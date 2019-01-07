package me.observer.weather;

import java.util.ArrayList;

public class WeatherData implements ISubject {
	
	private ArrayList<IObserver> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		this.observers = new ArrayList<IObserver>();
	}
	
	public void registerObserver(IObserver o) {
		this.observers.add(o);
	}

	public void removeObserver(IObserver o) {
		int i = observers.indexOf(o);
		if(i >= 0){
			observers.remove(o);
		}
	}
	
	public void notifyObserver() {
		for (int i = 0; i < this.observers.size(); i++) {
			IObserver observer = this.observers.get(i);
			observer.update(this.temperature, this.humidity, this.pressure);
		}
	}
	
	public void  getChanged() {
		notifyObserver();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		getChanged();
	}

}
