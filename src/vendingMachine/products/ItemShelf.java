package vendingMachine.products;

import vendingMachine.enums.ItemType;

import java.util.ArrayList;
import java.util.List;

public class ItemShelf {
    private List<Item> items;
    private boolean available;
    private int maxCapacity;
    private ItemType type;
    private int code;

    public ItemShelf(boolean available, int code, ItemType type) {
        this.type = type;
        this.items = new ArrayList<>();
        this.available = available;
        this.maxCapacity = 0;
        this.code = code;
    }

    public ItemType getType() {
        return type;
    }

    public List<Item> getItems() {
        return items;
    }

    public int getCode() {
        return code;
    }

    public void setItem(Item item) {
        this.items.add(item);
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }
}
