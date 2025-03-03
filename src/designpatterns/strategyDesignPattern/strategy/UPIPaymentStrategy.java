package designpatterns.strategyDesignPattern.strategy;

public class UPIPaymentStrategy implements PaymentStrategy {
    private String vpa;

    public UPIPaymentStrategy(String vpa) {
        this.vpa = vpa;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using UPI");
    }
}
