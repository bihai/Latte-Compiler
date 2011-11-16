tree grammar DefSymbols;

options {
  language = Java;
  tokenVocab = Latte;
  ASTLabelType = LatteTree;
  filter = true;
}

@header {
  package grammar;
}

@members {
	SymbolTable symbolTable;
	Scope currentScope;
	MethodSymbol currentMethod;
	public DefSymbols(TreeNodeStream stream, SymbolTable symbolTable){
			this(stream);
			this.symbolTable = symbolTable;
			currentScope = symbolTable.getGlobalScope();
	}
}
	
topdown
	:	enter_scope
	| enter_method
	| variable_declaration
	| variable_call
	| return_statement
	;

bottomup
	: exit_scope
	| exit_method
	//| method_call
	//| expression_statement
	| if_statement
	| assign_statement
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
	: ^(FUNC NAME type arguments_list? .*) {
		Type funcType = $type.type;
		MethodSymbol method = (MethodSymbol)currentScope.resolve($NAME.text);
		if(method.getType() == null){
			method.setType(funcType);
			method.setParentScope(currentScope);
			currentScope.define(method);
			currentScope = method;
			currentMethod = method;
			$NAME.setSymbol(method);
		}
		else{
			//TODO: Throw exception: function already defined
		}

	}
	;
	
return_statement
  : ^(RETURN .*){
    $return_statement.start.symbol = currentMethod;
  }
  ;

	
arguments_list
  : ^(PARAMS param+ )
  ;

param
  : ^(PARAM type NAME) {
      VariableSymbol variable = new VariableSymbol($NAME.text,$type.type);
      currentScope.define(variable);
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
	 : FUNC {currentScope = currentScope.getParentScope();}
	 ;
	 
variable_declaration
	:	^(DEFINE NAME single_type .*){
		VariableSymbol variable = new VariableSymbol($NAME.text, $single_type.type);
		currentScope.define(variable);
		$NAME.symbol = variable;
		//System.out.println($NAME.text);
	}
	;
	
variable_call
  : ^(REF NAME){
    Symbol symbol = currentScope.resolve($NAME.text);
    if(symbol==null){
      //TODO: Throw exception, variable not defined
      System.out.println("Variable "+ $NAME.text+" not defined");
    }else{
      $NAME.symbol = symbol;
      //System.out.println(symbol.getName());
    }
  }
  ;
  
 method_call
  : ^(CALL NAME .*){
    Symbol symbol = currentScope.resolve($NAME.text);
    if(symbol==null){
      //TODO: Throw exception, variable not defined
      System.out.println("Function "+ $NAME.text+" not defined");
    }else{
      $NAME.symbol = symbol;
      //System.out.println(symbol.getName());
    }
    }
  ;
  
 //EXPRESSION
 
expression_statement
  : ^(EXPR expression){
      $EXPR.evalType = $expression.type;}
  ;
  
expression returns[Type type]
 :  INTEGER {$type = (Type)currentScope.resolve("int"); System.out.println("Integer found");}
 |  STRING  {$type = (Type)currentScope.resolve("string"); System.out.println("String found");}
 |  BOOLEAN  {$type = (Type)currentScope.resolve("boolean"); System.out.println("Bool found");}
 |	binary_operator {$type = null;}
 |	variable_call
 |	method_call
 |	negation
 ;
 
binary_operator returns[Type type]
	@after{$start.evalType = $type;}
	:
	(	^(numericOp exp1 = expression exp2 = expression)
			{$type = symbolTable.checkTypeNumOp($exp1.type, $exp2.type); }
	|	^(relativeOp exp1 = expression exp2 = expression )
			{$type = symbolTable.checkTypeNumOp($exp1.type, $exp2.type); }
  | ^(equalityOp exp1 = expression exp2 = expression) 
  		{$type = symbolTable.checkTypeEqOp($exp1.type, $exp2.type); }
  | ^(logicalOp exp1 = expression exp2 = expression) 
  		{$type = symbolTable.checkTypeBoolOp($exp1.type, $exp2.type); }
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
  
negation
	: ^(NEGATION expression) {System.out.println("Bool Negation found");}
  | ^(NUM_NEGATION expression) {System.out.println("Num Negation found");}
	;

// STATEMENTS

if_statement
  : ^(IF expression_statement .*){
  	System.out.println("Found IF");
  	if($IF.getChildCount() == 3){
  		System.out.println("Found ELSE");
  	}
  }
//  | ^(IF . . .){
//  System.out.println("Found IF ELSE");}
  ;
  
assign_statement
	:
	;