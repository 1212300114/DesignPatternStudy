package me.observer.weatherObserable;

import java.util.Observable;
import java.util.Observer;

public class GeneralDisplay implements Observer, IDisplayElement {
    private float temp;
    private float humi;
    private float pressure;
    Observable observable;

    public GeneralDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof  WeatherData){
            WeatherData data = (WeatherData)o;
            this.temp = data.getTemp();
            this.humi = data.getHumi();
            this.pressure = data.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + this.temp + "F degress and" + this.humi + "% humidity");
    }
}