/*
 * generated by Xtext 2.13.0
 */
package net.unicoen.generator

import java.lang.reflect.Type
import java.lang.reflect.ParameterizedType
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import net.unicoen.uniMapperGenerator.Atom
import net.unicoen.uniMapperGenerator.Element
import net.unicoen.uniMapperGenerator.Grammar
import net.unicoen.uniMapperGenerator.LexerRule
import net.unicoen.uniMapperGenerator.ParserRule
import net.unicoen.uniMapperGenerator.RuleRef
import net.unicoen.uniMapperGenerator.Terminal
import net.unicoen.util.InvokingStateAnalyzer

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class UniMapperGeneratorGenerator extends AbstractGenerator {
	private String _grammarName
	private InvokingStateAnalyzer _analyzer
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val g4Generator = new ANTLRGrammarGenerator(fsa)
		resource.allContents.filter(Grammar).forEach [
			_grammarName = it.name.toCamelCase
			val parserCode = g4Generator.generate(_grammarName, it)
			_analyzer = new InvokingStateAnalyzer(parserCode, it)
			fsa.generateFile(_grammarName + "Mapper.xtend", it.generateMapper)
		]
	}
	
	def generateImports() '''
		package net.unicoen.mapper

		import java.io.FileInputStream
		import java.util.List
		import java.util.ArrayList
		import java.util.Map
		import net.unicoen.node.*
		import net.unicoen.parser.«_grammarName»BaseVisitor
		import net.unicoen.parser.«_grammarName»Lexer
		import net.unicoen.parser.«_grammarName»Parser
		import org.antlr.v4.runtime.ANTLRInputStream
		import org.antlr.v4.runtime.CharStream
		import org.antlr.v4.runtime.CommonTokenStream
		import org.antlr.v4.runtime.ParserRuleContext
		import org.antlr.v4.runtime.RuleContext
		import org.antlr.v4.runtime.Token
		import org.antlr.v4.runtime.tree.ParseTree
		import org.antlr.v4.runtime.tree.RuleNode
		import org.antlr.v4.runtime.tree.TerminalNode
		import org.antlr.v4.runtime.tree.TerminalNodeImpl
		import org.eclipse.xtext.xbase.lib.Functions.Function1
		import java.lang.reflect.ParameterizedType
		import net.unicoen.node_helper.CodeLocation
		import net.unicoen.node_helper.CodeRange
	'''

	def generateMapper(Grammar g) '''
		«generateImports»
		
		class «_grammarName»Mapper extends «_grammarName»BaseVisitor<Object> {
		
			val boolean _isDebugMode
			val List<Comment> _comments = new ArrayList<Comment>;
			var CommonTokenStream _stream;
			var UniNode _lastNode;
			var int _nextTokenIndex;
		
			static class Comment {
				val List<String> contents
				var ParseTree parent
		
				new(List<String> contents, ParseTree parent) {
					this.contents = contents
					this.parent = parent
				}
			}
		
			new(boolean isDebugMode) {
				_isDebugMode = isDebugMode
			}
		
			def parse(String code) {
				parseCore(new ANTLRInputStream(code))
			}
		
			def parseFile(String path) {
				val inputStream = new FileInputStream(path)
				try {
					parseCore(new ANTLRInputStream(inputStream))
				} finally {
					inputStream.close
				}
			}
		
			def parseCore(CharStream chars) {
				parseCore(chars, [parser|parser.«g.root.root.name»])
			}
		
			def parse(String code, Function1<«_grammarName»Parser, ParseTree> parseAction) {
				parseCore(new ANTLRInputStream(code), parseAction)
			}
		
			def parseFile(String path, Function1<«_grammarName»Parser, ParseTree> parseAction) {
				val inputStream = new FileInputStream(path)
				try {
					parseCore(new ANTLRInputStream(inputStream), parseAction)
				} finally {
					inputStream.close
				}
			}
		
			def parseCore(CharStream chars, Function1<«_grammarName»Parser, ParseTree> parseAction) {
				val lexer = new «_grammarName»Lexer(chars)
				val tokens = new CommonTokenStream(lexer)
				val parser = new «_grammarName»Parser(tokens)
				val tree = parseAction.apply(parser) // parse
				_comments.clear()
				_stream = tokens
				_lastNode = null
				_nextTokenIndex = 0

				«IF g.rules.size > 0»
					val ret = tree.visit.flatten

					if (_lastNode !== null) {
						val count = _stream.size - 1
						for (var i = _nextTokenIndex; i < count; i++) {
							val hiddenToken = _stream.get(i) // Includes skipped tokens (maybe)
							if (_lastNode.comments === null) {
								_lastNode.comments = newArrayList
							}
							_lastNode.comments += hiddenToken.text
						}
					}
					ret
      			«ENDIF»
			}

			override public visitChildren(RuleNode node) {
				val n = node.childCount
				val list = newArrayList()
				(0 ..< n).forEach [ i |
					val c = node.getChild(i)
					val childResult = c.visit
					list += childResult
				]
				list.flatten
			}
		
			override public visit(ParseTree tree) {
				val result = if (_isDebugMode && tree instanceof RuleContext) {
						val ruleName = «_grammarName»Parser.ruleNames.get((tree as ParserRuleContext).ruleIndex)
						println("enter " + ruleName + " : " + tree.text)
						val ret = tree.accept(this)
						println("exit " + ruleName + " : " + ret)
						ret
					} else {
						tree.accept(this)
					}
		
				val node = if (result instanceof List<?>) {
						if(result.size == 1) result.get(0) else result
					} else {
						result
					}
				if (node instanceof UniNode) {
					if (tree instanceof RuleContext)
					{
						val start = (tree as ParserRuleContext).start
						val stop = (tree as ParserRuleContext).stop
						val begin = new CodeLocation(start.charPositionInLine,start.line)
						val endPos = stop.charPositionInLine
						val length = 1 + stop.stopIndex - stop.startIndex
						val end = new CodeLocation(endPos + length, stop.line)
						node.codeRange = new CodeRange(begin,end)
					}
					var List<String> contents = newArrayList
					for (var i = _comments.size - 1; i >= 0 && _comments.get(i).parent == tree; i--) {
						_comments.get(i).contents += contents
						contents = _comments.get(i).contents
						_comments.remove(i)
					}
					if (contents.size > 0) {
						if (node.comments === null) {
							node.comments = contents
						} else {
							node.comments += contents
						}
					}
					_lastNode = node
				} else {
					for (var i = _comments.size - 1; i >= 0 && _comments.get(i).parent == tree; i--) {
						_comments.get(i).parent = _comments.get(i).parent.parent
					}
					_lastNode = null
				}
		
				result
			}

			def boolean isNonEmptyNode(ParseTree node) {
				if (node instanceof ParserRuleContext) {
					if (node.childCount > 1) {
						return true
					}
					node.childCount == 1 && node.children.exists[isNonEmptyNode]
				} else {
					true
				}
			}

			override public visitTerminal(TerminalNode node) {
				if (_isDebugMode) {
					println("visit TERMINAL : " + node.text)
				}
		
				val token = node.symbol
				if (token.type > 0) {
					val count = token.tokenIndex
					val List<String> contents = newArrayList
					var i = _nextTokenIndex
					for (; i < count; i++) {
						val hiddenToken = _stream.get(i) // Includes skipped tokens (maybe)
						if (_lastNode !== null && _stream.get(_nextTokenIndex - 1).line == hiddenToken.line) {
							if (_lastNode.comments === null) {
								_lastNode.comments = newArrayList
							}
							_lastNode.comments += hiddenToken.text
						} else {
							contents += hiddenToken.text
						}
					}
					val count2 = _stream.size - 1
					for (i = count + 1; i < count2 && _stream.get(i).channel == Token.HIDDEN_CHANNEL &&
						_stream.get(count).line == _stream.get(i).line; i++) {
						contents += _stream.get(i).text
					}
					if (contents.size > 0) {
						_comments.add(new Comment(contents, node.parent))
					}
					_nextTokenIndex = i
				}
				node.text
			}
		
			private def Object flatten(Object obj) {
				if (obj instanceof List<?>) {
					if (obj.size == 1) {
						return obj.get(0).flatten
					}
					val ret = newArrayList
					obj.forEach [
						ret += it.flatten
					]
					return ret
				}
				if (obj instanceof Map<?, ?>) {
					if (obj.size == 1) {
						return obj.get(obj.keySet.get(0)).flatten
					}
					val ret = newHashMap
					obj.forEach [ key, value |
						ret.put(key, value.flatten)
					]
					return ret
				}
				obj
			}
		
			public def <T> List<T> castToList(Object obj, Class<T> clazz) {
				val temp = obj.flatten
				val ret = newArrayList
				if (temp instanceof Map<?, ?>) {
					val add = temp.containsKey("add")
					temp.forEach [ key, value |
						switch key {
							case "add": {
								if (value instanceof Map<?, ?>) {
									ret += value.castTo(clazz)
								} else if (value instanceof List<?>) {
									value.forEach [
										val t = it.castTo(clazz)
										if (t != null) {
											ret += t
										}
									]
								} else {
									ret += value.castToList(clazz)
								}
							}
							default: {
								if (!add) {
									ret += value.castToList(clazz)
								}
							}
						}
					]
				} else if (temp instanceof List<?>) {
					temp.forEach [
						ret += it.castToList(clazz)
					]
				} else {
					ret += temp.castTo(clazz)
				}
				ret
			}
		
			public def <T> T castTo(Object obj, Class<T> clazz) {
				val temp = obj.flatten
				if (temp instanceof Map<?, ?>) {
					if (String.isAssignableFrom(clazz)) {
						val builder = new StringBuilder
						val hasAdd = temp.containsKey("add")
						temp.forEach [ key, value |
							switch (key) {
								case "add": {
									builder.append(value.castTo(clazz))
								}
								default: {
									if (!hasAdd) {
										builder.append(value.castTo(clazz))
									}
								}
							}
						]
						return if (builder.length > 0) clazz.getConstructor(StringBuilder).newInstance(builder) else null
					}
					val instance = clazz.newInstance
					val fields = clazz.fields
					val fieldsName = newArrayList
					fields.forEach[fieldsName.add(it.name)]
					temp.forEach [ key, value |
						if (fieldsName.contains(key)) {
							val field = fields.get(fieldsName.indexOf(key))
							field.set(instance,
								if (List.isAssignableFrom(field.type)) {
									value.castToList(
										(field.genericType as ParameterizedType).actualTypeArguments.get(0) as Class<?>)
								} else {
									value.castTo(field.type)
								})
						}
					]
					return instance
				}
				if (temp instanceof List<?>) {
					if (String.isAssignableFrom(clazz)) {
						val builder = new StringBuilder
						temp.forEach [
							builder.append(it.castTo(clazz))
						]
						return if (builder.length > 0) clazz.getConstructor(StringBuilder).newInstance(builder) else null
					}
					val first = temp.findFirst[clazz.isAssignableFrom(it.class)]
					return if (first === null) {
						try {
							clazz.newInstance
						} catch (InstantiationException e) {
							null
						}
					} else
						first.castTo(clazz)
				}
				clazz.cast(temp)
			}
		
			«FOR r : g.rules.filter(ParserRule)»
				«IF r.type !== null && r.type.type.name !== null && r.type.type.name.endsWith("Literal")»
					«r.makeLiteralMethod»

				«ELSEIF r.type !== null || r.eAllContents.filter(Element).findFirst[it.op !== null] !== null»
					«r.makeVisitMethod»

				«ENDIF»
			«ENDFOR»
		}
	'''

	def toCamelCase(String str) {
		Character.toUpperCase(str.charAt(0)) + str.substring(1)
	}

	def makeVisitMethod(ParserRule r) {
		val ruleName = r.name.toCamelCase
		val typeName = if (r.type !== null) {
			r.type.type.name
		} else {
			new String
		}
		'''
			override public visit«ruleName»(«_grammarName»Parser.«ruleName»Context ctx) {
				«IF typeName=="List"»
					«r.makeListMethodBody(r.type.type.typevalue)»
				«ELSE»
					«r.makeMethodBody»
				«ENDIF»
			}
		'''
	}

	def makeMethodBody(ParserRule r) {
		val annotationList = newHashSet
		val elementList = r.eAllContents.filter(Element).filter[it.op !== null].toList
		val hasMerge = elementList.findFirst[it.op == "MERGE"] !== null
		val hasReturn = elementList.findFirst[it.op == "RETURN"] !== null
		elementList.forEach[
			annotationList += it.op
		]
	'''
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		«FOR it : annotationList»«IF it != "MERGE"»
		val «if (it == "ADD") it.toLowerCase else if (it == "RETURN") "ret" else it» = newArrayList
		«IF it != "RETURN"»
		map.put("«if (it == "ADD") it.toLowerCase else it»", «if (it == "ADD") it.toLowerCase else it»)
		«ENDIF»«ENDIF»«ENDFOR»
		«IF hasMerge»
		val merge = newArrayList
		«ENDIF»
		ctx.children.forEach [
			if (it instanceof RuleContext) {
				switch it.invokingState {
					«val stateList = newHashSet»
					«FOR it : elementList»
						«val atom = it.body»
						«IF atom instanceof Atom»
							«val ref = atom.body»
							«IF ref instanceof RuleRef»
								«val invokingState = r.getInvokingState»
								«IF stateList.add(invokingState)»
									case «invokingState»: {
										«if (it.op == "MERGE" || it.op == "ADD") it.op.toLowerCase 
										else if (it.op == "RETURN") "ret" 
										else it.op» += it.visit«IF r.type !== null && r.type.type.dir !== null».flatten«ENDIF»
									}
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					default: {
						none += it.visit
					}
				}
			} else if (it instanceof TerminalNode) {
				switch it.symbol.type {
					«val nameList = newHashSet»
					«FOR it : elementList»
						«val atom = it.body»
						«IF atom instanceof Atom»
							«val ref = atom.body»
							«IF ref instanceof Terminal && nameList.add(it.terminalName)»
								case «_grammarName»Parser.«it.terminalName»: {
									«if (it.op == "MERGE" || it.op == "ADD") it.op.toLowerCase else if (it.op == "RETURN") "ret" else it.op» += it.visit.flatten
								}
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					default: {
						none += it.visit
					}
				}
			}
		]
		«IF hasReturn»
			if (!ret.isEmpty) {
				return ret
			}
		«ENDIF»
		«IF r.type !== null»
			«IF r.type.type.name !== null»
				«IF hasMerge»val node = «ENDIF»map.castTo(«r.type.type.name»)
				«IF hasMerge»
					merge.forEach[node.merge(it.castTo(«r.type.type.name»))]
					node
				«ENDIF»
			«ELSE»
				«IF r.type.type.dir == '>'»
					add.reverse
				«ENDIF»
				var node = add.get(0) as UniExpr
				add.remove(node)
				for (Object obj : add) {
					switch (obj) {
						«FOR field:r.type.type.fieldvalue»
						«field.name.get(0)»: {
							obj.«field.name.get(1)» = node
							node = obj
						}
						«ENDFOR»
					}
				}
				node
			«ENDIF»
		«ELSE»
			«IF hasMerge»
				merge.forEach [
					if (it instanceof Map<?, ?>) {
						it.forEach [ k, v |
							if (map.containsKey(k)) {
								map.get(k) += v
							} else {
								map.put(k, v as ArrayList<Object>)
							}
						]
					}
				]
			«ENDIF»
			map
		«ENDIF»
	'''}

	def getReferenceReturnType(Element r) {
		val ref = (r.body as Atom).body
		if (ref instanceof RuleRef) {
			if (ref.reference.type !== null) {
				ref.reference.type.type.name
			}
		}
	}

	def getTerminalName(Element r) {
		val ref = (r.body as Atom).body
		if (ref instanceof Terminal) {
			(ref.reference as LexerRule).name
		}
	}

	def getTypeName(Type type) {
		switch type {
			Class<?>:
				return type.name
			ParameterizedType: {
				val sb = new StringBuilder
				sb.append(type.typeName).append('<')
				var isFirst = true
				for (Type arg : type.actualTypeArguments) {
					if (!isFirst) {
						sb.append(',')
					}
					sb.append(arg.typeName)
				}
				sb.append('>')
				return sb.toString
			}
			default:
				die("Unknown type:" + type.toString)
		}
	}

	def makeListMethodBody(ParserRule r, String itemClassName) {
		val annotationList = newHashSet
		val elementList = r.eAllContents.filter(Element).filter[it.op !== null].toList
		val hasMerge = elementList.findFirst[ it.op == "MERGE" ] !== null
		val hasReturn = elementList.findFirst[ it.op == "RETURN" ] !== null
		elementList.forEach[
			annotationList += it.op
		]
		
	'''
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		«FOR it : annotationList»«IF it != "MERGE"»
		val «if (it == "ADD") it.toLowerCase else if (it == "RETURN") "ret" else it» = newArrayList
		«IF it != "RETURN"»
		map.put("«if (it == "ADD") it.toLowerCase else it»", «if (it == "ADD") it.toLowerCase else it»)
		«ENDIF»«ENDIF»«ENDFOR»
		«IF hasMerge»
		val merge = newArrayList
		«ENDIF»
		if (ctx.children != null) {
			ctx.children.forEach [
				if (it instanceof RuleContext) {
					switch it.invokingState {
						«val stateList = newHashSet»
						«FOR it : elementList»
							«val atom = it.body»
							«IF atom instanceof Atom»
								«val ref = atom.body»
								«IF ref instanceof RuleRef»
									«val invokingState = r.getInvokingState»
									«IF stateList.add(invokingState)»
										case «invokingState»: {
											«if (it.op == "MERGE") it.op.toLowerCase 
											else if (it.op == "ADD")
"val results = it.visit.flatten
if(results instanceof ArrayList<?>){
	for (result: results)
		add += result
}
else
	add"
											else if (it.op == "RETURN") "ret" 
											else it.op» += it.visit
										}
									«ENDIF»
								«ENDIF»
							«ENDIF»
						«ENDFOR»
						default: {
							none += it.visit
						}
					}
				} else if (it instanceof TerminalNode) {
					switch it.symbol.type {
						«val nameList = newHashSet»
						«FOR it : elementList»
							«val atom = it.body»
							«IF atom instanceof Atom»
								«val ref = atom.body»
								«IF ref instanceof Terminal && nameList.add(it.terminalName)»
									case «_grammarName»Parser.«it.terminalName»: {
										«if (it.op == "MERGE" || it.op == "ADD") it.op.toLowerCase else if (it.op == "RETURN") "ret" else it.op» += it.visit
									}
								«ENDIF»
							«ENDIF»
						«ENDFOR»
						default: {
							none += it.visit
						}
					}
				}
			]
		}
		«IF hasReturn»
			if (!ret.isEmpty) {
				return ret
			}
		«ENDIF»
		«IF hasMerge»val node = «ENDIF»map«IF r.type !== null».castTo«IF !hasMerge»List«ENDIF»(«itemClassName»)«ENDIF»
		«IF hasMerge»
		val ret = newArrayList
		merge.castToList(«itemClassName»).forEach [
			it.merge(node)
			ret += it
		]
		ret
		«ENDIF»
	'''
	}

	def makeStringMethodBody(ParserRule r) '''
		val map = newHashMap
		val none = newArrayList
		map.put("none", none)
		if (ctx.children != null) {
			ctx.children.forEach [
				none += it.visit
			]
		}
		map
	'''


	def makeLiteralMethod(ParserRule r) '''
		«val methodName = "visit" + r.name.toCamelCase»
		override public «methodName»(«_grammarName»Parser.«r.name.toCamelCase»Context ctx) {
			val text = ctx.children.findFirst [
				if (it instanceof TerminalNodeImpl) {
					«FOR it : r.eAllContents.filter(Element).toList»
						«IF it.op !== null»
							«IF it.op == "value"»
								if (it.symbol.type == «_grammarName»Parser.«it.terminalName») {
									return true
								}
							«ENDIF»
						«ENDIF»
					«ENDFOR»
				}
				return false
			].visit as String
			«IF r.type.type.name == "UniIntLiteral"»
				return new UniIntLiteral(Integer.parseInt(text))
			«ELSEIF r.type.type.name == "UniBoolLiteral"»
				return new UniBoolLiteral(Boolean.parseBoolean(text))
			«ELSEIF r.type.type.name == "UniDoubleLiteral"»
				return new UniDoubleLiteral(Double.parseDouble(text))
			«ELSEIF r.type.type.name == "UniStringLiteral"»
				return new UniStringLiteral(text.substring(1, text.length - 1))
			«ELSEIF r.type.type.name == "UniCharacterLiteral"»
				return new UniCharacterLiteral(text.substring(1, text.length - 1).charAt(0))
			«ELSE»
				throw new RuntimeException("Unimplemented Method: «methodName»")
			«ENDIF»
		}
	'''

	def die(String message) {
		throw new RuntimeException(message)
	}

	def getInvokingState(ParserRule r) {
		_analyzer.getInvokingState(r)
	}

//	def hasItemClassField(ParserRule r, String itemClassName) {
//		val list = r.eAllContents.filter(Element).toIterable
//		for (elem : list) {
//			if (itemClassName.hasField(elem.op)) {
//				return true
//			}
//		}
//		return false
//	}
//
//	def hasField(String itemClass, String fieldName) {
//		try {
//			val clazz = Class.forName(UniNode.package.name + '.' + itemClass)
//			clazz.getField(fieldName)
//		} catch (Exception e) {
//			return false
//		}
//		return true
//	}

}
