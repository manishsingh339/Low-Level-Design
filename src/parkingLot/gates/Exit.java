package parkingLot.gates;

import parkingLot.ParkingLot;
import parkingLot.bills.Bill;
import parkingLot.payment.CardPayment;
import parkingLot.payment.PaymentContext;
import parkingLot.response.SlotResp;

public class Exit {
    public void leaveParking(String registrationNumber) {
        SlotResp slotResp = ParkingLot.getInstance().getSlotByRegistrationNumber(registrationNumber);

        int amount = Bill.calculateBill(System.currentTimeMillis() - slotResp.getSlot().getEntryTime(), slotResp.getSlot().getType());
        System.out.println("Amount to be paid: " + amount);
        PaymentContext paymentContext = new PaymentContext(new CardPayment("1234-5678-9012-3456"));
        paymentContext.pay(amount);
        ParkingLot.getInstance().leaveSlot(slotResp.getSlot(), slotResp.getFloorNumber());
    }
}
