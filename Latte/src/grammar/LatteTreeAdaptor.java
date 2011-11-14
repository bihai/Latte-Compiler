package grammar;

import org.antlr.runtime.Token;


public class LatteTreeAdaptor extends org.antlr.runtime.tree.CommonTreeAdaptor {

	@Override
	public Object create(Token payload) {
		return new LatteTree(payload);
	}

	@Override
	public Object dupNode(Object t) {
		if(t==null){
			return null;
		}
		return create( ((LatteTree)t).token);
	}

	
}
