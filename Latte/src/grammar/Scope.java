package grammar;

public interface Scope {

	boolean isGlobal();

	public String getName();

	public Scope getParentScope();

	public void define(Symbol symbol);

	public Symbol resolve(String name);
}
