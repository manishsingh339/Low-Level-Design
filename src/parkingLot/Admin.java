package parkingLot;

import parkingLot.enums.VehicleType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Admin {
    public Floor addFloor(int floorNumber, Map<VehicleType, Integer> capacity) {
        Floor floor = new Floor(1, capacity);
        ParkingLot.getInstance().addFloor(floor);
        addSlotsToFloor(floor);
        return floor;
    }

    private void addSlotsToFloor(Floor floor) {
        List<Slot> slots = floor.getSlots();
        Set<VehicleType> keys = floor.getCapacity().keySet();
        while (keys.iterator().hasNext()) {
            VehicleType vehicleType = keys.iterator().next();
            for (int i = 1; i <= floor.getCapacity().get(vehicleType); i++) {
                slots.add(new Slot(i, vehicleType));
            }
        }
    }

    private void removeFloor(int floorNumber) {
        ParkingLot.getInstance().removeFloor(floorNumber);
    }
}
