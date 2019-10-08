import java.util.ArrayList;
import java.util.List;

public class ObservableCOncret implements Observable{

	private List<Observer> observers = new ArrayList<>();
	private int etat;
	
	public List<Observer> getObservers() {
		return observers;
	}

	public void setObservers(List<Observer> observers) {
		this.observers = observers;
	}

	public int getEtat() {
		return etat;
	}

	public void setEtat(int etat) {
		this.etat = etat;
		notifyAObservers();
	}

	@Override
	public void addObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void deleteObserver(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyAObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers) {
			o.update(etat);
		}
	}

}