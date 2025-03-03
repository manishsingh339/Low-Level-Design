package designpatterns.observerDesignPattern.observer;

public class DesktopDisplay implements Observer {
    @Override
    public void update(float temp, float humidity) {
        System.out.println("Desktop Temperature: " + temp + " Humidity: " + humidity);
    }
}
