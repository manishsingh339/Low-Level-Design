package designpatterns.factory;

public interface Vehicle {
    void drive();
}

class Car implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Car drives");
    }
}

class Bike implements Vehicle {
    @Override
    public void drive() {
        System.out.println("Bike drives");
    }
}
