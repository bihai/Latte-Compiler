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
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public Scope getScope() {
		return scope;
	}
	public void setScope(Scope scope) {
		this.scope = scope;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Symbol [name=" + name + ", type=" + type + ", scope=" + scope
				+ "]";
	}
	
	
	
}
