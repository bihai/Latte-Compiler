// $ANTLR 3.4 D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g 2011-11-14 21:15:10

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARG", "ARRAY", "BEGIN", "BLOCK", "BOOLEAN", "CALL", "COMMENT", "COMPLEX", "DEFINE", "DEFINE_ARRAY", "DEFINE_SINGLE", "DIV", "DO", "ELSE", "END", "ENDFOR", "ENDIF", "ENDWHILE", "ERROR", "EXPR", "FOR", "FUNC", "IF", "INTEGER", "MINUS", "MOD", "MULTILINE_COMMENT", "NAME", "NEGATION", "PARAM", "PARAMS", "PLUS", "PRINTINT", "PROGRAM", "READINT", "REF", "RETURN", "SINGLE_TYPE", "STRING", "THEN", "TIMES", "WHILE", "WS", "'!'", "'!='", "'&&'", "'('", "')'", "'++'", "','", "'--'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'", "'boolean[]'", "'else'", "'error'", "'if'", "'int[]'", "'printInt'", "'readInt'", "'return'", "'while'", "'{'", "'||'", "'}'"
    };

    public static final int EOF=-1;
    public static final int T__47=47;
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
    public static final int PARAM=33;
    public static final int PARAMS=34;
    public static final int PLUS=35;
    public static final int PRINTINT=36;
    public static final int PROGRAM=37;
    public static final int READINT=38;
    public static final int REF=39;
    public static final int RETURN=40;
    public static final int SINGLE_TYPE=41;
    public static final int STRING=42;
    public static final int THEN=43;
    public static final int TIMES=44;
    public static final int WHILE=45;
    public static final int WS=46;

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


    public static class program_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:60:1: program : function_definitions_list -> ^( PROGRAM function_definitions_list ) ;
    public final LatteParser.program_return program() throws RecognitionException {
        LatteParser.program_return retval = new LatteParser.program_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.function_definitions_list_return function_definitions_list1 =null;


        RewriteRuleSubtreeStream stream_function_definitions_list=new RewriteRuleSubtreeStream(adaptor,"rule function_definitions_list");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:61:2: ( function_definitions_list -> ^( PROGRAM function_definitions_list ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:61:4: function_definitions_list
            {
            pushFollow(FOLLOW_function_definitions_list_in_program216);
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
            // 61:30: -> ^( PROGRAM function_definitions_list )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:61:33: ^( PROGRAM function_definitions_list )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:64:1: function_definitions_list : ( function_definition )+ ;
    public final LatteParser.function_definitions_list_return function_definitions_list() throws RecognitionException {
        LatteParser.function_definitions_list_return retval = new LatteParser.function_definitions_list_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.function_definition_return function_definition2 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:65:2: ( ( function_definition )+ )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:65:4: ( function_definition )+
            {
            root_0 = (LatteTree)adaptor.nil();


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:65:4: ( function_definition )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==SINGLE_TYPE||LA1_0==64||LA1_0==68) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:65:4: function_definition
            	    {
            	    pushFollow(FOLLOW_function_definition_in_function_definitions_list235);
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:68:1: function_definition : type fname= NAME '(' (arg= arguments_list )? ')' stmt= block -> ^( FUNC NAME type ( arguments_list )? block ) ;
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
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_arguments_list=new RewriteRuleSubtreeStream(adaptor,"rule arguments_list");
        RewriteRuleSubtreeStream stream_block=new RewriteRuleSubtreeStream(adaptor,"rule block");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:69:3: ( type fname= NAME '(' (arg= arguments_list )? ')' stmt= block -> ^( FUNC NAME type ( arguments_list )? block ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:69:4: type fname= NAME '(' (arg= arguments_list )? ')' stmt= block
            {
            pushFollow(FOLLOW_type_in_function_definition248);
            type3=type();

            state._fsp--;

            stream_type.add(type3.getTree());

            fname=(Token)match(input,NAME,FOLLOW_NAME_in_function_definition252);  
            stream_NAME.add(fname);


            char_literal4=(Token)match(input,50,FOLLOW_50_in_function_definition254);  
            stream_50.add(char_literal4);


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:69:27: (arg= arguments_list )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==SINGLE_TYPE||LA2_0==64||LA2_0==68) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:69:27: arg= arguments_list
                    {
                    pushFollow(FOLLOW_arguments_list_in_function_definition258);
                    arg=arguments_list();

                    state._fsp--;

                    stream_arguments_list.add(arg.getTree());

                    }
                    break;

            }


            char_literal5=(Token)match(input,51,FOLLOW_51_in_function_definition261);  
            stream_51.add(char_literal5);


            pushFollow(FOLLOW_block_in_function_definition265);
            stmt=block();

            state._fsp--;

            stream_block.add(stmt.getTree());

            // AST REWRITE
            // elements: arguments_list, block, NAME, type
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 69:59: -> ^( FUNC NAME type ( arguments_list )? block )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:69:62: ^( FUNC NAME type ( arguments_list )? block )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(FUNC, "FUNC")
                , root_1);

                adaptor.addChild(root_1, 
                stream_NAME.nextNode()
                );

                adaptor.addChild(root_1, stream_type.nextTree());

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:69:79: ( arguments_list )?
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:76:1: arguments_list returns [List<Param> result] :p1= param ( ',' p2= param )* -> ^( PARAMS ( param )+ ) ;
    public final LatteParser.arguments_list_return arguments_list() throws RecognitionException {
        LatteParser.arguments_list_return retval = new LatteParser.arguments_list_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal6=null;
        LatteParser.param_return p1 =null;

        LatteParser.param_return p2 =null;


        LatteTree char_literal6_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_param=new RewriteRuleSubtreeStream(adaptor,"rule param");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:77:3: (p1= param ( ',' p2= param )* -> ^( PARAMS ( param )+ ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:78:3: p1= param ( ',' p2= param )*
            {
            retval.result = new ArrayList<Param>();

            pushFollow(FOLLOW_param_in_arguments_list311);
            p1=param();

            state._fsp--;

            stream_param.add(p1.getTree());

            retval.result.add((p1!=null?p1.result:null));

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:79:39: ( ',' p2= param )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==53) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:79:40: ',' p2= param
            	    {
            	    char_literal6=(Token)match(input,53,FOLLOW_53_in_arguments_list316);  
            	    stream_53.add(char_literal6);


            	    pushFollow(FOLLOW_param_in_arguments_list320);
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
            // 80:3: -> ^( PARAMS ( param )+ )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:80:6: ^( PARAMS ( param )+ )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:83:1: param returns [Param result] : type NAME -> ^( PARAM type NAME ) ;
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
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:84:2: ( type NAME -> ^( PARAM type NAME ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:84:4: type NAME
            {
            pushFollow(FOLLOW_type_in_param351);
            type7=type();

            state._fsp--;

            stream_type.add(type7.getTree());

            NAME8=(Token)match(input,NAME,FOLLOW_NAME_in_param353);  
            stream_NAME.add(NAME8);


            retval.result = new Param((type7!=null?input.toString(type7.start,type7.stop):null), (NAME8!=null?NAME8.getText():null));

            // AST REWRITE
            // elements: type, NAME
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 84:61: -> ^( PARAM type NAME )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:84:64: ^( PARAM type NAME )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:87:1: type : ( single_type | array_type );
    public final LatteParser.type_return type() throws RecognitionException {
        LatteParser.type_return retval = new LatteParser.type_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.single_type_return single_type9 =null;

        LatteParser.array_type_return array_type10 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:88:2: ( single_type | array_type )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SINGLE_TYPE) ) {
                alt4=1;
            }
            else if ( (LA4_0==64||LA4_0==68) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:88:4: single_type
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_single_type_in_type377);
                    single_type9=single_type();

                    state._fsp--;

                    adaptor.addChild(root_0, single_type9.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:89:4: array_type
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_array_type_in_type382);
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:92:1: single_type : SINGLE_TYPE ;
    public final LatteParser.single_type_return single_type() throws RecognitionException {
        LatteParser.single_type_return retval = new LatteParser.single_type_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token SINGLE_TYPE11=null;

        LatteTree SINGLE_TYPE11_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:93:2: ( SINGLE_TYPE )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:93:4: SINGLE_TYPE
            {
            root_0 = (LatteTree)adaptor.nil();


            SINGLE_TYPE11=(Token)match(input,SINGLE_TYPE,FOLLOW_SINGLE_TYPE_in_single_type394); 
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:96:1: array_type : ( 'int[]' | 'boolean[]' );
    public final LatteParser.array_type_return array_type() throws RecognitionException {
        LatteParser.array_type_return retval = new LatteParser.array_type_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token set12=null;

        LatteTree set12_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:97:2: ( 'int[]' | 'boolean[]' )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:
            {
            root_0 = (LatteTree)adaptor.nil();


            set12=(Token)input.LT(1);

            if ( input.LA(1)==64||input.LA(1)==68 ) {
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:102:1: statement : ( block | declaration_statement | assignment_statement | if_statement | loop_statement | return_statement | expression_statement | ';' );
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
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:103:2: ( block | declaration_statement | assignment_statement | if_statement | loop_statement | return_statement | expression_statement | ';' )
            int alt5=8;
            switch ( input.LA(1) ) {
            case 73:
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

                if ( (LA5_3==DIV||(LA5_3 >= MINUS && LA5_3 <= MOD)||LA5_3==PLUS||LA5_3==TIMES||(LA5_3 >= 48 && LA5_3 <= 50)||(LA5_3 >= 55 && LA5_3 <= 57)||(LA5_3 >= 59 && LA5_3 <= 61)||LA5_3==74) ) {
                    alt5=7;
                }
                else if ( (LA5_3==52||LA5_3==54||LA5_3==58) ) {
                    alt5=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;

                }
                }
                break;
            case 67:
                {
                alt5=4;
                }
                break;
            case 72:
                {
                alt5=5;
                }
                break;
            case 71:
                {
                alt5=6;
                }
                break;
            case BOOLEAN:
            case INTEGER:
            case MINUS:
            case PLUS:
            case STRING:
            case 47:
            case 50:
            case 66:
            case 69:
            case 70:
                {
                alt5=7;
                }
                break;
            case 55:
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:103:4: block
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_block_in_statement422);
                    block13=block();

                    state._fsp--;

                    adaptor.addChild(root_0, block13.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:104:5: declaration_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_declaration_statement_in_statement428);
                    declaration_statement14=declaration_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, declaration_statement14.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:105:5: assignment_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_assignment_statement_in_statement434);
                    assignment_statement15=assignment_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, assignment_statement15.getTree());

                    }
                    break;
                case 4 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:106:5: if_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_if_statement_in_statement440);
                    if_statement16=if_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, if_statement16.getTree());

                    }
                    break;
                case 5 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:107:5: loop_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_loop_statement_in_statement446);
                    loop_statement17=loop_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, loop_statement17.getTree());

                    }
                    break;
                case 6 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:108:5: return_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_return_statement_in_statement452);
                    return_statement18=return_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, return_statement18.getTree());

                    }
                    break;
                case 7 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:109:5: expression_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_expression_statement_in_statement458);
                    expression_statement19=expression_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, expression_statement19.getTree());

                    }
                    break;
                case 8 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:110:5: ';'
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    char_literal20=(Token)match(input,55,FOLLOW_55_in_statement464); 
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:113:1: block : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final LatteParser.block_return block() throws RecognitionException {
        LatteParser.block_return retval = new LatteParser.block_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal21=null;
        Token char_literal23=null;
        LatteParser.statement_return statement22 =null;


        LatteTree char_literal21_tree=null;
        LatteTree char_literal23_tree=null;
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:114:2: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:114:4: '{' ( statement )* '}'
            {
            char_literal21=(Token)match(input,73,FOLLOW_73_in_block478);  
            stream_73.add(char_literal21);


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:114:8: ( statement )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==BOOLEAN||(LA6_0 >= INTEGER && LA6_0 <= MINUS)||LA6_0==NAME||LA6_0==PLUS||(LA6_0 >= SINGLE_TYPE && LA6_0 <= STRING)||LA6_0==47||LA6_0==50||LA6_0==55||(LA6_0 >= 66 && LA6_0 <= 67)||(LA6_0 >= 69 && LA6_0 <= 73)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:114:8: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_block480);
            	    statement22=statement();

            	    state._fsp--;

            	    stream_statement.add(statement22.getTree());

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            char_literal23=(Token)match(input,75,FOLLOW_75_in_block483);  
            stream_75.add(char_literal23);


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
            // 114:23: -> ^( BLOCK ( statement )* )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:114:26: ^( BLOCK ( statement )* )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:114:34: ( statement )*
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:117:1: declaration_statement : single_type single_declarator_list[$single_type.tree] ';' -> single_declarator_list ;
    public final LatteParser.declaration_statement_return declaration_statement() throws RecognitionException {
        LatteParser.declaration_statement_return retval = new LatteParser.declaration_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal26=null;
        LatteParser.single_type_return single_type24 =null;

        LatteParser.single_declarator_list_return single_declarator_list25 =null;


        LatteTree char_literal26_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleSubtreeStream stream_single_declarator_list=new RewriteRuleSubtreeStream(adaptor,"rule single_declarator_list");
        RewriteRuleSubtreeStream stream_single_type=new RewriteRuleSubtreeStream(adaptor,"rule single_type");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:118:2: ( single_type single_declarator_list[$single_type.tree] ';' -> single_declarator_list )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:118:4: single_type single_declarator_list[$single_type.tree] ';'
            {
            pushFollow(FOLLOW_single_type_in_declaration_statement508);
            single_type24=single_type();

            state._fsp--;

            stream_single_type.add(single_type24.getTree());

            pushFollow(FOLLOW_single_declarator_list_in_declaration_statement510);
            single_declarator_list25=single_declarator_list((single_type24!=null?((LatteTree)single_type24.tree):null));

            state._fsp--;

            stream_single_declarator_list.add(single_declarator_list25.getTree());

            char_literal26=(Token)match(input,55,FOLLOW_55_in_declaration_statement513);  
            stream_55.add(char_literal26);


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
            // 118:62: -> single_declarator_list
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:126:1: single_declarator_list[LatteTree typeTree] : single_declarator[$typeTree] ( ',' ! single_declarator[$typeTree] )* ;
    public final LatteParser.single_declarator_list_return single_declarator_list(LatteTree typeTree) throws RecognitionException {
        LatteParser.single_declarator_list_return retval = new LatteParser.single_declarator_list_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal28=null;
        LatteParser.single_declarator_return single_declarator27 =null;

        LatteParser.single_declarator_return single_declarator29 =null;


        LatteTree char_literal28_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:127:4: ( single_declarator[$typeTree] ( ',' ! single_declarator[$typeTree] )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:127:6: single_declarator[$typeTree] ( ',' ! single_declarator[$typeTree] )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_single_declarator_in_single_declarator_list537);
            single_declarator27=single_declarator(typeTree);

            state._fsp--;

            adaptor.addChild(root_0, single_declarator27.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:127:35: ( ',' ! single_declarator[$typeTree] )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==53) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:127:36: ',' ! single_declarator[$typeTree]
            	    {
            	    char_literal28=(Token)match(input,53,FOLLOW_53_in_single_declarator_list541); 

            	    pushFollow(FOLLOW_single_declarator_in_single_declarator_list544);
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:130:1: single_declarator[LatteTree typeTree] : ( NAME '=' expression -> ^( DEFINE NAME expression ) | NAME -> ^( DEFINE NAME ) );
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
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:131:4: ( NAME '=' expression -> ^( DEFINE NAME expression ) | NAME -> ^( DEFINE NAME ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==NAME) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==58) ) {
                    alt8=1;
                }
                else if ( (LA8_1==53||LA8_1==55) ) {
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:131:6: NAME '=' expression
                    {
                    NAME30=(Token)match(input,NAME,FOLLOW_NAME_in_single_declarator563);  
                    stream_NAME.add(NAME30);


                    char_literal31=(Token)match(input,58,FOLLOW_58_in_single_declarator565);  
                    stream_58.add(char_literal31);


                    pushFollow(FOLLOW_expression_in_single_declarator567);
                    expression32=expression();

                    state._fsp--;

                    stream_expression.add(expression32.getTree());

                    // AST REWRITE
                    // elements: NAME, expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 131:27: -> ^( DEFINE NAME expression )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:131:30: ^( DEFINE NAME expression )
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:132:6: NAME
                    {
                    NAME33=(Token)match(input,NAME,FOLLOW_NAME_in_single_declarator588);  
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
                    // 132:11: -> ^( DEFINE NAME )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:132:14: ^( DEFINE NAME )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:135:1: assignment_statement : assignment ';' !;
    public final LatteParser.assignment_statement_return assignment_statement() throws RecognitionException {
        LatteParser.assignment_statement_return retval = new LatteParser.assignment_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal35=null;
        LatteParser.assignment_return assignment34 =null;


        LatteTree char_literal35_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:136:4: ( assignment ';' !)
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:136:6: assignment ';' !
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_assignment_in_assignment_statement616);
            assignment34=assignment();

            state._fsp--;

            adaptor.addChild(root_0, assignment34.getTree());

            char_literal35=(Token)match(input,55,FOLLOW_55_in_assignment_statement618); 

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:139:1: assignment : ( ident '=' ^ expression | ident '++' -> ^( '=' ident ^( PLUS ident INTEGER[\"1\"] ) ) | ident '--' -> ^( '=' ident ^( MINUS ident INTEGER[\"1\"] ) ) );
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
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleSubtreeStream stream_ident=new RewriteRuleSubtreeStream(adaptor,"rule ident");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:140:4: ( ident '=' ^ expression | ident '++' -> ^( '=' ident ^( PLUS ident INTEGER[\"1\"] ) ) | ident '--' -> ^( '=' ident ^( MINUS ident INTEGER[\"1\"] ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==NAME) ) {
                switch ( input.LA(2) ) {
                case 58:
                    {
                    alt9=1;
                    }
                    break;
                case 52:
                    {
                    alt9=2;
                    }
                    break;
                case 54:
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:140:6: ident '=' ^ expression
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_assignment637);
                    ident36=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident36.getTree());

                    char_literal37=(Token)match(input,58,FOLLOW_58_in_assignment639); 
                    char_literal37_tree = 
                    (LatteTree)adaptor.create(char_literal37)
                    ;
                    root_0 = (LatteTree)adaptor.becomeRoot(char_literal37_tree, root_0);


                    pushFollow(FOLLOW_expression_in_assignment642);
                    expression38=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression38.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:141:6: ident '++'
                    {
                    pushFollow(FOLLOW_ident_in_assignment649);
                    ident39=ident();

                    state._fsp--;

                    stream_ident.add(ident39.getTree());

                    string_literal40=(Token)match(input,52,FOLLOW_52_in_assignment651);  
                    stream_52.add(string_literal40);


                    // AST REWRITE
                    // elements: ident, 58, ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 141:17: -> ^( '=' ident ^( PLUS ident INTEGER[\"1\"] ) )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:141:20: ^( '=' ident ^( PLUS ident INTEGER[\"1\"] ) )
                        {
                        LatteTree root_1 = (LatteTree)adaptor.nil();
                        root_1 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(58, "58")
                        , root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());

                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:141:32: ^( PLUS ident INTEGER[\"1\"] )
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:142:6: ident '--'
                    {
                    pushFollow(FOLLOW_ident_in_assignment675);
                    ident41=ident();

                    state._fsp--;

                    stream_ident.add(ident41.getTree());

                    string_literal42=(Token)match(input,54,FOLLOW_54_in_assignment677);  
                    stream_54.add(string_literal42);


                    // AST REWRITE
                    // elements: ident, 58, ident
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (LatteTree)adaptor.nil();
                    // 142:17: -> ^( '=' ident ^( MINUS ident INTEGER[\"1\"] ) )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:142:20: ^( '=' ident ^( MINUS ident INTEGER[\"1\"] ) )
                        {
                        LatteTree root_1 = (LatteTree)adaptor.nil();
                        root_1 = (LatteTree)adaptor.becomeRoot(
                        (LatteTree)adaptor.create(58, "58")
                        , root_1);

                        adaptor.addChild(root_1, stream_ident.nextTree());

                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:142:32: ^( MINUS ident INTEGER[\"1\"] )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:145:1: if_statement : 'if' '(' expression ')' st1= statement ( options {greedy=true; } : 'else' st2= statement )? -> ^( IF expression $st1 ( $st2)? ) ;
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
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:146:2: ( 'if' '(' expression ')' st1= statement ( options {greedy=true; } : 'else' st2= statement )? -> ^( IF expression $st1 ( $st2)? ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:146:4: 'if' '(' expression ')' st1= statement ( options {greedy=true; } : 'else' st2= statement )?
            {
            string_literal43=(Token)match(input,67,FOLLOW_67_in_if_statement710);  
            stream_67.add(string_literal43);


            char_literal44=(Token)match(input,50,FOLLOW_50_in_if_statement712);  
            stream_50.add(char_literal44);


            pushFollow(FOLLOW_expression_in_if_statement714);
            expression45=expression();

            state._fsp--;

            stream_expression.add(expression45.getTree());

            char_literal46=(Token)match(input,51,FOLLOW_51_in_if_statement716);  
            stream_51.add(char_literal46);


            pushFollow(FOLLOW_statement_in_if_statement720);
            st1=statement();

            state._fsp--;

            stream_statement.add(st1.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:147:2: ( options {greedy=true; } : 'else' st2= statement )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==65) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:147:26: 'else' st2= statement
                    {
                    string_literal47=(Token)match(input,65,FOLLOW_65_in_if_statement732);  
                    stream_65.add(string_literal47);


                    pushFollow(FOLLOW_statement_in_if_statement736);
                    st2=statement();

                    state._fsp--;

                    stream_statement.add(st2.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: st1, expression, st2
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
            // 148:3: -> ^( IF expression $st1 ( $st2)? )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:149:2: ^( IF expression $st1 ( $st2)? )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(IF, "IF")
                , root_1);

                adaptor.addChild(root_1, stream_expression.nextTree());

                adaptor.addChild(root_1, stream_st1.nextTree());

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:149:25: ( $st2)?
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:153:1: loop_statement : 'while' '(' expression ')' statement -> ^( WHILE expression DO statement ENDWHILE ) ;
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
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:154:4: ( 'while' '(' expression ')' statement -> ^( WHILE expression DO statement ENDWHILE ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:154:6: 'while' '(' expression ')' statement
            {
            string_literal48=(Token)match(input,72,FOLLOW_72_in_loop_statement775);  
            stream_72.add(string_literal48);


            char_literal49=(Token)match(input,50,FOLLOW_50_in_loop_statement777);  
            stream_50.add(char_literal49);


            pushFollow(FOLLOW_expression_in_loop_statement779);
            expression50=expression();

            state._fsp--;

            stream_expression.add(expression50.getTree());

            char_literal51=(Token)match(input,51,FOLLOW_51_in_loop_statement781);  
            stream_51.add(char_literal51);


            pushFollow(FOLLOW_statement_in_loop_statement783);
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
            // 154:43: -> ^( WHILE expression DO statement ENDWHILE )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:155:4: ^( WHILE expression DO statement ENDWHILE )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:160:1: return_statement : 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) ;
    public final LatteParser.return_statement_return return_statement() throws RecognitionException {
        LatteParser.return_statement_return retval = new LatteParser.return_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal53=null;
        Token char_literal55=null;
        LatteParser.expression_return expression54 =null;


        LatteTree string_literal53_tree=null;
        LatteTree char_literal55_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:161:4: ( 'return' ( expression )? ';' -> ^( RETURN ( expression )? ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:161:6: 'return' ( expression )? ';'
            {
            string_literal53=(Token)match(input,71,FOLLOW_71_in_return_statement820);  
            stream_71.add(string_literal53);


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:161:15: ( expression )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==BOOLEAN||(LA11_0 >= INTEGER && LA11_0 <= MINUS)||LA11_0==NAME||LA11_0==PLUS||LA11_0==STRING||LA11_0==47||LA11_0==50||LA11_0==66||(LA11_0 >= 69 && LA11_0 <= 70)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:161:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_return_statement823);
                    expression54=expression();

                    state._fsp--;

                    stream_expression.add(expression54.getTree());

                    }
                    break;

            }


            char_literal55=(Token)match(input,55,FOLLOW_55_in_return_statement827);  
            stream_55.add(char_literal55);


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
            // 161:33: -> ^( RETURN ( expression )? )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:161:36: ^( RETURN ( expression )? )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(RETURN, "RETURN")
                , root_1);

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:161:45: ( expression )?
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:164:1: expression_statement : expression ';' !;
    public final LatteParser.expression_statement_return expression_statement() throws RecognitionException {
        LatteParser.expression_statement_return retval = new LatteParser.expression_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal57=null;
        LatteParser.expression_return expression56 =null;


        LatteTree char_literal57_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:165:3: ( expression ';' !)
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:165:5: expression ';' !
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_expression_in_expression_statement853);
            expression56=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression56.getTree());

            char_literal57=(Token)match(input,55,FOLLOW_55_in_expression_statement855); 

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:170:1: predefined_statement : predefined_function ;
    public final LatteParser.predefined_statement_return predefined_statement() throws RecognitionException {
        LatteParser.predefined_statement_return retval = new LatteParser.predefined_statement_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.predefined_function_return predefined_function58 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:171:2: ( predefined_function )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:171:4: predefined_function
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_predefined_function_in_predefined_statement870);
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:174:1: predefined_function : ( printInt | error | readInt );
    public final LatteParser.predefined_function_return predefined_function() throws RecognitionException {
        LatteParser.predefined_function_return retval = new LatteParser.predefined_function_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.printInt_return printInt59 =null;

        LatteParser.error_return error60 =null;

        LatteParser.readInt_return readInt61 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:175:2: ( printInt | error | readInt )
            int alt12=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt12=1;
                }
                break;
            case 66:
                {
                alt12=2;
                }
                break;
            case 70:
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:175:4: printInt
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_printInt_in_predefined_function882);
                    printInt59=printInt();

                    state._fsp--;

                    adaptor.addChild(root_0, printInt59.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:177:4: error
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_error_in_predefined_function888);
                    error60=error();

                    state._fsp--;

                    adaptor.addChild(root_0, error60.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:178:4: readInt
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_readInt_in_predefined_function893);
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:181:1: printInt : 'printInt' '(' expression ')' -> ^( PRINTINT expression ) ;
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
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:182:2: ( 'printInt' '(' expression ')' -> ^( PRINTINT expression ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:182:4: 'printInt' '(' expression ')'
            {
            string_literal62=(Token)match(input,69,FOLLOW_69_in_printInt905);  
            stream_69.add(string_literal62);


            char_literal63=(Token)match(input,50,FOLLOW_50_in_printInt907);  
            stream_50.add(char_literal63);


            pushFollow(FOLLOW_expression_in_printInt909);
            expression64=expression();

            state._fsp--;

            stream_expression.add(expression64.getTree());

            char_literal65=(Token)match(input,51,FOLLOW_51_in_printInt911);  
            stream_51.add(char_literal65);


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
            // 182:34: -> ^( PRINTINT expression )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:182:37: ^( PRINTINT expression )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:189:1: error : 'error' '(' ')' -> ERROR ;
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
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:190:2: ( 'error' '(' ')' -> ERROR )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:190:4: 'error' '(' ')'
            {
            string_literal66=(Token)match(input,66,FOLLOW_66_in_error936);  
            stream_66.add(string_literal66);


            char_literal67=(Token)match(input,50,FOLLOW_50_in_error938);  
            stream_50.add(char_literal67);


            char_literal68=(Token)match(input,51,FOLLOW_51_in_error940);  
            stream_51.add(char_literal68);


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
            // 190:20: -> ERROR
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:193:1: readInt : 'readInt' '(' ')' -> READINT ;
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
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:194:2: ( 'readInt' '(' ')' -> READINT )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:194:4: 'readInt' '(' ')'
            {
            string_literal69=(Token)match(input,70,FOLLOW_70_in_readInt956);  
            stream_70.add(string_literal69);


            char_literal70=(Token)match(input,50,FOLLOW_50_in_readInt958);  
            stream_50.add(char_literal70);


            char_literal71=(Token)match(input,51,FOLLOW_51_in_readInt961);  
            stream_51.add(char_literal71);


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
            // 194:23: -> READINT
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:199:1: expression : logical_expression_or -> ^( EXPR logical_expression_or ) ;
    public final LatteParser.expression_return expression() throws RecognitionException {
        LatteParser.expression_return retval = new LatteParser.expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.logical_expression_or_return logical_expression_or72 =null;


        RewriteRuleSubtreeStream stream_logical_expression_or=new RewriteRuleSubtreeStream(adaptor,"rule logical_expression_or");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:200:2: ( logical_expression_or -> ^( EXPR logical_expression_or ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:200:4: logical_expression_or
            {
            pushFollow(FOLLOW_logical_expression_or_in_expression979);
            logical_expression_or72=logical_expression_or();

            state._fsp--;

            stream_logical_expression_or.add(logical_expression_or72.getTree());

            // AST REWRITE
            // elements: logical_expression_or
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (LatteTree)adaptor.nil();
            // 200:26: -> ^( EXPR logical_expression_or )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:200:29: ^( EXPR logical_expression_or )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(EXPR, "EXPR")
                , root_1);

                adaptor.addChild(root_1, stream_logical_expression_or.nextTree());

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


    public static class logical_expression_or_return extends ParserRuleReturnScope {
        LatteTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logical_expression_or"
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:203:1: logical_expression_or : logical_expression_and ( '||' ^ logical_expression_and )* ;
    public final LatteParser.logical_expression_or_return logical_expression_or() throws RecognitionException {
        LatteParser.logical_expression_or_return retval = new LatteParser.logical_expression_or_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal74=null;
        LatteParser.logical_expression_and_return logical_expression_and73 =null;

        LatteParser.logical_expression_and_return logical_expression_and75 =null;


        LatteTree string_literal74_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:204:2: ( logical_expression_and ( '||' ^ logical_expression_and )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:204:4: logical_expression_and ( '||' ^ logical_expression_and )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_logical_expression_and_in_logical_expression_or998);
            logical_expression_and73=logical_expression_and();

            state._fsp--;

            adaptor.addChild(root_0, logical_expression_and73.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:204:27: ( '||' ^ logical_expression_and )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==74) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:204:28: '||' ^ logical_expression_and
            	    {
            	    string_literal74=(Token)match(input,74,FOLLOW_74_in_logical_expression_or1001); 
            	    string_literal74_tree = 
            	    (LatteTree)adaptor.create(string_literal74)
            	    ;
            	    root_0 = (LatteTree)adaptor.becomeRoot(string_literal74_tree, root_0);


            	    pushFollow(FOLLOW_logical_expression_and_in_logical_expression_or1004);
            	    logical_expression_and75=logical_expression_and();

            	    state._fsp--;

            	    adaptor.addChild(root_0, logical_expression_and75.getTree());

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:207:1: logical_expression_and : comparison_expression ( '&&' ^ comparison_expression )* ;
    public final LatteParser.logical_expression_and_return logical_expression_and() throws RecognitionException {
        LatteParser.logical_expression_and_return retval = new LatteParser.logical_expression_and_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token string_literal77=null;
        LatteParser.comparison_expression_return comparison_expression76 =null;

        LatteParser.comparison_expression_return comparison_expression78 =null;


        LatteTree string_literal77_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:208:2: ( comparison_expression ( '&&' ^ comparison_expression )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:208:4: comparison_expression ( '&&' ^ comparison_expression )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_comparison_expression_in_logical_expression_and1017);
            comparison_expression76=comparison_expression();

            state._fsp--;

            adaptor.addChild(root_0, comparison_expression76.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:208:26: ( '&&' ^ comparison_expression )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==49) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:208:27: '&&' ^ comparison_expression
            	    {
            	    string_literal77=(Token)match(input,49,FOLLOW_49_in_logical_expression_and1020); 
            	    string_literal77_tree = 
            	    (LatteTree)adaptor.create(string_literal77)
            	    ;
            	    root_0 = (LatteTree)adaptor.becomeRoot(string_literal77_tree, root_0);


            	    pushFollow(FOLLOW_comparison_expression_in_logical_expression_and1023);
            	    comparison_expression78=comparison_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, comparison_expression78.getTree());

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:211:1: comparison_expression : relational_expression ;
    public final LatteParser.comparison_expression_return comparison_expression() throws RecognitionException {
        LatteParser.comparison_expression_return retval = new LatteParser.comparison_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        LatteParser.relational_expression_return relational_expression79 =null;



        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:212:2: ( relational_expression )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:212:4: relational_expression
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_relational_expression_in_comparison_expression1036);
            relational_expression79=relational_expression();

            state._fsp--;

            adaptor.addChild(root_0, relational_expression79.getTree());

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:215:1: relational_expression : additive_expression ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression )* ;
    public final LatteParser.relational_expression_return relational_expression() throws RecognitionException {
        LatteParser.relational_expression_return retval = new LatteParser.relational_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token set81=null;
        LatteParser.additive_expression_return additive_expression80 =null;

        LatteParser.additive_expression_return additive_expression82 =null;


        LatteTree set81_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:216:2: ( additive_expression ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:216:4: additive_expression ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_additive_expression_in_relational_expression1049);
            additive_expression80=additive_expression();

            state._fsp--;

            adaptor.addChild(root_0, additive_expression80.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:216:24: ( ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==48||(LA15_0 >= 56 && LA15_0 <= 57)||(LA15_0 >= 59 && LA15_0 <= 61)) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:216:25: ( '==' | '!=' | '<' | '<=' | '>=' | '>' ) ^ additive_expression
            	    {
            	    set81=(Token)input.LT(1);

            	    set81=(Token)input.LT(1);

            	    if ( input.LA(1)==48||(input.LA(1) >= 56 && input.LA(1) <= 57)||(input.LA(1) >= 59 && input.LA(1) <= 61) ) {
            	        input.consume();
            	        root_0 = (LatteTree)adaptor.becomeRoot(
            	        (LatteTree)adaptor.create(set81)
            	        , root_0);
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    pushFollow(FOLLOW_additive_expression_in_relational_expression1077);
            	    additive_expression82=additive_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, additive_expression82.getTree());

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:219:1: additive_expression : multiplicative_expression ( ( PLUS ^| MINUS ^) multiplicative_expression )* ;
    public final LatteParser.additive_expression_return additive_expression() throws RecognitionException {
        LatteParser.additive_expression_return retval = new LatteParser.additive_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token PLUS84=null;
        Token MINUS85=null;
        LatteParser.multiplicative_expression_return multiplicative_expression83 =null;

        LatteParser.multiplicative_expression_return multiplicative_expression86 =null;


        LatteTree PLUS84_tree=null;
        LatteTree MINUS85_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:220:2: ( multiplicative_expression ( ( PLUS ^| MINUS ^) multiplicative_expression )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:220:4: multiplicative_expression ( ( PLUS ^| MINUS ^) multiplicative_expression )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1091);
            multiplicative_expression83=multiplicative_expression();

            state._fsp--;

            adaptor.addChild(root_0, multiplicative_expression83.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:220:30: ( ( PLUS ^| MINUS ^) multiplicative_expression )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==MINUS||LA17_0==PLUS) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:220:31: ( PLUS ^| MINUS ^) multiplicative_expression
            	    {
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:220:31: ( PLUS ^| MINUS ^)
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
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:220:32: PLUS ^
            	            {
            	            PLUS84=(Token)match(input,PLUS,FOLLOW_PLUS_in_additive_expression1095); 
            	            PLUS84_tree = 
            	            (LatteTree)adaptor.create(PLUS84)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(PLUS84_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:220:40: MINUS ^
            	            {
            	            MINUS85=(Token)match(input,MINUS,FOLLOW_MINUS_in_additive_expression1100); 
            	            MINUS85_tree = 
            	            (LatteTree)adaptor.create(MINUS85)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(MINUS85_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_multiplicative_expression_in_additive_expression1104);
            	    multiplicative_expression86=multiplicative_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multiplicative_expression86.getTree());

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:223:1: multiplicative_expression : unary_expression ( ( TIMES ^| DIV ^| MOD ^) unary_expression )* ;
    public final LatteParser.multiplicative_expression_return multiplicative_expression() throws RecognitionException {
        LatteParser.multiplicative_expression_return retval = new LatteParser.multiplicative_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token TIMES88=null;
        Token DIV89=null;
        Token MOD90=null;
        LatteParser.unary_expression_return unary_expression87 =null;

        LatteParser.unary_expression_return unary_expression91 =null;


        LatteTree TIMES88_tree=null;
        LatteTree DIV89_tree=null;
        LatteTree MOD90_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:224:2: ( unary_expression ( ( TIMES ^| DIV ^| MOD ^) unary_expression )* )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:224:4: unary_expression ( ( TIMES ^| DIV ^| MOD ^) unary_expression )*
            {
            root_0 = (LatteTree)adaptor.nil();


            pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1118);
            unary_expression87=unary_expression();

            state._fsp--;

            adaptor.addChild(root_0, unary_expression87.getTree());

            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:224:21: ( ( TIMES ^| DIV ^| MOD ^) unary_expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==DIV||LA19_0==MOD||LA19_0==TIMES) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:224:22: ( TIMES ^| DIV ^| MOD ^) unary_expression
            	    {
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:224:22: ( TIMES ^| DIV ^| MOD ^)
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
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:224:23: TIMES ^
            	            {
            	            TIMES88=(Token)match(input,TIMES,FOLLOW_TIMES_in_multiplicative_expression1122); 
            	            TIMES88_tree = 
            	            (LatteTree)adaptor.create(TIMES88)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(TIMES88_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:224:32: DIV ^
            	            {
            	            DIV89=(Token)match(input,DIV,FOLLOW_DIV_in_multiplicative_expression1127); 
            	            DIV89_tree = 
            	            (LatteTree)adaptor.create(DIV89)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(DIV89_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:224:39: MOD ^
            	            {
            	            MOD90=(Token)match(input,MOD,FOLLOW_MOD_in_multiplicative_expression1132); 
            	            MOD90_tree = 
            	            (LatteTree)adaptor.create(MOD90)
            	            ;
            	            root_0 = (LatteTree)adaptor.becomeRoot(MOD90_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_unary_expression_in_multiplicative_expression1136);
            	    unary_expression91=unary_expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, unary_expression91.getTree());

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:227:1: unary_expression : ( PLUS !| negation )* suffix_expression ;
    public final LatteParser.unary_expression_return unary_expression() throws RecognitionException {
        LatteParser.unary_expression_return retval = new LatteParser.unary_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token PLUS92=null;
        LatteParser.negation_return negation93 =null;

        LatteParser.suffix_expression_return suffix_expression94 =null;


        LatteTree PLUS92_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:228:2: ( ( PLUS !| negation )* suffix_expression )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:228:4: ( PLUS !| negation )* suffix_expression
            {
            root_0 = (LatteTree)adaptor.nil();


            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:228:4: ( PLUS !| negation )*
            loop20:
            do {
                int alt20=3;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==PLUS) ) {
                    alt20=1;
                }
                else if ( (LA20_0==MINUS||LA20_0==47) ) {
                    alt20=2;
                }


                switch (alt20) {
            	case 1 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:228:5: PLUS !
            	    {
            	    PLUS92=(Token)match(input,PLUS,FOLLOW_PLUS_in_unary_expression1152); 

            	    }
            	    break;
            	case 2 :
            	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:228:13: negation
            	    {
            	    pushFollow(FOLLOW_negation_in_unary_expression1157);
            	    negation93=negation();

            	    state._fsp--;

            	    adaptor.addChild(root_0, negation93.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            pushFollow(FOLLOW_suffix_expression_in_unary_expression1162);
            suffix_expression94=suffix_expression();

            state._fsp--;

            adaptor.addChild(root_0, suffix_expression94.getTree());

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:231:1: negation : ( '!' | MINUS -> NEGATION );
    public final LatteParser.negation_return negation() throws RecognitionException {
        LatteParser.negation_return retval = new LatteParser.negation_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal95=null;
        Token MINUS96=null;

        LatteTree char_literal95_tree=null;
        LatteTree MINUS96_tree=null;
        RewriteRuleTokenStream stream_MINUS=new RewriteRuleTokenStream(adaptor,"token MINUS");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:232:2: ( '!' | MINUS -> NEGATION )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==47) ) {
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:232:4: '!'
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    char_literal95=(Token)match(input,47,FOLLOW_47_in_negation1175); 
                    char_literal95_tree = 
                    (LatteTree)adaptor.create(char_literal95)
                    ;
                    adaptor.addChild(root_0, char_literal95_tree);


                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:232:8: MINUS
                    {
                    MINUS96=(Token)match(input,MINUS,FOLLOW_MINUS_in_negation1177);  
                    stream_MINUS.add(MINUS96);


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
                    // 232:14: -> NEGATION
                    {
                        adaptor.addChild(root_0, 
                        (LatteTree)adaptor.create(NEGATION, "NEGATION")
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:235:1: suffix_expression : ( basic_expression | NAME '(' expression_list ')' -> ^( CALL NAME expression_list ) | predefined_statement );
    public final LatteParser.suffix_expression_return suffix_expression() throws RecognitionException {
        LatteParser.suffix_expression_return retval = new LatteParser.suffix_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token NAME98=null;
        Token char_literal99=null;
        Token char_literal101=null;
        LatteParser.basic_expression_return basic_expression97 =null;

        LatteParser.expression_list_return expression_list100 =null;

        LatteParser.predefined_statement_return predefined_statement102 =null;


        LatteTree NAME98_tree=null;
        LatteTree char_literal99_tree=null;
        LatteTree char_literal101_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_expression_list=new RewriteRuleSubtreeStream(adaptor,"rule expression_list");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:236:2: ( basic_expression | NAME '(' expression_list ')' -> ^( CALL NAME expression_list ) | predefined_statement )
            int alt22=3;
            switch ( input.LA(1) ) {
            case NAME:
                {
                int LA22_1 = input.LA(2);

                if ( (LA22_1==50) ) {
                    alt22=2;
                }
                else if ( (LA22_1==DIV||(LA22_1 >= MINUS && LA22_1 <= MOD)||LA22_1==PLUS||LA22_1==TIMES||(LA22_1 >= 48 && LA22_1 <= 49)||LA22_1==51||LA22_1==53||(LA22_1 >= 55 && LA22_1 <= 57)||(LA22_1 >= 59 && LA22_1 <= 61)||LA22_1==74) ) {
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
            case 50:
                {
                alt22=1;
                }
                break;
            case 66:
            case 69:
            case 70:
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:236:4: basic_expression
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_basic_expression_in_suffix_expression1193);
                    basic_expression97=basic_expression();

                    state._fsp--;

                    adaptor.addChild(root_0, basic_expression97.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:237:4: NAME '(' expression_list ')'
                    {
                    NAME98=(Token)match(input,NAME,FOLLOW_NAME_in_suffix_expression1198);  
                    stream_NAME.add(NAME98);


                    char_literal99=(Token)match(input,50,FOLLOW_50_in_suffix_expression1200);  
                    stream_50.add(char_literal99);


                    pushFollow(FOLLOW_expression_list_in_suffix_expression1202);
                    expression_list100=expression_list();

                    state._fsp--;

                    stream_expression_list.add(expression_list100.getTree());

                    char_literal101=(Token)match(input,51,FOLLOW_51_in_suffix_expression1204);  
                    stream_51.add(char_literal101);


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
                    // 237:33: -> ^( CALL NAME expression_list )
                    {
                        // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:237:36: ^( CALL NAME expression_list )
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:238:4: predefined_statement
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_predefined_statement_in_suffix_expression1221);
                    predefined_statement102=predefined_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, predefined_statement102.getTree());

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:241:1: expression_list : ( expression ( ',' expression )* )? -> ^( ARG ( expression )* ) ;
    public final LatteParser.expression_list_return expression_list() throws RecognitionException {
        LatteParser.expression_list_return retval = new LatteParser.expression_list_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal104=null;
        LatteParser.expression_return expression103 =null;

        LatteParser.expression_return expression105 =null;


        LatteTree char_literal104_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:2: ( ( expression ( ',' expression )* )? -> ^( ARG ( expression )* ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:4: ( expression ( ',' expression )* )?
            {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:4: ( expression ( ',' expression )* )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==BOOLEAN||(LA24_0 >= INTEGER && LA24_0 <= MINUS)||LA24_0==NAME||LA24_0==PLUS||LA24_0==STRING||LA24_0==47||LA24_0==50||LA24_0==66||(LA24_0 >= 69 && LA24_0 <= 70)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:5: expression ( ',' expression )*
                    {
                    pushFollow(FOLLOW_expression_in_expression_list1233);
                    expression103=expression();

                    state._fsp--;

                    stream_expression.add(expression103.getTree());

                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:16: ( ',' expression )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( (LA23_0==53) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:17: ',' expression
                    	    {
                    	    char_literal104=(Token)match(input,53,FOLLOW_53_in_expression_list1236);  
                    	    stream_53.add(char_literal104);


                    	    pushFollow(FOLLOW_expression_in_expression_list1238);
                    	    expression105=expression();

                    	    state._fsp--;

                    	    stream_expression.add(expression105.getTree());

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
            // 242:36: -> ^( ARG ( expression )* )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:39: ^( ARG ( expression )* )
                {
                LatteTree root_1 = (LatteTree)adaptor.nil();
                root_1 = (LatteTree)adaptor.becomeRoot(
                (LatteTree)adaptor.create(ARG, "ARG")
                , root_1);

                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:242:45: ( expression )*
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:245:1: ident : NAME -> ^( REF NAME ) ;
    public final LatteParser.ident_return ident() throws RecognitionException {
        LatteParser.ident_return retval = new LatteParser.ident_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token NAME106=null;

        LatteTree NAME106_tree=null;
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:246:2: ( NAME -> ^( REF NAME ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:246:4: NAME
            {
            NAME106=(Token)match(input,NAME,FOLLOW_NAME_in_ident1263);  
            stream_NAME.add(NAME106);


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
            // 246:9: -> ^( REF NAME )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:246:12: ^( REF NAME )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:250:1: array_call : NAME '[' INTEGER ']' -> ^( ARRAY NAME INTEGER ) ;
    public final LatteParser.array_call_return array_call() throws RecognitionException {
        LatteParser.array_call_return retval = new LatteParser.array_call_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token NAME107=null;
        Token char_literal108=null;
        Token INTEGER109=null;
        Token char_literal110=null;

        LatteTree NAME107_tree=null;
        LatteTree char_literal108_tree=null;
        LatteTree INTEGER109_tree=null;
        LatteTree char_literal110_tree=null;
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleTokenStream stream_NAME=new RewriteRuleTokenStream(adaptor,"token NAME");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:251:2: ( NAME '[' INTEGER ']' -> ^( ARRAY NAME INTEGER ) )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:251:4: NAME '[' INTEGER ']'
            {
            NAME107=(Token)match(input,NAME,FOLLOW_NAME_in_array_call1285);  
            stream_NAME.add(NAME107);


            char_literal108=(Token)match(input,62,FOLLOW_62_in_array_call1287);  
            stream_62.add(char_literal108);


            INTEGER109=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_array_call1289);  
            stream_INTEGER.add(INTEGER109);


            char_literal110=(Token)match(input,63,FOLLOW_63_in_array_call1291);  
            stream_63.add(char_literal110);


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
            // 251:25: -> ^( ARRAY NAME INTEGER )
            {
                // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:251:28: ^( ARRAY NAME INTEGER )
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:254:1: basic_expression : ( ident | literal | '(' ! expression ')' !);
    public final LatteParser.basic_expression_return basic_expression() throws RecognitionException {
        LatteParser.basic_expression_return retval = new LatteParser.basic_expression_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token char_literal113=null;
        Token char_literal115=null;
        LatteParser.ident_return ident111 =null;

        LatteParser.literal_return literal112 =null;

        LatteParser.expression_return expression114 =null;


        LatteTree char_literal113_tree=null;
        LatteTree char_literal115_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:255:2: ( ident | literal | '(' ! expression ')' !)
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
            case 50:
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
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:255:4: ident
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_ident_in_basic_expression1313);
                    ident111=ident();

                    state._fsp--;

                    adaptor.addChild(root_0, ident111.getTree());

                    }
                    break;
                case 2 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:256:4: literal
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    pushFollow(FOLLOW_literal_in_basic_expression1318);
                    literal112=literal();

                    state._fsp--;

                    adaptor.addChild(root_0, literal112.getTree());

                    }
                    break;
                case 3 :
                    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:257:4: '(' ! expression ')' !
                    {
                    root_0 = (LatteTree)adaptor.nil();


                    char_literal113=(Token)match(input,50,FOLLOW_50_in_basic_expression1323); 

                    pushFollow(FOLLOW_expression_in_basic_expression1326);
                    expression114=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression114.getTree());

                    char_literal115=(Token)match(input,51,FOLLOW_51_in_basic_expression1328); 

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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:260:1: literal : ( INTEGER | BOOLEAN | STRING );
    public final LatteParser.literal_return literal() throws RecognitionException {
        LatteParser.literal_return retval = new LatteParser.literal_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token set116=null;

        LatteTree set116_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:261:2: ( INTEGER | BOOLEAN | STRING )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:
            {
            root_0 = (LatteTree)adaptor.nil();


            set116=(Token)input.LT(1);

            if ( input.LA(1)==BOOLEAN||input.LA(1)==INTEGER||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (LatteTree)adaptor.create(set116)
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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:266:1: integer_literal : INTEGER ;
    public final LatteParser.integer_literal_return integer_literal() throws RecognitionException {
        LatteParser.integer_literal_return retval = new LatteParser.integer_literal_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token INTEGER117=null;

        LatteTree INTEGER117_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:267:2: ( INTEGER )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:267:4: INTEGER
            {
            root_0 = (LatteTree)adaptor.nil();


            INTEGER117=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_integer_literal1363); 
            INTEGER117_tree = 
            (LatteTree)adaptor.create(INTEGER117)
            ;
            adaptor.addChild(root_0, INTEGER117_tree);


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
    // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:270:1: boolean_literal : BOOLEAN ;
    public final LatteParser.boolean_literal_return boolean_literal() throws RecognitionException {
        LatteParser.boolean_literal_return retval = new LatteParser.boolean_literal_return();
        retval.start = input.LT(1);


        LatteTree root_0 = null;

        Token BOOLEAN118=null;

        LatteTree BOOLEAN118_tree=null;

        try {
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:271:2: ( BOOLEAN )
            // D:\\Projects\\git\\Latte\\Latte\\src\\grammar\\Latte.g:271:4: BOOLEAN
            {
            root_0 = (LatteTree)adaptor.nil();


            BOOLEAN118=(Token)match(input,BOOLEAN,FOLLOW_BOOLEAN_in_boolean_literal1375); 
            BOOLEAN118_tree = 
            (LatteTree)adaptor.create(BOOLEAN118)
            ;
            adaptor.addChild(root_0, BOOLEAN118_tree);


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


 

    public static final BitSet FOLLOW_function_definitions_list_in_program216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_definition_in_function_definitions_list235 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000011L});
    public static final BitSet FOLLOW_type_in_function_definition248 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_NAME_in_function_definition252 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_function_definition254 = new BitSet(new long[]{0x0008020000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_arguments_list_in_function_definition258 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_function_definition261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_block_in_function_definition265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_param_in_arguments_list311 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_arguments_list316 = new BitSet(new long[]{0x0000020000000000L,0x0000000000000011L});
    public static final BitSet FOLLOW_param_in_arguments_list320 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_type_in_param351 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_NAME_in_param353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_type_in_type377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_array_type_in_type382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SINGLE_TYPE_in_single_type394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_block_in_statement422 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_statement_in_statement428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_statement_in_statement434 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_if_statement_in_statement440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_loop_statement_in_statement446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_return_statement_in_statement452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_statement_in_statement458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_statement464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_block478 = new BitSet(new long[]{0x0084860898000100L,0x0000000000000BECL});
    public static final BitSet FOLLOW_statement_in_block480 = new BitSet(new long[]{0x0084860898000100L,0x0000000000000BECL});
    public static final BitSet FOLLOW_75_in_block483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_type_in_declaration_statement508 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_single_declarator_list_in_declaration_statement510 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_declaration_statement513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_single_declarator_in_single_declarator_list537 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_single_declarator_list541 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_single_declarator_in_single_declarator_list544 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_NAME_in_single_declarator563 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_single_declarator565 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_in_single_declarator567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_single_declarator588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignment_in_assignment_statement616 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_assignment_statement618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment637 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_assignment639 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_in_assignment642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment649 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_assignment651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_assignment675 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_assignment677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_if_statement710 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_if_statement712 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_in_if_statement714 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_if_statement716 = new BitSet(new long[]{0x0084860898000100L,0x00000000000003ECL});
    public static final BitSet FOLLOW_statement_in_if_statement720 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_if_statement732 = new BitSet(new long[]{0x0084860898000100L,0x00000000000003ECL});
    public static final BitSet FOLLOW_statement_in_if_statement736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_loop_statement775 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_loop_statement777 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_in_loop_statement779 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_loop_statement781 = new BitSet(new long[]{0x0084860898000100L,0x00000000000003ECL});
    public static final BitSet FOLLOW_statement_in_loop_statement783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_return_statement820 = new BitSet(new long[]{0x0084840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_in_return_statement823 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_return_statement827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_statement853 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_expression_statement855 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predefined_function_in_predefined_statement870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printInt_in_predefined_function882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_error_in_predefined_function888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_readInt_in_predefined_function893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_printInt905 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_printInt907 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_in_printInt909 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_printInt911 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_error936 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_error938 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_error940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_readInt956 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_readInt958 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_readInt961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_or_in_expression979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_logical_expression_and_in_logical_expression_or998 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_logical_expression_or1001 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_logical_expression_and_in_logical_expression_or1004 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_comparison_expression_in_logical_expression_and1017 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_49_in_logical_expression_and1020 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_comparison_expression_in_logical_expression_and1023 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_relational_expression_in_comparison_expression1036 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1049 = new BitSet(new long[]{0x3B01000000000002L});
    public static final BitSet FOLLOW_set_in_relational_expression1052 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_additive_expression_in_relational_expression1077 = new BitSet(new long[]{0x3B01000000000002L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1091 = new BitSet(new long[]{0x0000000810000002L});
    public static final BitSet FOLLOW_PLUS_in_additive_expression1095 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_MINUS_in_additive_expression1100 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_multiplicative_expression_in_additive_expression1104 = new BitSet(new long[]{0x0000000810000002L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1118 = new BitSet(new long[]{0x0000100020008002L});
    public static final BitSet FOLLOW_TIMES_in_multiplicative_expression1122 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_DIV_in_multiplicative_expression1127 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_MOD_in_multiplicative_expression1132 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_unary_expression_in_multiplicative_expression1136 = new BitSet(new long[]{0x0000100020008002L});
    public static final BitSet FOLLOW_PLUS_in_unary_expression1152 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_negation_in_unary_expression1157 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_suffix_expression_in_unary_expression1162 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_negation1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MINUS_in_negation1177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basic_expression_in_suffix_expression1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_suffix_expression1198 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_suffix_expression1200 = new BitSet(new long[]{0x000C840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_list_in_suffix_expression1202 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_suffix_expression1204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predefined_statement_in_suffix_expression1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expression_list1233 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_53_in_expression_list1236 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_in_expression_list1238 = new BitSet(new long[]{0x0020000000000002L});
    public static final BitSet FOLLOW_NAME_in_ident1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NAME_in_array_call1285 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_array_call1287 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_INTEGER_in_array_call1289 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_63_in_array_call1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ident_in_basic_expression1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_literal_in_basic_expression1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_basic_expression1323 = new BitSet(new long[]{0x0004840898000100L,0x0000000000000064L});
    public static final BitSet FOLLOW_expression_in_basic_expression1326 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_basic_expression1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_integer_literal1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOOLEAN_in_boolean_literal1375 = new BitSet(new long[]{0x0000000000000002L});

}