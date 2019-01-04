package me.weather;

public interface IObserver {
	void update(float temp, float humidity, float pressuer);
}
