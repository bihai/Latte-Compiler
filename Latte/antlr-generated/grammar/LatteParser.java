// $ANTLR 3.4 D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g 2011-11-16 14:57:41

  package grammar;
  import java.util.Map;
  import java.util.HashMap;
  import java.util.List;
  import java.util.ArrayList;
  import grammar.Param;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class LatteParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "ARRAY", "BEGIN", "BLOCK", "BOOLEAN", "CALL", "COMMENT", "COMPLEX", "DEFINE", "DEFINE_ARRAY", "DEFINE_SINGLE", "DIV", "DO", "ELSE", "END", "ENDFOR", "ENDIF", "ENDWHILE", "ERROR", "EXPR", "FOR", "FUNC", "IF", "INTEGER", "MINUS", "MOD", "MULTILINE_COMMENT", "NAME", "NEGATION", "NUM_NEGATION", "PARAM", "PARAMS", "PLUS", "PRINTINT", "PROGRAM", "READINT", "REF", "RETURN", "SINGLE_TYPE", "STRING", "THEN", "TIMES", "WHILE", "WS", "'!'", "'!='", "'&&'", "'('", "')'", "'++'", "','", "'--'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'", "'boolean[]'", "'else'", "'error'", "'if'", "'int[]'", "'printInt'", "'readInt'", "'return'", "'while'", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__48=48;
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
    public static final int ERROR=22;
    public static final int EXPR=23;
    public static final int FOR=24;
    public static final int FUNC=25;
    public static final int IF=26;
    public static final int INTEGER=27;
    public static final int MINUS=28;
    public static final int MOD=29;
    public static final int MULTILINE_COMMENT=30;
    public static final int NAME=31;
    public static final int NEGATION=32;
    public static final int NUM_NEGATION=33;
    public static final int PARAM=34;
    public static final int PARAMS=35;
    public static final int PLUS=36;
    public static final int PRINTINT=37;
    public static final int PROGRAM=38;
    public static final int READINT=39;
    public static final int REF=40;
    public static final int RETURN=41;
    public static final int SINGLE_TYPE=42;
    public static final int STRING=43;
    public static final int THEN=44;
    public static final int TIMES=45;
    public static final int WHILE=46;
    public static final int WS=47;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public LatteParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public LatteParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return LatteParser.tokenNames; }
    public String getGrammarFileName() { return "D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g"; }


      Map<String, CommonTree> functionDefinitions = new HashMap<String, CommonTree>();
      Map<String, List<Param> > functionParameters = new HashMap<String, List<Param>>();
      SymbolTable symbolTable = new SymbolTable();
      
     	public LatteParser(TokenStream stream, SymbolTable symbolTable){
    			this(stream);
    			this.symbolTable = symbolTable;
    	}


    public static class program_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:67:1: program : function_definitions_list -> ^( PROGRAM function_definitions_list ) ;
    public final LatteParser.program_return program() throws RecognitionException {
        LatteParser.program_return retval = new LatteParser.program_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.function_definitions_list_return function_definitions_list1 =null;


        RewriteRuleSubtreeStream stream_function_definitions_list=new RewriteRuleSubtreeStream(adaptor,"rule function_definitions_list");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:68:2: ( function_definitions_list -> ^( PROGRAM function_definitions_list ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:68:4: function_definitions_list
            {
            pushFollow(FOLLOW_function_definitions_list_in_program221);
            function_definitions_list1=function_definitions_list();

            state._fsp--;

            stream_function_definitions_list.add(function_definitions_list1.getTree());

            // AST REWRITE
            // elements: function_definitions_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 68:30: -> ^( PROGRAM function_definitions_list )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:68:33: ^( PROGRAM function_definitions_list )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                adaptor.addChild(root_1, stream_function_definitions_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class function_definitions_list_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definitions_list"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:71:1: function_definitions_list : ( function_definition )+ ;
    public final LatteParser.function_definitions_list_return function_definitions_list() throws RecognitionException {
        LatteParser.function_definitions_list_return retval = new LatteParser.function_definitions_list_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.function_definition_return function_definition2 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:72:2: ( ( function_definition )+ )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:72:4: ( function_definition )+
            {
            root_0 = (LatteTree)adaptor.nil();


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:72:4: ( function_definition )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SINGLE_TYPE||LA1_0==65||LA1_0==69) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:72:4: function_definition
            	    {
            	    pushFollow(FOLLOW_function_definition_in_function_definitions_list240);
            	    function_definition2=function_definition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, function_definition2.getTree());

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

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function_definitions_list"


    public static class function_definition_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function_definition"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:75:1: function_definition : type fname= NAME '(' (arg= arguments_list )? ')' stmt= block -> ^( FUNC NAME type ( arguments_list )? block ) ;
    public final LatteParser.function_definition_return function_definition() throws RecognitionException {
        LatteParser.function_definition_return retval = new LatteParser.function_definition_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token fname=null;
        Token char_literal4=null;
        Token char_literal5=null;
        LatteParser.arguments_list_return arg =null;

        LatteParser.block_return stmt =null;

        LatteParser.type_return type3 =null;


        LatteTree fname_tree=null;
        LatteTree char_literal4_tree=null;
        LatteTree char_literal5_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_arguments_list=new RewriteRuleSubtreeStream(adaptor,"rule arguments_list");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:76:3: ( type fname= NAME '(' (arg= arguments_list )? ')' stmt= block -> ^( FUNC NAME type ( arguments_list )? block ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:76:4: type fname= NAME '(' (arg= arguments_list )? ')' stmt= block
            {
            pushFollow(FOLLOW_type_in_function_definition253);
            type3=type();

            state._fsp--;

            stream_type.add(type3.getTree());

            fname=(Token)match(input,NAME,FOLLOW_NAME_in_function_definition257);  
            stream_NAME.add(fname);


            char_literal4=(Token)match(input,51,FOLLOW_51_in_function_definition259);  
            stream_51.add(char_literal4);


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:76:27: (arg= arguments_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SINGLE_TYPE||LA2_0==65||LA2_0==69) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:76:27: arg= arguments_list
                    {
                    pushFollow(FOLLOW_arguments_list_in_function_definition263);
                    arg=arguments_list();

                    state._fsp--;

                    stream_arguments_list.add(arg.getTree());

                    }
                    break;

            }


            char_literal5=(Token)match(input,52,FOLLOW_52_in_function_definition266);  
            stream_52.add(char_literal5);


            pushFollow(FOLLOW_block_in_function_definition270);
            stmt=block();

            state._fsp--;

            stream_block.add(stmt.getTree());

            // AST REWRITE
            // elements: arguments_list, type, block, NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 76:59: -> ^( FUNC NAME type ( arguments_list )? block )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:76:62: ^( FUNC NAME type ( arguments_list )? block )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(FUNC, "FUNC")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NAME.nextNode()
                );

                adaptor.addChild(root_1, stream_type.nextTree());

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:76:79: ( arguments_list )?
                if ( stream_arguments_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_arguments_list.nextTree());

                }
                stream_arguments_list.reset();

                adaptor.addChild(root_1, stream_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving

            	  functionDefinitions.put((fname!=null?fname.getText():null), ((LatteTree)retval.tree));
            	  functionParameters.put((fname!=null?fname.getText():null), (arg!=null?arg.result:null)); //hasmap of hashmap
            	  symbolTable.getGlobalScope().define(new MethodSymbol((fname!=null?fname.getText():null),null,null));
            	
        }
        return retval;
    }
    // $ANTLR end "function_definition"


    public static class arguments_list_return extends ParserRuleReturnScope {
        public List<Param> result;
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arguments_list"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:84:1: arguments_list returns [List<Param> result] :p1= param ( ',' p2= param )* -> ^( PARAMS ( param )+ ) ;
    public final LatteParser.arguments_list_return arguments_list() throws RecognitionException {
        LatteParser.arguments_list_return retval = new LatteParser.arguments_list_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal6=null;
        LatteParser.param_return p1 =null;

        LatteParser.param_return p2 =null;


        LatteTree char_literal6_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:85:3: (p1= param ( ',' p2= param )* -> ^( PARAMS ( param )+ ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:86:3: p1= param ( ',' p2= param )*
            {
            retval.result = new ArrayList<Param>();

            pushFollow(FOLLOW_param_in_arguments_list316);
            p1=param();

            state._fsp--;

            stream_param.add(p1.getTree());

            retval.result.add((p1!=null?p1.result:null));

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:87:39: ( ',' p2= param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==54) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:87:40: ',' p2= param
            	    {
            	    char_literal6=(Token)match(input,54,FOLLOW_54_in_arguments_list321);  
            	    stream_54.add(char_literal6);


            	    pushFollow(FOLLOW_param_in_arguments_list325);
            	    p2=param();

            	    state._fsp--;

            	    stream_param.add(p2.getTree());

            	    retval.result.add((p2!=null?p2.result:null));

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 88:3: -> ^( PARAMS ( param )+ )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:88:6: ^( PARAMS ( param )+ )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                if ( !(stream_param.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_param.nextTree());

                }
                stream_param.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arguments_list"


    public static class param_return extends ParserRuleReturnScope {
        public Param result;
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "param"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:91:1: param returns [Param result] : type NAME -> ^( PARAM type NAME ) ;
    public final LatteParser.param_return param() throws RecognitionException {
        LatteParser.param_return retval = new LatteParser.param_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token NAME8=null;
        LatteParser.type_return type7 =null;


        LatteTree NAME8_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:92:2: ( type NAME -> ^( PARAM type NAME ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:92:4: type NAME
            {
            pushFollow(FOLLOW_type_in_param356);
            type7=type();

            state._fsp--;

            stream_type.add(type7.getTree());

            NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_param358);  
            stream_NAME.add(NAME8);


            retval.result = new Param((type7!=null?input.toString(type7.start,type7.stop):null), (NAME8!=null?NAME8.getText():null));

            // AST REWRITE
            // elements: NAME, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 92:61: -> ^( PARAM type NAME )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:92:64: ^( PARAM type NAME )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(PARAM, "PARAM")
                , root_1);

                adaptor.addChild(root_1, stream_type.nextTree());

                adaptor.addChild(root_1, 
                stream_NAME.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "param"


    public static class type_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:95:1: type : ( single_type | array_type );
    public final LatteParser.type_return type() throws RecognitionException {
        LatteParser.type_return retval = new LatteParser.type_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.single_type_return single_type9 =null;

        LatteParser.array_type_return array_type10 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:96:2: ( single_type | array_type )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SINGLE_TYPE) ) {
                alt4=1;
            }
            else if ( (LA4_0==65||LA4_0==69) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:96:4: single_type
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_single_type_in_type382);
                    single_type9=single_type();

                    state._fsp--;

                    adaptor.addChild(root_0, single_type9.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:97:4: array_type
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_array_type_in_type387);
                    array_type10=array_type();

                    state._fsp--;

                    adaptor.addChild(root_0, array_type10.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class single_type_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_type"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:100:1: single_type : SINGLE_TYPE ;
    public final LatteParser.single_type_return single_type() throws RecognitionException {
        LatteParser.single_type_return retval = new LatteParser.single_type_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token SINGLE_TYPE11=null;

        LatteTree SINGLE_TYPE11_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:101:2: ( SINGLE_TYPE )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:101:4: SINGLE_TYPE
            {
            root_0 = (LatteTree)adaptor.nil();


            SINGLE_TYPE11=(Token)match(input,SINGLE_TYPE,FOLLOW_SINGLE_TYPE_in_single_type399); 
            SINGLE_TYPE11_tree = 
            (LatteTree)adaptor.create(SINGLE_TYPE11)
            ;
            adaptor.addChild(root_0, SINGLE_TYPE11_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_type"


    public static class array_type_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_type"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:104:1: array_type : ( 'int[]' | 'boolean[]' );
    public final LatteParser.array_type_return array_type() throws RecognitionException {
        LatteParser.array_type_return retval = new LatteParser.array_type_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token set12=null;

        LatteTree set12_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:105:2: ( 'int[]' | 'boolean[]' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:
            {
            root_0 = (LatteTree)adaptor.nil();


            set12=(Token)input.LT(1);

            if ( input.LA(1)==65||input.LA(1)==69 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (LatteTree)adaptor.create(set12)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_type"


    public static class statement_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:110:1: statement : ( block | declaration_statement | assignment_statement | if_statement | loop_statement | return_statement | expression_statement | ';' );
    public final LatteParser.statement_return statement() throws RecognitionException {
        LatteParser.statement_return retval = new LatteParser.statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal20=null;
        LatteParser.block_return block13 =null;

        LatteParser.declaration_statement_return declaration_statement14 =null;

        LatteParser.assignment_statement_return assignment_statement15 =null;

        LatteParser.if_statement_return if_statement16 =null;

        LatteParser.loop_statement_return loop_statement17 =null;

        LatteParser.return_statement_return return_statement18 =null;

        LatteParser.expression_statement_return expression_statement19 =null;


        LatteTree char_literal20_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:111:2: ( block | declaration_statement | assignment_statement | if_statement | loop_statement | return_statement | expression_statement | ';' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt5=1;
                }
                break;
            case SINGLE_TYPE:
                {
                alt5=2;
                }
                break;
            case NAME:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==DIV||(LA5_3 >= MINUS && LA5_3 <= MOD)||LA5_3==PLUS||LA5_3==TIMES||(LA5_3 >= 49 && LA5_3 <= 51)||(LA5_3 >= 56 && LA5_3 <= 58)||(LA5_3 >= 60 && LA5_3 <= 62)||LA5_3==75) ) {
                    alt5=7;
                }
                else if ( (LA5_3==53||LA5_3==55||LA5_3==59) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            case 68:
                {
                alt5=4;
                }
                break;
            case 73:
                {
                alt5=5;
                }
                break;
            case 72:
                {
                alt5=6;
                }
                break;
            case BOOLEAN:
            case INTEGER:
            case MINUS:
            case PLUS:
            case STRING:
            case 48:
            case 51:
            case 67:
            case 70:
            case 71:
                {
                alt5=7;
                }
                break;
            case 56:
                {
                alt5=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:111:4: block
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement427);
                    block13=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block13.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:112:5: declaration_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_statement_in_statement433);
                    declaration_statement14=declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration_statement14.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:113:5: assignment_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_assignment_statement_in_statement439);
                    assignment_statement15=assignment_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment_statement15.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:114:5: if_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_if_statement_in_statement445);
                    if_statement16=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement16.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:115:5: loop_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_loop_statement_in_statement451);
                    loop_statement17=loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, loop_statement17.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:116:5: return_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_return_statement_in_statement457);
                    return_statement18=return_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, return_statement18.getTree());

                    }
                    break;
                case 7 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:117:5: expression_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement463);
                    expression_statement19=expression_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_statement19.getTree());

                    }
                    break;
                case 8 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:118:5: ';'
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    char_literal20=(Token)match(input,56,FOLLOW_56_in_statement469); 
                    char_literal20_tree = 
                    (LatteTree)adaptor.create(char_literal20)
                    ;
                    adaptor.addChild(root_0, char_literal20_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class block_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "block"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:121:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final LatteParser.block_return block() throws RecognitionException {
        LatteParser.block_return retval = new LatteParser.block_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal21=null;
        Token char_literal23=null;
        LatteParser.statement_return statement22 =null;


        LatteTree char_literal21_tree=null;
        LatteTree char_literal23_tree=null;
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:122:2: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:122:4: '{' ( statement )* '}'
            {
            char_literal21=(Token)match(input,74,FOLLOW_74_in_block483);  
            stream_74.add(char_literal21);


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:122:8: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||(LA6_0 >= INTEGER && LA6_0 <= MINUS)||LA6_0==NAME||LA6_0==PLUS||(LA6_0 >= SINGLE_TYPE && LA6_0 <= STRING)||LA6_0==48||LA6_0==51||LA6_0==56||(LA6_0 >= 67 && LA6_0 <= 68)||(LA6_0 >= 70 && LA6_0 <= 74)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:122:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block485);
            	    statement22=statement();

            	    state._fsp--;

            	    stream_statement.add(statement22.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            char_literal23=(Token)match(input,76,FOLLOW_76_in_block488);  
            stream_76.add(char_literal23);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 122:23: -> ^( BLOCK ( statement )* )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:122:26: ^( BLOCK ( statement )* )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:122:34: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "block"


    public static class declaration_statement_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration_statement"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:125:1: declaration_statement : single_type single_declarator_list[$single_type.tree] ';' -> single_declarator_list ;
    public final LatteParser.declaration_statement_return declaration_statement() throws RecognitionException {
        LatteParser.declaration_statement_return retval = new LatteParser.declaration_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal26=null;
        LatteParser.single_type_return single_type24 =null;

        LatteParser.single_declarator_list_return single_declarator_list25 =null;


        LatteTree char_literal26_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleSubtreeStream stream_single_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule single_declarator_list");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:126:2: ( single_type single_declarator_list[$single_type.tree] ';' -> single_declarator_list )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:126:4: single_type single_declarator_list[$single_type.tree] ';'
            {
            pushFollow(FOLLOW_single_type_in_declaration_statement513);
            single_type24=single_type();

            state._fsp--;

            stream_single_type.add(single_type24.getTree());

            pushFollow(FOLLOW_single_declarator_list_in_declaration_statement515);
            single_declarator_list25=single_declarator_list((single_type24!=null?((LatteTree)single_type24.tree):null));

            state._fsp--;

            stream_single_declarator_list.add(single_declarator_list25.getTree());

            char_literal26=(Token)match(input,56,FOLLOW_56_in_declaration_statement518);  
            stream_56.add(char_literal26);


            // AST REWRITE
            // elements: single_declarator_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 126:62: -> single_declarator_list
            {
                adaptor.addChild(root_0, stream_single_declarator_list.nextTree());

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration_statement"


    public static class single_declarator_list_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_declarator_list"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:134:1: single_declarator_list[LatteTree typeTree] : single_declarator[$typeTree] ( ',' ! single_declarator[$typeTree] )* ;
    public final LatteParser.single_declarator_list_return single_declarator_list(LatteTree typeTree) throws RecognitionException {
        LatteParser.single_declarator_list_return retval = new LatteParser.single_declarator_list_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal28=null;
        LatteParser.single_declarator_return single_declarator27 =null;

        LatteParser.single_declarator_return single_declarator29 =null;


        LatteTree char_literal28_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:135:4: ( single_declarator[$typeTree] ( ',' ! single_declarator[$typeTree] )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:135:6: single_declarator[$typeTree] ( ',' ! single_declarator[$typeTree] )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_single_declarator_in_single_declarator_list542);
            single_declarator27=single_declarator(typeTree);

            state._fsp--;

            adaptor.addChild(root_0, single_declarator27.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:135:35: ( ',' ! single_declarator[$typeTree] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==54) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:135:36: ',' ! single_declarator[$typeTree]
            	    {
            	    char_literal28=(Token)match(input,54,FOLLOW_54_in_single_declarator_list546); 

            	    pushFollow(FOLLOW_single_declarator_in_single_declarator_list549);
            	    single_declarator29=single_declarator(typeTree);

            	    state._fsp--;

            	    adaptor.addChild(root_0, single_declarator29.getTree());

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_declarator_list"


    public static class single_declarator_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "single_declarator"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:138:1: single_declarator[LatteTree typeTree] : ( NAME '=' expression -> ^( DEFINE NAME expression ) | NAME -> ^( DEFINE NAME ) );
    public final LatteParser.single_declarator_return single_declarator(LatteTree typeTree) throws RecognitionException {
        LatteParser.single_declarator_return retval = new LatteParser.single_declarator_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token NAME30=null;
        Token char_literal31=null;
        Token NAME33=null;
        LatteParser.expression_return expression32 =null;


        LatteTree NAME30_tree=null;
        LatteTree char_literal31_tree=null;
        LatteTree NAME33_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:139:4: ( NAME '=' expression -> ^( DEFINE NAME expression ) | NAME -> ^( DEFINE NAME ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NAME) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==59) ) {
                    alt8=1;
                }
                else if ( (LA8_1==54||LA8_1==56) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:139:6: NAME '=' expression
                    {
                    NAME30=(Token)match(input,NAME,FOLLOW_NAME_in_single_declarator568);  
                    stream_NAME.add(NAME30);


                    char_literal31=(Token)match(input,59,FOLLOW_59_in_single_declarator570);  
                    stream_59.add(char_literal31);


                    pushFollow(FOLLOW_expression_in_single_declarator572);
                    expression32=expression();

                    state._fsp--;

                    stream_expression.add(expression32.getTree());

                    // AST REWRITE
                    // elements: expression, NAME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 139:27: -> ^( DEFINE NAME expression )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:139:30: ^( DEFINE NAME expression )
                        {
                        LatteTree root_1 = (LatteTree)adaptor.nil();
                        root_1 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(DEFINE, "DEFINE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NAME.nextNode()
                        );

                        adaptor.addChild(root_1, typeTree);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:140:6: NAME
                    {
                    NAME33=(Token)match(input,NAME,FOLLOW_NAME_in_single_declarator593);  
                    stream_NAME.add(NAME33);


                    // AST REWRITE
                    // elements: NAME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 140:11: -> ^( DEFINE NAME )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:140:14: ^( DEFINE NAME )
                        {
                        LatteTree root_1 = (LatteTree)adaptor.nil();
                        root_1 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(DEFINE, "DEFINE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NAME.nextNode()
                        );

                        adaptor.addChild(root_1, typeTree);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "single_declarator"


    public static class assignment_statement_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment_statement"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:143:1: assignment_statement : assignment ';' !;
    public final LatteParser.assignment_statement_return assignment_statement() throws RecognitionException {
        LatteParser.assignment_statement_return retval = new LatteParser.assignment_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal35=null;
        LatteParser.assignment_return assignment34 =null;


        LatteTree char_literal35_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:144:4: ( assignment ';' !)
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:144:6: assignment ';' !
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_assignment_in_assignment_statement621);
            assignment34=assignment();

            state._fsp--;

            adaptor.addChild(root_0, assignment34.getTree());

            char_literal35=(Token)match(input,56,FOLLOW_56_in_assignment_statement623); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment_statement"


    public static class assignment_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignment"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:147:1: assignment : ( ident '=' ^ expression | ident '++' -> ^( '=' ident ^( PLUS ident INTEGER[\"1\"] ) ) | ident '--' -> ^( '=' ident ^( MINUS ident INTEGER[\"1\"] ) ) );
    public final LatteParser.assignment_return assignment() throws RecognitionException {
        LatteParser.assignment_return retval = new LatteParser.assignment_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal37=null;
        Token string_literal40=null;
        Token string_literal42=null;
        LatteParser.ident_return ident36 =null;

        LatteParser.expression_return expression38 =null;

        LatteParser.ident_return ident39 =null;

        LatteParser.ident_return ident41 =null;


        LatteTree char_literal37_tree=null;
        LatteTree string_literal40_tree=null;
        LatteTree string_literal42_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:148:4: ( ident '=' ^ expression | ident '++' -> ^( '=' ident ^( PLUS ident INTEGER[\"1\"] ) ) | ident '--' -> ^( '=' ident ^( MINUS ident INTEGER[\"1\"] ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NAME) ) {
                switch ( input.LA(2) ) {
                case 59:
                    {
                    alt9=1;
                    }
                    break;
                case 53:
                    {
                    alt9=2;
                    }
                    break;
                case 55:
                    {
                    alt9=3;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }

            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:148:6: ident '=' ^ expression
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_assignment642);
                    ident36=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident36.getTree());

                    char_literal37=(Token)match(input,59,FOLLOW_59_in_assignment644); 
                    char_literal37_tree = 
                    (LatteTree)adaptor.create(char_literal37)
                    ;
                    root_0 = (LatteTree)adaptor.becomeRoot(char_literal37_tree, root_0);


                    pushFollow(FOLLOW_expression_in_assignment647);
                    expression38=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression38.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:149:6: ident '++'
                    {
                    pushFollow(FOLLOW_ident_in_assignment654);
                    ident39=ident();

                    state._fsp--;

                    stream_ident.add(ident39.getTree());

                    string_literal40=(Token)match(input,53,FOLLOW_53_in_assignment656);  
                    stream_53.add(string_literal40);


                    // AST REWRITE
                    // elements: ident, ident, 59
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 149:17: -> ^( '=' ident ^( PLUS ident INTEGER[\"1\"] ) )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:149:20: ^( '=' ident ^( PLUS ident INTEGER[\"1\"] ) )
                        {
                        LatteTree root_1 = (LatteTree)adaptor.nil();
                        root_1 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(59, "59")
                        , root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());

                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:149:32: ^( PLUS ident INTEGER[\"1\"] )
                        {
                        LatteTree root_2 = (LatteTree)adaptor.nil();
                        root_2 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(PLUS, "PLUS")
                        , root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_2, 
                        (LatteTree)adaptor.create(INTEGER, "1")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:150:6: ident '--'
                    {
                    pushFollow(FOLLOW_ident_in_assignment680);
                    ident41=ident();

                    state._fsp--;

                    stream_ident.add(ident41.getTree());

                    string_literal42=(Token)match(input,55,FOLLOW_55_in_assignment682);  
                    stream_55.add(string_literal42);


                    // AST REWRITE
                    // elements: ident, ident, 59
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 150:17: -> ^( '=' ident ^( MINUS ident INTEGER[\"1\"] ) )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:150:20: ^( '=' ident ^( MINUS ident INTEGER[\"1\"] ) )
                        {
                        LatteTree root_1 = (LatteTree)adaptor.nil();
                        root_1 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(59, "59")
                        , root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());

                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:150:32: ^( MINUS ident INTEGER[\"1\"] )
                        {
                        LatteTree root_2 = (LatteTree)adaptor.nil();
                        root_2 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(MINUS, "MINUS")
                        , root_2);

                        adaptor.addChild(root_2, stream_ident.nextTree());

                        adaptor.addChild(root_2, 
                        (LatteTree)adaptor.create(INTEGER, "1")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignment"


    public static class if_statement_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "if_statement"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:153:1: if_statement : 'if' '(' expression ')' st1= statement ( options {greedy=true; } : 'else' st2= statement )? -> ^( IF expression $st1 ( $st2)? ) ;
    public final LatteParser.if_statement_return if_statement() throws RecognitionException {
        LatteParser.if_statement_return retval = new LatteParser.if_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal43=null;
        Token char_literal44=null;
        Token char_literal46=null;
        Token string_literal47=null;
        LatteParser.statement_return st1 =null;

        LatteParser.statement_return st2 =null;

        LatteParser.expression_return expression45 =null;


        LatteTree string_literal43_tree=null;
        LatteTree char_literal44_tree=null;
        LatteTree char_literal46_tree=null;
        LatteTree string_literal47_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:154:2: ( 'if' '(' expression ')' st1= statement ( options {greedy=true; } : 'else' st2= statement )? -> ^( IF expression $st1 ( $st2)? ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:154:4: 'if' '(' expression ')' st1= statement ( options {greedy=true; } : 'else' st2= statement )?
            {
            string_literal43=(Token)match(input,68,FOLLOW_68_in_if_statement715);  
            stream_68.add(string_literal43);


            char_literal44=(Token)match(input,51,FOLLOW_51_in_if_statement717);  
            stream_51.add(char_literal44);


            pushFollow(FOLLOW_expression_in_if_statement719);
            expression45=expression();

            state._fsp--;

            stream_expression.add(expression45.getTree());

            char_literal46=(Token)match(input,52,FOLLOW_52_in_if_statement721);  
            stream_52.add(char_literal46);


            pushFollow(FOLLOW_statement_in_if_statement725);
            st1=statement();

            state._fsp--;

            stream_statement.add(st1.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:155:2: ( options {greedy=true; } : 'else' st2= statement )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==66) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:155:26: 'else' st2= statement
                    {
                    string_literal47=(Token)match(input,66,FOLLOW_66_in_if_statement737);  
                    stream_66.add(string_literal47);


                    pushFollow(FOLLOW_statement_in_if_statement741);
                    st2=statement();

                    state._fsp--;

                    stream_statement.add(st2.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: expression, st2, st1
            // token labels: 
            // rule labels: retval, st1, st2
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_st1=new RewriteRuleSubtreeStream(adaptor,"rule st1",st1!=null?st1.tree:null);
            RewriteRuleSubtreeStream stream_st2=new RewriteRuleSubtreeStream(adaptor,"rule st2",st2!=null?st2.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 156:3: -> ^( IF expression $st1 ( $st2)? )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:157:2: ^( IF expression $st1 ( $st2)? )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(IF, "IF")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, stream_st1.nextTree());

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:157:25: ( $st2)?
                if ( stream_st2.hasNext() ) {
                    adaptor.addChild(root_1, stream_st2.nextTree());

                }
                stream_st2.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "if_statement"


    public static class loop_statement_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "loop_statement"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:161:1: loop_statement : 'while' '(' expression ')' statement -> ^( WHILE expression DO statement ENDWHILE ) ;
    public final LatteParser.loop_statement_return loop_statement() throws RecognitionException {
        LatteParser.loop_statement_return retval = new LatteParser.loop_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal48=null;
        Token char_literal49=null;
        Token char_literal51=null;
        LatteParser.expression_return expression50 =null;

        LatteParser.statement_return statement52 =null;


        LatteTree string_literal48_tree=null;
        LatteTree char_literal49_tree=null;
        LatteTree char_literal51_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:162:4: ( 'while' '(' expression ')' statement -> ^( WHILE expression DO statement ENDWHILE ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:162:6: 'while' '(' expression ')' statement
            {
            string_literal48=(Token)match(input,73,FOLLOW_73_in_loop_statement780);  
            stream_73.add(string_literal48);


            char_literal49=(Token)match(input,51,FOLLOW_51_in_loop_statement782);  
            stream_51.add(char_literal49);


            pushFollow(FOLLOW_expression_in_loop_statement784);
            expression50=expression();

            state._fsp--;

            stream_expression.add(expression50.getTree());

            char_literal51=(Token)match(input,52,FOLLOW_52_in_loop_statement786);  
            stream_52.add(char_literal51);


            pushFollow(FOLLOW_statement_in_loop_statement788);
            statement52=statement();

            state._fsp--;

            stream_statement.add(statement52.getTree());

            // AST REWRITE
            // elements: statement, expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 162:43: -> ^( WHILE expression DO statement ENDWHILE )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:163:4: ^( WHILE expression DO statement ENDWHILE )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(WHILE, "WHILE")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, 
                (LatteTree)adaptor.create(DO, "DO")
                );

                adaptor.addChild(root_1, stream_statement.nextTree());

                adaptor.addChild(root_1, 
                (LatteTree)adaptor.create(ENDWHILE, "ENDWHILE")
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "loop_statement"


    public static class return_statement_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "return_statement"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:168:1: return_statement : 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) ;
    public final LatteParser.return_statement_return return_statement() throws RecognitionException {
        LatteParser.return_statement_return retval = new LatteParser.return_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal53=null;
        Token char_literal55=null;
        LatteParser.expression_return expression54 =null;


        LatteTree string_literal53_tree=null;
        LatteTree char_literal55_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:169:4: ( 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:169:6: 'return' ( expression )? ';'
            {
            string_literal53=(Token)match(input,72,FOLLOW_72_in_return_statement825);  
            stream_72.add(string_literal53);


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:169:15: ( expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BOOLEAN||(LA11_0 >= INTEGER && LA11_0 <= MINUS)||LA11_0==NAME||LA11_0==PLUS||LA11_0==STRING||LA11_0==48||LA11_0==51||LA11_0==67||(LA11_0 >= 70 && LA11_0 <= 71)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:169:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement828);
                    expression54=expression();

                    state._fsp--;

                    stream_expression.add(expression54.getTree());

                    }
                    break;

            }


            char_literal55=(Token)match(input,56,FOLLOW_56_in_return_statement832);  
            stream_56.add(char_literal55);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 169:33: -> ^( RETURN ( expression )? )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:169:36: ^( RETURN ( expression )? )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(RETURN, "RETURN")
                , root_1);

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:169:45: ( expression )?
                if ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "return_statement"


    public static class expression_statement_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_statement"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:172:1: expression_statement : expression ';' !;
    public final LatteParser.expression_statement_return expression_statement() throws RecognitionException {
        LatteParser.expression_statement_return retval = new LatteParser.expression_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal57=null;
        LatteParser.expression_return expression56 =null;


        LatteTree char_literal57_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:173:3: ( expression ';' !)
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:173:5: expression ';' !
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_expression_statement858);
            expression56=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression56.getTree());

            char_literal57=(Token)match(input,56,FOLLOW_56_in_expression_statement860); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression_statement"


    public static class predefined_statement_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predefined_statement"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:178:1: predefined_statement : predefined_function ;
    public final LatteParser.predefined_statement_return predefined_statement() throws RecognitionException {
        LatteParser.predefined_statement_return retval = new LatteParser.predefined_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.predefined_function_return predefined_function58 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:179:2: ( predefined_function )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:179:4: predefined_function
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_predefined_function_in_predefined_statement875);
            predefined_function58=predefined_function();

            state._fsp--;

            adaptor.addChild(root_0, predefined_function58.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predefined_statement"


    public static class predefined_function_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predefined_function"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:182:1: predefined_function : ( printInt | error | readInt );
    public final LatteParser.predefined_function_return predefined_function() throws RecognitionException {
        LatteParser.predefined_function_return retval = new LatteParser.predefined_function_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.printInt_return printInt59 =null;

        LatteParser.error_return error60 =null;

        LatteParser.readInt_return readInt61 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:183:2: ( printInt | error | readInt )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt12=1;
                }
                break;
            case 67:
                {
                alt12=2;
                }
                break;
            case 71:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:183:4: printInt
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_printInt_in_predefined_function887);
                    printInt59=printInt();

                    state._fsp--;

                    adaptor.addChild(root_0, printInt59.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:185:4: error
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_error_in_predefined_function893);
                    error60=error();

                    state._fsp--;

                    adaptor.addChild(root_0, error60.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:186:4: readInt
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_readInt_in_predefined_function898);
                    readInt61=readInt();

                    state._fsp--;

                    adaptor.addChild(root_0, readInt61.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predefined_function"


    public static class printInt_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printInt"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:189:1: printInt : 'printInt' '(' expression ')' -> ^( PRINTINT expression ) ;
    public final LatteParser.printInt_return printInt() throws RecognitionException {
        LatteParser.printInt_return retval = new LatteParser.printInt_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal62=null;
        Token char_literal63=null;
        Token char_literal65=null;
        LatteParser.expression_return expression64 =null;


        LatteTree string_literal62_tree=null;
        LatteTree char_literal63_tree=null;
        LatteTree char_literal65_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:190:2: ( 'printInt' '(' expression ')' -> ^( PRINTINT expression ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:190:4: 'printInt' '(' expression ')'
            {
            string_literal62=(Token)match(input,70,FOLLOW_70_in_printInt910);  
            stream_70.add(string_literal62);


            char_literal63=(Token)match(input,51,FOLLOW_51_in_printInt912);  
            stream_51.add(char_literal63);


            pushFollow(FOLLOW_expression_in_printInt914);
            expression64=expression();

            state._fsp--;

            stream_expression.add(expression64.getTree());

            char_literal65=(Token)match(input,52,FOLLOW_52_in_printInt916);  
            stream_52.add(char_literal65);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 190:34: -> ^( PRINTINT expression )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:190:37: ^( PRINTINT expression )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(PRINTINT, "PRINTINT")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printInt"


    public static class error_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "error"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:197:1: error : 'error' '(' ')' -> ERROR ;
    public final LatteParser.error_return error() throws RecognitionException {
        LatteParser.error_return retval = new LatteParser.error_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal66=null;
        Token char_literal67=null;
        Token char_literal68=null;

        LatteTree string_literal66_tree=null;
        LatteTree char_literal67_tree=null;
        LatteTree char_literal68_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:198:2: ( 'error' '(' ')' -> ERROR )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:198:4: 'error' '(' ')'
            {
            string_literal66=(Token)match(input,67,FOLLOW_67_in_error941);  
            stream_67.add(string_literal66);


            char_literal67=(Token)match(input,51,FOLLOW_51_in_error943);  
            stream_51.add(char_literal67);


            char_literal68=(Token)match(input,52,FOLLOW_52_in_error945);  
            stream_52.add(char_literal68);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 198:20: -> ERROR
            {
                adaptor.addChild(root_0, 
                (LatteTree)adaptor.create(ERROR, "ERROR")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "error"


    public static class readInt_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "readInt"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:201:1: readInt : 'readInt' '(' ')' -> READINT ;
    public final LatteParser.readInt_return readInt() throws RecognitionException {
        LatteParser.readInt_return retval = new LatteParser.readInt_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal69=null;
        Token char_literal70=null;
        Token char_literal71=null;

        LatteTree string_literal69_tree=null;
        LatteTree char_literal70_tree=null;
        LatteTree char_literal71_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:202:2: ( 'readInt' '(' ')' -> READINT )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:202:4: 'readInt' '(' ')'
            {
            string_literal69=(Token)match(input,71,FOLLOW_71_in_readInt961);  
            stream_71.add(string_literal69);


            char_literal70=(Token)match(input,51,FOLLOW_51_in_readInt963);  
            stream_51.add(char_literal70);


            char_literal71=(Token)match(input,52,FOLLOW_52_in_readInt966);  
            stream_52.add(char_literal71);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 202:23: -> READINT
            {
                adaptor.addChild(root_0, 
                (LatteTree)adaptor.create(READINT, "READINT")
                );

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "readInt"


    public static class expression_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:206:1: expression : expr -> ^( EXPR expr ) ;
    public final LatteParser.expression_return expression() throws RecognitionException {
        LatteParser.expression_return retval = new LatteParser.expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.expr_return expr72 =null;


        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:207:2: ( expr -> ^( EXPR expr ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:207:4: expr
            {
            pushFollow(FOLLOW_expr_in_expression983);
            expr72=expr();

            state._fsp--;

            stream_expr.add(expr72.getTree());

            // AST REWRITE
            // elements: expr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 207:9: -> ^( EXPR expr )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:207:12: ^( EXPR expr )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(EXPR, "EXPR")
                , root_1);

                adaptor.addChild(root_1, stream_expr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class expr_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:210:1: expr : logical_expression_or ;
    public final LatteParser.expr_return expr() throws RecognitionException {
        LatteParser.expr_return retval = new LatteParser.expr_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.logical_expression_or_return logical_expression_or73 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:211:2: ( logical_expression_or )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:211:4: logical_expression_or
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_logical_expression_or_in_expr1003);
            logical_expression_or73=logical_expression_or();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression_or73.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class logical_expression_or_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_expression_or"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:214:1: logical_expression_or : logical_expression_and ( '||' ^ logical_expression_and )* ;
    public final LatteParser.logical_expression_or_return logical_expression_or() throws RecognitionException {
        LatteParser.logical_expression_or_return retval = new LatteParser.logical_expression_or_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal75=null;
        LatteParser.logical_expression_and_return logical_expression_and74 =null;

        LatteParser.logical_expression_and_return logical_expression_and76 =null;


        LatteTree string_literal75_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:215:2: ( logical_expression_and ( '||' ^ logical_expression_and )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:215:4: logical_expression_and ( '||' ^ logical_expression_and )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_logical_expression_and_in_logical_expression_or1014);
            logical_expression_and74=logical_expression_and();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression_and74.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:215:27: ( '||' ^ logical_expression_and )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==75) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:215:28: '||' ^ logical_expression_and
            	    {
            	    string_literal75=(Token)match(input,75,FOLLOW_75_in_logical_expression_or1017); 
            	    string_literal75_tree = 
            	    (LatteTree)adaptor.create(string_literal75)
            	    ;
            	    root_0 = (LatteTree)adaptor.becomeRoot(string_literal75_tree, root_0);


            	    pushFollow(FOLLOW_logical_expression_and_in_logical_expression_or1020);
            	    logical_expression_and76=logical_expression_and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_expression_and76.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_expression_or"


    public static class logical_expression_and_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_expression_and"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:218:1: logical_expression_and : comparison_expression ( '&&' ^ comparison_expression )* ;
    public final LatteParser.logical_expression_and_return logical_expression_and() throws RecognitionException {
        LatteParser.logical_expression_and_return retval = new LatteParser.logical_expression_and_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal78=null;
        LatteParser.comparison_expression_return comparison_expression77 =null;

        LatteParser.comparison_expression_return comparison_expression79 =null;


        LatteTree string_literal78_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:219:2: ( comparison_expression ( '&&' ^ comparison_expression )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:219:4: comparison_expression ( '&&' ^ comparison_expression )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_comparison_expression_in_logical_expression_and1033);
            comparison_expression77=comparison_expression();

            state._fsp--;

            adaptor.addChild(root_0, comparison_expression77.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:219:26: ( '&&' ^ comparison_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==50) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:219:27: '&&' ^ comparison_expression
            	    {
            	    string_literal78=(Token)match(input,50,FOLLOW_50_in_logical_expression_and1036); 
            	    string_literal78_tree = 
            	    (LatteTree)adaptor.create(string_literal78)
            	    ;
            	    root_0 = (LatteTree)adaptor.becomeRoot(string_literal78_tree, root_0);


            	    pushFollow(FOLLOW_comparison_expression_in_logical_expression_and1039);
            	    comparison_expression79=comparison_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comparison_expression79.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logical_expression_and"


    public static class comparison_expression_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparison_expression"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:222:1: comparison_expression : relational_expression ;
    public final LatteParser.comparison_expression_return comparison_expression() throws RecognitionException {
        LatteParser.comparison_expression_return retval = new LatteParser.comparison_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.relational_expression_return relational_expression80 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:223:2: ( relational_expression )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:223:4: relational_expression
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_comparison_expression1052);
            relational_expression80=relational_expression();

            state._fsp--;

            adaptor.addChild(root_0, relational_expression80.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "comparison_expression"


    public static class relational_expression_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "relational_expression"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:226:1: relational_expression : additive_expression ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression )* ;
    public final LatteParser.relational_expression_return relational_expression() throws RecognitionException {
        LatteParser.relational_expression_return retval = new LatteParser.relational_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token set82=null;
        LatteParser.additive_expression_return additive_expression81 =null;

        LatteParser.additive_expression_return additive_expression83 =null;


        LatteTree set82_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:227:2: ( additive_expression ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:227:4: additive_expression ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_relational_expression1065);
            additive_expression81=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression81.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:227:24: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==49||(LA15_0 >= 57 && LA15_0 <= 58)||(LA15_0 >= 60 && LA15_0 <= 62)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:227:25: ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression
            	    {
            	    set82=(Token)input.LT(1);

            	    set82=(Token)input.LT(1);

            	    if ( input.LA(1)==49||(input.LA(1) >= 57 && input.LA(1) <= 58)||(input.LA(1) >= 60 && input.LA(1) <= 62) ) {
            	        input.consume();
            	        root_0 = (LatteTree)adaptor.becomeRoot(
            	        (LatteTree)adaptor.create(set82)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additive_expression_in_relational_expression1093);
            	    additive_expression83=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression83.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "relational_expression"


    public static class additive_expression_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "additive_expression"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:230:1: additive_expression : multiplicative_expression ( ( PLUS ^| MINUS ^) multiplicative_expression )* ;
    public final LatteParser.additive_expression_return additive_expression() throws RecognitionException {
        LatteParser.additive_expression_return retval = new LatteParser.additive_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token PLUS85=null;
        Token MINUS86=null;
        LatteParser.multiplicative_expression_return multiplicative_expression84 =null;

        LatteParser.multiplicative_expression_return multiplicative_expression87 =null;


        LatteTree PLUS85_tree=null;
        LatteTree MINUS86_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:231:2: ( multiplicative_expression ( ( PLUS ^| MINUS ^) multiplicative_expression )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:231:4: multiplicative_expression ( ( PLUS ^| MINUS ^) multiplicative_expression )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1107);
            multiplicative_expression84=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression84.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:231:30: ( ( PLUS ^| MINUS ^) multiplicative_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:231:31: ( PLUS ^| MINUS ^) multiplicative_expression
            	    {
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:231:31: ( PLUS ^| MINUS ^)
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==PLUS) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==MINUS) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:231:32: PLUS ^
            	            {
            	            PLUS85=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression1111); 
            	            PLUS85_tree = 
            	            (LatteTree)adaptor.create(PLUS85)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(PLUS85_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:231:40: MINUS ^
            	            {
            	            MINUS86=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression1116); 
            	            MINUS86_tree = 
            	            (LatteTree)adaptor.create(MINUS86)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(MINUS86_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1120);
            	    multiplicative_expression87=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression87.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "additive_expression"


    public static class multiplicative_expression_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multiplicative_expression"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:234:1: multiplicative_expression : unary_expression ( ( TIMES ^| DIV ^| MOD ^) unary_expression )* ;
    public final LatteParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        LatteParser.multiplicative_expression_return retval = new LatteParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token TIMES89=null;
        Token DIV90=null;
        Token MOD91=null;
        LatteParser.unary_expression_return unary_expression88 =null;

        LatteParser.unary_expression_return unary_expression92 =null;


        LatteTree TIMES89_tree=null;
        LatteTree DIV90_tree=null;
        LatteTree MOD91_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:2: ( unary_expression ( ( TIMES ^| DIV ^| MOD ^) unary_expression )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:4: unary_expression ( ( TIMES ^| DIV ^| MOD ^) unary_expression )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1134);
            unary_expression88=unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, unary_expression88.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:21: ( ( TIMES ^| DIV ^| MOD ^) unary_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DIV||LA19_0==MOD||LA19_0==TIMES) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:22: ( TIMES ^| DIV ^| MOD ^) unary_expression
            	    {
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:22: ( TIMES ^| DIV ^| MOD ^)
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case TIMES:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:23: TIMES ^
            	            {
            	            TIMES89=(Token)match(input,TIMES,FOLLOW_TIMES_in_multiplicative_expression1138); 
            	            TIMES89_tree = 
            	            (LatteTree)adaptor.create(TIMES89)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(TIMES89_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:32: DIV ^
            	            {
            	            DIV90=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_expression1143); 
            	            DIV90_tree = 
            	            (LatteTree)adaptor.create(DIV90)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(DIV90_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:39: MOD ^
            	            {
            	            MOD91=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicative_expression1148); 
            	            MOD91_tree = 
            	            (LatteTree)adaptor.create(MOD91)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(MOD91_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1152);
            	    unary_expression92=unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_expression92.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multiplicative_expression"


    public static class unary_expression_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unary_expression"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:238:1: unary_expression : ( PLUS !| negation ^)* suffix_expression ;
    public final LatteParser.unary_expression_return unary_expression() throws RecognitionException {
        LatteParser.unary_expression_return retval = new LatteParser.unary_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token PLUS93=null;
        LatteParser.negation_return negation94 =null;

        LatteParser.suffix_expression_return suffix_expression95 =null;


        LatteTree PLUS93_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:239:2: ( ( PLUS !| negation ^)* suffix_expression )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:239:4: ( PLUS !| negation ^)* suffix_expression
            {
            root_0 = (LatteTree)adaptor.nil();


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:239:4: ( PLUS !| negation ^)*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==PLUS) ) {
                    alt20=1;
                }
                else if ( (LA20_0==MINUS||LA20_0==48) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:239:5: PLUS !
            	    {
            	    PLUS93=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression1168); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:239:13: negation ^
            	    {
            	    pushFollow(FOLLOW_negation_in_unary_expression1173);
            	    negation94=negation();

            	    state._fsp--;

            	    root_0 = (LatteTree)adaptor.becomeRoot(negation94.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            pushFollow(FOLLOW_suffix_expression_in_unary_expression1179);
            suffix_expression95=suffix_expression();

            state._fsp--;

            adaptor.addChild(root_0, suffix_expression95.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unary_expression"


    public static class negation_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "negation"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:1: negation : ( '!' -> NEGATION | MINUS -> NUM_NEGATION );
    public final LatteParser.negation_return negation() throws RecognitionException {
        LatteParser.negation_return retval = new LatteParser.negation_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal96=null;
        Token MINUS97=null;

        LatteTree char_literal96_tree=null;
        LatteTree MINUS97_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:243:2: ( '!' -> NEGATION | MINUS -> NUM_NEGATION )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==48) ) {
                alt21=1;
            }
            else if ( (LA21_0==MINUS) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:243:4: '!'
                    {
                    char_literal96=(Token)match(input,48,FOLLOW_48_in_negation1192);  
                    stream_48.add(char_literal96);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 243:8: -> NEGATION
                    {
                        adaptor.addChild(root_0, 
                        (LatteTree)adaptor.create(NEGATION, "NEGATION")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:244:4: MINUS
                    {
                    MINUS97=(Token)match(input,MINUS,FOLLOW_MINUS_in_negation1201);  
                    stream_MINUS.add(MINUS97);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 244:10: -> NUM_NEGATION
                    {
                        adaptor.addChild(root_0, 
                        (LatteTree)adaptor.create(NUM_NEGATION, "NUM_NEGATION")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "negation"


    public static class suffix_expression_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "suffix_expression"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:247:1: suffix_expression : ( basic_expression | NAME '(' expression_list ')' -> ^( CALL NAME expression_list ) | predefined_statement );
    public final LatteParser.suffix_expression_return suffix_expression() throws RecognitionException {
        LatteParser.suffix_expression_return retval = new LatteParser.suffix_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token NAME99=null;
        Token char_literal100=null;
        Token char_literal102=null;
        LatteParser.basic_expression_return basic_expression98 =null;

        LatteParser.expression_list_return expression_list101 =null;

        LatteParser.predefined_statement_return predefined_statement103 =null;


        LatteTree NAME99_tree=null;
        LatteTree char_literal100_tree=null;
        LatteTree char_literal102_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:248:2: ( basic_expression | NAME '(' expression_list ')' -> ^( CALL NAME expression_list ) | predefined_statement )
            int alt22=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==51) ) {
                    alt22=2;
                }
                else if ( (LA22_1==DIV||(LA22_1 >= MINUS && LA22_1 <= MOD)||LA22_1==PLUS||LA22_1==TIMES||(LA22_1 >= 49 && LA22_1 <= 50)||LA22_1==52||LA22_1==54||(LA22_1 >= 56 && LA22_1 <= 58)||(LA22_1 >= 60 && LA22_1 <= 62)||LA22_1==75) ) {
                    alt22=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }
                }
                break;
            case BOOLEAN:
            case INTEGER:
            case STRING:
            case 51:
                {
                alt22=1;
                }
                break;
            case 67:
            case 70:
            case 71:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:248:4: basic_expression
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_basic_expression_in_suffix_expression1217);
                    basic_expression98=basic_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_expression98.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:249:4: NAME '(' expression_list ')'
                    {
                    NAME99=(Token)match(input,NAME,FOLLOW_NAME_in_suffix_expression1222);  
                    stream_NAME.add(NAME99);


                    char_literal100=(Token)match(input,51,FOLLOW_51_in_suffix_expression1224);  
                    stream_51.add(char_literal100);


                    pushFollow(FOLLOW_expression_list_in_suffix_expression1226);
                    expression_list101=expression_list();

                    state._fsp--;

                    stream_expression_list.add(expression_list101.getTree());

                    char_literal102=(Token)match(input,52,FOLLOW_52_in_suffix_expression1228);  
                    stream_52.add(char_literal102);


                    // AST REWRITE
                    // elements: expression_list, NAME
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 249:33: -> ^( CALL NAME expression_list )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:249:36: ^( CALL NAME expression_list )
                        {
                        LatteTree root_1 = (LatteTree)adaptor.nil();
                        root_1 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(CALL, "CALL")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_NAME.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expression_list.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:250:4: predefined_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_predefined_statement_in_suffix_expression1245);
                    predefined_statement103=predefined_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, predefined_statement103.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "suffix_expression"


    public static class expression_list_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression_list"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:253:1: expression_list : ( expression ( ',' expression )* )? -> ^( ARG ( expression )* ) ;
    public final LatteParser.expression_list_return expression_list() throws RecognitionException {
        LatteParser.expression_list_return retval = new LatteParser.expression_list_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal105=null;
        LatteParser.expression_return expression104 =null;

        LatteParser.expression_return expression106 =null;


        LatteTree char_literal105_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:2: ( ( expression ( ',' expression )* )? -> ^( ARG ( expression )* ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:4: ( expression ( ',' expression )* )?
            {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:4: ( expression ( ',' expression )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BOOLEAN||(LA24_0 >= INTEGER && LA24_0 <= MINUS)||LA24_0==NAME||LA24_0==PLUS||LA24_0==STRING||LA24_0==48||LA24_0==51||LA24_0==67||(LA24_0 >= 70 && LA24_0 <= 71)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:5: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_expression_list1257);
                    expression104=expression();

                    state._fsp--;

                    stream_expression.add(expression104.getTree());

                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:16: ( ',' expression )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==54) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:17: ',' expression
                    	    {
                    	    char_literal105=(Token)match(input,54,FOLLOW_54_in_expression_list1260);  
                    	    stream_54.add(char_literal105);


                    	    pushFollow(FOLLOW_expression_in_expression_list1262);
                    	    expression106=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression106.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    }
                    break;

            }


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 254:36: -> ^( ARG ( expression )* )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:39: ^( ARG ( expression )* )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(ARG, "ARG")
                , root_1);

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:45: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression_list"


    public static class ident_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ident"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:257:1: ident : NAME -> ^( REF NAME ) ;
    public final LatteParser.ident_return ident() throws RecognitionException {
        LatteParser.ident_return retval = new LatteParser.ident_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token NAME107=null;

        LatteTree NAME107_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:258:2: ( NAME -> ^( REF NAME ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:258:4: NAME
            {
            NAME107=(Token)match(input,NAME,FOLLOW_NAME_in_ident1287);  
            stream_NAME.add(NAME107);


            // AST REWRITE
            // elements: NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 258:9: -> ^( REF NAME )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:258:12: ^( REF NAME )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(REF, "REF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NAME.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ident"


    public static class array_call_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "array_call"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:262:1: array_call : NAME '[' INTEGER ']' -> ^( ARRAY NAME INTEGER ) ;
    public final LatteParser.array_call_return array_call() throws RecognitionException {
        LatteParser.array_call_return retval = new LatteParser.array_call_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token NAME108=null;
        Token char_literal109=null;
        Token INTEGER110=null;
        Token char_literal111=null;

        LatteTree NAME108_tree=null;
        LatteTree char_literal109_tree=null;
        LatteTree INTEGER110_tree=null;
        LatteTree char_literal111_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:263:2: ( NAME '[' INTEGER ']' -> ^( ARRAY NAME INTEGER ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:263:4: NAME '[' INTEGER ']'
            {
            NAME108=(Token)match(input,NAME,FOLLOW_NAME_in_array_call1309);  
            stream_NAME.add(NAME108);


            char_literal109=(Token)match(input,63,FOLLOW_63_in_array_call1311);  
            stream_63.add(char_literal109);


            INTEGER110=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_array_call1313);  
            stream_INTEGER.add(INTEGER110);


            char_literal111=(Token)match(input,64,FOLLOW_64_in_array_call1315);  
            stream_64.add(char_literal111);


            // AST REWRITE
            // elements: NAME, INTEGER
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 263:25: -> ^( ARRAY NAME INTEGER )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:263:28: ^( ARRAY NAME INTEGER )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(ARRAY, "ARRAY")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NAME.nextNode()
                );

                adaptor.addChild(root_1, 
                stream_INTEGER.nextNode()
                );

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "array_call"


    public static class basic_expression_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "basic_expression"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:266:1: basic_expression : ( ident | literal | '(' ! expr ')' !);
    public final LatteParser.basic_expression_return basic_expression() throws RecognitionException {
        LatteParser.basic_expression_return retval = new LatteParser.basic_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal114=null;
        Token char_literal116=null;
        LatteParser.ident_return ident112 =null;

        LatteParser.literal_return literal113 =null;

        LatteParser.expr_return expr115 =null;


        LatteTree char_literal114_tree=null;
        LatteTree char_literal116_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:267:2: ( ident | literal | '(' ! expr ')' !)
            int alt25=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                alt25=1;
                }
                break;
            case BOOLEAN:
            case INTEGER:
            case STRING:
                {
                alt25=2;
                }
                break;
            case 51:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:267:4: ident
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_basic_expression1337);
                    ident112=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident112.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:268:4: literal
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_basic_expression1342);
                    literal113=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal113.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:269:4: '(' ! expr ')' !
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    char_literal114=(Token)match(input,51,FOLLOW_51_in_basic_expression1347); 

                    pushFollow(FOLLOW_expr_in_basic_expression1350);
                    expr115=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr115.getTree());

                    char_literal116=(Token)match(input,52,FOLLOW_52_in_basic_expression1352); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "basic_expression"


    public static class literal_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "literal"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:272:1: literal : ( INTEGER | BOOLEAN | STRING );
    public final LatteParser.literal_return literal() throws RecognitionException {
        LatteParser.literal_return retval = new LatteParser.literal_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token set117=null;

        LatteTree set117_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:273:2: ( INTEGER | BOOLEAN | STRING )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:
            {
            root_0 = (LatteTree)adaptor.nil();


            set117=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==INTEGER||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (LatteTree)adaptor.create(set117)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "literal"


    public static class integer_literal_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "integer_literal"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:278:1: integer_literal : INTEGER ;
    public final LatteParser.integer_literal_return integer_literal() throws RecognitionException {
        LatteParser.integer_literal_return retval = new LatteParser.integer_literal_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token INTEGER118=null;

        LatteTree INTEGER118_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:279:2: ( INTEGER )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:279:4: INTEGER
            {
            root_0 = (LatteTree)adaptor.nil();


            INTEGER118=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer_literal1387); 
            INTEGER118_tree = 
            (LatteTree)adaptor.create(INTEGER118)
            ;
            adaptor.addChild(root_0, INTEGER118_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "integer_literal"


    public static class boolean_literal_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolean_literal"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:282:1: boolean_literal : BOOLEAN ;
    public final LatteParser.boolean_literal_return boolean_literal() throws RecognitionException {
        LatteParser.boolean_literal_return retval = new LatteParser.boolean_literal_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token BOOLEAN119=null;

        LatteTree BOOLEAN119_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:283:2: ( BOOLEAN )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:283:4: BOOLEAN
            {
            root_0 = (LatteTree)adaptor.nil();


            BOOLEAN119=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_literal1399); 
            BOOLEAN119_tree = 
            (LatteTree)adaptor.create(BOOLEAN119)
            ;
            adaptor.addChild(root_0, BOOLEAN119_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (LatteTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (LatteTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolean_literal"

    // Delegated rules


 

    public static final BitSet FOLLOW_function_definitions_list_in_program221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_function_definitions_list240 = new BitSet(new long[]{0x0000040000000002L,0x0000000000000022L});
    public static final BitSet FOLLOW_type_in_function_definition253 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_NAME_in_function_definition257 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function_definition259 = new BitSet(new long[]{0x0010040000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_arguments_list_in_function_definition263 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_function_definition266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_block_in_function_definition270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_arguments_list316 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_arguments_list321 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000022L});
    public static final BitSet FOLLOW_param_in_arguments_list325 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_type_in_param356 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_NAME_in_param358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_type_in_type382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_type_in_type387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_TYPE_in_single_type399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statement_in_statement433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_statement_in_statement451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_statement469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_block483 = new BitSet(new long[]{0x01090C1098000100L,0x00000000000017D8L});
    public static final BitSet FOLLOW_statement_in_block485 = new BitSet(new long[]{0x01090C1098000100L,0x00000000000017D8L});
    public static final BitSet FOLLOW_76_in_block488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_type_in_declaration_statement513 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_single_declarator_list_in_declaration_statement515 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_declaration_statement518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_declarator_in_single_declarator_list542 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_single_declarator_list546 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_single_declarator_in_single_declarator_list549 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_NAME_in_single_declarator568 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_single_declarator570 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expression_in_single_declarator572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_single_declarator593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_statement621 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_assignment_statement623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment642 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_assignment644 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expression_in_assignment647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment654 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_assignment656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment680 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_assignment682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_if_statement715 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_if_statement717 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expression_in_if_statement719 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_if_statement721 = new BitSet(new long[]{0x01090C1098000100L,0x00000000000007D8L});
    public static final BitSet FOLLOW_statement_in_if_statement725 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_66_in_if_statement737 = new BitSet(new long[]{0x01090C1098000100L,0x00000000000007D8L});
    public static final BitSet FOLLOW_statement_in_if_statement741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_loop_statement780 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_loop_statement782 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expression_in_loop_statement784 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_loop_statement786 = new BitSet(new long[]{0x01090C1098000100L,0x00000000000007D8L});
    public static final BitSet FOLLOW_statement_in_loop_statement788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_return_statement825 = new BitSet(new long[]{0x0109081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expression_in_return_statement828 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_return_statement832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement858 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_expression_statement860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predefined_function_in_predefined_statement875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printInt_in_predefined_function887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_error_in_predefined_function893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_readInt_in_predefined_function898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_printInt910 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_printInt912 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expression_in_printInt914 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_printInt916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_error941 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_error943 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_error945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_readInt961 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_readInt963 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_readInt966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_expression983 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_or_in_expr1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_and_in_logical_expression_or1014 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_logical_expression_or1017 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_logical_expression_and_in_logical_expression_or1020 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000800L});
    public static final BitSet FOLLOW_comparison_expression_in_logical_expression_and1033 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_50_in_logical_expression_and1036 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_comparison_expression_in_logical_expression_and1039 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_comparison_expression1052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1065 = new BitSet(new long[]{0x7602000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expression1068 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1093 = new BitSet(new long[]{0x7602000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1107 = new BitSet(new long[]{0x0000001010000002L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression1111 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression1116 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1120 = new BitSet(new long[]{0x0000001010000002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1134 = new BitSet(new long[]{0x0000200020008002L});
    public static final BitSet FOLLOW_TIMES_in_multiplicative_expression1138 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_expression1143 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_MOD_in_multiplicative_expression1148 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1152 = new BitSet(new long[]{0x0000200020008002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression1168 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_negation_in_unary_expression1173 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_suffix_expression_in_unary_expression1179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_negation1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_negation1201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_expression_in_suffix_expression1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_suffix_expression1222 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_suffix_expression1224 = new BitSet(new long[]{0x0019081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expression_list_in_suffix_expression1226 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_suffix_expression1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predefined_statement_in_suffix_expression1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1257 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_54_in_expression_list1260 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expression_in_expression_list1262 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_NAME_in_ident1287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_array_call1309 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_array_call1311 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INTEGER_in_array_call1313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_64_in_array_call1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_basic_expression1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_basic_expression1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_basic_expression1347 = new BitSet(new long[]{0x0009081098000100L,0x00000000000000C8L});
    public static final BitSet FOLLOW_expr_in_basic_expression1350 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_basic_expression1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer_literal1387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_literal1399 = new BitSet(new long[]{0x0000000000000002L});

}