package designpatterns.singleton;

public class DoubleCheckedLocking {
    private static volatile DoubleCheckedLocking instance; // Volatile keyword prevents memory inconsistency

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if (instance == null) { // First check (no locking)
            synchronized (DoubleCheckedLocking.class) { // Locking to prevent race condition
                if (instance == null) { // Second check (thread-safe)
                    instance = new DoubleCheckedLocking();
                }
            }
        }
        return instance;
    }
}

