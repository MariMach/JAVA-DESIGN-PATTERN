package adapter;

import ext.ImplAdaptee;

public class Adapter2 implements Standard{

	private ImplAdaptee adaptee = new ImplAdaptee();
	@Override
	public void operation(int nb1, int nb2) {
		// TODO Auto-generated method stub
		int res = adaptee.operation2(nb1, nb2);
		adaptee.operation3(res);
	}

}
