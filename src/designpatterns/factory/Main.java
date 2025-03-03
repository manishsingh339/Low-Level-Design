package designpatterns.factory;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle car = vehicleFactory.getVehicle("car");
        car.drive();

        Vehicle bike = vehicleFactory.getVehicle("bike");
        bike.drive();
    }
}
