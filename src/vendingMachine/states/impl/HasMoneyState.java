package vendingMachine.states.impl;

import vendingMachine.VendingMachine;
import vendingMachine.enums.Coin;
import vendingMachine.products.Item;

import java.util.ArrayList;

public class HasMoneyState implements State {

    public HasMoneyState(VendingMachine machine){
        System.out.println("Currently Vending machine is in HasMoneyState");
        machine.setCoinList(new ArrayList<>());
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) throws Exception {
        machine.insertCoin(coin);
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) throws Exception {
        machine.setVendingMachineState(new ProductSelectState(machine));
    }

    @Override
    public void selectProduct(VendingMachine machine, int code) throws Exception {
        throw new UnsupportedOperationException("Can not select product in HasMoneyState");
    }

    @Override
    public void clickOnDispenseProductButton(VendingMachine machine) {
       throw new UnsupportedOperationException("Can not dispense product in HasMoneyState");
    }

    @Override
    public void dispenseProduct(VendingMachine machine, Item item) {
        throw new UnsupportedOperationException("Can not dispense product in HasMoneyState");
    }

    @Override
    public void returnCoin(VendingMachine machine, int amount) {
        throw new UnsupportedOperationException("Can not return coin in HasMoneyState");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) {
        throw new UnsupportedOperationException("Can not update inventory in HasMoneyState");
    }
}
