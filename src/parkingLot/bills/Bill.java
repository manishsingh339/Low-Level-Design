package parkingLot.bills;

import parkingLot.enums.VehicleType;

public class Bill {
    private static final int MILL_PER_HOUR = 1000 * 60 * 60;
    private static final int CAR_RATE = 10;
    private static final int BIKE_RATE = 5;
    private static final int TRUCK_RATE = 15;

    public static int calculateBill(long durationMillis, VehicleType vehicleType) {
        int duration = (int) durationMillis / MILL_PER_HOUR;
        int billAmount = 0;
        switch (vehicleType) {
            case CAR -> {
                billAmount = CAR_RATE * duration;
            }
            case BIKE -> {
                billAmount = BIKE_RATE * duration;
            }
            case TRUCK -> {
                billAmount = TRUCK_RATE * duration;
            }
        }
        return billAmount;
    }
}
