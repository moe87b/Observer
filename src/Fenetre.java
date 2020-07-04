import javax.swing.JFrame;

import observer.Observable;
import observer.Observer;

public class Fenetre extends JFrame implements Observable {

	@Override
	public void addObserver(Observer obs) {
		this.listeObservers.add(obs);

	}

	@Override
	public void notifyObservers() {
		for (Observer obs : this.listeObservers) {
			obs.update();
		}

	}

}