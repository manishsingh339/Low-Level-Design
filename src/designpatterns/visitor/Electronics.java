package designpatterns.visitor;

public class Electronics implements Visitable {
    private String name;
    private float price;

    public Electronics(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
