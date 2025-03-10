package atm.states;

import atm.ATM;
import atm.Card;
import atm.enums.TransactionType;

public abstract class ATMState {
    public void insertCard(ATM atm) {
        throw new RuntimeException("OOP! Something went wrong!");
    }

    public void authenticatePin(ATM atm, Card card, int pinEntered)  {
        throw new RuntimeException("OOP! Something went wrong!");
    }
    public void selectOption(ATM atm, Card card, TransactionType transactionType) {
        throw new RuntimeException("OOP! Something went wrong!");
    }
    public void requestCash(ATM atm, Card card, int amount) {
        throw new RuntimeException("OOP! Something went wrong!");
    }
    public void displayBalance(ATM atm, Card card) {
        throw new RuntimeException("OOP! Something went wrong!");
    }
    public void dispenseCash() {
        throw new RuntimeException("OOP! Something went wrong!");
    }

    public void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleState());
        System.out.println("Exit happens \n");
    }

    public void returnCard() {
        System.out.println("\nPlease collect your card");
    }
}
