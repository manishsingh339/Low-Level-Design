package atm.states;

import atm.ATM;
import atm.Card;
import atm.enums.TransactionType;

public class SelectOptionState extends ATMState {
    public SelectOptionState() {
        System.out.println("\nSelect option");
        showAllOptions();
    }

    @Override
    public void selectOption(ATM atm, Card card, TransactionType txnType) {
        switch (txnType) {
            case CASH_WITHDRAWAL:
                atm.setAtmState(new CashWithdrawalState());
                break;
            case BALANCE_CHECK:
                atm.setAtmState(new CheckBalanceState(atm, card));
                break;
            default:
                System.out.println("Invalid Option");
                exit(atm);
        }

    }

    private void showAllOptions() {
        System.out.println("Please select an option");
        TransactionType.showAllTransactionTypes();
    }

}
