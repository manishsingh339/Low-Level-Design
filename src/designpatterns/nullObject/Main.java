package designpatterns.nullObject;

public class Main {
    public static void main(String[] args) {
        System.out.println(CustomerFactory.getCustomer("John").getName());
        System.out.println(CustomerFactory.getCustomer("Jane").getName());
        System.out.println(CustomerFactory.getCustomer("Jane1").getName());
    }
}
