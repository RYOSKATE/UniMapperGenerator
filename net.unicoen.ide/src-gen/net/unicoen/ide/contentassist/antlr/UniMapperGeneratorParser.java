/*
 * generated by Xtext 2.13.0
 */
package net.unicoen.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.HashMap;
import java.util.Map;
import net.unicoen.ide.contentassist.antlr.internal.InternalUniMapperGeneratorParser;
import net.unicoen.services.UniMapperGeneratorGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class UniMapperGeneratorParser extends AbstractContentAssistParser {

	@Inject
	private UniMapperGeneratorGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalUniMapperGeneratorParser createParser() {
		InternalUniMapperGeneratorParser result = new InternalUniMapperGeneratorParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getPrequelConstructAccess().getAlternatives(), "rule__PrequelConstruct__Alternatives");
					put(grammarAccess.getOptionAccess().getAlternatives(), "rule__Option__Alternatives");
					put(grammarAccess.getOptionValueAccess().getAlternatives(), "rule__OptionValue__Alternatives");
					put(grammarAccess.getImportAccess().getAlternatives(), "rule__Import__Alternatives");
					put(grammarAccess.getTokensAccess().getAlternatives(), "rule__Tokens__Alternatives");
					put(grammarAccess.getActionScopeAccess().getAlternatives(), "rule__ActionScope__Alternatives");
					put(grammarAccess.getRuleAccess().getAlternatives(), "rule__Rule__Alternatives");
					put(grammarAccess.getRulePrequelAccess().getAlternatives(), "rule__RulePrequel__Alternatives");
					put(grammarAccess.getElementAccess().getAlternatives(), "rule__Element__Alternatives");
					put(grammarAccess.getLabeledElementAccess().getOpAlternatives_1_0(), "rule__LabeledElement__OpAlternatives_1_0");
					put(grammarAccess.getLabeledElementAccess().getAlternatives_2(), "rule__LabeledElement__Alternatives_2");
					put(grammarAccess.getEbnfSuffixAccess().getAlternatives(), "rule__EbnfSuffix__Alternatives");
					put(grammarAccess.getAtomAccess().getAlternatives(), "rule__Atom__Alternatives");
					put(grammarAccess.getTerminalAccess().getAlternatives(), "rule__Terminal__Alternatives");
					put(grammarAccess.getTokenRefAccess().getAlternatives(), "rule__TokenRef__Alternatives");
					put(grammarAccess.getNotSetAccess().getAlternatives(), "rule__NotSet__Alternatives");
					put(grammarAccess.getSetElementAccess().getAlternatives(), "rule__SetElement__Alternatives");
					put(grammarAccess.getElementOptionAccess().getAlternatives(), "rule__ElementOption__Alternatives");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getAlternatives(), "rule__UnicoenTypeIdentifiers__Alternatives");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getDirAlternatives_1_1_0(), "rule__UnicoenTypeIdentifiers__DirAlternatives_1_1_0");
					put(grammarAccess.getLexerElementAccess().getAlternatives(), "rule__LexerElement__Alternatives");
					put(grammarAccess.getLabeledLexerElementAccess().getOpAlternatives_1_0(), "rule__LabeledLexerElement__OpAlternatives_1_0");
					put(grammarAccess.getLabeledLexerElementAccess().getAlternatives_2(), "rule__LabeledLexerElement__Alternatives_2");
					put(grammarAccess.getLexerAtomAccess().getAlternatives(), "rule__LexerAtom__Alternatives");
					put(grammarAccess.getLexerCommandAccess().getAlternatives(), "rule__LexerCommand__Alternatives");
					put(grammarAccess.getLexerCommandNameAccess().getAlternatives(), "rule__LexerCommandName__Alternatives");
					put(grammarAccess.getLexerCommandExprAccess().getAlternatives(), "rule__LexerCommandExpr__Alternatives");
					put(grammarAccess.getLexerCommandArgAccess().getAlternatives(), "rule__LexerCommandArg__Alternatives");
					put(grammarAccess.getId_Access().getAlternatives(), "rule__Id___Alternatives");
					put(grammarAccess.getGrammarTypeAccess().getAlternatives(), "rule__GrammarType__Alternatives");
					put(grammarAccess.getGrammarAccess().getGroup(), "rule__Grammar__Group__0");
					put(grammarAccess.getOptionsAccess().getGroup(), "rule__Options__Group__0");
					put(grammarAccess.getOptionsAccess().getGroup_2(), "rule__Options__Group_2__0");
					put(grammarAccess.getOptionAccess().getGroup_1(), "rule__Option__Group_1__0");
					put(grammarAccess.getTokenVocabAccess().getGroup(), "rule__TokenVocab__Group__0");
					put(grammarAccess.getImportsAccess().getGroup(), "rule__Imports__Group__0");
					put(grammarAccess.getImportsAccess().getGroup_2(), "rule__Imports__Group_2__0");
					put(grammarAccess.getImportAccess().getGroup_0(), "rule__Import__Group_0__0");
					put(grammarAccess.getV4TokensAccess().getGroup(), "rule__V4Tokens__Group__0");
					put(grammarAccess.getV4TokensAccess().getGroup_2(), "rule__V4Tokens__Group_2__0");
					put(grammarAccess.getEmptyTokensAccess().getGroup(), "rule__EmptyTokens__Group__0");
					put(grammarAccess.getV3TokensAccess().getGroup(), "rule__V3Tokens__Group__0");
					put(grammarAccess.getV3TokenAccess().getGroup(), "rule__V3Token__Group__0");
					put(grammarAccess.getV3TokenAccess().getGroup_1(), "rule__V3Token__Group_1__0");
					put(grammarAccess.getGrammarActionAccess().getGroup(), "rule__GrammarAction__Group__0");
					put(grammarAccess.getGrammarActionAccess().getGroup_1(), "rule__GrammarAction__Group_1__0");
					put(grammarAccess.getModeAccess().getGroup(), "rule__Mode__Group__0");
					put(grammarAccess.getParserRuleAccess().getGroup(), "rule__ParserRule__Group__0");
					put(grammarAccess.getExceptionGroupAccess().getGroup(), "rule__ExceptionGroup__Group__0");
					put(grammarAccess.getExceptionHandlerAccess().getGroup(), "rule__ExceptionHandler__Group__0");
					put(grammarAccess.getFinallyClauseAccess().getGroup(), "rule__FinallyClause__Group__0");
					put(grammarAccess.getReturnAccess().getGroup(), "rule__Return__Group__0");
					put(grammarAccess.getExceptionsAccess().getGroup(), "rule__Exceptions__Group__0");
					put(grammarAccess.getExceptionsAccess().getGroup_2(), "rule__Exceptions__Group_2__0");
					put(grammarAccess.getLocalVarsAccess().getGroup(), "rule__LocalVars__Group__0");
					put(grammarAccess.getRuleActionAccess().getGroup(), "rule__RuleAction__Group__0");
					put(grammarAccess.getRuleAltListAccess().getGroup(), "rule__RuleAltList__Group__0");
					put(grammarAccess.getRuleAltListAccess().getGroup_1(), "rule__RuleAltList__Group_1__0");
					put(grammarAccess.getLabeledAltAccess().getGroup(), "rule__LabeledAlt__Group__0");
					put(grammarAccess.getLabeledAltAccess().getGroup_1(), "rule__LabeledAlt__Group_1__0");
					put(grammarAccess.getAlternativeAccess().getGroup(), "rule__Alternative__Group__0");
					put(grammarAccess.getElementAccess().getGroup_0(), "rule__Element__Group_0__0");
					put(grammarAccess.getElementAccess().getGroup_1(), "rule__Element__Group_1__0");
					put(grammarAccess.getElementAccess().getGroup_1_2(), "rule__Element__Group_1_2__0");
					put(grammarAccess.getEbnfAccess().getGroup(), "rule__Ebnf__Group__0");
					put(grammarAccess.getActionElementAccess().getGroup(), "rule__ActionElement__Group__0");
					put(grammarAccess.getLabeledElementAccess().getGroup(), "rule__LabeledElement__Group__0");
					put(grammarAccess.getEbnfSuffixAccess().getGroup_0(), "rule__EbnfSuffix__Group_0__0");
					put(grammarAccess.getEbnfSuffixAccess().getGroup_1(), "rule__EbnfSuffix__Group_1__0");
					put(grammarAccess.getEbnfSuffixAccess().getGroup_2(), "rule__EbnfSuffix__Group_2__0");
					put(grammarAccess.getBlockAccess().getGroup(), "rule__Block__Group__0");
					put(grammarAccess.getBlockAccess().getGroup_1(), "rule__Block__Group_1__0");
					put(grammarAccess.getAltListAccess().getGroup(), "rule__AltList__Group__0");
					put(grammarAccess.getAltListAccess().getGroup_1(), "rule__AltList__Group_1__0");
					put(grammarAccess.getRuleRefAccess().getGroup(), "rule__RuleRef__Group__0");
					put(grammarAccess.getElementOptionsAccess().getGroup(), "rule__ElementOptions__Group__0");
					put(grammarAccess.getElementOptionsAccess().getGroup_2(), "rule__ElementOptions__Group_2__0");
					put(grammarAccess.getElementOptionsAccess().getGroup_2_1(), "rule__ElementOptions__Group_2_1__0");
					put(grammarAccess.getRangeAccess().getGroup(), "rule__Range__Group__0");
					put(grammarAccess.getTerminalAccess().getGroup_0(), "rule__Terminal__Group_0__0");
					put(grammarAccess.getTerminalAccess().getGroup_1(), "rule__Terminal__Group_1__0");
					put(grammarAccess.getNotSetAccess().getGroup_0(), "rule__NotSet__Group_0__0");
					put(grammarAccess.getNotSetAccess().getGroup_1(), "rule__NotSet__Group_1__0");
					put(grammarAccess.getBlockSetAccess().getGroup(), "rule__BlockSet__Group__0");
					put(grammarAccess.getBlockSetAccess().getGroup_2(), "rule__BlockSet__Group_2__0");
					put(grammarAccess.getWildcardAccess().getGroup(), "rule__Wildcard__Group__0");
					put(grammarAccess.getElementOptionAccess().getGroup_1(), "rule__ElementOption__Group_1__0");
					put(grammarAccess.getUnicoenTypeDecAccess().getGroup(), "rule__UnicoenTypeDec__Group__0");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getGroup_0(), "rule__UnicoenTypeIdentifiers__Group_0__0");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getGroup_0_1(), "rule__UnicoenTypeIdentifiers__Group_0_1__0");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getGroup_1(), "rule__UnicoenTypeIdentifiers__Group_1__0");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getGroup_1_3(), "rule__UnicoenTypeIdentifiers__Group_1_3__0");
					put(grammarAccess.getLexerRuleAccess().getGroup(), "rule__LexerRule__Group__0");
					put(grammarAccess.getLexerAltListAccess().getGroup(), "rule__LexerAltList__Group__0");
					put(grammarAccess.getLexerAltListAccess().getGroup_1(), "rule__LexerAltList__Group_1__0");
					put(grammarAccess.getLexerAltAccess().getGroup(), "rule__LexerAlt__Group__0");
					put(grammarAccess.getLexerElementsAccess().getGroup(), "rule__LexerElements__Group__0");
					put(grammarAccess.getLexerElementWithDollarAccess().getGroup(), "rule__LexerElementWithDollar__Group__0");
					put(grammarAccess.getLexerElementWithDollarAccess().getGroup_1(), "rule__LexerElementWithDollar__Group_1__0");
					put(grammarAccess.getLexerElementAccess().getGroup_0(), "rule__LexerElement__Group_0__0");
					put(grammarAccess.getLexerElementAccess().getGroup_1(), "rule__LexerElement__Group_1__0");
					put(grammarAccess.getLexerElementAccess().getGroup_2(), "rule__LexerElement__Group_2__0");
					put(grammarAccess.getLabeledLexerElementAccess().getGroup(), "rule__LabeledLexerElement__Group__0");
					put(grammarAccess.getLexerBlockAccess().getGroup(), "rule__LexerBlock__Group__0");
					put(grammarAccess.getLexerBlockAccess().getGroup_1(), "rule__LexerBlock__Group_1__0");
					put(grammarAccess.getLexerCommandsAccess().getGroup(), "rule__LexerCommands__Group__0");
					put(grammarAccess.getLexerCommandsAccess().getGroup_2(), "rule__LexerCommands__Group_2__0");
					put(grammarAccess.getLexerCommandAccess().getGroup_0(), "rule__LexerCommand__Group_0__0");
					put(grammarAccess.getQualifiedIdAccess().getGroup(), "rule__QualifiedId__Group__0");
					put(grammarAccess.getQualifiedIdAccess().getGroup_1(), "rule__QualifiedId__Group_1__0");
					put(grammarAccess.getGrammarAccess().getTypeAssignment_0(), "rule__Grammar__TypeAssignment_0");
					put(grammarAccess.getGrammarAccess().getNameAssignment_2(), "rule__Grammar__NameAssignment_2");
					put(grammarAccess.getGrammarAccess().getPrequelsAssignment_4(), "rule__Grammar__PrequelsAssignment_4");
					put(grammarAccess.getGrammarAccess().getRulesAssignment_5(), "rule__Grammar__RulesAssignment_5");
					put(grammarAccess.getGrammarAccess().getModesAssignment_6(), "rule__Grammar__ModesAssignment_6");
					put(grammarAccess.getOptionsAccess().getKeywordAssignment_1(), "rule__Options__KeywordAssignment_1");
					put(grammarAccess.getOptionsAccess().getOptionsAssignment_2_0(), "rule__Options__OptionsAssignment_2_0");
					put(grammarAccess.getOptionAccess().getNameAssignment_1_0(), "rule__Option__NameAssignment_1_0");
					put(grammarAccess.getOptionAccess().getValueAssignment_1_2(), "rule__Option__ValueAssignment_1_2");
					put(grammarAccess.getTokenVocabAccess().getNameAssignment_0(), "rule__TokenVocab__NameAssignment_0");
					put(grammarAccess.getTokenVocabAccess().getImportURIAssignment_2(), "rule__TokenVocab__ImportURIAssignment_2");
					put(grammarAccess.getQualifiedOptionAccess().getValueAssignment(), "rule__QualifiedOption__ValueAssignment");
					put(grammarAccess.getStringOptionAccess().getValueAssignment(), "rule__StringOption__ValueAssignment");
					put(grammarAccess.getActionOptionAccess().getValueAssignment(), "rule__ActionOption__ValueAssignment");
					put(grammarAccess.getIntOptionAccess().getValueAssignment(), "rule__IntOption__ValueAssignment");
					put(grammarAccess.getImportsAccess().getKeywordAssignment_0(), "rule__Imports__KeywordAssignment_0");
					put(grammarAccess.getImportsAccess().getImportsAssignment_1(), "rule__Imports__ImportsAssignment_1");
					put(grammarAccess.getImportsAccess().getImportsAssignment_2_1(), "rule__Imports__ImportsAssignment_2_1");
					put(grammarAccess.getImportAccess().getAliasAssignment_0_0(), "rule__Import__AliasAssignment_0_0");
					put(grammarAccess.getImportAccess().getImportURIAssignment_0_2(), "rule__Import__ImportURIAssignment_0_2");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getV4TokensAccess().getKeywordAssignment_0(), "rule__V4Tokens__KeywordAssignment_0");
					put(grammarAccess.getV4TokensAccess().getTokensAssignment_1(), "rule__V4Tokens__TokensAssignment_1");
					put(grammarAccess.getV4TokensAccess().getTokensAssignment_2_1(), "rule__V4Tokens__TokensAssignment_2_1");
					put(grammarAccess.getV4TokenAccess().getNameAssignment(), "rule__V4Token__NameAssignment");
					put(grammarAccess.getEmptyTokensAccess().getKeywordAssignment_1(), "rule__EmptyTokens__KeywordAssignment_1");
					put(grammarAccess.getV3TokensAccess().getKeywordAssignment_0(), "rule__V3Tokens__KeywordAssignment_0");
					put(grammarAccess.getV3TokensAccess().getTokensAssignment_1(), "rule__V3Tokens__TokensAssignment_1");
					put(grammarAccess.getV3TokenAccess().getNameAssignment_0(), "rule__V3Token__NameAssignment_0");
					put(grammarAccess.getV3TokenAccess().getValueAssignment_1_1(), "rule__V3Token__ValueAssignment_1_1");
					put(grammarAccess.getGrammarActionAccess().getAtSymbolAssignment_0(), "rule__GrammarAction__AtSymbolAssignment_0");
					put(grammarAccess.getGrammarActionAccess().getScopeAssignment_1_0(), "rule__GrammarAction__ScopeAssignment_1_0");
					put(grammarAccess.getGrammarActionAccess().getColonSymbolAssignment_1_1(), "rule__GrammarAction__ColonSymbolAssignment_1_1");
					put(grammarAccess.getGrammarActionAccess().getNameAssignment_2(), "rule__GrammarAction__NameAssignment_2");
					put(grammarAccess.getGrammarActionAccess().getActionAssignment_3(), "rule__GrammarAction__ActionAssignment_3");
					put(grammarAccess.getModeAccess().getIdAssignment_1(), "rule__Mode__IdAssignment_1");
					put(grammarAccess.getModeAccess().getRulesAssignment_3(), "rule__Mode__RulesAssignment_3");
					put(grammarAccess.getParserRuleAccess().getNameAssignment_0(), "rule__ParserRule__NameAssignment_0");
					put(grammarAccess.getParserRuleAccess().getArgsAssignment_1(), "rule__ParserRule__ArgsAssignment_1");
					put(grammarAccess.getParserRuleAccess().getReturnAssignment_2(), "rule__ParserRule__ReturnAssignment_2");
					put(grammarAccess.getParserRuleAccess().getThrowsAssignment_3(), "rule__ParserRule__ThrowsAssignment_3");
					put(grammarAccess.getParserRuleAccess().getLocalsAssignment_4(), "rule__ParserRule__LocalsAssignment_4");
					put(grammarAccess.getParserRuleAccess().getPrequelsAssignment_5(), "rule__ParserRule__PrequelsAssignment_5");
					put(grammarAccess.getParserRuleAccess().getTypeAssignment_6(), "rule__ParserRule__TypeAssignment_6");
					put(grammarAccess.getParserRuleAccess().getBodyAssignment_8(), "rule__ParserRule__BodyAssignment_8");
					put(grammarAccess.getParserRuleAccess().getCaughtAssignment_9(), "rule__ParserRule__CaughtAssignment_9");
					put(grammarAccess.getParserRuleAccess().getSemicolonSymbolAssignment_10(), "rule__ParserRule__SemicolonSymbolAssignment_10");
					put(grammarAccess.getExceptionGroupAccess().getHandlersAssignment_1(), "rule__ExceptionGroup__HandlersAssignment_1");
					put(grammarAccess.getExceptionGroupAccess().getFinallyAssignment_2(), "rule__ExceptionGroup__FinallyAssignment_2");
					put(grammarAccess.getExceptionHandlerAccess().getExceptionAssignment_1(), "rule__ExceptionHandler__ExceptionAssignment_1");
					put(grammarAccess.getExceptionHandlerAccess().getBodyAssignment_2(), "rule__ExceptionHandler__BodyAssignment_2");
					put(grammarAccess.getFinallyClauseAccess().getBodyAssignment_1(), "rule__FinallyClause__BodyAssignment_1");
					put(grammarAccess.getReturnAccess().getBodyAssignment_1(), "rule__Return__BodyAssignment_1");
					put(grammarAccess.getExceptionsAccess().getExceptionsAssignment_1(), "rule__Exceptions__ExceptionsAssignment_1");
					put(grammarAccess.getExceptionsAccess().getExceptionsAssignment_2_1(), "rule__Exceptions__ExceptionsAssignment_2_1");
					put(grammarAccess.getLocalVarsAccess().getBodyAssignment_1(), "rule__LocalVars__BodyAssignment_1");
					put(grammarAccess.getRuleActionAccess().getAtSymbolAssignment_0(), "rule__RuleAction__AtSymbolAssignment_0");
					put(grammarAccess.getRuleActionAccess().getNameAssignment_1(), "rule__RuleAction__NameAssignment_1");
					put(grammarAccess.getRuleActionAccess().getBodyAssignment_2(), "rule__RuleAction__BodyAssignment_2");
					put(grammarAccess.getRuleAltListAccess().getAlternativesAssignment_0(), "rule__RuleAltList__AlternativesAssignment_0");
					put(grammarAccess.getRuleAltListAccess().getAlternativesAssignment_1_1(), "rule__RuleAltList__AlternativesAssignment_1_1");
					put(grammarAccess.getLabeledAltAccess().getBodyAssignment_0(), "rule__LabeledAlt__BodyAssignment_0");
					put(grammarAccess.getLabeledAltAccess().getPoundSymbolAssignment_1_0(), "rule__LabeledAlt__PoundSymbolAssignment_1_0");
					put(grammarAccess.getLabeledAltAccess().getLabelAssignment_1_1(), "rule__LabeledAlt__LabelAssignment_1_1");
					put(grammarAccess.getAlternativeAccess().getOptionsAssignment_1(), "rule__Alternative__OptionsAssignment_1");
					put(grammarAccess.getAlternativeAccess().getElementsAssignment_2(), "rule__Alternative__ElementsAssignment_2");
					put(grammarAccess.getElementAccess().getBodyAssignment_0_0(), "rule__Element__BodyAssignment_0_0");
					put(grammarAccess.getElementAccess().getOperatorAssignment_0_1(), "rule__Element__OperatorAssignment_0_1");
					put(grammarAccess.getElementAccess().getBodyAssignment_1_0(), "rule__Element__BodyAssignment_1_0");
					put(grammarAccess.getElementAccess().getOperatorAssignment_1_1(), "rule__Element__OperatorAssignment_1_1");
					put(grammarAccess.getElementAccess().getOpAssignment_1_2_1(), "rule__Element__OpAssignment_1_2_1");
					put(grammarAccess.getElementAccess().getBodyAssignment_2(), "rule__Element__BodyAssignment_2");
					put(grammarAccess.getElementAccess().getBodyAssignment_3(), "rule__Element__BodyAssignment_3");
					put(grammarAccess.getEbnfAccess().getBodyAssignment_0(), "rule__Ebnf__BodyAssignment_0");
					put(grammarAccess.getEbnfAccess().getOperatorAssignment_1(), "rule__Ebnf__OperatorAssignment_1");
					put(grammarAccess.getActionElementAccess().getBodyAssignment_0(), "rule__ActionElement__BodyAssignment_0");
					put(grammarAccess.getActionElementAccess().getOptionsAssignment_1(), "rule__ActionElement__OptionsAssignment_1");
					put(grammarAccess.getLabeledElementAccess().getNameAssignment_0(), "rule__LabeledElement__NameAssignment_0");
					put(grammarAccess.getLabeledElementAccess().getOpAssignment_1(), "rule__LabeledElement__OpAssignment_1");
					put(grammarAccess.getLabeledElementAccess().getBodyAssignment_2_0(), "rule__LabeledElement__BodyAssignment_2_0");
					put(grammarAccess.getLabeledElementAccess().getBodyAssignment_2_1(), "rule__LabeledElement__BodyAssignment_2_1");
					put(grammarAccess.getEbnfSuffixAccess().getOperatorAssignment_0_0(), "rule__EbnfSuffix__OperatorAssignment_0_0");
					put(grammarAccess.getEbnfSuffixAccess().getNongreedyAssignment_0_1(), "rule__EbnfSuffix__NongreedyAssignment_0_1");
					put(grammarAccess.getEbnfSuffixAccess().getOperatorAssignment_1_0(), "rule__EbnfSuffix__OperatorAssignment_1_0");
					put(grammarAccess.getEbnfSuffixAccess().getNongreedyAssignment_1_1(), "rule__EbnfSuffix__NongreedyAssignment_1_1");
					put(grammarAccess.getEbnfSuffixAccess().getOperatorAssignment_2_0(), "rule__EbnfSuffix__OperatorAssignment_2_0");
					put(grammarAccess.getEbnfSuffixAccess().getNongreedyAssignment_2_1(), "rule__EbnfSuffix__NongreedyAssignment_2_1");
					put(grammarAccess.getBlockAccess().getOptionsAssignment_1_0(), "rule__Block__OptionsAssignment_1_0");
					put(grammarAccess.getBlockAccess().getActionsAssignment_1_1(), "rule__Block__ActionsAssignment_1_1");
					put(grammarAccess.getBlockAccess().getColonAssignment_1_2(), "rule__Block__ColonAssignment_1_2");
					put(grammarAccess.getBlockAccess().getBodyAssignment_2(), "rule__Block__BodyAssignment_2");
					put(grammarAccess.getAltListAccess().getAlternativesAssignment_0(), "rule__AltList__AlternativesAssignment_0");
					put(grammarAccess.getAltListAccess().getAlternativesAssignment_1_1(), "rule__AltList__AlternativesAssignment_1_1");
					put(grammarAccess.getAtomAccess().getBodyAssignment_0(), "rule__Atom__BodyAssignment_0");
					put(grammarAccess.getAtomAccess().getBodyAssignment_1(), "rule__Atom__BodyAssignment_1");
					put(grammarAccess.getAtomAccess().getBodyAssignment_2(), "rule__Atom__BodyAssignment_2");
					put(grammarAccess.getAtomAccess().getBodyAssignment_3(), "rule__Atom__BodyAssignment_3");
					put(grammarAccess.getAtomAccess().getBodyAssignment_4(), "rule__Atom__BodyAssignment_4");
					put(grammarAccess.getRuleRefAccess().getReferenceAssignment_0(), "rule__RuleRef__ReferenceAssignment_0");
					put(grammarAccess.getRuleRefAccess().getOptionsAssignment_1(), "rule__RuleRef__OptionsAssignment_1");
					put(grammarAccess.getElementOptionsAccess().getBeginAssignment_1(), "rule__ElementOptions__BeginAssignment_1");
					put(grammarAccess.getElementOptionsAccess().getOptionsAssignment_2_0(), "rule__ElementOptions__OptionsAssignment_2_0");
					put(grammarAccess.getElementOptionsAccess().getOptionsAssignment_2_1_1(), "rule__ElementOptions__OptionsAssignment_2_1_1");
					put(grammarAccess.getElementOptionsAccess().getEndAssignment_3(), "rule__ElementOptions__EndAssignment_3");
					put(grammarAccess.getRangeAccess().getFromAssignment_0(), "rule__Range__FromAssignment_0");
					put(grammarAccess.getRangeAccess().getToAssignment_2(), "rule__Range__ToAssignment_2");
					put(grammarAccess.getTerminalAccess().getReferenceAssignment_0_0(), "rule__Terminal__ReferenceAssignment_0_0");
					put(grammarAccess.getTerminalAccess().getOptionsAssignment_0_1(), "rule__Terminal__OptionsAssignment_0_1");
					put(grammarAccess.getTerminalAccess().getLiteralAssignment_1_0(), "rule__Terminal__LiteralAssignment_1_0");
					put(grammarAccess.getTerminalAccess().getOptionsAssignment_1_1(), "rule__Terminal__OptionsAssignment_1_1");
					put(grammarAccess.getTerminalAccess().getEofAssignment_2(), "rule__Terminal__EofAssignment_2");
					put(grammarAccess.getNotSetAccess().getBodyAssignment_0_1(), "rule__NotSet__BodyAssignment_0_1");
					put(grammarAccess.getNotSetAccess().getBodyAssignment_1_1(), "rule__NotSet__BodyAssignment_1_1");
					put(grammarAccess.getBlockSetAccess().getElementsAssignment_1(), "rule__BlockSet__ElementsAssignment_1");
					put(grammarAccess.getBlockSetAccess().getElementsAssignment_2_1(), "rule__BlockSet__ElementsAssignment_2_1");
					put(grammarAccess.getSetElementAccess().getTokenRefAssignment_0(), "rule__SetElement__TokenRefAssignment_0");
					put(grammarAccess.getSetElementAccess().getStringLiteralAssignment_1(), "rule__SetElement__StringLiteralAssignment_1");
					put(grammarAccess.getSetElementAccess().getRangeAssignment_2(), "rule__SetElement__RangeAssignment_2");
					put(grammarAccess.getSetElementAccess().getCharSetAssignment_3(), "rule__SetElement__CharSetAssignment_3");
					put(grammarAccess.getWildcardAccess().getDotAssignment_0(), "rule__Wildcard__DotAssignment_0");
					put(grammarAccess.getWildcardAccess().getOptionsAssignment_1(), "rule__Wildcard__OptionsAssignment_1");
					put(grammarAccess.getElementOptionAccess().getQualifiedIdAssignment_0(), "rule__ElementOption__QualifiedIdAssignment_0");
					put(grammarAccess.getElementOptionAccess().getIdAssignment_1_0(), "rule__ElementOption__IdAssignment_1_0");
					put(grammarAccess.getElementOptionAccess().getAssignAssignment_1_1(), "rule__ElementOption__AssignAssignment_1_1");
					put(grammarAccess.getElementOptionAccess().getValueAssignment_1_2(), "rule__ElementOption__ValueAssignment_1_2");
					put(grammarAccess.getUnicoenTypeDecAccess().getTypeAssignment_1(), "rule__UnicoenTypeDec__TypeAssignment_1");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getNameAssignment_0_0(), "rule__UnicoenTypeIdentifiers__NameAssignment_0_0");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getTypevalueAssignment_0_1_1(), "rule__UnicoenTypeIdentifiers__TypevalueAssignment_0_1_1");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getDirAssignment_1_1(), "rule__UnicoenTypeIdentifiers__DirAssignment_1_1");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getFieldvalueAssignment_1_2(), "rule__UnicoenTypeIdentifiers__FieldvalueAssignment_1_2");
					put(grammarAccess.getUnicoenTypeIdentifiersAccess().getFieldvalueAssignment_1_3_1(), "rule__UnicoenTypeIdentifiers__FieldvalueAssignment_1_3_1");
					put(grammarAccess.getLexerRuleAccess().getFragmentAssignment_0(), "rule__LexerRule__FragmentAssignment_0");
					put(grammarAccess.getLexerRuleAccess().getNameAssignment_1(), "rule__LexerRule__NameAssignment_1");
					put(grammarAccess.getLexerRuleAccess().getTypeAssignment_2(), "rule__LexerRule__TypeAssignment_2");
					put(grammarAccess.getLexerRuleAccess().getBodyAssignment_4(), "rule__LexerRule__BodyAssignment_4");
					put(grammarAccess.getLexerRuleAccess().getSemicolonSymbolAssignment_5(), "rule__LexerRule__SemicolonSymbolAssignment_5");
					put(grammarAccess.getLexerAltListAccess().getAlternativesAssignment_0(), "rule__LexerAltList__AlternativesAssignment_0");
					put(grammarAccess.getLexerAltListAccess().getAlternativesAssignment_1_1(), "rule__LexerAltList__AlternativesAssignment_1_1");
					put(grammarAccess.getLexerAltAccess().getBodyAssignment_0(), "rule__LexerAlt__BodyAssignment_0");
					put(grammarAccess.getLexerAltAccess().getCommandsAssignment_1(), "rule__LexerAlt__CommandsAssignment_1");
					put(grammarAccess.getLexerElementsAccess().getElementsAssignment_1(), "rule__LexerElements__ElementsAssignment_1");
					put(grammarAccess.getLexerElementWithDollarAccess().getBodyAssignment_0(), "rule__LexerElementWithDollar__BodyAssignment_0");
					put(grammarAccess.getLexerElementWithDollarAccess().getOpAssignment_1_1(), "rule__LexerElementWithDollar__OpAssignment_1_1");
					put(grammarAccess.getLexerElementAccess().getBodyAssignment_0_0(), "rule__LexerElement__BodyAssignment_0_0");
					put(grammarAccess.getLexerElementAccess().getOperatorAssignment_0_1(), "rule__LexerElement__OperatorAssignment_0_1");
					put(grammarAccess.getLexerElementAccess().getBodyAssignment_1_0(), "rule__LexerElement__BodyAssignment_1_0");
					put(grammarAccess.getLexerElementAccess().getOperatorAssignment_1_1(), "rule__LexerElement__OperatorAssignment_1_1");
					put(grammarAccess.getLexerElementAccess().getBodyAssignment_2_0(), "rule__LexerElement__BodyAssignment_2_0");
					put(grammarAccess.getLexerElementAccess().getOperatorAssignment_2_1(), "rule__LexerElement__OperatorAssignment_2_1");
					put(grammarAccess.getLexerElementAccess().getBodyAssignment_3(), "rule__LexerElement__BodyAssignment_3");
					put(grammarAccess.getLabeledLexerElementAccess().getLabelAssignment_0(), "rule__LabeledLexerElement__LabelAssignment_0");
					put(grammarAccess.getLabeledLexerElementAccess().getOpAssignment_1(), "rule__LabeledLexerElement__OpAssignment_1");
					put(grammarAccess.getLabeledLexerElementAccess().getBodyAssignment_2_0(), "rule__LabeledLexerElement__BodyAssignment_2_0");
					put(grammarAccess.getLabeledLexerElementAccess().getBodyAssignment_2_1(), "rule__LabeledLexerElement__BodyAssignment_2_1");
					put(grammarAccess.getLexerAtomAccess().getBodyAssignment_0(), "rule__LexerAtom__BodyAssignment_0");
					put(grammarAccess.getLexerAtomAccess().getBodyAssignment_1(), "rule__LexerAtom__BodyAssignment_1");
					put(grammarAccess.getLexerAtomAccess().getBodyAssignment_2(), "rule__LexerAtom__BodyAssignment_2");
					put(grammarAccess.getLexerAtomAccess().getBodyAssignment_3(), "rule__LexerAtom__BodyAssignment_3");
					put(grammarAccess.getLexerAtomAccess().getBodyAssignment_4(), "rule__LexerAtom__BodyAssignment_4");
					put(grammarAccess.getLexerAtomAccess().getBodyAssignment_5(), "rule__LexerAtom__BodyAssignment_5");
					put(grammarAccess.getLexerCharSetAccess().getBodyAssignment(), "rule__LexerCharSet__BodyAssignment");
					put(grammarAccess.getLexerBlockAccess().getOptionsAssignment_1_0(), "rule__LexerBlock__OptionsAssignment_1_0");
					put(grammarAccess.getLexerBlockAccess().getBodyAssignment_2(), "rule__LexerBlock__BodyAssignment_2");
					put(grammarAccess.getLexerCommandsAccess().getKeywordAssignment_0(), "rule__LexerCommands__KeywordAssignment_0");
					put(grammarAccess.getLexerCommandsAccess().getCommandsAssignment_1(), "rule__LexerCommands__CommandsAssignment_1");
					put(grammarAccess.getLexerCommandsAccess().getCommandsAssignment_2_1(), "rule__LexerCommands__CommandsAssignment_2_1");
					put(grammarAccess.getLexerCommandAccess().getNameAssignment_0_0(), "rule__LexerCommand__NameAssignment_0_0");
					put(grammarAccess.getLexerCommandAccess().getArgsAssignment_0_2(), "rule__LexerCommand__ArgsAssignment_0_2");
					put(grammarAccess.getLexerCommandAccess().getNameAssignment_1(), "rule__LexerCommand__NameAssignment_1");
					put(grammarAccess.getLexerCommandExprAccess().getRefAssignment_0(), "rule__LexerCommandExpr__RefAssignment_0");
					put(grammarAccess.getLexerCommandExprAccess().getValueAssignment_1(), "rule__LexerCommandExpr__ValueAssignment_1");
					put(grammarAccess.getQualifiedIdAccess().getNameAssignment_0(), "rule__QualifiedId__NameAssignment_0");
					put(grammarAccess.getQualifiedIdAccess().getNameAssignment_1_1(), "rule__QualifiedId__NameAssignment_1_1");
				}
			};
		}
		return nameMappings.get(element);
	}
			
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public UniMapperGeneratorGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(UniMapperGeneratorGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
