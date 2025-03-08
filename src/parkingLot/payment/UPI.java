package parkingLot.payment;

public class UPI implements PaymentStrategy {
    private String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid $" + amount + " using UPI.");
    }
}
