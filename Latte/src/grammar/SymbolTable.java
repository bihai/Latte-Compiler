package grammar;

public class SymbolTable {
	private GlobalScope globalScope;

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
	}

	public GlobalScope getGlobalScope() {
		return globalScope;
	}
	
	public Type checkTypeEqOp(Type exp1,Type exp2){
		Type bool = (Type) globalScope.resolve("boolean");
		Type integer = (Type) globalScope.resolve("int");
		Type string = (Type) globalScope.resolve("string");
		System.out.println("checked eq");
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
			//TODO: Throw exception: mismached type, expected exp1 type
			return null;
		}
	}
	
	public Type checkTypeNumOp(Type exp1,Type exp2){
		Type integer = (Type) globalScope.resolve("int");
		System.out.println("checked num");
		if ((exp1 == integer)&&(exp2 == integer)){
			return integer;
		}
		else{
			//TODO: Throw exception: mismached type, expected integer
			return null;
		}
	}
	
	public Type checkTypeRelOp(Type exp1,Type exp2){
		Type integer = (Type) globalScope.resolve("int");
		Type bool = (Type) globalScope.resolve("boolean");
		System.out.println("checked num");
		if ((exp1 == integer)&&(exp2 == integer)){
			return bool;
		}
		else{
			//TODO: Throw exception: mismached type, expected integer
			return null;
		}
	}
	
	public Type checkTypeBoolOp(Type exp1,Type exp2){
		Type bool = (Type) globalScope.resolve("boolean");
		System.out.println("checked bool op");
		if ((exp1 == bool)&&(exp2 == bool)){
			return bool;
		}
		else{
			//TODO: Throw exception: mismached type, expected bool
			return null;
		}
	}
}
