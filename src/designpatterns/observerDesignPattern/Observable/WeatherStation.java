package designpatterns.observerDesignPattern.Observable;

import designpatterns.observerDesignPattern.observer.Observer;

import java.util.List;

public class WeatherStation implements Observable{
    private float temperature;
    private float humidity;
    private List<Observer> observers;

    public WeatherStation() {
        observers = new java.util.ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        observers.forEach(o -> o.update(temperature, humidity));
    }

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObserver();
    }
}
