package designpatterns.template;

public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate onlineOrder = new OnlineOrder();
        onlineOrder.processOrder();
        System.out.println();
        OrderProcessTemplate offLineOrder = new OffLineOrder();
        offLineOrder.processOrder();
    }
}
