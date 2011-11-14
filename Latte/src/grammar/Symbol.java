package grammar;

public class Symbol {
	String name;
	Type type;
	Scope scope;
	public Symbol(String name) {
		super();
		this.name = name;
	}
	public Symbol(String name, Type type) {
		super();
		this.name = name;
		this.type = type;
	}
	public String getName() {
		return name;
	}
	
	public boolean isGlobal(){
		return scope.isGlobal();
	}
	@Override
	public String toString() {
		return "Symbol [name=" + name + ", type=" + type + ", scope=" + scope
				+ "]";
	}
	
	
	
}
