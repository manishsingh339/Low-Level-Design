package designpatterns.template;

public class OnlineOrder extends OrderProcessTemplate {
    @Override
    public void makePayment() {
        System.out.println("Making online payment...");
    }

    @Override
    public void deliver() {
        System.out.println("Delivering online...");
    }
}
