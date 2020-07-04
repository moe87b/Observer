package observer;

import java.util.ArrayList;

public interface Observable {
	ArrayList<Observer> listeObservers = new ArrayList<Observer>();

	public void addObserver(Observer obs);

	public void notifyObservers();
}