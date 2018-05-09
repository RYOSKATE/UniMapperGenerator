/**
 * generated by Xtext 2.13.0
 */
package net.unicoen.uniMapperGenerator.impl;

import net.unicoen.uniMapperGenerator.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UniMapperGeneratorFactoryImpl extends EFactoryImpl implements UniMapperGeneratorFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static UniMapperGeneratorFactory init()
  {
    try
    {
      UniMapperGeneratorFactory theUniMapperGeneratorFactory = (UniMapperGeneratorFactory)EPackage.Registry.INSTANCE.getEFactory(UniMapperGeneratorPackage.eNS_URI);
      if (theUniMapperGeneratorFactory != null)
      {
        return theUniMapperGeneratorFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new UniMapperGeneratorFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniMapperGeneratorFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case UniMapperGeneratorPackage.GRAMMAR: return createGrammar();
      case UniMapperGeneratorPackage.PREQUEL_CONSTRUCT: return createPrequelConstruct();
      case UniMapperGeneratorPackage.OPTIONS: return createOptions();
      case UniMapperGeneratorPackage.OPTION: return createOption();
      case UniMapperGeneratorPackage.TOKEN_VOCAB: return createTokenVocab();
      case UniMapperGeneratorPackage.OPTION_VALUE: return createOptionValue();
      case UniMapperGeneratorPackage.QUALIFIED_OPTION: return createQualifiedOption();
      case UniMapperGeneratorPackage.STRING_OPTION: return createStringOption();
      case UniMapperGeneratorPackage.ACTION_OPTION: return createActionOption();
      case UniMapperGeneratorPackage.INT_OPTION: return createIntOption();
      case UniMapperGeneratorPackage.IMPORTS: return createImports();
      case UniMapperGeneratorPackage.IMPORT: return createImport();
      case UniMapperGeneratorPackage.TOKENS: return createTokens();
      case UniMapperGeneratorPackage.V4_TOKENS: return createV4Tokens();
      case UniMapperGeneratorPackage.V4_TOKEN: return createV4Token();
      case UniMapperGeneratorPackage.EMPTY_TOKENS: return createEmptyTokens();
      case UniMapperGeneratorPackage.V3_TOKENS: return createV3Tokens();
      case UniMapperGeneratorPackage.V3_TOKEN: return createV3Token();
      case UniMapperGeneratorPackage.GRAMMAR_ACTION: return createGrammarAction();
      case UniMapperGeneratorPackage.MODE: return createMode();
      case UniMapperGeneratorPackage.RULE: return createRule();
      case UniMapperGeneratorPackage.PARSER_RULE: return createParserRule();
      case UniMapperGeneratorPackage.EXCEPTION_GROUP: return createExceptionGroup();
      case UniMapperGeneratorPackage.EXCEPTION_HANDLER: return createExceptionHandler();
      case UniMapperGeneratorPackage.FINALLY_CLAUSE: return createFinallyClause();
      case UniMapperGeneratorPackage.RETURN: return createReturn();
      case UniMapperGeneratorPackage.EXCEPTIONS: return createExceptions();
      case UniMapperGeneratorPackage.LOCAL_VARS: return createLocalVars();
      case UniMapperGeneratorPackage.RULE_PREQUEL: return createRulePrequel();
      case UniMapperGeneratorPackage.RULE_ACTION: return createRuleAction();
      case UniMapperGeneratorPackage.RULE_ALT_LIST: return createRuleAltList();
      case UniMapperGeneratorPackage.LABELED_ALT: return createLabeledAlt();
      case UniMapperGeneratorPackage.ALTERNATIVE: return createAlternative();
      case UniMapperGeneratorPackage.ELEMENT: return createElement();
      case UniMapperGeneratorPackage.EBNF: return createEbnf();
      case UniMapperGeneratorPackage.ACTION_ELEMENT: return createActionElement();
      case UniMapperGeneratorPackage.LABELED_ELEMENT: return createLabeledElement();
      case UniMapperGeneratorPackage.EBNF_SUFFIX: return createEbnfSuffix();
      case UniMapperGeneratorPackage.BLOCK: return createBlock();
      case UniMapperGeneratorPackage.ALT_LIST: return createAltList();
      case UniMapperGeneratorPackage.ATOM: return createAtom();
      case UniMapperGeneratorPackage.RULE_REF: return createRuleRef();
      case UniMapperGeneratorPackage.ELEMENT_OPTIONS: return createElementOptions();
      case UniMapperGeneratorPackage.RANGE: return createRange();
      case UniMapperGeneratorPackage.TERMINAL: return createTerminal();
      case UniMapperGeneratorPackage.TOKEN_REF: return createTokenRef();
      case UniMapperGeneratorPackage.NOT_SET: return createNotSet();
      case UniMapperGeneratorPackage.BLOCK_SET: return createBlockSet();
      case UniMapperGeneratorPackage.SET_ELEMENT: return createSetElement();
      case UniMapperGeneratorPackage.WILDCARD: return createWildcard();
      case UniMapperGeneratorPackage.ELEMENT_OPTION: return createElementOption();
      case UniMapperGeneratorPackage.UNICOEN_TYPE_DEC: return createUnicoenTypeDec();
      case UniMapperGeneratorPackage.UNICOEN_TYPE_IDENTIFIERS: return createUnicoenTypeIdentifiers();
      case UniMapperGeneratorPackage.LEXER_RULE: return createLexerRule();
      case UniMapperGeneratorPackage.LEXER_ALT_LIST: return createLexerAltList();
      case UniMapperGeneratorPackage.LEXER_ALT: return createLexerAlt();
      case UniMapperGeneratorPackage.LEXER_ELEMENTS: return createLexerElements();
      case UniMapperGeneratorPackage.LEXER_ELEMENT_WITH_DOLLAR: return createLexerElementWithDollar();
      case UniMapperGeneratorPackage.LEXER_ELEMENT: return createLexerElement();
      case UniMapperGeneratorPackage.LABELED_LEXER_ELEMENT: return createLabeledLexerElement();
      case UniMapperGeneratorPackage.LEXER_ATOM: return createLexerAtom();
      case UniMapperGeneratorPackage.LEXER_CHAR_SET: return createLexerCharSet();
      case UniMapperGeneratorPackage.LEXER_BLOCK: return createLexerBlock();
      case UniMapperGeneratorPackage.LEXER_COMMANDS: return createLexerCommands();
      case UniMapperGeneratorPackage.LEXER_COMMAND: return createLexerCommand();
      case UniMapperGeneratorPackage.LEXER_COMMAND_EXPR: return createLexerCommandExpr();
      case UniMapperGeneratorPackage.LEXER_COMMAND_ARG: return createLexerCommandArg();
      case UniMapperGeneratorPackage.QUALIFIED_ID: return createQualifiedId();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case UniMapperGeneratorPackage.GRAMMAR_TYPE:
        return createGrammarTypeFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case UniMapperGeneratorPackage.GRAMMAR_TYPE:
        return convertGrammarTypeToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grammar createGrammar()
  {
    GrammarImpl grammar = new GrammarImpl();
    return grammar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PrequelConstruct createPrequelConstruct()
  {
    PrequelConstructImpl prequelConstruct = new PrequelConstructImpl();
    return prequelConstruct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Options createOptions()
  {
    OptionsImpl options = new OptionsImpl();
    return options;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Option createOption()
  {
    OptionImpl option = new OptionImpl();
    return option;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TokenVocab createTokenVocab()
  {
    TokenVocabImpl tokenVocab = new TokenVocabImpl();
    return tokenVocab;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionValue createOptionValue()
  {
    OptionValueImpl optionValue = new OptionValueImpl();
    return optionValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedOption createQualifiedOption()
  {
    QualifiedOptionImpl qualifiedOption = new QualifiedOptionImpl();
    return qualifiedOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringOption createStringOption()
  {
    StringOptionImpl stringOption = new StringOptionImpl();
    return stringOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionOption createActionOption()
  {
    ActionOptionImpl actionOption = new ActionOptionImpl();
    return actionOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntOption createIntOption()
  {
    IntOptionImpl intOption = new IntOptionImpl();
    return intOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Imports createImports()
  {
    ImportsImpl imports = new ImportsImpl();
    return imports;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Import createImport()
  {
    ImportImpl import_ = new ImportImpl();
    return import_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Tokens createTokens()
  {
    TokensImpl tokens = new TokensImpl();
    return tokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public V4Tokens createV4Tokens()
  {
    V4TokensImpl v4Tokens = new V4TokensImpl();
    return v4Tokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public V4Token createV4Token()
  {
    V4TokenImpl v4Token = new V4TokenImpl();
    return v4Token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EmptyTokens createEmptyTokens()
  {
    EmptyTokensImpl emptyTokens = new EmptyTokensImpl();
    return emptyTokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public V3Tokens createV3Tokens()
  {
    V3TokensImpl v3Tokens = new V3TokensImpl();
    return v3Tokens;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public V3Token createV3Token()
  {
    V3TokenImpl v3Token = new V3TokenImpl();
    return v3Token;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GrammarAction createGrammarAction()
  {
    GrammarActionImpl grammarAction = new GrammarActionImpl();
    return grammarAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Mode createMode()
  {
    ModeImpl mode = new ModeImpl();
    return mode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Rule createRule()
  {
    RuleImpl rule = new RuleImpl();
    return rule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParserRule createParserRule()
  {
    ParserRuleImpl parserRule = new ParserRuleImpl();
    return parserRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionGroup createExceptionGroup()
  {
    ExceptionGroupImpl exceptionGroup = new ExceptionGroupImpl();
    return exceptionGroup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExceptionHandler createExceptionHandler()
  {
    ExceptionHandlerImpl exceptionHandler = new ExceptionHandlerImpl();
    return exceptionHandler;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FinallyClause createFinallyClause()
  {
    FinallyClauseImpl finallyClause = new FinallyClauseImpl();
    return finallyClause;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Return createReturn()
  {
    ReturnImpl return_ = new ReturnImpl();
    return return_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Exceptions createExceptions()
  {
    ExceptionsImpl exceptions = new ExceptionsImpl();
    return exceptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVars createLocalVars()
  {
    LocalVarsImpl localVars = new LocalVarsImpl();
    return localVars;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RulePrequel createRulePrequel()
  {
    RulePrequelImpl rulePrequel = new RulePrequelImpl();
    return rulePrequel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleAction createRuleAction()
  {
    RuleActionImpl ruleAction = new RuleActionImpl();
    return ruleAction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleAltList createRuleAltList()
  {
    RuleAltListImpl ruleAltList = new RuleAltListImpl();
    return ruleAltList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledAlt createLabeledAlt()
  {
    LabeledAltImpl labeledAlt = new LabeledAltImpl();
    return labeledAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alternative createAlternative()
  {
    AlternativeImpl alternative = new AlternativeImpl();
    return alternative;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element createElement()
  {
    ElementImpl element = new ElementImpl();
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Ebnf createEbnf()
  {
    EbnfImpl ebnf = new EbnfImpl();
    return ebnf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionElement createActionElement()
  {
    ActionElementImpl actionElement = new ActionElementImpl();
    return actionElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledElement createLabeledElement()
  {
    LabeledElementImpl labeledElement = new LabeledElementImpl();
    return labeledElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EbnfSuffix createEbnfSuffix()
  {
    EbnfSuffixImpl ebnfSuffix = new EbnfSuffixImpl();
    return ebnfSuffix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Block createBlock()
  {
    BlockImpl block = new BlockImpl();
    return block;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AltList createAltList()
  {
    AltListImpl altList = new AltListImpl();
    return altList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atom createAtom()
  {
    AtomImpl atom = new AtomImpl();
    return atom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RuleRef createRuleRef()
  {
    RuleRefImpl ruleRef = new RuleRefImpl();
    return ruleRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementOptions createElementOptions()
  {
    ElementOptionsImpl elementOptions = new ElementOptionsImpl();
    return elementOptions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Range createRange()
  {
    RangeImpl range = new RangeImpl();
    return range;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Terminal createTerminal()
  {
    TerminalImpl terminal = new TerminalImpl();
    return terminal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TokenRef createTokenRef()
  {
    TokenRefImpl tokenRef = new TokenRefImpl();
    return tokenRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotSet createNotSet()
  {
    NotSetImpl notSet = new NotSetImpl();
    return notSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BlockSet createBlockSet()
  {
    BlockSetImpl blockSet = new BlockSetImpl();
    return blockSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SetElement createSetElement()
  {
    SetElementImpl setElement = new SetElementImpl();
    return setElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Wildcard createWildcard()
  {
    WildcardImpl wildcard = new WildcardImpl();
    return wildcard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementOption createElementOption()
  {
    ElementOptionImpl elementOption = new ElementOptionImpl();
    return elementOption;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnicoenTypeDec createUnicoenTypeDec()
  {
    UnicoenTypeDecImpl unicoenTypeDec = new UnicoenTypeDecImpl();
    return unicoenTypeDec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UnicoenTypeIdentifiers createUnicoenTypeIdentifiers()
  {
    UnicoenTypeIdentifiersImpl unicoenTypeIdentifiers = new UnicoenTypeIdentifiersImpl();
    return unicoenTypeIdentifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerRule createLexerRule()
  {
    LexerRuleImpl lexerRule = new LexerRuleImpl();
    return lexerRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerAltList createLexerAltList()
  {
    LexerAltListImpl lexerAltList = new LexerAltListImpl();
    return lexerAltList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerAlt createLexerAlt()
  {
    LexerAltImpl lexerAlt = new LexerAltImpl();
    return lexerAlt;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerElements createLexerElements()
  {
    LexerElementsImpl lexerElements = new LexerElementsImpl();
    return lexerElements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerElementWithDollar createLexerElementWithDollar()
  {
    LexerElementWithDollarImpl lexerElementWithDollar = new LexerElementWithDollarImpl();
    return lexerElementWithDollar;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerElement createLexerElement()
  {
    LexerElementImpl lexerElement = new LexerElementImpl();
    return lexerElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LabeledLexerElement createLabeledLexerElement()
  {
    LabeledLexerElementImpl labeledLexerElement = new LabeledLexerElementImpl();
    return labeledLexerElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerAtom createLexerAtom()
  {
    LexerAtomImpl lexerAtom = new LexerAtomImpl();
    return lexerAtom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerCharSet createLexerCharSet()
  {
    LexerCharSetImpl lexerCharSet = new LexerCharSetImpl();
    return lexerCharSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerBlock createLexerBlock()
  {
    LexerBlockImpl lexerBlock = new LexerBlockImpl();
    return lexerBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerCommands createLexerCommands()
  {
    LexerCommandsImpl lexerCommands = new LexerCommandsImpl();
    return lexerCommands;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerCommand createLexerCommand()
  {
    LexerCommandImpl lexerCommand = new LexerCommandImpl();
    return lexerCommand;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerCommandExpr createLexerCommandExpr()
  {
    LexerCommandExprImpl lexerCommandExpr = new LexerCommandExprImpl();
    return lexerCommandExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LexerCommandArg createLexerCommandArg()
  {
    LexerCommandArgImpl lexerCommandArg = new LexerCommandArgImpl();
    return lexerCommandArg;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedId createQualifiedId()
  {
    QualifiedIdImpl qualifiedId = new QualifiedIdImpl();
    return qualifiedId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GrammarType createGrammarTypeFromString(EDataType eDataType, String initialValue)
  {
    GrammarType result = GrammarType.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertGrammarTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UniMapperGeneratorPackage getUniMapperGeneratorPackage()
  {
    return (UniMapperGeneratorPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static UniMapperGeneratorPackage getPackage()
  {
    return UniMapperGeneratorPackage.eINSTANCE;
  }

} //UniMapperGeneratorFactoryImpl
