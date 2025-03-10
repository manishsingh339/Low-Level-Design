package atm.cashProcessor;

import atm.ATM;

public class TwoHundredWithdrawProcessor extends CashWithdrawProcessor {

    public TwoHundredWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawProcessor) {
        super(nextCashWithdrawProcessor);
    }

    public void withdraw(ATM atm, int remainingAmount) {
        int required =  remainingAmount/200;
        int balance = remainingAmount%200;

        if(required <= atm.getNoOfTwoHundredNotes()) {
            atm.deductTwoHundredNotes(required);
        } else if(required > atm.getNoOfTwoHundredNotes()) {
            atm.deductATMBalance(atm.getNoOfTwoHundredNotes());
            balance = balance + (required-atm.getNoOfTwoHundredNotes()) * 200;
        }

        if(balance != 0){
            super.withdraw(atm, balance);
        }
    }
}
