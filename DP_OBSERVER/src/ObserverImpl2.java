
public class ObserverImpl2 implements Observer{

	@Override
	public void update(int o) {
		// TODO Auto-generated method stub
		System.out.println("Observateur 2");
		System.out.println("Result : " +o*6);
	}

}
