package atm.states;

import atm.ATM;
import atm.Card;

public class CheckBalanceState extends ATMState {
    public CheckBalanceState() {
    }
    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Account Balance: " + card.getBalance());
        exit(atm);
    }
}
