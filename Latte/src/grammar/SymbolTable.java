package grammar;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import main.MismatchedReturnTypeException;
import main.MismatchedTypeException;

public class SymbolTable {
	private GlobalScope globalScope;
	private Boolean debug;
	private Map<String, ArrayList<Symbol>> functionParameters;

	public SymbolTable() {
		globalScope = new GlobalScope();
		Symbol intType = new BasicType("int");
		globalScope.define(intType);
		Symbol voidType = new BasicType("void");
		globalScope.define(voidType);
		Symbol boolType = new BasicType("boolean");
		globalScope.define(boolType);
		Symbol stringType = new BasicType("string");
		globalScope.define(stringType);
		
		globalScope.define(new MethodSymbol("printInt", (Type)voidType, globalScope));
		globalScope.define(new MethodSymbol("printString", (Type)voidType, globalScope));
		globalScope.define(new MethodSymbol("readInt", (Type)intType, globalScope));
		globalScope.define(new MethodSymbol("readString", (Type)stringType, globalScope));
		globalScope.define(new MethodSymbol("error", (Type)voidType, globalScope));
		
		functionParameters = new LinkedHashMap<String, ArrayList<Symbol>>();
		ArrayList<Symbol> ar = new ArrayList<Symbol>();
		ar.add(new VariableSymbol("name", (Type)intType));
		functionParameters.put("printInt", ar);
		ar = new ArrayList<Symbol>();
		ar.add(new VariableSymbol("name", (Type)stringType));
		functionParameters.put("printString", ar);
	}
	
	public SymbolTable(Boolean debug){
		this();
		this.debug = debug;
	}

	public GlobalScope getGlobalScope() {
		return globalScope;
	}
	
	public Type checkTypeEqOp(LatteTree t1,LatteTree t2){
		Type exp1 = t1.evalType;
		Type exp2 = t2.evalType;
		Type bool = (Type) globalScope.resolve("boolean");
		Type integer = (Type) globalScope.resolve("int");
		Type string = (Type) globalScope.resolve("string");
		if(debug) System.out.println("checked eq");
		if((exp1 == bool)&&(exp2 == bool)){
			return bool;
		}
		else if ((exp1 == integer)&&(exp2 == integer)){
			return bool;
		}
		else if ((exp1 == string)&&(exp2 == string)){
			return bool;
		}
		else{
				throw new MismatchedTypeException(exp1.getName(), exp2.getName(), t1.getLine());
		}
	}
	
	public Type checkTypeNumOp(LatteTree t1,LatteTree t2) throws MismatchedTypeException{
		Type exp1 = t1.evalType;
		Type exp2 = t2.evalType;
		Type integer = (Type) globalScope.resolve("int");
		if(debug) System.out.println("checked num");
		if ((exp1 == integer)&&(exp2 == integer)){
			return integer;
		}
		else{
			if(exp1 != integer){
				throw new MismatchedTypeException(exp1.getName(), integer.getName(), t1.getLine());
			}
			else{
				throw new MismatchedTypeException(exp2.getName(), integer.getName(), t2.getLine());
			}
		}
	}
	
	public Type checkTypeRelOp(LatteTree t1,LatteTree t2){
		Type exp1 = t1.evalType;
		Type exp2 = t2.evalType;
		Type integer = (Type) globalScope.resolve("int");
		Type bool = (Type) globalScope.resolve("boolean");
		if(debug) System.out.println("checked num");
		if ((exp1 == integer)&&(exp2 == integer)){
			return bool;
		}
		else{
			if(exp1 != integer){
				throw new MismatchedTypeException(exp1.getName(), integer.getName(), t1.getLine());
			}
			else{
				throw new MismatchedTypeException(exp2.getName(), integer.getName(), t2.getLine());
			}
		}
	}
	
	public Type checkTypeBoolOp(LatteTree t1,LatteTree t2){
		Type exp1 = t1.evalType;
		Type exp2 = t2.evalType;
		Type bool = (Type) globalScope.resolve("boolean");
		if(debug) System.out.println("checked bool op");
		if ((exp1 == bool)&&(exp2 == bool)){
			return bool;
		}
		else{
			if(exp1 != bool){
				throw new MismatchedTypeException(exp1.getName(), bool.getName(), t1.getLine());
			}
			else{
				throw new MismatchedTypeException(exp2.getName(), bool.getName(), t2.getLine());
			}
		}
	}

	public Type checkTypeBoolNegation(LatteTree tree) {
		return checkTypeBool(tree);
	}

	public Type checkTypeNumNegation(LatteTree tree) {
		Type exp = tree.evalType;
		Type integer = (Type) globalScope.resolve("int");
		if(debug) System.out.println("checked num negation");
		if (exp != integer){
			throw new MismatchedTypeException(exp.getName(), integer.getName(), tree.getLine());
		}
		return integer;
	}

	public Type checkTypeBool(LatteTree tree) {
		Type exp = tree.evalType;
		Type bool = (Type) globalScope.resolve("boolean");
		if(debug) System.out.println("checked bool");
		if (exp != bool){
			throw new MismatchedTypeException(exp.getName(), bool.getName(), tree.getLine());
		}
		return bool;
	}

	public Type checkAssignmentType(Symbol symbol, LatteTree tree) {
		Type exp2 = tree.evalType;
		if(debug) System.out.println("checked num");
		if(symbol.getType() != exp2){
			throw new MismatchedTypeException(symbol.getType().getName(), exp2.getName(), tree.getLine());
		}
		return exp2;

	}

	public void checkReturnType(MethodSymbol method, LatteTree tree) {
		Type exp2 = tree.evalType;
		Type exp1 = method.getType();
		if(debug) System.out.println("checked num");
		if(exp1 != exp2){
			throw new MismatchedReturnTypeException(exp1.getName(), exp2.getName(), tree.getLine());
		}
		//else {
//			//TODO: This method must return a result of type $type. Found $type
//			System.out.println("Void methods cannot return a value");
//		}
//		if(returnType == currentScope.resolve("void")){
//			//TODO: Void methods cannot return a value
//			System.out.println("Void methods cannot return a value");
//		} 
	}

	public Map<String, ArrayList<Symbol>> getFunctionParameters() {
		return functionParameters;
	}

	public void checkReturnType(LatteTree tree, Type returnType) {
		Type func = tree.evalType;
		Type voidType = (Type) globalScope.resolve("void");
		if(debug) System.out.println("checking return type");
		if(func == voidType){
			//TODO: This method must return a result of type $type
				System.out.println("Void methods cannot return a value");
		}
		//TODO: other possibilities
	}
}
