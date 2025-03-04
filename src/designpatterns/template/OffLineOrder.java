package designpatterns.template;

public class OffLineOrder extends OrderProcessTemplate {
    @Override
    public void makePayment() {
        System.out.println("Making offline payment...");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering offline...");
    }
}
