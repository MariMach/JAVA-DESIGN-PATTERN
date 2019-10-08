package presentation;


import metier.IMetier;
import proxy.Proxy;

public class Client {

	
	private IMetier metieri = new Proxy();
	
	public Client() {
		System.out.println(metieri.calcul());
	}
	
	public static void main(String args[]) {
		new Client();
	}
	
}