package vendingMachine.products;

public class Item {
    private int price;
    private String name;

    public Item(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
