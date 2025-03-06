package designpatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Civic", "White");
        Car clonedCar = (Car) car.clone();
        clonedCar.show();
        car.show();
        car.addColor("Black");
        System.out.println("\n After adding color");
        clonedCar.show();
        car.show();


        Bike bike = new Bike("Honda", "Red");
        Bike clonedBike = bike.clone();
        bike.show();
        clonedBike.show();
        bike.addColor("Blue");
        System.out.println("\n After adding color");
        bike.show();
        clonedBike.show();
    }
}
