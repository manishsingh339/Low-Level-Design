package designpatterns.singleton;

public class Synchronized {
    private static Synchronized instance;

    private Synchronized() {}

    public static synchronized Synchronized getInstance() { // Synchronized method
        if (instance == null) {
            instance = new Synchronized();
        }
        return instance;
    }
}

