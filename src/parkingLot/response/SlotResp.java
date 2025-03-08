package parkingLot.response;

import parkingLot.Slot;

public class SlotResp {
    private int floorNumber;
    private Slot slot;

    public SlotResp(int floorNumber, Slot slot) {
        this.floorNumber = floorNumber;
        this.slot = slot;
    }

    public Slot getSlot() {
        return slot;
    }

    public int getFloorNumber() {
        return floorNumber;
    }
}
