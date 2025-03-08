package vendingMachine;

import vendingMachine.enums.Coin;
import vendingMachine.products.Inventory;
import vendingMachine.products.Item;
import vendingMachine.products.ItemShelf;
import vendingMachine.states.impl.IdleState;
import vendingMachine.states.impl.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private State vendingMachineState;
    private Inventory inventory;
    private List<Coin> coinList;
    private int code;

    public VendingMachine() {
        vendingMachineState = new IdleState();
        inventory = new Inventory(4);
        coinList = new ArrayList();
        code = 0;
    }

    public State getVendingMachineState() {
        return vendingMachineState;
    }

    public void insertCoin(Coin coin) {
        coinList.add(coin);
    }

    public void addItem(Item item, int code) {
        inventory.addItem(item, code);
    }

    public void setVendingMachineState(State vendingMachineState) {
        this.vendingMachineState = vendingMachineState;
    }

    public void setCoinList(List<Coin> coinList) {
        this.coinList = coinList;
    }

    public List<Coin> getCoinList() {
        return coinList;
    }

    public void dispenseProduct() throws Exception {
        Item item = inventory.getItem(code);
        vendingMachineState.dispenseProduct(this, item);
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public Item getProduct(int code) {
        return inventory.getItem(code);
    }

    public void releaseProduct(int code) {
        inventory.updateItemOnSold(code);
    }

    public List<ItemShelf> getInventory() {
        return inventory.getInventory();
    }
}
