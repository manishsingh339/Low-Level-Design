package vendingMachine.states.impl;

import vendingMachine.VendingMachine;
import vendingMachine.enums.Coin;
import vendingMachine.products.Item;

public interface State {
    /**
     * Handles the event when the insert coin button is clicked on the vending machine.
     * This method may change the state of the vending machine depending on the current state.
     *
     * @param vendingMachine the vending machine on which the button is clicked
     * @throws Exception if the operation cannot be performed in the current state
     */
    void clickOnInsertCoinButton(VendingMachine vendingMachine) throws Exception;

    /**
     * Handles the event when a coin is inserted into the vending machine.
     * This method may change the state of the vending machine depending on the current state.
     *
     * @param vendingMachine the vending machine into which the coin is inserted
     * @param coin the coin that is inserted
     * @throws Exception if the operation cannot be performed in the current state
     */
    void insertCoin(VendingMachine vendingMachine, Coin coin) throws Exception;

    /**
     * Handles the event when the select product button is clicked on the vending machine.
     * This method may change the state of the vending machine depending on the current state.
     *
     * @param vendingMachine the vending machine on which the button is clicked
     * @throws Exception if the operation cannot be performed in the current state
     */
    void clickOnSelectProductButton(VendingMachine vendingMachine) throws Exception;

    /**
     * Handles the event when a product is selected from the vending machine.
     * This method may change the state of the vending machine depending on the current state.
     *
     * @param vendingMachine the vending machine on which the product is selected
     * @param code the identifier of the product that is selected
     * @throws Exception if the operation cannot be performed in the current state
     */
    void selectProduct(VendingMachine vendingMachine, int code) throws Exception;

    /**
     * Handles the event when the dispense product button is clicked on the vending machine.
     * This method may change the state of the vending machine depending on the current state.
     *
     * @param vendingMachine the vending machine on which the button is clicked
     * @throws Exception if the operation cannot be performed in the current state
     */
    void clickOnDispenseProductButton(VendingMachine vendingMachine) throws Exception;

    /**
     * Handles the event when the dispense product operation is performed on the vending machine.
     * This method may change the state of the vending machine depending on the current state.
     *
     * @param vendingMachine the vending machine on which the product is dispensed
     * @param item the item that is dispensed
     * @throws Exception if the operation cannot be performed in the current state
     */
    void dispenseProduct(VendingMachine vendingMachine, Item item) throws Exception;

    /**
     * Handles the event when the return coin button is clicked on the vending machine.
     * This method returns the amount of money that is currently in the vending machine.
     * This method may change the state of the vending machine depending on the current state.
     *
     * @param vendingMachine the vending machine on which the button is clicked
     * @param amount the amount of money that is currently in the vending machine
     * @throws Exception if the operation cannot be performed in the current state
     */
    void returnCoin(VendingMachine vendingMachine, int amount) throws Exception;

    /**
     * Handles the event when an item is added to the inventory of the vending machine.
     * This method may change the state of the vending machine depending on the current state.
     *
     * @param machine the vending machine on which the item is added
     * @param item the item that is added
     * @param codeNumber the identifier of the slot on which the item is added
     * @throws Exception if the operation cannot be performed in the current state
     */
    void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception;
}
