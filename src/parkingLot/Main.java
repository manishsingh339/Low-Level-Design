package parkingLot;

import parkingLot.enums.VehicleType;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ParkingLot lot = ParkingLot.getInstance();
        Admin admin = new Admin();
        admin.addFloor(1, Map.of(VehicleType.CAR, 10, VehicleType.BIKE, 5, VehicleType.TRUCK, 5));
        admin.addFloor(2, Map.of(VehicleType.CAR, 1, VehicleType.BIKE, 5, VehicleType.TRUCK, 5));
    }
}
