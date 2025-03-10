package atm;

public class Card {
    private String cardNumber;
    private int cvv;
    private int expiryDate;
    private int holderName;
    static int PIN_NUMBER = 1122;
    private Account account;

    public Card(String cardNumber, Account account) {
        this.cardNumber = cardNumber;
        this.account = account;
    }

    public boolean verifyPin(int pin) {
        return pin == PIN_NUMBER;
    }

    public void SetAccount(Account account) {
        this.account = account;
    }

    public int getBalance() {
        return account.getBalance();
    }

    public void dispenseCash(int amount) {
        System.out.println("Dispensing " + amount);
        account.withdraw(amount);
    }
}
