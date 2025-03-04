package designpatterns.singleton;

public class LazyInitialization {
    private static LazyInitialization instance; // No instance created initially

    private LazyInitialization() {} // Private constructor

    public static LazyInitialization getInstance() {
        if (instance == null) { // Creates instance only when needed
            instance = new LazyInitialization();
        }
        return instance;
    }
}

