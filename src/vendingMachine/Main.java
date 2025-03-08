package vendingMachine;

import vendingMachine.enums.Coin;
import vendingMachine.products.Item;
import vendingMachine.products.ItemShelf;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        List<ItemShelf> inventories = vendingMachine.getInventory();

        for (ItemShelf itemShelf : inventories) {
            int maxCapacity = 3;
            itemShelf.setMaxCapacity(maxCapacity);
            int price = 0;
            switch (itemShelf.getType()) {
                case COKE:
                    price = 1;
                    break;
                case PEPSI:
                    price = 2;
                    break;
                case CHIPS:
                    price = 3;
                    break;
                case SODA:
                    price = 4;
                    break;
            }
            for (int i = 0; i < maxCapacity; i++) {
                vendingMachine.addItem(new Item(price), itemShelf.getCode());
            }
        }
        displayInventory(vendingMachine);
        System.out.println("******************************************************************");
        try {
            vendingMachine.getVendingMachineState().clickOnInsertCoinButton(vendingMachine);
            vendingMachine.getVendingMachineState().insertCoin(vendingMachine, Coin.DIME);
            vendingMachine.getVendingMachineState().clickOnSelectProductButton(vendingMachine);
            vendingMachine.getVendingMachineState().selectProduct(vendingMachine, 101);
            vendingMachine.getVendingMachineState().clickOnDispenseProductButton(vendingMachine);
            vendingMachine.getVendingMachineState().dispenseProduct(vendingMachine, vendingMachine.getProduct(101));
            displayInventory(vendingMachine);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    private static void displayInventory(VendingMachine vendingMachine){

        List<ItemShelf> slots = vendingMachine.getInventory();
        for (int i = 0; i < slots.size(); i++) {
            System.out.println("CodeNumber: " + slots.get(i).getCode() +
                    " Type: " + slots.get(i).getType() +
                    " isAvailable: " + slots.get(i).getItems().size());
        }
    }
}
