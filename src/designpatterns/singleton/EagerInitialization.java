package designpatterns.singleton;
// Eager initialization - This is thread-safe but not efficient
public class EagerInitialization {
    private static final EagerInitialization INSTANCE = new EagerInitialization(); // Eagerly created

    private EagerInitialization() {} // Private constructor prevents instantiation

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}

