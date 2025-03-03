package designpatterns.observerDesignPattern;

import designpatterns.observerDesignPattern.Observable.WeatherStation;
import designpatterns.observerDesignPattern.observer.DesktopDisplay;
import designpatterns.observerDesignPattern.observer.MobileDisplay;
import designpatterns.observerDesignPattern.observer.WebDisplay;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        weatherStation.registerObserver( new MobileDisplay());
        weatherStation.registerObserver(new WebDisplay());
        weatherStation.registerObserver( new DesktopDisplay());

        System.out.println("Weather Update 1:");
        weatherStation.setMeasurements(10, 20);

        System.out.println("\nWeather Update 2:");
        weatherStation.setMeasurements(30, 40);
    }
}
