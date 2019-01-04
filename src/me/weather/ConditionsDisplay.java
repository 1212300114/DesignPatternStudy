package me.weather;

public class ConditionsDisplay implements IObserver, IDisplayElement {

	private float temp;
	private float humi;
	private float pressure;
	private ISubject weatherData;

	public ConditionsDisplay(ISubject subject) {
		this.weatherData = subject;
		this.weatherData.registerObserver(this);
	}

	public void display() {
		System.out.println("Current conditions:" + this.temp + "F degress and" + this.humi + "% humidity");
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humi = humidity;
		this.pressure = pressure;
		display();
	}

}
