package parkingLot;

import parkingLot.enums.VehicleType;

public class Slot {
    private int number;
    private VehicleType type;
    private boolean available;
    private String registrationNumber;
    private Long entryTime;

    public Slot(int number, VehicleType type) {
        this.number = number;
        this.type = type;
        this.available = true;
        this.registrationNumber = null;
        this.entryTime = null;
    }

    public void park(String registrationNumber) {
        if(this.available) {
            this.available = false;
            this.registrationNumber = registrationNumber;
            this.entryTime = System.currentTimeMillis();
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void leave() {
        this.available = true;
        this.registrationNumber = null;
        this.entryTime = null;
    }

    public int getNumber() {
        return number;
    }

    public VehicleType getType() {
        return type;
    }

    public boolean isAvailable() {
        return available;
    }
    public Long getEntryTime() {
        return entryTime;
    }
}
