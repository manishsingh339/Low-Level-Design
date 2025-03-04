package designpatterns.adapter;

public class Main {
    public static void main(String[] args) {
        EuropeanSocket powerAdapter = new PowerAdapter(new AmericanPlug());
        powerAdapter.providePower();
    }
}
