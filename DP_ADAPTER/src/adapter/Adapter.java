package adapter;

import ext.ImplAdaptee;

public class Adapter extends ImplAdaptee implements Standard{

	@Override
	public void operation(int nb1, int nb2) {
		// TODO Auto-generated method stub
		int r = operation2(nb1, nb2);
		operation3(r);
	}
	
}
