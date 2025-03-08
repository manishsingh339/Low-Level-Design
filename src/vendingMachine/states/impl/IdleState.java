package vendingMachine.states.impl;

import vendingMachine.VendingMachine;
import vendingMachine.enums.Coin;
import vendingMachine.products.Item;

public class IdleState implements State {
    public IdleState(){
        System.out.println("Currently Vending machine is in IdleState");
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception {
        vendingMachine.setVendingMachineState(new HasMoneyState(vendingMachine));
    }

    @Override
    public void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception {
        throw new UnsupportedOperationException("Can not insert coin in IdleState");
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception {
        throw new UnsupportedOperationException("Can not select product in IdleState");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, int code) throws Exception {
        throw new UnsupportedOperationException("Can not select product in IdleState");
    }

    @Override
    public void clickOnDispenseProductButton(VendingMachine vendingMachine) throws Exception {
        throw new UnsupportedOperationException("Can not dispense product in IdleState");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine, Item item) throws Exception {
        throw new UnsupportedOperationException("Can not dispense product in IdleState");
    }

    @Override
    public void returnCoin(VendingMachine vendingMachine, int amount) throws Exception {
        throw new UnsupportedOperationException("Can not return coin in IdleState");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        machine.addItem(item, codeNumber);
    }
}
