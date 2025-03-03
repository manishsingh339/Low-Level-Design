package designpatterns.strategyDesignPattern.strategy;

public class NetBankingPaymentStrategy implements PaymentStrategy {
    private String bankName;

    public NetBankingPaymentStrategy(String bankName) {
        this.bankName = bankName;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Net Banking");
    }
}
