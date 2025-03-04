package designpatterns.template;

public abstract class OrderProcessTemplate {

    public final void processOrder() {
        selectItem();
        makePayment();
        deliver();
    }

    void selectItem() {
        System.out.println("Selecting item...");
    }

    public abstract void makePayment();

    public abstract void deliver();

}
