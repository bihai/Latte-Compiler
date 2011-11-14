package grammar;

public class ClassSymbol extends Symbol implements Type, Scope {
	//TODO Finish Class methods
	//TODO Add superclass
	//TODO Add methods like resolve member
	public ClassSymbol(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Scope getParentScope() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void define(Symbol symbol) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Symbol resolve(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
