package vendingMachine.products;

import vendingMachine.enums.ItemType;

import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<ItemShelf> inventory;

    public Inventory(int itemCount) {
        inventory = new ArrayList<>();
        initializeEmptyInventory(itemCount);
    }

    public List<ItemShelf> getInventory() {
        return inventory;
    }

    private void initializeEmptyInventory(int itemCount) {
        int startCode = 101;
        for (int i = 0; i < ItemType.values().length; i++) {
            inventory.add(new ItemShelf(false, startCode++, ItemType.values()[i]));
        }
    }

    public void addItem(Item item, int codeNumber) {
        ItemShelf itemShelf = inventory.stream()
                .filter(shelf -> shelf.getCode() == codeNumber)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Item Shelf not found"));
        if(itemShelf.getItems().size() >= itemShelf.getMaxCapacity()) {
            throw new RuntimeException("Item Shelf is full");
        }
        itemShelf.setItem(item);
        itemShelf.setAvailable(true);
    }

    public Item getItem(int codeNumber) {
        ItemShelf itemShelf = inventory.stream()
                .filter(shelf -> shelf.getCode() == codeNumber && shelf.getItems().size() > 0)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Item Shelf not found"));
        return itemShelf.getItems().get(0);
    }

    public void updateItemOnSold(int codeNumber) {
        ItemShelf itemShelf = inventory.stream()
                .filter(shelf -> shelf.getCode() == codeNumber)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Item Shelf not found"));
        itemShelf.getItems().remove(0);
        if(itemShelf.getItems().size() == 0) {
            itemShelf.setAvailable(false);
        }
    }
}
