package grammar;

import org.antlr.runtime.Token;
import org.antlr.runtime.tree.CommonTree;

public class LatteTree extends CommonTree {
	
	public LatteTree(Token t) {
		super(t);
	}
	Symbol symbol;
	Type evalType;
	public Symbol getSymbol() {
		return symbol;
	}
	public void setSymbol(Symbol symbol) {
		this.symbol = symbol;
	}
	public Type getEvalType() {
		return evalType;
	}
	public void setEvalType(Type evalType) {
		this.evalType = evalType;
	}
	
}
