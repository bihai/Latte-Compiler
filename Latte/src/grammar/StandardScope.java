package grammar;

import java.util.HashMap;
import java.util.Map;

public abstract class StandardScope implements Scope {
	Map<String, Symbol> symbols = new HashMap<String, Symbol>();

	public Symbol resolve(String name) {
		return symbols.get(name);
	}

	public void define(Symbol symbol) {
		if (!symbols.containsKey(symbol.name)) {
			symbols.put(symbol.name, symbol);
		}
		else{
			//TODO: throw SymbolAlreadyDefinedException
		}
	}
}
