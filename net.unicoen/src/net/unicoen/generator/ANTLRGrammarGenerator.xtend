package net.unicoen.generator

import com.google.common.io.Files
import java.io.File
import java.io.FileOutputStream
import java.nio.charset.StandardCharsets
import net.unicoen.uniMapperGenerator.ActionElement
import net.unicoen.uniMapperGenerator.ActionOption
import net.unicoen.uniMapperGenerator.AltList
import net.unicoen.uniMapperGenerator.Alternative
import net.unicoen.uniMapperGenerator.Atom
import net.unicoen.uniMapperGenerator.Block
import net.unicoen.uniMapperGenerator.BlockSet
import net.unicoen.uniMapperGenerator.Ebnf
import net.unicoen.uniMapperGenerator.EbnfSuffix
import net.unicoen.uniMapperGenerator.Element
import net.unicoen.uniMapperGenerator.ElementOption
import net.unicoen.uniMapperGenerator.ElementOptions
import net.unicoen.uniMapperGenerator.EmptyTokens
import net.unicoen.uniMapperGenerator.ExceptionGroup
import net.unicoen.uniMapperGenerator.ExceptionHandler
import net.unicoen.uniMapperGenerator.Exceptions
import net.unicoen.uniMapperGenerator.FinallyClause
import net.unicoen.uniMapperGenerator.Grammar
import net.unicoen.uniMapperGenerator.GrammarAction
import net.unicoen.uniMapperGenerator.GrammarType
import net.unicoen.uniMapperGenerator.Import
import net.unicoen.uniMapperGenerator.Imports
import net.unicoen.uniMapperGenerator.IntOption
import net.unicoen.uniMapperGenerator.LabeledAlt
import net.unicoen.uniMapperGenerator.LabeledElement
import net.unicoen.uniMapperGenerator.LabeledLexerElement
import net.unicoen.uniMapperGenerator.LexerAlt
import net.unicoen.uniMapperGenerator.LexerAltList
import net.unicoen.uniMapperGenerator.LexerAtom
import net.unicoen.uniMapperGenerator.LexerBlock
import net.unicoen.uniMapperGenerator.LexerCharSet
import net.unicoen.uniMapperGenerator.LexerCommand
import net.unicoen.uniMapperGenerator.LexerCommandExpr
import net.unicoen.uniMapperGenerator.LexerCommands
import net.unicoen.uniMapperGenerator.LexerElement
import net.unicoen.uniMapperGenerator.LexerElementWithDollar
import net.unicoen.uniMapperGenerator.LexerElements
import net.unicoen.uniMapperGenerator.LexerRule
import net.unicoen.uniMapperGenerator.LocalVars
import net.unicoen.uniMapperGenerator.Mode
import net.unicoen.uniMapperGenerator.NotSet
import net.unicoen.uniMapperGenerator.Option
import net.unicoen.uniMapperGenerator.Options
import net.unicoen.uniMapperGenerator.ParserRule
import net.unicoen.uniMapperGenerator.QualifiedId
import net.unicoen.uniMapperGenerator.QualifiedOption
import net.unicoen.uniMapperGenerator.Range
import net.unicoen.uniMapperGenerator.Return
import net.unicoen.uniMapperGenerator.RuleAction
import net.unicoen.uniMapperGenerator.RuleAltList
import net.unicoen.uniMapperGenerator.RuleRef
import net.unicoen.uniMapperGenerator.SetElement
import net.unicoen.uniMapperGenerator.StringOption
import net.unicoen.uniMapperGenerator.Terminal
import net.unicoen.uniMapperGenerator.TokenVocab
import net.unicoen.uniMapperGenerator.V3Token
import net.unicoen.uniMapperGenerator.V3Tokens
import net.unicoen.uniMapperGenerator.V4Token
import net.unicoen.uniMapperGenerator.V4Tokens
import net.unicoen.uniMapperGenerator.Wildcard
//import org.eclipse.core.resources.ResourcesPlugin
import org.eclipse.core.runtime.Path
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccessExtension2

class ANTLRGrammarGenerator {
	private val IFileSystemAccess _fsa
	private val _fileExtension = ".g4";
	private val _newLine = System.getProperty("line.separator")

	new(IFileSystemAccess fsa) {
		_fsa = fsa
	}

	def generate(String name, Grammar grammar) {
		val path = name + _fileExtension;
		_fsa.generateFile(path, grammar.compile)
		generateParserCode(name, path)
	}

	def generateParserCode(String name, String path) {
		val platformString = (_fsa as IFileSystemAccessExtension2).getURI(path).toPlatformString(true)
		//val rootPath = new File(".").getAbsolutePath();
		//val file = ResourcesPlugin.workspace.root.getFile(new Path(platformString))
		val antlrJar = new File("antlr-4.5.1-complete.jar")
		if (!antlrJar.exists) {
			val array = newByteArrayOfSize(1024 * 1024)
			val input = this.class.getResource("/antlr-4.5.1-complete.jar").openStream
			val output = new FileOutputStream(antlrJar)
			var size = 0
			while ((size = input.read(array)) > 0) {
				output.write(array, 0, size)
			}
			input.close
			output.close
		}
		//val pb = new ProcessBuilder("java", "-cp", antlrJar.absolutePath, "org.antlr.v4.Tool", "-o",
		//	file.parent.rawLocation.toOSString, file.rawLocation.toOSString)
		//pb.start.waitFor
		//val parserFile = new File(file.parent.rawLocation.toOSString + File.separator + name + "Parser.java")
		//val reader = Files.newReader(parserFile, StandardCharsets.UTF_8)
		val builder = new StringBuilder
		var line = ""
		//while ((line = reader.readLine) !== null) {
		//	builder.append(line)
		//	builder.append(_newLine)
		//}
		//reader.close
		builder.toString
	}

	def dispatch compile(Grammar g) {
		val sb = new StringBuilder
		sb.append(g.nameCompile + _newLine + _newLine)
		g.prequels.forEach [
			sb.append(it.compile + _newLine)
		]
		g.rules.forEach [
			sb.append(it.compile + _newLine)
		]
		g.modes.forEach [
			sb.append(it.compile + _newLine)
		]
		sb.toString
	}

	def nameCompile(Grammar g) '''áIF g.type !== null && !g.type.equals(GrammarType.DEFAULT)âág.typeâ áENDIFâgrammar ág.
		nameâ;'''

	def dispatch compile(Options op) '''áop.keywordâáFOR o : op.optionsâ áo.compileâ;áENDFORâ}'''

	def dispatch compile(Option o) '''áo.nameâ = áo.value.compileâ'''

	def dispatch compile(TokenVocab tv) '''átv.nameâ = átv.importURIâ'''

	def dispatch compile(QualifiedOption qop) '''áqop.valueâ'''

	def dispatch compile(StringOption qop) '''áqop.valueâ'''

	def dispatch compile(ActionOption qop) '''áqop.valueâ'''

	def dispatch compile(IntOption qop) '''áqop.valueâ'''

	def dispatch compile(Imports im) {
		'''áim.keywordâ áFOR i : im.importsâáIF !im.imports.get(0).equals(i)â, áENDIFâái.compileâáENDFORâ'''
	}

	def dispatch compile(Import i) '''áIF !i.alias.emptyâái.aliasâ = áENDIFâái.importURIâ'''

	def dispatch compile(V4Tokens v4) {
		'''áv4.keywordâ áFOR t : v4.tokensâáIF !v4.tokens.get(0).equals(t)â, áENDIFâát.compileâáENDFORâ'''
	}

	def dispatch compile(V4Token v4) '''áv4.nameâ'''

	def dispatch compile(EmptyTokens et) '''áet.keywordâ}'''

	def dispatch compile(V3Tokens v3) '''áv3.keywordâáFOR t : v3.tokensâ át.compileâáENDFORâ}'''

	def dispatch compile(V3Token v3) '''áv3.nameâáIF !v3.value.emptyâ = áv3.valueâáENDIFâ;'''

	def dispatch compile(GrammarAction ga) '''@áIF !ga.scope.nullOrEmptyâága.scopeâ ága.colonSymbolâ áENDIFâága.nameâ ága.
		actionâ
'''

	def dispatch compile(Mode m) '''mode ám.idâ;áFOR lr : m.rulesâálr.compileâáENDFORâ'''

	def dispatch compile(ParserRule pr) {
		'''ápr.nameâáIF pr.^return != nullâ ápr.^return.compileâáENDIFâáIF pr.throws != nullâ ápr.throws.compileâáENDIFâáIF pr.
			locals != nullâ ápr.locals.compileâáENDIFâáFOR p : pr.prequelsâ áp.compileâáENDFORâ
	:ápr.body.compileâápr.caught.compileâ
	ápr.semicolonSymbolâ
'''

	}

	def dispatch compile(ExceptionGroup eg) '''áFOR e : eg.handlersâáENDFORâáIF eg.^finally != nullâáeg.^finally.compileâáENDIFâ'''

	def dispatch compile(ExceptionHandler eh) '''catch áeh.exceptionâ áeh.bodyâ'''

	def dispatch compile(FinallyClause fc) '''finally áfc.bodyâ'''

	def dispatch compile(Return re) '''returns áre.bodyâ'''

	def dispatch compile(Exceptions ex) '''throws áFOR e : ex.exceptionsâáIF !ex.exceptions.get(0).equals(e)â,áENDIFâ áeâáENDFORâ'''

	def dispatch compile(LocalVars lv) '''locals álv.bodyâ'''

	def dispatch compile(RuleAction ra) '''@ára.nameâ ára.bodyâ'''

	def dispatch compile(RuleAltList ral) '''áFOR a : ral.alternativesâáIF !ral.alternatives.get(0).equals(a)â
	|áENDIFâ	áa.compileâáENDFORâ'''

	def dispatch compile(LabeledAlt la) '''ála.body.compileâáIF la.label != nullâ #ála.labelâáENDIFâ'''

	def dispatch compile(Alternative al) '''áIF al.options != nullâáal.options.compileâ áENDIFâáFOR e : al.elementsâáe.
		compileâáENDFORâ'''

	def dispatch compile(Element el) '''áel.body.compileâáIF el.operator != nullâáel.operator.compileâáENDIFâ '''

	def dispatch compile(Ebnf eb) '''áeb.body.compileâáIF eb.operator != nullâáeb.operator.compileâáENDIFâ'''

	def dispatch compile(ActionElement ae) '''áae.bodyâáIF ae.options != nullâáae.options.compileâáENDIFâ'''

	def dispatch compile(LabeledElement le) '''ále.nameâ ále.opâ ále.body.compileâ'''

	def dispatch compile(EbnfSuffix es) '''áes.operatorâáIF es.nongreedy != nullâ áes.nongreedyâáENDIFâ'''

	def dispatch compile(Block bl) '''(áIF bl.colon != nullâáIF bl.options != nullâábl.options.compileâáENDIFâáFOR a : bl.
		actionsâ áa.compileâáENDFORâ: áENDIFâábl.body.compileâ)'''

	def dispatch compile(AltList al) '''áFOR a : al.alternativesâáIF !al.alternatives.get(0).equals(a)â|áENDIFâáa.
		compileâáENDFORâ'''

	def dispatch compile(Atom at) '''áat.body.compileâ'''

	//def dispatch compile(RuleRef rr) '''árr.reference.nameâárr.argsâáIF rr.options != nullâárr.options.compileâáENDIFâ'''
	def dispatch compile(RuleRef rr) '''árr.reference.nameâáIF rr.options != nullâárr.options.compileâáENDIFâ'''

	def dispatch compile(ElementOptions eo) '''<áFOR o : eo.optionsâáo.compileâ,áENDFORâ>'''

	def dispatch compile(Range ra) '''ára.fromâ..ára.toâ '''

	def dispatch compile(Terminal te) '''áIF te.reference != nullâáte.reference.refCompileâáIF te.options != nullâáte.
		options.compileâáENDIFâáELSEIF te.literal != nullâáte.literalâáIF te.options != nullâ áte.options.compileâáENDIFâáENDIFâ'''

	def dispatch compile(NotSet ns) '''~áns.body.compileâ'''

	def dispatch compile(BlockSet bs) '''(áFOR e : bs.elementsâáIF !bs.elements.get(0).equals(e)â|áENDIFâáe.compileâáENDFORâ)'''

	def dispatch compile(SetElement se) '''áIF se.tokenRef != nullâáse.tokenRefâáELSEIF se.stringLiteral != nullâáse.stringLiteralâáELSEIF se.
		range != nullâáse.rangeâáELSEâáse.charSetâáENDIFâ'''

	def dispatch compile(Wildcard wi) '''áwi.dotâáIF wi.options != nullâáwi.options.compileâáENDIFâ'''

	def dispatch compile(ElementOption eo) '''áIF eo.qualifiedId != nullâáeo.qualifiedId.compileâáELSEâáeo.idâ áeo.
		assignâ áeo.valueâáENDIFâ'''

	def dispatch compile(LexerRule lr) '''áIF lr.^fragmentâfragment
áENDIFâálr.nameâ
	:álr.body.compileâ
	;
'''

	def dispatch compile(LexerAltList lal) '''áFOR a : lal.alternativesâáIF !lal.alternatives.get(0).equals(a)â|áENDIFâ	áa.
		compileâ
áENDFORâ'''

	def dispatch compile(LexerAlt la) '''ála.body.compileâáIF la.commands != nullâ ála.commands.compileâáENDIFâ'''

	def dispatch compile(LexerElements le) '''áFOR e : le.elementsâáe.compileâáENDFORâ'''

	def dispatch compile(LexerElementWithDollar led) '''áled.body.compileâ'''

	def dispatch compile(LexerElement le) '''ále.body.compileâáIF le.operator != nullâále.operator.compileâáENDIFâ '''

	def dispatch compile(LabeledLexerElement lle) '''álle.labelâ álle.opâ álle.body.compileâ'''

	def dispatch compile(LexerAtom la) '''ála.body.compileâ'''

	def dispatch compile(LexerCharSet lcs) '''álcs.bodyâ'''

	def dispatch compile(LexerBlock lb) '''(áIF lb.options != nullâálb.optionsâ :áENDIFâálb.body.compileâ)'''

	def dispatch compile(LexerCommands lc) '''álc.keywordâáFOR c : lc.commandsâáIF !lc.commands.get(0).equals(c)â|áENDIFâác.
		compileâáENDFORâ'''

	def dispatch compile(LexerCommand lc) '''álc.nameâáIF lc.args != nullâ(álc.args.compileâ)áENDIFâ'''

	def dispatch compile(LexerCommandExpr lce) '''áIF lce.ref != nullâálce.ref.compileâáELSEâálce.valueâáENDIFâ'''

	def dispatch compile(QualifiedId qi) '''áFOR n : qi.nameâánâ.áENDFORâ'''

	def dispatch refCompile(V3Token v3) '''áv3.nameâ = áv3.valueâ;'''

	def dispatch refCompile(V4Token v4) '''áv4.nameâ'''

	def dispatch refCompile(LexerRule lr) '''álr.nameâ'''

}
