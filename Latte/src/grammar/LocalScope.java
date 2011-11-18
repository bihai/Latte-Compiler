package grammar;

public class LocalScope extends StandardScope {
	Scope parentScope;
	
	public LocalScope(Scope parentScope) {
		super();
		this.parentScope = parentScope;
	}

	@Override
	public boolean isGlobal() {
		return false;
	}

	@Override
	public Scope getParentScope() {
		return parentScope;
	}

	@Override
	public Symbol resolve(String name) {
		Symbol symbol = super.resolve(name);
		if (symbol == null){
			symbol = parentScope.resolve(name);
		}
		return symbol;
	}

	@Override
	public String getName() {
		return "Local Scope";
	}

	@Override
	public Symbol resolveLocal(String name) {
		return super.resolve(name);
	}
	
	
}
