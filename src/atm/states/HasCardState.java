package atm.states;

import atm.ATM;
import atm.Card;

public class HasCardState extends ATMState {
    public HasCardState() {
        System.out.println("\nCard is inserted");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pinEntered) {
        if (card.verifyPin(pinEntered)) {
            System.out.println("Pin is correct");
            atm.setAtmState(new SelectOptionState());
        } else {
            System.out.println("Pin is incorrect");
            exit(atm);
        }
    }
}
