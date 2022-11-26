package solid.observerpattern.subjects;


import solid.observerpattern.observers.IObserver;

interface ISubject {

	void registerObserver(IObserver o);
	void removeObserver(IObserver o);
	void notifyObservers();

}
