package grammar;

public class GlobalScope extends StandardScope {

	@Override
	public boolean isGlobal() {
		return true;
	}

	@Override
	public String getName() {
		return "Global Scope";
	}

	@Override
	public Scope getParentScope() {
		return null;
	}
}
