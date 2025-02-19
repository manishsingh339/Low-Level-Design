package oops.abstraction;

abstract class Vehicle {
    abstract void start();  // Abstract method (no body)

    void fuelType() {  // Concrete method
        System.out.println("Uses fuel");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car starts with a key");
    }
}

public class AbstractUsingClass {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.fuelType();
    }
}
