package vendingMachine.states.impl;

import vendingMachine.VendingMachine;
import vendingMachine.enums.Coin;
import vendingMachine.products.Item;

public class ProductSelectState implements State{

    public ProductSelectState(VendingMachine machine) {
        machine.setVendingMachineState(this);
        machine.setCode(0);
    }

    @Override
    public void clickOnInsertCoinButton(VendingMachine machine) {
        return;
    }

    @Override
    public void insertCoin(VendingMachine machine, Coin coin) {
        return;
    }

    @Override
    public void clickOnSelectProductButton(VendingMachine machine) {
        return;
    }

    @Override
    public void selectProduct(VendingMachine machine, int code) {
       Item item = machine.getProduct(code);
       if(item != null) {
          machine.setCode(code);
       }
    }

    @Override
    public void clickOnDispenseProductButton(VendingMachine machine) {
        machine.setVendingMachineState(new DispenseState());
    }

    @Override
    public void dispenseProduct(VendingMachine machine, Item item) {
        throw  new UnsupportedOperationException("Can not dispense product in ProductSelectState");
    }

    @Override
    public void returnCoin(VendingMachine machine, int amount) {
        throw  new UnsupportedOperationException("Can not return coin in ProductSelectState");
    }

    @Override
    public void updateInventory(VendingMachine machine, Item item, int codeNumber) {
        throw new UnsupportedOperationException("Can not update inventory in ProductSelectState");
    }
}
