package designpatterns.nullObject;

public class NullCustomer extends Customer {
    @Override
    public String getName() {
        return "Not available";
    }

    @Override
    public boolean isNull() {
        return true;
    }
}
