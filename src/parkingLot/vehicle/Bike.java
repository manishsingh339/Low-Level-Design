package parkingLot.vehicle;

import parkingLot.enums.VehicleType;

public class Bike extends Vehicle {
    public Bike(String registrationNumber) {
        super(registrationNumber, VehicleType.BIKE);
    }
}
