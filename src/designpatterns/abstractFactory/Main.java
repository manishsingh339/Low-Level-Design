package designpatterns.abstractFactory;

public class Main {
    public static void main(String[] args) {
       GUIFactory factory = new AbstractFactory().getFactory("Windows");
       Button button = factory.createButton();
       button.render();
       CheckBox checkbox = factory.createCheckbox();
       checkbox.check();
       System.out.println();

       factory = new AbstractFactory().getFactory("Linux");
       button = factory.createButton();
       button.render();
       checkbox = factory.createCheckbox();
       checkbox.check();
        System.out.println();

       factory = new AbstractFactory().getFactory("Mac");
       button = factory.createButton();
       button.render();
       checkbox = factory.createCheckbox();
       checkbox.check();
    }
}
