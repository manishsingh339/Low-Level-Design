package designpatterns.observerDesignPattern.observer;

public class WebDisplay implements Observer {

    @Override
    public void update(float temp, float humidity) {
        System.out.println("Web Temperature: " + temp + " Humidity: " + humidity);
    }
}
