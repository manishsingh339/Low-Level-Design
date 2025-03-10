package atm.states;

import atm.ATM;
import atm.Card;

public class CheckBalanceState extends ATMState {
    public CheckBalanceState(ATM atm, Card card) {
        displayBalance(atm, card);
    }
    @Override
    public void displayBalance(ATM atm, Card card) {
        System.out.println("Balance: " + card.getBalance());
        exit(atm);
    }

}
