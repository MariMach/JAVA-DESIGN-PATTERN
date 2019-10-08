
public class Main {
	
	public static void main(String[] args) {
		ObservableCOncret sujet = new ObservableCOncret();
		ObserverImpl1 obs1 = new ObserverImpl1();
		ObserverImpl2 obs2 = new ObserverImpl2();		
		sujet.addObserver(obs1);
		sujet.addObserver(obs2);
		sujet.setEtat(8);
		sujet.setEtat(33);
		sujet.deleteObserver(obs1);
		sujet.setEtat(0);
	}

}
