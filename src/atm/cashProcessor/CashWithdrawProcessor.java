package atm.cashProcessor;

import atm.ATM;

public abstract class CashWithdrawProcessor {
    CashWithdrawProcessor nextCashWithdrawalProcessor;

    public CashWithdrawProcessor(CashWithdrawProcessor nextCashWithdrawalProcessor) {
        this.nextCashWithdrawalProcessor = nextCashWithdrawalProcessor;
    }

    public void withdraw(ATM atm, int remainingAmount) {
        if (nextCashWithdrawalProcessor != null) {
            nextCashWithdrawalProcessor.withdraw(atm, remainingAmount);
        }
    }
}
