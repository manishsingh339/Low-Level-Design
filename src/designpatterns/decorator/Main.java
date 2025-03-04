package designpatterns.decorator;

public class Main {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription()+" "+coffee.getCost());

        coffee = new SugarDecorator(coffee);
        System.out.println("\n"+coffee.getDescription()+" "+coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println("\n"+coffee.getDescription()+" "+coffee.getCost());

        coffee = new ChocolateDecorator(coffee);
        System.out.println("\n"+coffee.getDescription()+" "+coffee.getCost());
    }
}
