package parkingLot.vehicle;

import parkingLot.enums.VehicleType;

public class Truck extends Vehicle {
    public Truck(String registrationNumber) {
        super(registrationNumber, VehicleType.TRUCK);
    }
}
