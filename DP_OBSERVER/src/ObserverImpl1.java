
public class ObserverImpl1 implements Observer{

	@Override
	public void update(int o) {
		// TODO Auto-generated method stub
		System.out.println("Observateur 1");
		System.out.println("Result : " +o*3);
	}
}
