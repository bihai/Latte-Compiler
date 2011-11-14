package grammar;

public class SymbolTable {
	private GlobalScope GlobalScope;

	public SymbolTable() {
		GlobalScope = new GlobalScope();
		GlobalScope.define(new BasicType("int"));
		GlobalScope.define(new BasicType("void"));
		GlobalScope.define(new BasicType("boolean"));
		GlobalScope.define(new BasicType("string"));
	}

	public GlobalScope getGlobalScope() {
		return GlobalScope;
	}
	
	
}
