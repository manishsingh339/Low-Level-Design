package vendingMachine.states.impl;

import vendingMachine.VendingMachine;
import vendingMachine.enums.Coin;
import vendingMachine.products.Item;

public class DispenseState implements State{
    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) {
        return;
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int code) {
        return;
    }

    @Override
    public void clickOnDispenseProductButton(VendingMachine vendingMachine) {
        return;
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, Item item) {
        int amountInserted = vendingMachine.getCoinList().stream().mapToInt(Coin::getValue).sum();
        if(amountInserted < item.getPrice()) {
            System.out.println("Insufficient amount inserted");
            return;
        }
        vendingMachine.releaseProduct(vendingMachine.getCode());
        returnCoin(vendingMachine, amountInserted - item.getPrice());
    }

    @Override
    public void returnCoin(VendingMachine vendingMachine, int amount) {
        if(amount > 0) {
            System.out.println("Returned the change in the Coin Dispense Tray: " + amount);
        }
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) {
        throw new UnsupportedOperationException("Can not update inventory in DispenseState");
    }
}
