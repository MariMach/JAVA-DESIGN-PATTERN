package proxy;

import metier.IMetier;
import metier.MetierImpl;

public class Proxy implements IMetier{

	private MetierImpl metierImpl;
	@Override
	public double calcul() {
		if(metierImpl == null) {
			metierImpl =  new MetierImpl();
		}
		System.out.println("Ouverture d'une transaction");
		double res = 0;
		try {
			 res = metierImpl.calcul(); 
				System.out.println("Commit transaction");

		} catch (Exception e) {
			System.out.println("Rollback la transaction");
			throw(e); 
		}
		return res;
	}
	
}
