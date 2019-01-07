package me.observer.weatherObserable;


import java.util.Observable;

public class WeatherData extends Observable {
    private float temp;
    private float humi;
    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temp, float humi, float pressure) {
        this.temp = temp;
        this.humi = humi;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getHumi() {
        return humi;
    }

    public float getPressure() {
        return pressure;
    }

    public float getTemp() {
        return temp;
    }
}