package designpatterns.observerDesignPattern.Observable;

import designpatterns.observerDesignPattern.observer.Observer;

public interface Observable {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
