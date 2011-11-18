grammar Latte;

options {
  language = Java;
  output=AST;
  ASTLabelType=LatteTree;
}

tokens {
  CALL;
  FUNC;
  BEGIN;
  END;
  NEGATION;
  PROGRAM;
  ARRAY;
  BLOCK;
  DEFINE_SINGLE;
  DEFINE_ARRAY;
  COMPLEX;
  RETURN;
  IF;
  ELSE;
  THEN;
  ENDIF;
  FOR; 
  ENDFOR;
  WHILE;
  ENDWHILE;
  DO;
  PRINTINT;
  READINT;
  ERROR;
  ARG;
  DEFINE;
  PARAM;
  PARAMS;
  REF;
  EXPR;
  NUM_NEGATION;
  EQ;
}

@header {
  package grammar;
  import java.util.Map;
  import java.util.LinkedHashMap;
  import java.util.List;
  import java.util.ArrayList;
  import grammar.Param;
  import grammar.VariableSymbol;
  import grammar.Symbol;
  import main.NameAlreadyUsedException;
}

@lexer::header {
  package grammar;
}

@members {
  Map<String, CommonTree> functionDefinitions = new LinkedHashMap<String, CommonTree>();
  Map<String, ArrayList<Symbol> > functionParameters;
  SymbolTable symbolTable = new SymbolTable();
  
 	public LatteParser(TokenStream stream, SymbolTable symbolTable, Map<String,ArrayList<Symbol>> functionParameters){
			this(stream);
			this.symbolTable = symbolTable;
			this.functionParameters = functionParameters;
	}
	
	public Map<String, ArrayList<Symbol>> getfunctionParameters(){
		return functionParameters;
	}
}

program
	: function_definitions_list -> ^(PROGRAM function_definitions_list)
	;

function_definitions_list
	:	function_definition+
	;
	
function_definition
  :type fname=NAME '(' arg=arguments_list? ')' stmt=block -> ^(FUNC NAME type arguments_list? block)
	;
	finally {
	  functionDefinitions.put($fname.text, $function_definition.tree);
	  functionParameters.put($fname.text, $arg.result); //hasmap of hashmap
	  if(symbolTable.getGlobalScope().resolveLocal($fname.text) != null)
      	throw new NameAlreadyUsedException($fname.text, $fname.getLine());
     symbolTable.getGlobalScope().define(new MethodSymbol($fname.text,null,null));
	  
	}
	
arguments_list returns [ArrayList<Symbol> result]
  :	
  {$result = new ArrayList<Symbol>();}
  p1=param {$result.add($p1.result);} (',' p2=param {$result.add($p2.result);})*
  -> ^(PARAMS param+)
  ;

param returns [VariableSymbol result]
	:	type NAME {
		$result = new VariableSymbol($type.text, (Type) symbolTable.getGlobalScope().resolve($NAME.text));
		
	} -> ^(PARAM type NAME)
	;
	
type
	: single_type
	|	array_type
	;
	
single_type
	: SINGLE_TYPE
	;

array_type
	:	'int[]' | 'boolean[]'
	;

//-----STATEMENTS-----

statement
	:	block
  |	declaration_statement
  |	assignment_statement
  | if_statement
  | loop_statement
  | return_statement
  | expression_statement
  | ';'
  ;
  
block
	: '{' statement* '}' -> ^(BLOCK (statement)* ) 
	;
	
declaration_statement
	: single_type single_declarator_list[$single_type.tree] ';' -> single_declarator_list
//	| array_type	array_declarator_list ';' -> ^(DEFINE_ARRAY array_type array_declarator_list)
	;
	
////array_declarator_list
////   :	NAME (','! NAME)*
////   ;
//  
single_declarator_list[LatteTree typeTree]
   :	single_declarator[$typeTree] (','! single_declarator[$typeTree])*
   ;

single_declarator[LatteTree typeTree]
   :	NAME EQ expression  -> ^(DEFINE NAME {$typeTree} expression) 
   |	NAME -> ^(DEFINE NAME {$typeTree})
   ;
   
assignment_statement
   :	assignment ';'!
   ;
   
assignment
   :	ident '=' expression -> ^(EQ ident expression)
   |	ident '++' -> ^(EQ ident ^(PLUS ident INTEGER["1"]))
   |	ident '--' -> ^(EQ ident ^(MINUS ident INTEGER["1"]))
   ;
   
if_statement
	:	'if' '(' expression ')' st1=statement 
	(options {greedy=true;}:'else' st2=statement)?
	 ->
	^(IF expression $st1  $st2?)
  ;

   
loop_statement
   :	'while' '(' expression ')' statement ->
   ^(WHILE expression DO statement ENDWHILE)
//   |	'for' '(' as1=assignment ';' ex=expression ';' as2=assignment ')' st=statement ->
//   ^(FOR $as1 $ex $as2 DO $st ENDFOR)
   ;
   
return_statement
   :	'return' expression? ';' -> ^(RETURN expression?)
   ;
   
expression_statement
  :	expression ';'!
	;
	
//predefined statements

predefined_statement
	:	predefined_function
	;
	
predefined_function
	:	printInt
//	|	printString
	|	error
	|	readInt
	;
	
printInt
	:	'printInt' '(' expression ')' -> ^(CALL NAME["printInt"] ^(ARG expression))
	;
	
//printString
//	:	'printString' '(' expression ')' ';' -> ^(PRINTSTRING expression)
//	;
	
error
	:	'error' '(' ')'	-> ERROR
	;
	
readInt
	:	'readInt' '('  ')' -> READINT
	;
	
//-----EXPRESSIONS-----
expression
	: expr -> ^(EXPR expr)
	;
	
expr
	: logical_expression_or
	;

logical_expression_or
	: logical_expression_and ('||'^ logical_expression_and)*
	;

logical_expression_and
	: comparison_expression ('&&'^ comparison_expression)*
	;

comparison_expression
	: relational_expression //(('==' | '!=')^ relational_expression)*
	;
	
relational_expression
	:	additive_expression (('==' | '!=' | '<' | '<=' | '>=' | '>')^ additive_expression)*
	;
	
additive_expression
	: multiplicative_expression ((PLUS^ | MINUS^) multiplicative_expression)*
	;
	
multiplicative_expression
	: unary_expression ((TIMES^ | DIV^ | MOD^) unary_expression)* 
	;
	
unary_expression
	: (PLUS! | negation^ )* suffix_expression 
	;
	
negation
	: '!' -> NEGATION
	| MINUS -> NUM_NEGATION
	;
	
suffix_expression
	: basic_expression
	| NAME '(' expression_list ')' -> ^(CALL NAME expression_list)  //?
	| predefined_statement
	;

expression_list
	: (expression (',' expression)*)? -> ^(ARG expression*)
	;
	
ident
	: NAME -> ^(REF NAME)
	//| array_call
	;
	
array_call
	: NAME '[' INTEGER ']' -> ^(ARRAY NAME INTEGER)
	;
	
basic_expression
	:	ident
	|	literal
	| '('! expr ')'!
	;
	
literal
	: INTEGER
	| BOOLEAN
	| STRING
	;
integer_literal
	:	INTEGER
	;	

boolean_literal
	:	BOOLEAN
	;	
	

PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
MOD: '%';
EQ: '=';
INTEGER : '0'..'9'+;
//INTEGER : ('0' | ('-')?('1'..'9')('0'..'9')*);
BOOLEAN: ('true' | 'false');
SINGLE_TYPE: ('int' | 'boolean' | 'void' | 'string');
NAME : ('a'..'z' | 'A'..'Z')('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*;
WS: (' ' | '\t' | '\n' | '\r' | '\f' )+ {$channel = HIDDEN;};
COMMENT: '//' .* ('\n' | '\r') {$channel = HIDDEN;};
MULTILINE_COMMENT: '/*' (options {greedy=false;} : .)* '*/' {$channel = HIDDEN;};
STRING: '"'(.)*'"';	
