package atm;

import atm.enums.TransactionType;
import atm.states.ATMState;
import atm.states.IdleState;

public class ATM {
    private static ATM atm = new ATM(); // eager singleton
    private ATMState atmState;
    private int atmBalance;
    private int noOfTwoHundredNotes;
    private int noOfFiveHundredNotes;
    private int noOfOneHundredNotes;

    public static ATM getInstance() {
        atm.setAtmState(new IdleState());
        return atm;
    }

    public void setAtmState(ATMState atmState) {
        this.atmState = atmState;
    }

    public void setAtmBalance(int atmBalance, int noOfTwoHundredNotes, int noOfFiveHundredNotes, int noOfOneHundredNotes) {
        this.atmBalance = atmBalance;
        this.noOfTwoHundredNotes = noOfTwoHundredNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public int getNoOfTwoHundredNotes() {
        return noOfTwoHundredNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public void insertCard(Card card) {
        //System.out.println(this.atmState.getClass().getSimpleName());
        atmState.insertCard(this);
    }

    public void authenticatePin(Card card, int pinEntered) {
        atmState.authenticatePin(this, card, pinEntered);
    }

    public void selectOption(Card card, TransactionType transactionType) {
        atmState.selectOption(this, card, transactionType);
    }

    public void requestCash(Card card, int amount) {
        atmState.requestCash(this, card, amount);
    }

    public void deductATMBalance(int amount) {
        atmBalance -= amount;
    }

    public void deductTwoHundredNotes(int number) {
        noOfTwoHundredNotes = noOfTwoHundredNotes - number;
    }

    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public int getBalance() {
        return atmBalance;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("200 Notes: " + noOfTwoHundredNotes);
        System.out.println("500 Notes: " + noOfFiveHundredNotes);
        System.out.println("100 Notes: " + noOfOneHundredNotes);
    }

    public void displayBalance(ATM atm, Card card) {
        atmState.displayBalance(atm, card);
    }
}
