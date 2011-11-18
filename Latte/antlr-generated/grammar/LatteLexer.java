// $ANTLR 3.4 D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g 2011-11-18 12:24:27

  package grammar;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatteLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int ARG=4;
    public static final int ARRAY=5;
    public static final int BEGIN=6;
    public static final int BLOCK=7;
    public static final int BOOLEAN=8;
    public static final int CALL=9;
    public static final int COMMENT=10;
    public static final int COMPLEX=11;
    public static final int DEFINE=12;
    public static final int DEFINE_ARRAY=13;
    public static final int DEFINE_SINGLE=14;
    public static final int DIV=15;
    public static final int DO=16;
    public static final int ELSE=17;
    public static final int END=18;
    public static final int ENDFOR=19;
    public static final int ENDIF=20;
    public static final int ENDWHILE=21;
    public static final int EQ=22;
    public static final int ERROR=23;
    public static final int EXPR=24;
    public static final int FOR=25;
    public static final int FUNC=26;
    public static final int IF=27;
    public static final int INTEGER=28;
    public static final int MINUS=29;
    public static final int MOD=30;
    public static final int MULTILINE_COMMENT=31;
    public static final int NAME=32;
    public static final int NEGATION=33;
    public static final int NUM_NEGATION=34;
    public static final int PARAM=35;
    public static final int PARAMS=36;
    public static final int PLUS=37;
    public static final int PRINTINT=38;
    public static final int PROGRAM=39;
    public static final int READINT=40;
    public static final int REF=41;
    public static final int RETURN=42;
    public static final int SINGLE_TYPE=43;
    public static final int STRING=44;
    public static final int THEN=45;
    public static final int TIMES=46;
    public static final int WHILE=47;
    public static final int WS=48;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public LatteLexer() {} 
    public LatteLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public LatteLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g"; }

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:11:7: ( '!' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:11:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:12:7: ( '!=' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:12:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:13:7: ( '&&' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:13:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:14:7: ( '(' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:14:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:15:7: ( ')' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:15:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:16:7: ( '++' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:16:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:17:7: ( ',' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:17:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:18:7: ( '--' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:18:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:19:7: ( ';' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:19:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:20:7: ( '<' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:20:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:21:7: ( '<=' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:21:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:22:7: ( '==' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:22:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:23:7: ( '>' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:23:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:24:7: ( '>=' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:24:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:25:7: ( '[' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:25:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:26:7: ( ']' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:26:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:27:7: ( 'boolean[]' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:27:9: 'boolean[]'
            {
            match("boolean[]"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:28:7: ( 'else' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:28:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:29:7: ( 'error' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:29:9: 'error'
            {
            match("error"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:30:7: ( 'if' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:30:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:31:7: ( 'int[]' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:31:9: 'int[]'
            {
            match("int[]"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:32:7: ( 'printInt' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:32:9: 'printInt'
            {
            match("printInt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:33:7: ( 'readInt' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:33:9: 'readInt'
            {
            match("readInt"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:34:7: ( 'return' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:34:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:35:7: ( 'while' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:35:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:36:7: ( '{' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:36:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:37:7: ( '||' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:37:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:38:7: ( '}' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:38:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:301:5: ( '+' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:301:7: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:302:6: ( '-' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:302:8: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "TIMES"
    public final void mTIMES() throws RecognitionException {
        try {
            int _type = TIMES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:303:6: ( '*' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:303:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TIMES"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:304:4: ( '/' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:304:6: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:305:4: ( '%' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:305:6: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "EQ"
    public final void mEQ() throws RecognitionException {
        try {
            int _type = EQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:306:3: ( '=' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:306:5: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQ"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:307:9: ( ( '0' .. '9' )+ )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:307:11: ( '0' .. '9' )+
            {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:307:11: ( '0' .. '9' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "BOOLEAN"
    public final void mBOOLEAN() throws RecognitionException {
        try {
            int _type = BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:309:8: ( ( 'true' | 'false' ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:309:10: ( 'true' | 'false' )
            {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:309:10: ( 'true' | 'false' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='t') ) {
                alt2=1;
            }
            else if ( (LA2_0=='f') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:309:11: 'true'
                    {
                    match("true"); 



                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:309:20: 'false'
                    {
                    match("false"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BOOLEAN"

    // $ANTLR start "SINGLE_TYPE"
    public final void mSINGLE_TYPE() throws RecognitionException {
        try {
            int _type = SINGLE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:310:12: ( ( 'int' | 'boolean' | 'void' | 'string' ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:310:14: ( 'int' | 'boolean' | 'void' | 'string' )
            {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:310:14: ( 'int' | 'boolean' | 'void' | 'string' )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 'i':
                {
                alt3=1;
                }
                break;
            case 'b':
                {
                alt3=2;
                }
                break;
            case 'v':
                {
                alt3=3;
                }
                break;
            case 's':
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:310:15: 'int'
                    {
                    match("int"); 



                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:310:23: 'boolean'
                    {
                    match("boolean"); 



                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:310:35: 'void'
                    {
                    match("void"); 



                    }
                    break;
                case 4 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:310:44: 'string'
                    {
                    match("string"); 



                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SINGLE_TYPE"

    // $ANTLR start "NAME"
    public final void mNAME() throws RecognitionException {
        try {
            int _type = NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:311:6: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:311:8: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:311:29: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')||(LA4_0 >= 'A' && LA4_0 <= 'Z')||LA4_0=='_'||(LA4_0 >= 'a' && LA4_0 <= 'z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NAME"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:312:3: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:312:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:312:5: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||(LA5_0 >= '\f' && LA5_0 <= '\r')||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:313:8: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:313:10: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 



            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:313:15: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                    alt6=2;
                }
                else if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:313:15: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "MULTILINE_COMMENT"
    public final void mMULTILINE_COMMENT() throws RecognitionException {
        try {
            int _type = MULTILINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:314:18: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:314:20: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:314:25: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1 >= '\u0000' && LA7_1 <= '.')||(LA7_1 >= '0' && LA7_1 <= '\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0 >= '\u0000' && LA7_0 <= ')')||(LA7_0 >= '+' && LA7_0 <= '\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:314:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            match("*/"); 



            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULTILINE_COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:315:7: ( '\"' ( . )* '\"' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:315:9: '\"' ( . )* '\"'
            {
            match('\"'); 

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:315:12: ( . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='\"') ) {
                    alt8=2;
                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= '!')||(LA8_0 >= '#' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:315:13: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    public void mTokens() throws RecognitionException {
        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:8: ( T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | PLUS | MINUS | TIMES | DIV | MOD | EQ | INTEGER | BOOLEAN | SINGLE_TYPE | NAME | WS | COMMENT | MULTILINE_COMMENT | STRING )
        int alt9=42;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:10: T__49
                {
                mT__49(); 


                }
                break;
            case 2 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:16: T__50
                {
                mT__50(); 


                }
                break;
            case 3 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:22: T__51
                {
                mT__51(); 


                }
                break;
            case 4 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:28: T__52
                {
                mT__52(); 


                }
                break;
            case 5 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:34: T__53
                {
                mT__53(); 


                }
                break;
            case 6 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:40: T__54
                {
                mT__54(); 


                }
                break;
            case 7 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:46: T__55
                {
                mT__55(); 


                }
                break;
            case 8 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:52: T__56
                {
                mT__56(); 


                }
                break;
            case 9 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:58: T__57
                {
                mT__57(); 


                }
                break;
            case 10 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:64: T__58
                {
                mT__58(); 


                }
                break;
            case 11 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:70: T__59
                {
                mT__59(); 


                }
                break;
            case 12 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:76: T__60
                {
                mT__60(); 


                }
                break;
            case 13 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:82: T__61
                {
                mT__61(); 


                }
                break;
            case 14 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:88: T__62
                {
                mT__62(); 


                }
                break;
            case 15 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:94: T__63
                {
                mT__63(); 


                }
                break;
            case 16 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:100: T__64
                {
                mT__64(); 


                }
                break;
            case 17 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:106: T__65
                {
                mT__65(); 


                }
                break;
            case 18 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:112: T__66
                {
                mT__66(); 


                }
                break;
            case 19 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:118: T__67
                {
                mT__67(); 


                }
                break;
            case 20 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:124: T__68
                {
                mT__68(); 


                }
                break;
            case 21 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:130: T__69
                {
                mT__69(); 


                }
                break;
            case 22 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:136: T__70
                {
                mT__70(); 


                }
                break;
            case 23 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:142: T__71
                {
                mT__71(); 


                }
                break;
            case 24 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:148: T__72
                {
                mT__72(); 


                }
                break;
            case 25 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:154: T__73
                {
                mT__73(); 


                }
                break;
            case 26 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:160: T__74
                {
                mT__74(); 


                }
                break;
            case 27 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:166: T__75
                {
                mT__75(); 


                }
                break;
            case 28 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:172: T__76
                {
                mT__76(); 


                }
                break;
            case 29 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:178: PLUS
                {
                mPLUS(); 


                }
                break;
            case 30 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:183: MINUS
                {
                mMINUS(); 


                }
                break;
            case 31 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:189: TIMES
                {
                mTIMES(); 


                }
                break;
            case 32 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:195: DIV
                {
                mDIV(); 


                }
                break;
            case 33 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:199: MOD
                {
                mMOD(); 


                }
                break;
            case 34 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:203: EQ
                {
                mEQ(); 


                }
                break;
            case 35 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:206: INTEGER
                {
                mINTEGER(); 


                }
                break;
            case 36 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:214: BOOLEAN
                {
                mBOOLEAN(); 


                }
                break;
            case 37 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:222: SINGLE_TYPE
                {
                mSINGLE_TYPE(); 


                }
                break;
            case 38 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:234: NAME
                {
                mNAME(); 


                }
                break;
            case 39 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:239: WS
                {
                mWS(); 


                }
                break;
            case 40 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:242: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 41 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:250: MULTILINE_COMMENT
                {
                mMULTILINE_COMMENT(); 


                }
                break;
            case 42 :
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:1:268: STRING
                {
                mSTRING(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\1\uffff\1\43\3\uffff\1\45\1\uffff\1\47\1\uffff\1\51\1\53\1\55\2"+
        "\uffff\6\37\4\uffff\1\70\2\uffff\4\37\17\uffff\3\37\1\100\4\37\3"+
        "\uffff\7\37\1\uffff\1\116\11\37\1\130\1\37\2\uffff\4\37\1\136\1"+
        "\37\1\116\2\37\1\uffff\1\142\3\37\1\146\1\uffff\1\136\2\37\1\uffff"+
        "\2\37\1\153\1\uffff\2\116\1\37\1\156\2\uffff\1\157\2\uffff";
    static final String DFA9_eofS =
        "\160\uffff";
    static final String DFA9_minS =
        "\1\11\1\75\3\uffff\1\53\1\uffff\1\55\1\uffff\3\75\2\uffff\1\157"+
        "\1\154\1\146\1\162\1\145\1\150\4\uffff\1\52\2\uffff\1\162\1\141"+
        "\1\157\1\164\17\uffff\1\157\1\163\1\162\1\60\1\164\1\151\1\141\1"+
        "\151\3\uffff\1\165\1\154\1\151\1\162\1\154\1\145\1\157\1\uffff\1"+
        "\60\1\156\1\144\1\165\1\154\1\145\1\163\1\144\1\151\1\145\1\60\1"+
        "\162\2\uffff\1\164\1\111\1\162\1\145\1\60\1\145\1\60\1\156\1\141"+
        "\1\uffff\1\60\1\111\2\156\1\60\1\uffff\1\60\1\147\1\156\1\uffff"+
        "\1\156\1\164\1\60\1\uffff\2\60\1\164\1\60\2\uffff\1\60\2\uffff";
    static final String DFA9_maxS =
        "\1\175\1\75\3\uffff\1\53\1\uffff\1\55\1\uffff\3\75\2\uffff\1\157"+
        "\1\162\1\156\1\162\1\145\1\150\4\uffff\1\57\2\uffff\1\162\1\141"+
        "\1\157\1\164\17\uffff\1\157\1\163\1\162\1\172\1\164\1\151\1\164"+
        "\1\151\3\uffff\1\165\1\154\1\151\1\162\1\154\1\145\1\157\1\uffff"+
        "\1\172\1\156\1\144\1\165\1\154\1\145\1\163\1\144\1\151\1\145\1\172"+
        "\1\162\2\uffff\1\164\1\111\1\162\1\145\1\172\1\145\1\172\1\156\1"+
        "\141\1\uffff\1\172\1\111\2\156\1\172\1\uffff\1\172\1\147\1\156\1"+
        "\uffff\1\156\1\164\1\172\1\uffff\2\172\1\164\1\172\2\uffff\1\172"+
        "\2\uffff";
    static final String DFA9_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\uffff\1\7\1\uffff\1\11\3\uffff\1\17\1\20"+
        "\6\uffff\1\32\1\33\1\34\1\37\1\uffff\1\41\1\43\4\uffff\1\46\1\47"+
        "\1\52\1\2\1\1\1\6\1\35\1\10\1\36\1\13\1\12\1\14\1\42\1\16\1\15\10"+
        "\uffff\1\50\1\51\1\40\7\uffff\1\24\14\uffff\1\25\1\45\11\uffff\1"+
        "\22\5\uffff\1\44\3\uffff\1\23\3\uffff\1\31\4\uffff\1\30\1\21\1\uffff"+
        "\1\27\1\26";
    static final String DFA9_specialS =
        "\160\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\40\1\uffff\2\40\22\uffff\1\40\1\1\1\41\2\uffff\1\31\1\2\1"+
            "\uffff\1\3\1\4\1\27\1\5\1\6\1\7\1\uffff\1\30\12\32\1\uffff\1"+
            "\10\1\11\1\12\1\13\2\uffff\32\37\1\14\1\uffff\1\15\3\uffff\1"+
            "\37\1\16\2\37\1\17\1\34\2\37\1\20\6\37\1\21\1\37\1\22\1\36\1"+
            "\33\1\37\1\35\1\23\3\37\1\24\1\25\1\26",
            "\1\42",
            "",
            "",
            "",
            "\1\44",
            "",
            "\1\46",
            "",
            "\1\50",
            "\1\52",
            "\1\54",
            "",
            "",
            "\1\56",
            "\1\57\5\uffff\1\60",
            "\1\61\7\uffff\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "",
            "",
            "",
            "",
            "\1\67\4\uffff\1\66",
            "",
            "",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
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
            "",
            "",
            "",
            "\1\75",
            "\1\76",
            "\1\77",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\101",
            "\1\102",
            "\1\103\22\uffff\1\104",
            "\1\105",
            "",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "",
            "\12\37\7\uffff\32\37\1\115\3\uffff\1\37\1\uffff\32\37",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\131",
            "",
            "",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\137",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\140",
            "\1\141",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\143",
            "\1\144",
            "\1\145",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\1\147",
            "\1\150",
            "",
            "\1\151",
            "\1\152",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "\12\37\7\uffff\32\37\1\154\3\uffff\1\37\1\uffff\32\37",
            "\1\155",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            "",
            "\12\37\7\uffff\32\37\4\uffff\1\37\1\uffff\32\37",
            "",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | PLUS | MINUS | TIMES | DIV | MOD | EQ | INTEGER | BOOLEAN | SINGLE_TYPE | NAME | WS | COMMENT | MULTILINE_COMMENT | STRING );";
        }
    }
 

}