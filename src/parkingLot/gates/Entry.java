package parkingLot.gates;

import parkingLot.ParkingLot;
import parkingLot.vehicle.Vehicle;

public class Entry {

    public void assignSlot(Vehicle vehicle) {
       ParkingLot.getInstance().assignSlot(vehicle);
    }
}
