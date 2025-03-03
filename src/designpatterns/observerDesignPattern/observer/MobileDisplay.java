package designpatterns.observerDesignPattern.observer;

public class MobileDisplay implements Observer {

    @Override
    public void update(float temp, float humidity) {
        System.out.println("Mobile Temperature: " + temp + " Humidity: " + humidity);
    }
}

