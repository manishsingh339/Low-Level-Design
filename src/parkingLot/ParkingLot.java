package parkingLot;

import parkingLot.response.SlotResp;
import parkingLot.vehicle.Vehicle;
import parkingLot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<Floor> floors;

    private ParkingLot() {
        floors = new ArrayList<>();
    }

    private static class SingletonHolder {
        private static final ParkingLot INSTANCE = new ParkingLot();
    }

    public SlotResp getSlotByRegistrationNumber(String registrationNumber) {
        Slot slot = null;
        Floor floor = null;
        for (Floor floor1 : floors) {
            for (Slot s : floor1.getSlots()) {
                if (s.getRegistrationNumber().equals(registrationNumber)) {
                    slot = s;
                    floor = floor1;
                    break;
                }
            }
        }
        return new SlotResp(floor.getNumber(), slot);
    }

    /**
     * Retrieves the single instance of the ParkingLot class.
     *
     * @return the single instance of ParkingLot
     */
    public static ParkingLot getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /**
     * Adds a floor to the parking lot.
     *
     * @param floor the floor to add
     */
    public void addFloor(Floor floor) {
        floors.add(floor);
    }

    public void removeFloor(int floorNumber) {
        floors.removeIf(floor -> floor.getNumber() == floorNumber);
    }

    public void assignSlot(Vehicle vehicle) {
        Slot assignSlot = null;
        Floor assignFloor = null;
        for (Floor floor : floors) {
            if (floor.getCapacity().keySet().contains(vehicle.getType()) && floor.getCapacity().get(vehicle.getType()) > 0) {
                for (Slot slot : floor.getSlots()) {
                    if (slot.getType() == vehicle.getType() && slot.isAvailable()) {
                        assignSlot = slot;
                        assignFloor = floor;
                    }
                }
            }
        }

        if (assignSlot != null) {
            assignFloor.bookSlot(assignSlot.getType(), assignSlot.getNumber(), vehicle.getRegistrationNumber());
        } else {
            System.out.println("No available slot found for vehicle type: " + vehicle.getType());
        }
    }

    public void leaveSlot(Slot slot, int floorNumber) {
        floors.stream()
                .filter(floor -> floor.getNumber() == floorNumber)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Floor not found"))
                .releaseSlot(slot.getType(), slot.getNumber());
    }

    /**
     * Adds a slot to a specified floor in the parking lot.
     * The slot is added to the floor identified by the given floor number.
     *
     * @param slot the slot to add
     * @param floorNumber the number of the floor where the slot should be added
     * @throws RuntimeException if the floor with the specified number is not found
     */
    public void addSlot(Slot slot, int floorNumber) {
        floors.stream()
                .filter(floor -> floor.getNumber() == floorNumber)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Floor not found"))
                .addSlot(slot);
    }

    /**
     * Removes a slot from a specified floor in the parking lot.
     * The slot is identified by its number and type and is removed from the floor identified by the given floor number.
     *
     * @param slotNumber the number of the slot to remove
     * @param floorNumber the number of the floor where the slot should be removed
     * @param vehicleType the type of the slot to remove
     * @throws RuntimeException if the floor with the specified number is not found
     */
    public void removeSlot(int slotNumber, int floorNumber, VehicleType vehicleType) {
        floors.stream()
                .filter(floor -> floor.getNumber() == floorNumber)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Floor not found"))
                .removeSlot(slotNumber, vehicleType);
    }
}
