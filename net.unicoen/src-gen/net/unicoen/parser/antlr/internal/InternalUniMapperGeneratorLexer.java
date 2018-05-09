package net.unicoen.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalUniMapperGeneratorLexer extends Lexer {
    public static final int RULE_ACTION=7;
    public static final int T__50=50;
    public static final int RULE_ARG_OR_CHARSET=11;
    public static final int RULE_NAME_CHAR=17;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_NESTED_ACTION=22;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int RULE_TOKEN_VOCAB=5;
    public static final int RULE_ACTION_ESC=23;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=31;
    public static final int RULE_ESC=20;
    public static final int RULE_COLON=12;
    public static final int RULE_LEXER_CHAR_SET=27;
    public static final int RULE_ACTION_STRING_LITERAL=24;
    public static final int RULE_INT=8;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=29;
    public static final int RULE_TOKENS_SPEC=9;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int RULE_TOKEN_REF=14;
    public static final int RULE_DOLLAR=13;
    public static final int RULE_RARROW=15;
    public static final int RULE_STRING=6;
    public static final int RULE_ARG_ACTION=26;
    public static final int RULE_SL_COMMENT=28;
    public static final int RULE_OPTIONS_SPEC=4;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_RULE_REF=10;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int RULE_WS=30;
    public static final int RULE_LITERAL_CHAR=19;
    public static final int RULE_ANY_OTHER=32;
    public static final int RULE_NAME_START_CHAR=18;
    public static final int RULE_ACTION_CHAR_LITERAL=25;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int RULE_XDIGIT=21;
    public static final int T__45=45;
    public static final int RULE_WSNLCHARS=16;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators

    public InternalUniMapperGeneratorLexer() {;} 
    public InternalUniMapperGeneratorLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalUniMapperGeneratorLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalUniMapperGenerator.g"; }

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:11:7: ( 'grammar' )
            // InternalUniMapperGenerator.g:11:9: 'grammar'
            {
            match("grammar"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:12:7: ( ';' )
            // InternalUniMapperGenerator.g:12:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:13:7: ( '}' )
            // InternalUniMapperGenerator.g:13:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:14:7: ( '=' )
            // InternalUniMapperGenerator.g:14:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:15:7: ( 'import' )
            // InternalUniMapperGenerator.g:15:9: 'import'
            {
            match("import"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:16:7: ( ',' )
            // InternalUniMapperGenerator.g:16:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:17:7: ( '@' )
            // InternalUniMapperGenerator.g:17:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:18:7: ( '::' )
            // InternalUniMapperGenerator.g:18:9: '::'
            {
            match("::"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:19:7: ( 'parser' )
            // InternalUniMapperGenerator.g:19:9: 'parser'
            {
            match("parser"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:20:7: ( 'lexer' )
            // InternalUniMapperGenerator.g:20:9: 'lexer'
            {
            match("lexer"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:21:7: ( 'tree' )
            // InternalUniMapperGenerator.g:21:9: 'tree'
            {
            match("tree"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:22:7: ( 'mode' )
            // InternalUniMapperGenerator.g:22:9: 'mode'
            {
            match("mode"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:23:7: ( 'catch' )
            // InternalUniMapperGenerator.g:23:9: 'catch'
            {
            match("catch"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:24:7: ( 'finally' )
            // InternalUniMapperGenerator.g:24:9: 'finally'
            {
            match("finally"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:25:7: ( 'returns' )
            // InternalUniMapperGenerator.g:25:9: 'returns'
            {
            match("returns"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:26:7: ( 'throws' )
            // InternalUniMapperGenerator.g:26:9: 'throws'
            {
            match("throws"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:27:7: ( 'locals' )
            // InternalUniMapperGenerator.g:27:9: 'locals'
            {
            match("locals"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:28:7: ( '|' )
            // InternalUniMapperGenerator.g:28:9: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:29:7: ( '#' )
            // InternalUniMapperGenerator.g:29:9: '#'
            {
            match('#'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:30:7: ( '+=' )
            // InternalUniMapperGenerator.g:30:9: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:31:7: ( '?' )
            // InternalUniMapperGenerator.g:31:9: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:32:7: ( '*' )
            // InternalUniMapperGenerator.g:32:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:33:7: ( '+' )
            // InternalUniMapperGenerator.g:33:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:34:7: ( '(' )
            // InternalUniMapperGenerator.g:34:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:35:7: ( ')' )
            // InternalUniMapperGenerator.g:35:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:36:7: ( '<' )
            // InternalUniMapperGenerator.g:36:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:37:7: ( '>' )
            // InternalUniMapperGenerator.g:37:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:38:7: ( '..' )
            // InternalUniMapperGenerator.g:38:9: '..'
            {
            match(".."); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:39:7: ( 'EOF2' )
            // InternalUniMapperGenerator.g:39:9: 'EOF2'
            {
            match("EOF2"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:40:7: ( '~' )
            // InternalUniMapperGenerator.g:40:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:41:7: ( '.' )
            // InternalUniMapperGenerator.g:41:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:42:7: ( '=>' )
            // InternalUniMapperGenerator.g:42:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:43:7: ( 'fragment' )
            // InternalUniMapperGenerator.g:43:9: 'fragment'
            {
            match("fragment"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:44:7: ( 'default_hack_' )
            // InternalUniMapperGenerator.g:44:9: 'default_hack_'
            {
            match("default_hack_"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "RULE_TOKEN_VOCAB"
    public final void mRULE_TOKEN_VOCAB() throws RecognitionException {
        try {
            int _type = RULE_TOKEN_VOCAB;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5128:18: ( 'tokenVocab' )
            // InternalUniMapperGenerator.g:5128:20: 'tokenVocab'
            {
            match("tokenVocab"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOKEN_VOCAB"

    // $ANTLR start "RULE_COLON"
    public final void mRULE_COLON() throws RecognitionException {
        try {
            int _type = RULE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5130:12: ( ':' )
            // InternalUniMapperGenerator.g:5130:14: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_COLON"

    // $ANTLR start "RULE_RARROW"
    public final void mRULE_RARROW() throws RecognitionException {
        try {
            int _type = RULE_RARROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5132:13: ( '->' )
            // InternalUniMapperGenerator.g:5132:15: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RARROW"

    // $ANTLR start "RULE_OPTIONS_SPEC"
    public final void mRULE_OPTIONS_SPEC() throws RecognitionException {
        try {
            int _type = RULE_OPTIONS_SPEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5134:19: ( 'options' ( RULE_WSNLCHARS )* '{' )
            // InternalUniMapperGenerator.g:5134:21: 'options' ( RULE_WSNLCHARS )* '{'
            {
            match("options"); 

            // InternalUniMapperGenerator.g:5134:31: ( RULE_WSNLCHARS )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\t' && LA1_0<='\n')||(LA1_0>='\f' && LA1_0<='\r')||LA1_0==' ') ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5134:31: RULE_WSNLCHARS
            	    {
            	    mRULE_WSNLCHARS(); 

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_OPTIONS_SPEC"

    // $ANTLR start "RULE_TOKENS_SPEC"
    public final void mRULE_TOKENS_SPEC() throws RecognitionException {
        try {
            int _type = RULE_TOKENS_SPEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5136:18: ( 'tokens' ( RULE_WSNLCHARS )* '{' )
            // InternalUniMapperGenerator.g:5136:20: 'tokens' ( RULE_WSNLCHARS )* '{'
            {
            match("tokens"); 

            // InternalUniMapperGenerator.g:5136:29: ( RULE_WSNLCHARS )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='\t' && LA2_0<='\n')||(LA2_0>='\f' && LA2_0<='\r')||LA2_0==' ') ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5136:29: RULE_WSNLCHARS
            	    {
            	    mRULE_WSNLCHARS(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOKENS_SPEC"

    // $ANTLR start "RULE_RULE_REF"
    public final void mRULE_RULE_REF() throws RecognitionException {
        try {
            int _type = RULE_RULE_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5138:15: ( 'a' .. 'z' ( RULE_NAME_CHAR )* )
            // InternalUniMapperGenerator.g:5138:17: 'a' .. 'z' ( RULE_NAME_CHAR )*
            {
            matchRange('a','z'); 
            // InternalUniMapperGenerator.g:5138:26: ( RULE_NAME_CHAR )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')||(LA3_0>='A' && LA3_0<='Z')||LA3_0=='_'||(LA3_0>='a' && LA3_0<='z')||LA3_0=='\u00B7'||(LA3_0>='\u00C0' && LA3_0<='\u00D6')||(LA3_0>='\u00D8' && LA3_0<='\u00F6')||(LA3_0>='\u00F8' && LA3_0<='\u037D')||(LA3_0>='\u037F' && LA3_0<='\u1FFF')||(LA3_0>='\u200C' && LA3_0<='\u200D')||(LA3_0>='\u203F' && LA3_0<='\u2040')||(LA3_0>='\u2070' && LA3_0<='\u218F')||(LA3_0>='\u2C00' && LA3_0<='\u2FEF')||(LA3_0>='\u3001' && LA3_0<='\uD7FF')||(LA3_0>='\uF900' && LA3_0<='\uFDCF')||(LA3_0>='\uFDF0' && LA3_0<='\uFFFD')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5138:26: RULE_NAME_CHAR
            	    {
            	    mRULE_NAME_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_RULE_REF"

    // $ANTLR start "RULE_TOKEN_REF"
    public final void mRULE_TOKEN_REF() throws RecognitionException {
        try {
            int _type = RULE_TOKEN_REF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5140:16: ( 'A' .. 'Z' ( RULE_NAME_CHAR )* )
            // InternalUniMapperGenerator.g:5140:18: 'A' .. 'Z' ( RULE_NAME_CHAR )*
            {
            matchRange('A','Z'); 
            // InternalUniMapperGenerator.g:5140:27: ( RULE_NAME_CHAR )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')||LA4_0=='\u00B7'||(LA4_0>='\u00C0' && LA4_0<='\u00D6')||(LA4_0>='\u00D8' && LA4_0<='\u00F6')||(LA4_0>='\u00F8' && LA4_0<='\u037D')||(LA4_0>='\u037F' && LA4_0<='\u1FFF')||(LA4_0>='\u200C' && LA4_0<='\u200D')||(LA4_0>='\u203F' && LA4_0<='\u2040')||(LA4_0>='\u2070' && LA4_0<='\u218F')||(LA4_0>='\u2C00' && LA4_0<='\u2FEF')||(LA4_0>='\u3001' && LA4_0<='\uD7FF')||(LA4_0>='\uF900' && LA4_0<='\uFDCF')||(LA4_0>='\uFDF0' && LA4_0<='\uFFFD')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5140:27: RULE_NAME_CHAR
            	    {
            	    mRULE_NAME_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_TOKEN_REF"

    // $ANTLR start "RULE_NAME_CHAR"
    public final void mRULE_NAME_CHAR() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5142:25: ( ( RULE_NAME_START_CHAR | '0' .. '9' | '_' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' ) )
            // InternalUniMapperGenerator.g:5142:27: ( RULE_NAME_START_CHAR | '0' .. '9' | '_' | '\\u00B7' | '\\u0300' .. '\\u036F' | '\\u203F' .. '\\u2040' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z')||input.LA(1)=='\u00B7'||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u203F' && input.LA(1)<='\u2040')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME_CHAR"

    // $ANTLR start "RULE_NAME_START_CHAR"
    public final void mRULE_NAME_START_CHAR() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5144:31: ( ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' ) )
            // InternalUniMapperGenerator.g:5144:33: ( 'A' .. 'Z' | 'a' .. 'z' | '\\u00C0' .. '\\u00D6' | '\\u00D8' .. '\\u00F6' | '\\u00F8' .. '\\u02FF' | '\\u0370' .. '\\u037D' | '\\u037F' .. '\\u1FFF' | '\\u200C' .. '\\u200D' | '\\u2070' .. '\\u218F' | '\\u2C00' .. '\\u2FEF' | '\\u3001' .. '\\uD7FF' | '\\uF900' .. '\\uFDCF' | '\\uFDF0' .. '\\uFFFD' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z')||(input.LA(1)>='\u00C0' && input.LA(1)<='\u00D6')||(input.LA(1)>='\u00D8' && input.LA(1)<='\u00F6')||(input.LA(1)>='\u00F8' && input.LA(1)<='\u02FF')||(input.LA(1)>='\u0370' && input.LA(1)<='\u037D')||(input.LA(1)>='\u037F' && input.LA(1)<='\u1FFF')||(input.LA(1)>='\u200C' && input.LA(1)<='\u200D')||(input.LA(1)>='\u2070' && input.LA(1)<='\u218F')||(input.LA(1)>='\u2C00' && input.LA(1)<='\u2FEF')||(input.LA(1)>='\u3001' && input.LA(1)<='\uD7FF')||(input.LA(1)>='\uF900' && input.LA(1)<='\uFDCF')||(input.LA(1)>='\uFDF0' && input.LA(1)<='\uFFFD') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME_START_CHAR"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5146:13: ( '\\'' ( RULE_LITERAL_CHAR )* '\\'' )
            // InternalUniMapperGenerator.g:5146:15: '\\'' ( RULE_LITERAL_CHAR )* '\\''
            {
            match('\''); 
            // InternalUniMapperGenerator.g:5146:20: ( RULE_LITERAL_CHAR )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5146:20: RULE_LITERAL_CHAR
            	    {
            	    mRULE_LITERAL_CHAR(); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_LITERAL_CHAR"
    public final void mRULE_LITERAL_CHAR() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5148:28: ( ( RULE_ESC | ~ ( ( '\\'' | '\\\\' ) ) ) )
            // InternalUniMapperGenerator.g:5148:30: ( RULE_ESC | ~ ( ( '\\'' | '\\\\' ) ) )
            {
            // InternalUniMapperGenerator.g:5148:30: ( RULE_ESC | ~ ( ( '\\'' | '\\\\' ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\\') ) {
                alt6=1;
            }
            else if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalUniMapperGenerator.g:5148:31: RULE_ESC
                    {
                    mRULE_ESC(); 

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:5148:40: ~ ( ( '\\'' | '\\\\' ) )
                    {
                    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}


                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LITERAL_CHAR"

    // $ANTLR start "RULE_ESC"
    public final void mRULE_ESC() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5150:19: ( '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT | . ) )
            // InternalUniMapperGenerator.g:5150:21: '\\\\' ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT | . )
            {
            match('\\'); 
            // InternalUniMapperGenerator.g:5150:26: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT | . )
            int alt7=11;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // InternalUniMapperGenerator.g:5150:27: 'n'
                    {
                    match('n'); 

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:5150:31: 'r'
                    {
                    match('r'); 

                    }
                    break;
                case 3 :
                    // InternalUniMapperGenerator.g:5150:35: 't'
                    {
                    match('t'); 

                    }
                    break;
                case 4 :
                    // InternalUniMapperGenerator.g:5150:39: 'b'
                    {
                    match('b'); 

                    }
                    break;
                case 5 :
                    // InternalUniMapperGenerator.g:5150:43: 'f'
                    {
                    match('f'); 

                    }
                    break;
                case 6 :
                    // InternalUniMapperGenerator.g:5150:47: '\"'
                    {
                    match('\"'); 

                    }
                    break;
                case 7 :
                    // InternalUniMapperGenerator.g:5150:51: '\\''
                    {
                    match('\''); 

                    }
                    break;
                case 8 :
                    // InternalUniMapperGenerator.g:5150:56: '\\\\'
                    {
                    match('\\'); 

                    }
                    break;
                case 9 :
                    // InternalUniMapperGenerator.g:5150:61: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 10 :
                    // InternalUniMapperGenerator.g:5150:65: 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT
                    {
                    match('u'); 
                    mRULE_XDIGIT(); 
                    mRULE_XDIGIT(); 
                    mRULE_XDIGIT(); 
                    mRULE_XDIGIT(); 

                    }
                    break;
                case 11 :
                    // InternalUniMapperGenerator.g:5150:117: .
                    {
                    matchAny(); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ESC"

    // $ANTLR start "RULE_XDIGIT"
    public final void mRULE_XDIGIT() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5152:22: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // InternalUniMapperGenerator.g:5152:24: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_XDIGIT"

    // $ANTLR start "RULE_ACTION"
    public final void mRULE_ACTION() throws RecognitionException {
        try {
            int _type = RULE_ACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5154:13: ( RULE_NESTED_ACTION )
            // InternalUniMapperGenerator.g:5154:15: RULE_NESTED_ACTION
            {
            mRULE_NESTED_ACTION(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTION"

    // $ANTLR start "RULE_NESTED_ACTION"
    public final void mRULE_NESTED_ACTION() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5156:29: ( '___nested_action_' )
            // InternalUniMapperGenerator.g:5156:31: '___nested_action_'
            {
            match("___nested_action_"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_NESTED_ACTION"

    // $ANTLR start "RULE_ACTION_STRING_LITERAL"
    public final void mRULE_ACTION_STRING_LITERAL() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5158:37: ( '\"' ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // InternalUniMapperGenerator.g:5158:39: '\"' ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // InternalUniMapperGenerator.g:5158:43: ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\"' ) ) )*
            loop8:
            do {
                int alt8=3;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\\') ) {
                    alt8=1;
                }
                else if ( ((LA8_0>='\u0000' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='[')||(LA8_0>=']' && LA8_0<='\uFFFF')) ) {
                    alt8=2;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5158:44: RULE_ACTION_ESC
            	    {
            	    mRULE_ACTION_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalUniMapperGenerator.g:5158:60: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            match('\"'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTION_STRING_LITERAL"

    // $ANTLR start "RULE_ACTION_CHAR_LITERAL"
    public final void mRULE_ACTION_CHAR_LITERAL() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5160:35: ( '\\'' ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            // InternalUniMapperGenerator.g:5160:37: '\\'' ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
            {
            match('\''); 
            // InternalUniMapperGenerator.g:5160:42: ( RULE_ACTION_ESC | ~ ( ( '\\\\' | '\\'' ) ) )*
            loop9:
            do {
                int alt9=3;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='\\') ) {
                    alt9=1;
                }
                else if ( ((LA9_0>='\u0000' && LA9_0<='&')||(LA9_0>='(' && LA9_0<='[')||(LA9_0>=']' && LA9_0<='\uFFFF')) ) {
                    alt9=2;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5160:43: RULE_ACTION_ESC
            	    {
            	    mRULE_ACTION_ESC(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalUniMapperGenerator.g:5160:59: ~ ( ( '\\\\' | '\\'' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match('\''); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTION_CHAR_LITERAL"

    // $ANTLR start "RULE_ACTION_ESC"
    public final void mRULE_ACTION_ESC() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5162:26: ( '\\\\' . )
            // InternalUniMapperGenerator.g:5162:28: '\\\\' .
            {
            match('\\'); 
            matchAny(); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ACTION_ESC"

    // $ANTLR start "RULE_DOLLAR"
    public final void mRULE_DOLLAR() throws RecognitionException {
        try {
            int _type = RULE_DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5164:13: ( '$' )
            // InternalUniMapperGenerator.g:5164:15: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DOLLAR"

    // $ANTLR start "RULE_ARG_OR_CHARSET"
    public final void mRULE_ARG_OR_CHARSET() throws RecognitionException {
        try {
            int _type = RULE_ARG_OR_CHARSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5166:21: ( ( RULE_ARG_ACTION | RULE_LEXER_CHAR_SET ) )
            // InternalUniMapperGenerator.g:5166:23: ( RULE_ARG_ACTION | RULE_LEXER_CHAR_SET )
            {
            // InternalUniMapperGenerator.g:5166:23: ( RULE_ARG_ACTION | RULE_LEXER_CHAR_SET )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='[') ) {
                alt10=1;
            }
            else if ( (LA10_0=='_') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalUniMapperGenerator.g:5166:24: RULE_ARG_ACTION
                    {
                    mRULE_ARG_ACTION(); 

                    }
                    break;
                case 2 :
                    // InternalUniMapperGenerator.g:5166:40: RULE_LEXER_CHAR_SET
                    {
                    mRULE_LEXER_CHAR_SET(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARG_OR_CHARSET"

    // $ANTLR start "RULE_LEXER_CHAR_SET"
    public final void mRULE_LEXER_CHAR_SET() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5168:30: ( '___lexer_char_set_' )
            // InternalUniMapperGenerator.g:5168:32: '___lexer_char_set_'
            {
            match("___lexer_char_set_"); 


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_LEXER_CHAR_SET"

    // $ANTLR start "RULE_ARG_ACTION"
    public final void mRULE_ARG_ACTION() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5170:26: ( '[' (~ ( ( '[' | ']' ) ) )* ']' )
            // InternalUniMapperGenerator.g:5170:28: '[' (~ ( ( '[' | ']' ) ) )* ']'
            {
            match('['); 
            // InternalUniMapperGenerator.g:5170:32: (~ ( ( '[' | ']' ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\u0000' && LA11_0<='Z')||LA11_0=='\\'||(LA11_0>='^' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5170:32: ~ ( ( '[' | ']' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='Z')||input.LA(1)=='\\'||(input.LA(1)>='^' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match(']'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ARG_ACTION"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5172:17: ( '//' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n' )
            // InternalUniMapperGenerator.g:5172:19: '//' (~ ( ( '\\r' | '\\n' ) ) )* ( '\\r' )? '\\n'
            {
            match("//"); 

            // InternalUniMapperGenerator.g:5172:24: (~ ( ( '\\r' | '\\n' ) ) )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='\u0000' && LA12_0<='\t')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\uFFFF')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5172:24: ~ ( ( '\\r' | '\\n' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            // InternalUniMapperGenerator.g:5172:40: ( '\\r' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\r') ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalUniMapperGenerator.g:5172:40: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }

            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5174:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalUniMapperGenerator.g:5174:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalUniMapperGenerator.g:5174:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5174:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5176:9: ( ( ' ' | '\\t' | '\\f' | ( '\\r' )? '\\n' )+ )
            // InternalUniMapperGenerator.g:5176:11: ( ' ' | '\\t' | '\\f' | ( '\\r' )? '\\n' )+
            {
            // InternalUniMapperGenerator.g:5176:11: ( ' ' | '\\t' | '\\f' | ( '\\r' )? '\\n' )+
            int cnt16=0;
            loop16:
            do {
                int alt16=5;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt16=1;
                    }
                    break;
                case '\t':
                    {
                    alt16=2;
                    }
                    break;
                case '\f':
                    {
                    alt16=3;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt16=4;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5176:12: ' '
            	    {
            	    match(' '); 

            	    }
            	    break;
            	case 2 :
            	    // InternalUniMapperGenerator.g:5176:16: '\\t'
            	    {
            	    match('\t'); 

            	    }
            	    break;
            	case 3 :
            	    // InternalUniMapperGenerator.g:5176:21: '\\f'
            	    {
            	    match('\f'); 

            	    }
            	    break;
            	case 4 :
            	    // InternalUniMapperGenerator.g:5176:26: ( '\\r' )? '\\n'
            	    {
            	    // InternalUniMapperGenerator.g:5176:26: ( '\\r' )?
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0=='\r') ) {
            	        alt15=1;
            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // InternalUniMapperGenerator.g:5176:26: '\\r'
            	            {
            	            match('\r'); 

            	            }
            	            break;

            	    }

            	    match('\n'); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_WSNLCHARS"
    public final void mRULE_WSNLCHARS() throws RecognitionException {
        try {
            // InternalUniMapperGenerator.g:5178:25: ( ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' ) )
            // InternalUniMapperGenerator.g:5178:27: ( ' ' | '\\t' | '\\f' | '\\n' | '\\r' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_WSNLCHARS"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5180:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalUniMapperGenerator.g:5180:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalUniMapperGenerator.g:5180:11: ( '^' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='^') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalUniMapperGenerator.g:5180:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalUniMapperGenerator.g:5180:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='0' && LA18_0<='9')||(LA18_0>='A' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='z')) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5182:10: ( ( '0' .. '9' )+ )
            // InternalUniMapperGenerator.g:5182:12: ( '0' .. '9' )+
            {
            // InternalUniMapperGenerator.g:5182:12: ( '0' .. '9' )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalUniMapperGenerator.g:5182:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalUniMapperGenerator.g:5184:16: ( . )
            // InternalUniMapperGenerator.g:5184:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalUniMapperGenerator.g:1:8: ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_TOKEN_VOCAB | RULE_COLON | RULE_RARROW | RULE_OPTIONS_SPEC | RULE_TOKENS_SPEC | RULE_RULE_REF | RULE_TOKEN_REF | RULE_STRING | RULE_ACTION | RULE_DOLLAR | RULE_ARG_OR_CHARSET | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_WS | RULE_ID | RULE_INT | RULE_ANY_OTHER )
        int alt20=51;
        alt20 = dfa20.predict(input);
        switch (alt20) {
            case 1 :
                // InternalUniMapperGenerator.g:1:10: T__33
                {
                mT__33(); 

                }
                break;
            case 2 :
                // InternalUniMapperGenerator.g:1:16: T__34
                {
                mT__34(); 

                }
                break;
            case 3 :
                // InternalUniMapperGenerator.g:1:22: T__35
                {
                mT__35(); 

                }
                break;
            case 4 :
                // InternalUniMapperGenerator.g:1:28: T__36
                {
                mT__36(); 

                }
                break;
            case 5 :
                // InternalUniMapperGenerator.g:1:34: T__37
                {
                mT__37(); 

                }
                break;
            case 6 :
                // InternalUniMapperGenerator.g:1:40: T__38
                {
                mT__38(); 

                }
                break;
            case 7 :
                // InternalUniMapperGenerator.g:1:46: T__39
                {
                mT__39(); 

                }
                break;
            case 8 :
                // InternalUniMapperGenerator.g:1:52: T__40
                {
                mT__40(); 

                }
                break;
            case 9 :
                // InternalUniMapperGenerator.g:1:58: T__41
                {
                mT__41(); 

                }
                break;
            case 10 :
                // InternalUniMapperGenerator.g:1:64: T__42
                {
                mT__42(); 

                }
                break;
            case 11 :
                // InternalUniMapperGenerator.g:1:70: T__43
                {
                mT__43(); 

                }
                break;
            case 12 :
                // InternalUniMapperGenerator.g:1:76: T__44
                {
                mT__44(); 

                }
                break;
            case 13 :
                // InternalUniMapperGenerator.g:1:82: T__45
                {
                mT__45(); 

                }
                break;
            case 14 :
                // InternalUniMapperGenerator.g:1:88: T__46
                {
                mT__46(); 

                }
                break;
            case 15 :
                // InternalUniMapperGenerator.g:1:94: T__47
                {
                mT__47(); 

                }
                break;
            case 16 :
                // InternalUniMapperGenerator.g:1:100: T__48
                {
                mT__48(); 

                }
                break;
            case 17 :
                // InternalUniMapperGenerator.g:1:106: T__49
                {
                mT__49(); 

                }
                break;
            case 18 :
                // InternalUniMapperGenerator.g:1:112: T__50
                {
                mT__50(); 

                }
                break;
            case 19 :
                // InternalUniMapperGenerator.g:1:118: T__51
                {
                mT__51(); 

                }
                break;
            case 20 :
                // InternalUniMapperGenerator.g:1:124: T__52
                {
                mT__52(); 

                }
                break;
            case 21 :
                // InternalUniMapperGenerator.g:1:130: T__53
                {
                mT__53(); 

                }
                break;
            case 22 :
                // InternalUniMapperGenerator.g:1:136: T__54
                {
                mT__54(); 

                }
                break;
            case 23 :
                // InternalUniMapperGenerator.g:1:142: T__55
                {
                mT__55(); 

                }
                break;
            case 24 :
                // InternalUniMapperGenerator.g:1:148: T__56
                {
                mT__56(); 

                }
                break;
            case 25 :
                // InternalUniMapperGenerator.g:1:154: T__57
                {
                mT__57(); 

                }
                break;
            case 26 :
                // InternalUniMapperGenerator.g:1:160: T__58
                {
                mT__58(); 

                }
                break;
            case 27 :
                // InternalUniMapperGenerator.g:1:166: T__59
                {
                mT__59(); 

                }
                break;
            case 28 :
                // InternalUniMapperGenerator.g:1:172: T__60
                {
                mT__60(); 

                }
                break;
            case 29 :
                // InternalUniMapperGenerator.g:1:178: T__61
                {
                mT__61(); 

                }
                break;
            case 30 :
                // InternalUniMapperGenerator.g:1:184: T__62
                {
                mT__62(); 

                }
                break;
            case 31 :
                // InternalUniMapperGenerator.g:1:190: T__63
                {
                mT__63(); 

                }
                break;
            case 32 :
                // InternalUniMapperGenerator.g:1:196: T__64
                {
                mT__64(); 

                }
                break;
            case 33 :
                // InternalUniMapperGenerator.g:1:202: T__65
                {
                mT__65(); 

                }
                break;
            case 34 :
                // InternalUniMapperGenerator.g:1:208: T__66
                {
                mT__66(); 

                }
                break;
            case 35 :
                // InternalUniMapperGenerator.g:1:214: RULE_TOKEN_VOCAB
                {
                mRULE_TOKEN_VOCAB(); 

                }
                break;
            case 36 :
                // InternalUniMapperGenerator.g:1:231: RULE_COLON
                {
                mRULE_COLON(); 

                }
                break;
            case 37 :
                // InternalUniMapperGenerator.g:1:242: RULE_RARROW
                {
                mRULE_RARROW(); 

                }
                break;
            case 38 :
                // InternalUniMapperGenerator.g:1:254: RULE_OPTIONS_SPEC
                {
                mRULE_OPTIONS_SPEC(); 

                }
                break;
            case 39 :
                // InternalUniMapperGenerator.g:1:272: RULE_TOKENS_SPEC
                {
                mRULE_TOKENS_SPEC(); 

                }
                break;
            case 40 :
                // InternalUniMapperGenerator.g:1:289: RULE_RULE_REF
                {
                mRULE_RULE_REF(); 

                }
                break;
            case 41 :
                // InternalUniMapperGenerator.g:1:303: RULE_TOKEN_REF
                {
                mRULE_TOKEN_REF(); 

                }
                break;
            case 42 :
                // InternalUniMapperGenerator.g:1:318: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 43 :
                // InternalUniMapperGenerator.g:1:330: RULE_ACTION
                {
                mRULE_ACTION(); 

                }
                break;
            case 44 :
                // InternalUniMapperGenerator.g:1:342: RULE_DOLLAR
                {
                mRULE_DOLLAR(); 

                }
                break;
            case 45 :
                // InternalUniMapperGenerator.g:1:354: RULE_ARG_OR_CHARSET
                {
                mRULE_ARG_OR_CHARSET(); 

                }
                break;
            case 46 :
                // InternalUniMapperGenerator.g:1:374: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 47 :
                // InternalUniMapperGenerator.g:1:390: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 48 :
                // InternalUniMapperGenerator.g:1:406: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 49 :
                // InternalUniMapperGenerator.g:1:414: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 50 :
                // InternalUniMapperGenerator.g:1:422: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 51 :
                // InternalUniMapperGenerator.g:1:431: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA20 dfa20 = new DFA20(this);
    static final String DFA7_eotS =
        "\12\uffff\1\13\2\uffff";
    static final String DFA7_eofS =
        "\15\uffff";
    static final String DFA7_minS =
        "\1\0\11\uffff\1\60\2\uffff";
    static final String DFA7_maxS =
        "\1\uffff\11\uffff\1\146\2\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\uffff\1\13\1\12";
    static final String DFA7_specialS =
        "\1\0\14\uffff}>";
    static final String[] DFA7_transitionS = {
            "\42\13\1\6\4\13\1\7\26\13\1\11\35\13\1\10\5\13\1\4\3\13\1\5\7\13\1\1\3\13\1\2\1\13\1\3\1\12\uff8a\13",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\14\7\uffff\6\14\32\uffff\6\14",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "5150:26: ( 'n' | 'r' | 't' | 'b' | 'f' | '\"' | '\\'' | '\\\\' | '>' | 'u' RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT RULE_XDIGIT | . )";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA7_0 = input.LA(1);

                        s = -1;
                        if ( (LA7_0=='n') ) {s = 1;}

                        else if ( (LA7_0=='r') ) {s = 2;}

                        else if ( (LA7_0=='t') ) {s = 3;}

                        else if ( (LA7_0=='b') ) {s = 4;}

                        else if ( (LA7_0=='f') ) {s = 5;}

                        else if ( (LA7_0=='\"') ) {s = 6;}

                        else if ( (LA7_0=='\'') ) {s = 7;}

                        else if ( (LA7_0=='\\') ) {s = 8;}

                        else if ( (LA7_0=='>') ) {s = 9;}

                        else if ( (LA7_0=='u') ) {s = 10;}

                        else if ( ((LA7_0>='\u0000' && LA7_0<='!')||(LA7_0>='#' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='=')||(LA7_0>='?' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='a')||(LA7_0>='c' && LA7_0<='e')||(LA7_0>='g' && LA7_0<='m')||(LA7_0>='o' && LA7_0<='q')||LA7_0=='s'||(LA7_0>='v' && LA7_0<='\uFFFF')) ) {s = 11;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 7, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA20_eotS =
        "\1\uffff\1\60\2\uffff\1\64\1\60\2\uffff\1\71\7\60\2\uffff\1\110\6\uffff\1\120\1\123\1\uffff\1\60\1\55\2\60\1\123\1\55\1\132\1\uffff\2\55\3\uffff\1\55\1\uffff\1\55\2\uffff\2\60\5\uffff\1\60\4\uffff\13\60\14\uffff\2\123\2\uffff\1\60\1\uffff\1\60\1\uffff\1\132\7\uffff\15\60\1\123\2\60\1\132\5\60\1\u0089\2\60\1\u008c\4\60\1\u0091\2\60\2\132\3\60\1\u0099\1\60\1\uffff\2\60\1\uffff\1\u009e\3\60\1\uffff\2\60\2\132\1\60\1\u00a7\1\u00a8\1\uffff\1\u00a9\1\u00aa\2\60\1\uffff\5\60\2\132\1\u00b4\4\uffff\1\60\1\uffff\1\u00b6\1\60\1\u00b8\2\60\2\132\1\uffff\1\60\1\uffff\1\u00be\1\uffff\1\60\1\uffff\2\132\1\60\1\uffff\1\60\2\132\1\u00c6\1\60\2\132\1\uffff\1\60\2\132\1\60\2\132\1\u00d0\2\132\1\uffff\6\132\1\u00d9\1\132\1\uffff\1\134";
    static final String DFA20_eofS =
        "\u00db\uffff";
    static final String DFA20_minS =
        "\1\0\1\60\2\uffff\1\76\1\60\2\uffff\1\72\7\60\2\uffff\1\75\6\uffff\1\56\1\60\1\uffff\1\60\1\76\3\60\1\0\1\137\1\uffff\1\0\1\52\3\uffff\1\12\1\uffff\1\101\2\uffff\2\60\5\uffff\1\60\4\uffff\13\60\14\uffff\2\60\2\uffff\1\60\1\uffff\1\60\1\uffff\1\137\7\uffff\20\60\1\154\20\60\2\145\5\60\1\uffff\2\60\1\uffff\4\60\1\uffff\2\60\1\163\1\170\3\60\1\uffff\3\60\1\11\1\uffff\5\60\1\164\1\145\1\60\4\uffff\1\60\1\uffff\4\60\1\11\1\145\1\162\1\uffff\1\60\1\uffff\1\60\1\uffff\1\60\1\uffff\1\144\1\137\1\60\1\uffff\1\60\1\137\1\143\2\60\1\141\1\150\1\uffff\1\60\1\143\1\141\1\60\1\164\1\162\1\60\1\151\1\137\1\uffff\1\157\1\163\1\156\1\145\1\137\1\164\1\60\1\137\1\uffff\1\60";
    static final String DFA20_maxS =
        "\1\uffff\1\172\2\uffff\1\76\1\172\2\uffff\1\72\7\172\2\uffff\1\75\6\uffff\1\56\1\172\1\uffff\1\172\1\76\3\172\1\uffff\1\137\1\uffff\1\uffff\1\57\3\uffff\1\12\1\uffff\1\172\2\uffff\2\172\5\uffff\1\172\4\uffff\13\172\14\uffff\2\172\2\uffff\1\172\1\uffff\1\172\1\uffff\1\137\7\uffff\20\172\1\156\5\172\1\ufffd\2\172\1\ufffd\4\172\1\ufffd\2\172\2\145\3\172\1\ufffd\1\172\1\uffff\2\172\1\uffff\1\ufffd\3\172\1\uffff\2\172\1\163\1\170\1\172\2\ufffd\1\uffff\2\ufffd\1\172\1\173\1\uffff\5\172\1\164\1\145\1\ufffd\4\uffff\1\172\1\uffff\1\ufffd\1\172\1\ufffd\1\172\1\173\1\145\1\162\1\uffff\1\172\1\uffff\1\ufffd\1\uffff\1\172\1\uffff\1\144\1\137\1\172\1\uffff\1\172\1\137\1\143\1\ufffd\1\172\1\141\1\150\1\uffff\1\172\1\143\1\141\1\172\1\164\1\162\1\ufffd\1\151\1\137\1\uffff\1\157\1\163\1\156\1\145\1\137\1\164\1\172\1\137\1\uffff\1\172";
    static final String DFA20_acceptS =
        "\2\uffff\1\2\1\3\2\uffff\1\6\1\7\10\uffff\1\22\1\23\1\uffff\1\25\1\26\1\30\1\31\1\32\1\33\2\uffff\1\36\7\uffff\1\54\2\uffff\3\60\1\uffff\1\60\1\uffff\1\62\1\63\2\uffff\1\50\1\2\1\3\1\40\1\4\1\uffff\1\6\1\7\1\10\1\44\13\uffff\1\22\1\23\1\24\1\27\1\25\1\26\1\30\1\31\1\32\1\33\1\34\1\37\2\uffff\1\51\1\36\1\uffff\1\45\1\uffff\1\52\1\uffff\1\61\1\54\1\55\1\56\1\57\1\60\1\62\50\uffff\1\13\2\uffff\1\14\4\uffff\1\35\7\uffff\1\12\4\uffff\1\15\10\uffff\1\5\1\11\1\21\1\20\1\uffff\1\47\7\uffff\1\1\1\uffff\1\16\1\uffff\1\17\1\uffff\1\46\3\uffff\1\41\7\uffff\1\43\11\uffff\1\42\10\uffff\1\53\1\uffff";
    static final String DFA20_specialS =
        "\1\0\40\uffff\1\2\2\uffff\1\1\u00b6\uffff}>";
    static final String[] DFA20_transitionS = {
            "\11\55\1\47\1\52\1\55\1\50\1\51\22\55\1\46\2\55\1\21\1\43\2\55\1\41\1\25\1\26\1\24\1\22\1\6\1\35\1\31\1\45\12\54\1\10\1\2\1\27\1\4\1\30\1\23\1\7\4\40\1\32\25\40\1\44\2\55\1\53\1\42\1\55\2\37\1\15\1\34\1\37\1\16\1\1\1\37\1\5\2\37\1\12\1\14\1\37\1\36\1\11\1\37\1\17\1\37\1\13\6\37\1\55\1\20\1\3\1\33\uff81\55",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\56\10\57",
            "",
            "",
            "\1\63",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\65\15\57",
            "",
            "",
            "\1\70",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\72\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\73\11\57\1\74\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\76\6\57\1\77\2\57\1\75\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\100\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\101\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\102\10\57\1\103\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\104\25\57",
            "",
            "",
            "\1\107",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\117",
            "\12\122\7\uffff\16\122\1\121\13\122\4\uffff\1\122\1\uffff\32\122",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\125\25\57",
            "\1\126",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\127\12\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "\12\122\7\uffff\32\122\4\uffff\1\122\1\uffff\32\122",
            "\0\130",
            "\1\131",
            "",
            "\133\134\1\uffff\uffa4\134",
            "\1\136\4\uffff\1\135",
            "",
            "",
            "",
            "\1\137",
            "",
            "\32\132\4\uffff\1\132\1\uffff\32\132",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\141\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\17\57\1\142\12\57",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\143\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\27\57\1\144\2\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\145\27\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\146\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\147\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\12\57\1\150\17\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\3\57\1\151\26\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\152\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\153\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\154\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\155\6\57",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\122\7\uffff\5\122\1\156\24\122\4\uffff\1\122\1\uffff\32\122",
            "\12\122\7\uffff\32\122\4\uffff\1\122\1\uffff\32\122",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\5\57\1\157\24\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\160\6\57",
            "",
            "\1\161",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\162\15\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\163\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\164\7\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\165\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\166\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\167\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\170\13\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\171\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\172\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\173\27\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\174\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\6\57\1\175\23\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\176\5\57",
            "\2\122\1\177\7\122\7\uffff\32\122\4\uffff\1\122\1\uffff\32\122",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u0080\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\10\57\1\u0081\21\57",
            "\1\u0083\1\uffff\1\u0082",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u0084\15\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0085\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u0086\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0087\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u0088\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\26\57\1\u008a\3\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u008b\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u008d\22\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u008e\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\14\57\1\u008f\15\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0090\10\57",
            "\12\122\7\uffff\32\122\4\uffff\1\122\1\uffff\32\122\74\uffff\1\123\10\uffff\27\123\1\uffff\37\123\1\uffff\u0286\123\1\uffff\u1c81\123\14\uffff\2\123\61\uffff\2\123\57\uffff\u0120\123\u0a70\uffff\u03f0\123\21\uffff\ua7ff\123\u2100\uffff\u04d0\123\40\uffff\u020e\123",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\24\57\1\u0092\5\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u0093\13\57",
            "\1\u0094",
            "\1\u0095",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u0096\31\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u0097\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u0098\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u009a\7\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u009b\7\57",
            "\12\57\7\uffff\25\57\1\u009c\4\57\4\uffff\1\57\1\uffff\22\57\1\u009d\7\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u009f\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\4\57\1\u00a0\25\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00a1\14\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\13\57\1\u00a2\16\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00a3\14\57",
            "\1\u00a4",
            "\1\u00a5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\21\57\1\u00a6\10\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\16\57\1\u00ab\13\57",
            "\2\u00ac\1\uffff\2\u00ac\22\uffff\1\u00ac\17\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\1\u00ac",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\30\57\1\u00ad\1\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\15\57\1\u00ae\14\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00af\7\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00b0\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\22\57\1\u00b1\7\57",
            "\1\u00b2",
            "\1\u00b3",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "",
            "",
            "",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00b5\27\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\23\57\1\u00b7\6\57",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\u00b9\1\uffff\32\57",
            "\2\u00ba\1\uffff\2\u00ba\22\uffff\1\u00ba\17\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00bd\31\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\7\57\1\u00bf\22\57",
            "",
            "\1\u00c0",
            "\1\u00c1",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\57\1\u00c2\30\57",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\1\u00c3\31\57",
            "\1\u00c4",
            "\1\u00c5",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\2\57\1\u00c7\27\57",
            "\1\u00c8",
            "\1\u00c9",
            "",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\12\57\1\u00ca\17\57",
            "\1\u00cb",
            "\1\u00cc",
            "\12\57\7\uffff\32\57\4\uffff\1\u00cd\1\uffff\32\57",
            "\1\u00ce",
            "\1\u00cf",
            "\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32\57\74\uffff\1\60\10\uffff\27\60\1\uffff\37\60\1\uffff\u0286\60\1\uffff\u1c81\60\14\uffff\2\60\61\uffff\2\60\57\uffff\u0120\60\u0a70\uffff\u03f0\60\21\uffff\ua7ff\60\u2100\uffff\u04d0\60\40\uffff\u020e\60",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132",
            "\1\u00da",
            "",
            "\12\132\7\uffff\32\132\4\uffff\1\132\1\uffff\32\132"
    };

    static final short[] DFA20_eot = DFA.unpackEncodedString(DFA20_eotS);
    static final short[] DFA20_eof = DFA.unpackEncodedString(DFA20_eofS);
    static final char[] DFA20_min = DFA.unpackEncodedStringToUnsignedChars(DFA20_minS);
    static final char[] DFA20_max = DFA.unpackEncodedStringToUnsignedChars(DFA20_maxS);
    static final short[] DFA20_accept = DFA.unpackEncodedString(DFA20_acceptS);
    static final short[] DFA20_special = DFA.unpackEncodedString(DFA20_specialS);
    static final short[][] DFA20_transition;

    static {
        int numStates = DFA20_transitionS.length;
        DFA20_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA20_transition[i] = DFA.unpackEncodedString(DFA20_transitionS[i]);
        }
    }

    class DFA20 extends DFA {

        public DFA20(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 20;
            this.eot = DFA20_eot;
            this.eof = DFA20_eof;
            this.min = DFA20_min;
            this.max = DFA20_max;
            this.accept = DFA20_accept;
            this.special = DFA20_special;
            this.transition = DFA20_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | RULE_TOKEN_VOCAB | RULE_COLON | RULE_RARROW | RULE_OPTIONS_SPEC | RULE_TOKENS_SPEC | RULE_RULE_REF | RULE_TOKEN_REF | RULE_STRING | RULE_ACTION | RULE_DOLLAR | RULE_ARG_OR_CHARSET | RULE_SL_COMMENT | RULE_ML_COMMENT | RULE_WS | RULE_ID | RULE_INT | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA20_0 = input.LA(1);

                        s = -1;
                        if ( (LA20_0=='g') ) {s = 1;}

                        else if ( (LA20_0==';') ) {s = 2;}

                        else if ( (LA20_0=='}') ) {s = 3;}

                        else if ( (LA20_0=='=') ) {s = 4;}

                        else if ( (LA20_0=='i') ) {s = 5;}

                        else if ( (LA20_0==',') ) {s = 6;}

                        else if ( (LA20_0=='@') ) {s = 7;}

                        else if ( (LA20_0==':') ) {s = 8;}

                        else if ( (LA20_0=='p') ) {s = 9;}

                        else if ( (LA20_0=='l') ) {s = 10;}

                        else if ( (LA20_0=='t') ) {s = 11;}

                        else if ( (LA20_0=='m') ) {s = 12;}

                        else if ( (LA20_0=='c') ) {s = 13;}

                        else if ( (LA20_0=='f') ) {s = 14;}

                        else if ( (LA20_0=='r') ) {s = 15;}

                        else if ( (LA20_0=='|') ) {s = 16;}

                        else if ( (LA20_0=='#') ) {s = 17;}

                        else if ( (LA20_0=='+') ) {s = 18;}

                        else if ( (LA20_0=='?') ) {s = 19;}

                        else if ( (LA20_0=='*') ) {s = 20;}

                        else if ( (LA20_0=='(') ) {s = 21;}

                        else if ( (LA20_0==')') ) {s = 22;}

                        else if ( (LA20_0=='<') ) {s = 23;}

                        else if ( (LA20_0=='>') ) {s = 24;}

                        else if ( (LA20_0=='.') ) {s = 25;}

                        else if ( (LA20_0=='E') ) {s = 26;}

                        else if ( (LA20_0=='~') ) {s = 27;}

                        else if ( (LA20_0=='d') ) {s = 28;}

                        else if ( (LA20_0=='-') ) {s = 29;}

                        else if ( (LA20_0=='o') ) {s = 30;}

                        else if ( ((LA20_0>='a' && LA20_0<='b')||LA20_0=='e'||LA20_0=='h'||(LA20_0>='j' && LA20_0<='k')||LA20_0=='n'||LA20_0=='q'||LA20_0=='s'||(LA20_0>='u' && LA20_0<='z')) ) {s = 31;}

                        else if ( ((LA20_0>='A' && LA20_0<='D')||(LA20_0>='F' && LA20_0<='Z')) ) {s = 32;}

                        else if ( (LA20_0=='\'') ) {s = 33;}

                        else if ( (LA20_0=='_') ) {s = 34;}

                        else if ( (LA20_0=='$') ) {s = 35;}

                        else if ( (LA20_0=='[') ) {s = 36;}

                        else if ( (LA20_0=='/') ) {s = 37;}

                        else if ( (LA20_0==' ') ) {s = 38;}

                        else if ( (LA20_0=='\t') ) {s = 39;}

                        else if ( (LA20_0=='\f') ) {s = 40;}

                        else if ( (LA20_0=='\r') ) {s = 41;}

                        else if ( (LA20_0=='\n') ) {s = 42;}

                        else if ( (LA20_0=='^') ) {s = 43;}

                        else if ( ((LA20_0>='0' && LA20_0<='9')) ) {s = 44;}

                        else if ( ((LA20_0>='\u0000' && LA20_0<='\b')||LA20_0=='\u000B'||(LA20_0>='\u000E' && LA20_0<='\u001F')||(LA20_0>='!' && LA20_0<='\"')||(LA20_0>='%' && LA20_0<='&')||(LA20_0>='\\' && LA20_0<=']')||LA20_0=='`'||LA20_0=='{'||(LA20_0>='\u007F' && LA20_0<='\uFFFF')) ) {s = 45;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA20_36 = input.LA(1);

                        s = -1;
                        if ( ((LA20_36>='\u0000' && LA20_36<='Z')||(LA20_36>='\\' && LA20_36<='\uFFFF')) ) {s = 92;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA20_33 = input.LA(1);

                        s = -1;
                        if ( ((LA20_33>='\u0000' && LA20_33<='\uFFFF')) ) {s = 88;}

                        else s = 45;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 20, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}