package designpatterns.strategyDesignPattern;

import designpatterns.strategyDesignPattern.strategy.CardPaymentStrategy;
import designpatterns.strategyDesignPattern.strategy.NetBankingPaymentStrategy;
import designpatterns.strategyDesignPattern.strategy.UPIPaymentStrategy;

public class Main {
    /**
     * Demonstrates the Strategy Design Pattern by making payments
     * using different payment strategies: Card, Net Banking, and UPI.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
       PaymentContext paymentContext = new PaymentContext(new CardPaymentStrategy("1234-5678-9012-3456"));
       paymentContext.pay(100);

       paymentContext = new PaymentContext(new NetBankingPaymentStrategy("SBI"));
       paymentContext.pay(200);

       paymentContext = new PaymentContext(new UPIPaymentStrategy("user@upi"));
       paymentContext.pay(300);
    }
}
