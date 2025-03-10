package atm;

import atm.enums.TransactionType;

public class Main {
    static Account account;
    static Card card;

    public static void main(String[] args) {
        ATM atm = ATM.getInstance();

        // check account balance
       /* initializeATM(atm);
        atm.insertCard(card);
        atm.authenticatePin(card, 1122);
        atm.selectOption(card, TransactionType.BALANCE_CHECK);*/

        // withdraw cash
        initializeATM(atm);
        atm.insertCard(card);
        atm.authenticatePin(card, 1122);
        atm.selectOption(card, TransactionType.CASH_WITHDRAWAL);
        atm.requestCash(card, 5000);
        System.out.println("Account Balance "+card.getBalance());

        atm.printCurrentATMStatus();
    }

    private static void initializeATM(ATM atm) {
        atm.setAtmBalance(8000, 10, 10, 10);
        atm.printCurrentATMStatus();
        account = new Account(10000);
        card = new Card("1234", account);
        card.SetAccount(account);
        User user = new User(card, account, "Rahul");
    }
}
