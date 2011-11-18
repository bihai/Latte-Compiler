package grammar;

import java.util.HashMap;
import java.util.Map;

public class MethodSymbol extends Symbol implements Scope {
	
	Map<String, Symbol> symbols = new HashMap<String, Symbol>();
	Scope parentScope;
	
	public MethodSymbol(String name){
		super(name);
	}
	
	public MethodSymbol(String name, Type type, Scope parentScope) {
		super(name, type);
		this.parentScope = parentScope;
	}

	public boolean isGlobal() {
		return false;
	}

	public Scope getParentScope() {
		return parentScope;
	}

	@Override
	public void define(Symbol symbol) {
		if (!symbols.containsKey(symbol.name)) {
			symbols.put(symbol.name, symbol);
		}
		else{
			//TODO: throw SymbolAlreadyDefinedException
		}
	}

	public Symbol resolve(String name) {
		Symbol symbol = symbols.get(name);
		if (symbol == null){
			symbol = parentScope.resolve(name);
		}
		return symbol;
	}

	public void setParentScope(Scope parentScope) {
		this.parentScope = parentScope;
	}

	@Override
	public Symbol resolveLocal(String name) {
		return symbols.get(name);
	}

}
