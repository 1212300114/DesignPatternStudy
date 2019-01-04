package me.weather;

public interface ISubject {
	void registerObserver(IObserver o);

	void removeObserver(IObserver o);

	void notifyObserver();
}
