package parkingLot;

import parkingLot.enums.VehicleType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Floor {
    private int number;
    private Map<VehicleType, Integer> capacity;
    private List<Slot> slots;

    public Floor(int number, Map<VehicleType, Integer> capacity) {
        this.number = number;
        this.capacity = capacity;
        this.slots = new ArrayList<>();
    }

    /**
     * Retrieves the floor number.
     *
     * @return the number of this floor
     */
    public int getNumber() {
        return number;
    }

    /**
     * Retrieves the available capacity for each vehicle type of the floor.
     *
     * @return a map where the keys are the vehicle types and the values are the
     *         available capacity for each type
     */
    public Map<VehicleType, Integer> getCapacity() {
        return capacity;
    }

    /**
     * Sets the available capacity for each vehicle type of the floor.
     *
     * @param capacity a map where the keys are the vehicle types and the values
     *                 are the available capacity for each type
     */
    public void setCapacity(Map<VehicleType, Integer> capacity) {
        this.capacity = capacity;
    }

    /**
     * Retrieves all slots of this floor.
     *
     * @return a list containing all slots of this floor
     */
    public List<Slot> getSlots() {
        return slots;
    }

    /**
     * Adds a slot to the floor.
     * The slot is added to the internal list of slots and the capacity of the floor is updated accordingly.
     * @param slot the slot to add
     */
    public void addSlot(Slot slot) {
        this.slots.add(slot);
    }

    /**
     * Finds all available slots of a given type on this floor.
     * @param vehicleType the type of the slots to look for
     * @return a list of all available slots of the given type
     */
    public List<Slot> hasAvailableSlot(VehicleType vehicleType) {
        int available = this.capacity.getOrDefault(vehicleType, 0);
        if(available == 0) {
            return List.of();
        }
        return slots.stream()
            .filter(slot -> slot.getType() == vehicleType && slot.isAvailable())
                .collect(Collectors.toList());
    }

    /**
     * Books a slot of a given type and number. If no slot of the given type is available, does nothing.
     * @param vehicleType the type of the slot to book
     * @param slotNumber the number of the slot to book
     * @param registrationNumber the registration number of the vehicle
     */
    public void bookSlot(VehicleType vehicleType, int slotNumber, String registrationNumber) {
        int available = this.capacity.getOrDefault(vehicleType, 0);
        if(available > 0) {
            slots.stream()
                    .filter(slot -> slot.getType() == vehicleType && slot.getNumber() == slotNumber && slot.isAvailable())
                    .findFirst()
                    .orElseThrow(() -> new RuntimeException("Available slot not found"))
                    .park(registrationNumber);
            this.capacity.put(vehicleType, available - 1);
        }
    }


    public void releaseSlot(VehicleType vehicleType, int slotNumber) {
        int available = this.capacity.getOrDefault(vehicleType, 0);
        slots.stream()
                .filter(slot -> slot.getNumber() == slotNumber)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Slot not found"))
                .leave();
        this.capacity.put(vehicleType, available + 1);
    }

    /**
     * Removes a slot from the floor.
     * The slot is identified by its number and type.
     * The capacity of the floor is updated accordingly.
     * @param slotNumber the number of the slot to remove
     * @param vehicleType the type of the slot to remove
     */
    public void removeSlot(int slotNumber, VehicleType vehicleType) {
        slots.removeIf(slot -> slot.getNumber() == slotNumber);
        capacity.put(vehicleType, capacity.get(vehicleType) -1);
    }

    /**
     * Gets a string representation of the floor.
     * The string representation includes the floor number and the available capacity of each vehicle type.
     * @return a string representation of the floor
     */
    public String getInfo() {
        String info = "";
        info += "Floor: " + number + "\n";
        for (Entry<VehicleType, Integer> entry : capacity.entrySet()) {
            info += entry.getKey() + " available capacity: " + entry.getValue() + "\n";
        }
        return info;
    }
}
