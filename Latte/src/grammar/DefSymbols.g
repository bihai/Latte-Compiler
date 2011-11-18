tree grammar DefSymbols;

options {
  language = Java;
  tokenVocab = Latte;
  ASTLabelType = LatteTree;
  filter = true;
}

@header {
  package grammar;
  import main.MismatchedTypeException;
  import main.NameAlreadyUsedException;
  import main.MethodException;
  import main.VariableException;
  import java.util.Map;
}

@members {
	SymbolTable symbolTable;
	Scope currentScope;
	MethodSymbol currentMethod;
	Type returnType;
	Map<String, ArrayList<Symbol>> functionParameters;
	Boolean debug = false;
	public DefSymbols(TreeNodeStream stream, SymbolTable symbolTable, Map functionParameters){
			this(stream);
			this.symbolTable = symbolTable;
			currentScope = symbolTable.getGlobalScope();
			this.functionParameters = functionParameters;
	}
	
		public DefSymbols(TreeNodeStream stream, SymbolTable symbolTable, Map functionParameters, Boolean debug){
			this(stream, symbolTable, functionParameters);
			this.debug = debug;
	}
	

}
	
topdown
	:	enter_scope
	| enter_method
	| variable_declaration
	| variable_call
	| return_statement
	;

bottomup throws RuntimeException
	: exit_scope
	| exit_method
	| method_call
	//| expression_statement
	| if_statement
	| assign_statement
	| declaration_statement
	| return_statement
	;

enter_scope
	:	BLOCK {
		currentScope = new LocalScope(currentScope);
	}
	;
	
exit_scope
	: BLOCK{currentScope = currentScope.getParentScope();}
	;	
	
enter_method
	: ^(FUNC NAME type params_list? .*) {
		Type funcType = $type.type;
		MethodSymbol method = (MethodSymbol)currentScope.resolve($NAME.text);
		if(method.getType() == null){
			method.setType(funcType);
			method.setParentScope(currentScope);
			currentScope.define(method);
			currentScope = method;
			currentMethod = method;
			$FUNC.setSymbol(method);
			returnType = funcType;
		}
		else{
			throw new NameAlreadyUsedException($NAME.text, $NAME.getLine());
		}

	}
	;
	
params_list
  : ^(PARAMS param+ )
  ;

param
  : ^(PARAM type NAME) {
      VariableSymbol variable = new VariableSymbol($NAME.text,$type.type);
      if(currentScope.resolve($NAME.text) == null)
      	currentScope.define(variable);
      else
      	throw new NameAlreadyUsedException($NAME.text,$NAME.getLine());
      $NAME.symbol = variable;
    }
  ;
	
type returns [Type type]
	: single_type {$type = $single_type.type;}
	//|	array_type
	;
	
single_type returns [Type type]
	: SINGLE_TYPE {$type = (Type)currentScope.resolve($SINGLE_TYPE.getText());}
	;

//array_type
//	:	'int[]' | 'boolean[]'
//	;
	
exit_method
	 :  FUNC {
	 		currentScope = currentScope.getParentScope();
	 		if(returnType != $FUNC.getSymbol().getType()){
	 			symbolTable.checkReturnType($FUNC, returnType); 			
	 		}
	 }
	 ;
	 
variable_declaration
	:	^(DEFINE NAME single_type .*){
		VariableSymbol variable = new VariableSymbol($NAME.text, $single_type.type);
      if(currentScope.resolveLocal($NAME.text) == null)
      	currentScope.define(variable);
      else
      	throw new NameAlreadyUsedException($NAME.text,$NAME.getLine());
      $NAME.symbol = variable;
	}
	;
	
variable_call returns[Type type]
  : ^(REF NAME){
    Symbol symbol = currentScope.resolve($NAME.text);
    
    if(symbol==null){
      //System.out.println("Variable "+ $NAME.text+" not defined");
      throw new VariableException("Variable " + $NAME.text + " not defined in line ", $NAME.getLine());
    }else{
      $NAME.symbol = symbol;
      $type = symbol.getType();
      //System.out.println(symbol.getName());
    }
    
  }
  ;
  
 method_call returns[Type type]
  : ^(CALL NAME arguments_list){
    Symbol symbol = currentScope.resolve($NAME.text);
    if(symbol==null){
    	throw new MethodException("Function " + $NAME.text + " not defined in line ", $NAME.getLine());
      //System.out.println("Function "+ $NAME.text+" not defined");
    }else{
    	ArrayList<Symbol> params = functionParameters.get($NAME.text);
    	ArrayList<Type> args = $arguments_list.args;
    	if(args.size() != params.size()){
    		//System.out.println("wrong number of args");
    		throw new MethodException("Function " + $NAME.text + " error: wrong number of arguments in line ", $NAME.getLine());
    	}
    	for(int i = 0; i < args.size(); i++ ){
    		if(args.get(i) != params.get(i).getType()){
    			//System.out.println("wrong arg type");
    			throw new MethodException("Function " + $NAME.text + " error: wrong argument type. Found: "+ args.get(i).getName() 
    			+" expected: "+ params.get(i).getType().getName()
   			  +" in line ", $NAME.getLine());
    		}
    	}
    	
      $NAME.symbol = symbol;
      $type = symbol.getType();
      //System.out.println(symbol.getName());
    }
    }
  ;
  
arguments_list returns[ArrayList<Type> args]
@init{args = new ArrayList<Type>();}
	: ^(ARG (expression_statement{	args.add($expression_statement.type);	})*)
	;
  
 //EXPRESSION
 
expression_statement returns[Type type]
  : ^(EXPR expression){
  		$type = $expression.type;
      $EXPR.evalType = $expression.type;}
  ;
  
expression returns[Type type]
 :  INTEGER { $type = (Type)currentScope.resolve("int"); if(debug)System.out.println("Integer found"); $INTEGER.evalType = $type;}
 |  STRING  {$type = (Type)currentScope.resolve("string"); if(debug)System.out.println("String found"); $STRING.evalType = $type;}
 |  BOOLEAN  {$type = (Type)currentScope.resolve("boolean"); if(debug)System.out.println("Bool found"); $BOOLEAN.evalType = $type;}
 |	binary_operator {$type = $binary_operator.type; $start.evalType = $type;}
 |	variable_call {$type = $variable_call.type; $start.evalType = $type;}
 |	method_call {$type = $method_call.type; $start.evalType = $type;}
 |	negation {$type = $negation.type; $start.evalType = $type;}
 ;
 
binary_operator returns[Type type]
	@after{$start.evalType = $type;}
	:
	(	^(numericOp exp1 = expression exp2 = expression)
			{$type = symbolTable.checkTypeNumOp($exp1.start, $exp2.start); } 
	|	^(relativeOp exp1 = expression exp2 = expression )
			{$type = symbolTable.checkTypeNumOp($exp1.start, $exp2.start); }
  | ^(equalityOp exp1 = expression exp2 = expression) 
  		{$type = symbolTable.checkTypeEqOp($exp1.start, $exp2.start); }
  | ^(logicalOp exp1 = expression exp2 = expression) 
  		{$type = symbolTable.checkTypeBoolOp($exp1.start, $exp2.start); }
  )
  ; 

relativeOp
  : '>=' 
  | '>' 
  | '<' 
  | '<='  
  ;
  
 equalityOp
  : '==' | '!='
  ;

numericOp
  : PLUS | MINUS | TIMES | DIV | MOD
  ;  
  
 logicalOp
 	: '&&' | '||' 
 	;
  
negation returns[Type type]
	: ^(NEGATION expression) {$type = symbolTable.checkTypeBoolNegation($expression.start); System.out.println("Bool Negation found");}
  | ^(NUM_NEGATION expression) {$type = symbolTable.checkTypeNumNegation($expression.start); System.out.println("Num Negation found");}
	;

// STATEMENTS

if_statement throws RuntimeException
  : ^(IF expression_statement .*){
  	if(debug) System.out.println("Found IF");
  	if($IF.getChildCount() == 3){
  		if(debug) System.out.println("Found ELSE");
  	}
  	symbolTable.checkTypeBool($expression_statement.start);
 		if(debug) System.out.println("Correct If");
  }
//  | ^(IF . . .){
//  System.out.println("Found IF ELSE");}
  ;
  
assign_statement
	:	^(EQ ^(REF NAME) expression_statement) 	{
		Symbol symbol = $NAME.getSymbol();
		symbolTable.checkAssignmentType(symbol,$expression_statement.start);
		if(debug) System.out.println("assign "+symbol);
	}
	;
	
	
declaration_statement
	:	^(DEFINE NAME type expression_statement){
		Symbol symbol = $NAME.getSymbol();
		symbolTable.checkAssignmentType(symbol,$expression_statement.start);
		if(debug) System.out.println("Define "+$NAME.text+" variable");}
	;
	
return_statement
  : ^(RETURN expression_statement){
  	MethodSymbol method = currentMethod;
    $return_statement.start.symbol = method;
    symbolTable.checkReturnType(method, $expression_statement.start);
  }
  ;