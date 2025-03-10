package atm.states;

import atm.ATM;

public class IdleState extends ATMState {

    public IdleState() {
        System.out.println("Currently ATM is in IdleState");
    }

    @Override
    public void insertCard(ATM atm) {
        atm.setAtmState(new HasCardState());
    }
}
