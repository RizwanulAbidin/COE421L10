import java.util.ArrayList;

public class ConcreteSubject implements Subject {
	private ArrayList<Observer> observers;
	protected int energy;

	public ConcreteSubject() {
		observers = new ArrayList<Observer>();
	}

	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(energy);
		}
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}
}
