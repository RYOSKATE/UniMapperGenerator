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
			fsa.generateFile(_grammarName + "Mapper.ts", it.generateMapper)
		]
	}
	
	def generateImports() '''
		import CodeLocation from '../../node_helper/CodeLocation';
		import CodeRange from '../../node_helper/CodeRange';
		import UniNode from '../../node/UniNode';
		import UniParam from '../../node/UniParam';
		import UniExpr from '../../node/UniExpr';
		import UniArray from '../../node/UniArray';
		import UniNumberLiteral from '../../node/UniNumberLiteral';
		import UniBinOp from '../../node/UniBinOp';
		import UniBlock from '../../node/UniBlock';
		import UniBoolLiteral from '../../node/UniBoolLiteral';
		import UniBreak from '../../node/UniBreak';
		import UniCast from '../../node/UniCast';
		import UniContinue from '../../node/UniContinue';
		import UniDoWhile from '../../node/UniDoWhile';
		import UniEmptyStatement from '../../node/UniEmptyStatement';
		import UniFunctionDec from '../../node/UniFunctionDec';
		import UniFor from '../../node/UniFor';
		import UniIdent from '../../node/UniIdent';
		import UniIf from '../../node/UniIf';
		import UniIntLiteral from '../../node/UniIntLiteral';
		import UniWhile from '../../node/UniWhile';
		import UniUnaryOp from '../../node/UniUnaryOp';
		import UniTernaryOp from '../../node/UniTernaryOp';
		import UniStatement from '../../node/UniStatement';
		import UniStringLiteral from '../../node/UniStringLiteral';
		import UniReturn from '../../node/UniReturn';
		import UniVariableDec from '../../node/UniVariableDec';
		import UniVariableDef from '../../node/UniVariableDef';
		import UniSwitchUnit from '../../node/UniSwitchUnit';
		import UniSwitch from '../../node/UniSwitch';
		import UniMethodCall from '../../node/UniMethodCall';
		import UniProgram from '../../node/UniProgram';
		
		import { InputStream, CommonTokenStream, ParserRuleContext } from 'antlr4';
		import { RuleContext }from 'antlr4/RuleContext';
		import { TerminalNode, TerminalNodeImpl, RuleNode, ParseTree }from 'antlr4/tree/Tree';
		import { «_grammarName»Lexer } from './«_grammarName»Lexer';
		import { «_grammarName»Parser } from './«_grammarName»Parser';
		import { «_grammarName»Visitor } from './«_grammarName»Visitor';
	'''

	def generateMapper(Grammar g) '''
		// tslint:disable
		«generateImports»
		
		export default class «_grammarName»Mapper extends «_grammarName»Visitor {
		
			private isDebugMode:boolean = false;
			private parser:«_grammarName»Parser;
			// val List<Comment> _comments = new ArrayList<Comment>;
			// var CommonTokenStream _stream;
			// var UniNode _lastNode;
			// var int _nextTokenIndex;
		
			/*static class Comment {
				val List<String> contents
				var ParseTree parent
		
				new(List<String> contents, ParseTree parent) {
					this.contents = contents
					this.parent = parent
				}
			}*/
		
			setIsDebugMode(isDebugMode:boolean) {
			    this.isDebugMode = isDebugMode;
			}
		
			parse(code) {
			    const chars = new InputStream(code);
			    const [tree, parser] = this.parseCore(chars);
			    return this.visit(tree);
			}
			getRawTree(code) {
			    const chars = new InputStream(code);
			    return this.parseCore(chars);
			}
			
			parseCore(chars) {
			    const lexer = new «_grammarName»Lexer(chars);
			    const tokens = new CommonTokenStream(lexer);
			    this.parser = new «_grammarName»Parser(tokens);
			    this.parser.buildParseTrees = true;
			    const tree = this.parser.compilationUnit();
			    return [tree, this.parser];
			}
			
			/*def parseFile(String path) {
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
			}*/

			public visitChildren(node:RuleNode) {
			    const n = node.getChildCount();
			    const list:any[] = [];
			    for (let i = 0; i < n;++i) {
			      const c = node.getChild(i);
			      const childResult = this.visit(c);
			      list.push(childResult);
			    }
			    const flatten = this.flatten(list);
			    return flatten;
			  }
		
			public visit(node:ParseTree) {
			    if (!this.isDebugMode) {
			      return node.accept(this);
			    }
			    if (!(node instanceof RuleContext)) {
			      return node.accept(this);
			    }
			    const ruleName = this.getRuleName(node);
			    console.log('*** visit Rule : ' + ruleName + ' ***');
			    const ret = node.accept(this);
			    console.log('returned: ' + ret);
			    return ret;
		
				/*val node = if (result instanceof List<?>) {
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
		
				result*/
			}

			isNonEmptyNode(node:ParseTree):boolean {
			    if (node instanceof ParserRuleContext) {
			      const n = node.getChildCount();
			      if (n > 1) {
			        return true;
			      }
			      // n === 1 && node.children.exists[isNonEmptyNode]
			      return n === 1;
			    } else {
			      return true;
			    }
			}
			
			getRuleName(node) {
			  return this.parser.ruleNames[node.ruleIndex];
			}

			public visitTerminal(node:TerminalNode) {
				if (this.isDebugMode) {
					console.log("visit TERMINAL : " + node.text);
				}
		
				const token = node.symbol;
				/*if (token.type > 0) {
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
				}*/
				return token.text;
			}
		
			private flatten(obj:any) {
			    if (Array.isArray(obj)) {
			      if (obj.length === 1) {
			        return this.flatten(obj[0]);
			      }
			      const ret = [];
			      obj.forEach((it:any) => {
			        ret.push(this.flatten(it));
			      });
			      return ret;
			    }
			
			    if (obj instanceof Map) {
			      if (obj.size === 1) {
			        return this.flatten(obj.get(obj.keys[0]));
			      }
			      const ret = new Map<any, any>();
			      obj.forEach((value: any, key: any) => {
			        ret.set(key, this.flatten(value));
			      });
			      return ret;
			    }
			
			    return obj;
			}
		
			// tslint:disable-next-line:prefer-array-literal
			public castToList<T extends Function|String>(obj:any, clazz:T):Array<T> {
			  const temp = this.flatten(obj);
			  const ret = [];
			  if (temp instanceof Map) {
			    const add = temp.has('add');
			    temp.forEach((value: any, key: any) => {
			      switch (key) {
			        case 'add': {
			          if (value instanceof Map) {
			            ret.push(this.castTo<T>(value, clazz));
			          } else if (Array.isArray(value)) {
			            value.forEach((it:any) => {
			              const t = this.castTo(it, clazz);
			              if (t != null) {
			                ret.push(t);
			              }
			            });
			          } else {
			            ret.push(this.castToList(value, clazz));
			          }
			        } 
			          break;
			        default:
			          if (!add) {
			            ret.push(this.castToList(value, clazz));
			          }
			          break;
			      }    
			    });
			  } else if (Array.isArray(temp)) {
			    temp.forEach((it:any) => {
			      ret.push(this.castToList(it, clazz));
			    });
			  } else {
			    ret.push(this.castTo(temp, clazz));
			  }
			  return ret;
			}
			public castTo<T extends Function|String>(obj:any, clazz:any) {
			  const temp = this.flatten(obj);
			  const instance = new clazz();
			  const fields = instance.fields;
			  const fieldsName = [];
			  for (let it in instance) {
			    fieldsName.push(it);
			  }
			  if (temp instanceof Map) {
			    if (clazz instanceof String) {
			      let builder = '';
			      const hasAdd = temp.has('add');
			      temp.forEach((value: any, key: any) => {
			        switch (key) {
			          case 'add': {
			            builder += this.castTo<T>(value, clazz);
			          }
			          break;
			          default: {
			            if (!hasAdd) {
			              builder += this.castTo<T>(value, clazz);
			            }
			          }
			          break;
			        }
			      });
			      return (builder.length > 0) ? builder : null;
			    }
			    temp.forEach((value: any, key: any) => {
			      if (fieldsName.includes(key)) {
			        const field:Function = fields.get(key);
			        if (Array.isArray(field)) {
			          instance[key] = this.castToList(value, field);
			          // instance[key] = value.castToList((field.genericType as ParameterizedType).actualTypeArguments.get(0) as Class<?>);
			        } else {
			          instance[key] = this.castTo(value, field);
			        }
			      }
			    });
			    return instance;
			  }
			  if (Array.isArray(temp)) {
			    if (clazz instanceof String) {
			      let builder = '';
			      temp.forEach((it:any) => {
			        builder += (this.castTo(it, clazz));
			      });
			      return (builder.length > 0) ? builder : null;
			    }
			    const first = temp.find((it) => {
			      return it instanceof clazz;
			    });
			    if (first === null) {
			      try {
			        return instance;
			      } catch (e) {
			        return null;
			      }
			    } else {
			      return this.castTo<T>(first,clazz);
			    }
			  }
			 return temp as T;
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
			public visit«ruleName»(ctx:«_grammarName»Parser.«ruleName»Context) {
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
		const map = new Map<string,any>();
		const none = [];
		map.set("none", none);
		«FOR it : annotationList»«IF it != "MERGE"»
		const «if (it == "ADD") it.toLowerCase else if (it == "RETURN") "ret" else it» = [];
		«IF it != "RETURN"»
		map.set("«if (it == "ADD") it.toLowerCase else it»", «if (it == "ADD") it.toLowerCase else it»);
		«ENDIF»«ENDIF»«ENDFOR»
		«IF hasMerge»
		const merge = [];
		«ENDIF»
		const n = ctx.getChildCount();
		for (let i = 0; i < n;++i) {
			const it = ctx.getChild(i);	
			if (it instanceof RuleContext) {
				switch (it.invokingState) {
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
										else it.op».push(«IF r.type !== null && r.type.type.dir !== null»this.flatten(«ENDIF»this.visit(it)«IF r.type !== null && r.type.type.dir !== null»)«ENDIF»);
									}
									break;
								«ENDIF»
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					default: {
						none.push(this.visit(it));
					}
					break;
				}
			} else if (it instanceof TerminalNode) {
				switch (it.symbol.type) {
					«val nameList = newHashSet»
					«FOR it : elementList»
						«val atom = it.body»
						«IF atom instanceof Atom»
							«val ref = atom.body»
							«IF ref instanceof Terminal && nameList.add(it.terminalName)»
								case «_grammarName»Parser.«it.terminalName»: {
									«if (it.op == "MERGE" || it.op == "ADD") it.op.toLowerCase else if (it.op == "RETURN") "ret" else it.op».push(this.flatten(this.visit(it)));
								}
								break;
							«ENDIF»
						«ENDIF»
					«ENDFOR»
					default: {
						none.push(this.visit(it));
					}
					break;
				}
			}
		}
		«IF hasReturn»
			if (ret != []) {
				return ret;
			}
		«ENDIF»
		«IF r.type !== null»
			«IF r.type.type.name !== null»
				const node = this.castTo(map, «r.type.type.name»);
				«IF hasMerge»
					merge.forEach((it:any) => { node.merge(this.castTo(it, «r.type.type.name»));});
				«ENDIF»
				return node;
			«ELSE»
				«IF r.type.type.dir == '>'»
					add.reverse();
				«ENDIF»
				const node = add[0] as UniExpr;
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
		const map = new Map<string,any>();
		const none = [];
		map.set("none", none);
		«FOR it : annotationList»«IF it != "MERGE"»
		const «if (it == "ADD") it.toLowerCase else if (it == "RETURN") "ret" else it» = [];
		«IF it != "RETURN"»
		map.set("«if (it == "ADD") it.toLowerCase else it»", «if (it == "ADD") it.toLowerCase else it»);
		«ENDIF»«ENDIF»«ENDFOR»
		«IF hasMerge»
		const merge = [];
		«ENDIF»
		const n = ctx.getChildCount();
		if (0<n) {
			for (let i = 0; i < n;++i) {
				const it = ctx.getChild(i);
				if (it instanceof RuleContext) {
					switch (it.invokingState) {
						«val stateList = newHashSet»
						«FOR it : elementList»
							«val atom = it.body»
							«IF atom instanceof Atom»
								«val ref = atom.body»
								«IF ref instanceof RuleRef»
									«val invokingState = r.getInvokingState»
									«IF stateList.add(invokingState)»
										case «invokingState»: {
											«IF (it.op == "ADD")»
												const results = this.flatten(this.visit(it));
												if(Array.isArray(results)){
													for (const result of results)
														add.push(result);
												}
												else
													add.push(results);
											«ENDIF»
											«IF it.op != "ADD"»
												«if (it.op == "MERGE") it.op.toLowerCase 
													else if (it.op == "RETURN") "ret" 
													else it.op».push(this.visit(it));
											«ENDIF»	
										}
										break;
									«ENDIF»
								«ENDIF»
							«ENDIF»
						«ENDFOR»
						default: {
							none.push(this.visit(it));
						}
						break;
					}
				} else if (it instanceof TerminalNode) {
					switch (it.symbol.type) {
						«val nameList = newHashSet»
						«FOR it : elementList»
							«val atom = it.body»
							«IF atom instanceof Atom»
								«val ref = atom.body»
								«IF ref instanceof Terminal && nameList.add(it.terminalName)»
									case «_grammarName»Parser.«it.terminalName»: {
										«if (it.op == "MERGE" || it.op == "ADD") it.op.toLowerCase else if (it.op == "RETURN") "ret" else it.op».push(this.visit(it));
									}
									break;
								«ENDIF»
							«ENDIF»
						«ENDFOR»
						default: {
							none.push(this.visit(it));
						}
						break;
					}
				}
			}
		}
		«IF hasReturn»
			if (ret != []) {
				return ret;
			}
		«ENDIF»
		const node = «IF r.type === null»map«ENDIF»«IF r.type !== null»this.castTo«IF !hasMerge»List«ENDIF»(map, «itemClassName»)«ENDIF»
		«IF !hasMerge»
		return node;
		«ENDIF»
		«IF hasMerge»
		const ret = [];
		this.castToList(merge, «itemClassName»).forEach( (it) => {
			it.merge(node);
			ret.push(it);
		});
		return ret;
		«ENDIF»
	'''
	}

	def makeStringMethodBody(ParserRule r) '''
		const map = new Map<string, any>();
		const none = [];
		map.set("none", none);
		const n = node.getChildCount();
		for (let i = 0; i < n;++i) {
			const it = node.getChild(i);
		    none.push(this.visit(it));
		}
		return map;
	'''


	def makeLiteralMethod(ParserRule r) '''
		«val methodName = "visit" + r.name.toCamelCase»
		public «methodName»(ctx:«_grammarName»Parser.«r.name.toCamelCase»Context) {
			const findFirst = (ctx) => {
				const n = ctx.getChildCount();
				for (let i = 0; i < n;++i) {
					const it = ctx.getChild(i);	
					if (it instanceof TerminalNodeImpl) {
						«FOR it : r.eAllContents.filter(Element).toList»
							«IF it.op !== null»
								«IF it.op == "value"»
									if (it.symbol.type == «_grammarName»Parser.«it.terminalName») {
										return it;
									}
								«ENDIF»
							«ENDIF»
						«ENDFOR»
					}
				}
				return undefined;
			};
			const text = this.visit(findFirst(ctx)) as String;
			«IF r.type.type.name == "UniIntLiteral"»
				return new UniIntLiteral(Number(text));
			«ELSEIF r.type.type.name == "UniBoolLiteral"»
				return new UniBoolLiteral(Boolean(text));
			«ELSEIF r.type.type.name == "UniDoubleLiteral"»
				return new UniDoubleLiteral(Number(text));
			«ELSEIF r.type.type.name == "UniStringLiteral"»
				return new UniStringLiteral(text.substring(1, text.length - 1));
			«ELSEIF r.type.type.name == "UniCharacterLiteral"»
				return new UniCharacterLiteral(text.substring(1, text.length - 1).charAt(0));
			«ELSE»
				throw new RuntimeException("Unimplemented Method: «methodName»");
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
