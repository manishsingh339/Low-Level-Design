package atm.states;

import atm.ATM;
import atm.Card;
import atm.cashProcessor.CashWithdrawProcessor;
import atm.cashProcessor.FiveHundredWithdrawProcessor;
import atm.cashProcessor.OnHundredWithdrawProcessor;
import atm.cashProcessor.TwoHundredWithdrawProcessor;

public class CashWithdrawalState extends  ATMState{
    public CashWithdrawalState() {
        System.out.println("Enter Amount");
    }

    @Override
    public void requestCash(ATM atm, Card card, int amount) {
        if(atm.getBalance() < amount) {
            System.out.println("Insufficient Balance");
            exit(atm);
        } else if(card.getBalance() < amount) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atm);
        } else {
            card.dispenseCash(amount);
            atm.deductATMBalance(amount);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new FiveHundredWithdrawProcessor(new TwoHundredWithdrawProcessor(new OnHundredWithdrawProcessor(null)));
            withdrawProcessor.withdraw(atm, amount);
            exit(atm);
        }
    }
}
