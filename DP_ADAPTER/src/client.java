
import adapter.Adapter;
import adapter.Adapter2;
import adapter.Standard;
import adapter.StandardImpl1;

public class client {
	public static void main(String args[]) {
		Standard standard1 = new StandardImpl1();
		standard1.operation(7, 9);
		
		Standard standard2 = new Adapter();
		standard2.operation(7, 9);
		
		Standard standard3 = new Adapter2();
		standard3.operation(7, 9);
	}
}
