package designpatterns.nullObject;

import java.util.List;

public class CustomerFactory {
    private static List<String> names = List.of("John", "Jane");

    public static Customer getCustomer(String name) {
        if (names.contains(name)) {
            return new RealCustomer(name);
        }
        return new NullCustomer();
    }
}
