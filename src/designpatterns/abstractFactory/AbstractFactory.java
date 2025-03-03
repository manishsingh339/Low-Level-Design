package designpatterns.abstractFactory;

public class AbstractFactory {
    GUIFactory factory;

    public GUIFactory  getFactory(String osType) {
        if(osType.equals("Windows")) {
            factory = new WindowsFactory();
        } else if (osType.equals("Linux")) {
            factory = new LinuxFactory();
        } else if(osType.equals("Mac")) {
            factory = new MacFactory();
        } else {
            throw new IllegalArgumentException("Unknown OS type");
        }
        return factory;
    }
}
