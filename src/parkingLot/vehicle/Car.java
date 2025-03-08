package parkingLot.vehicle;

import parkingLot.enums.VehicleType;

public class Car extends Vehicle {

    public Car(String registrationNumber) {
        super(registrationNumber, VehicleType.CAR);
    }
}
