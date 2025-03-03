package designpatterns.strategyDesignPattern.strategy;

public class CardPaymentStrategy implements PaymentStrategy{
    private String cardNumber;

    public CardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    /**
     * Processes a payment using a card.
     *
     * @param amount the amount to be paid
     */
    @Override
    public void pay(int amount) {
        System.out.println("Paying " + amount + " using Card");
    }
}
