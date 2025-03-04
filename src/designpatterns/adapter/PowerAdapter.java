package designpatterns.adapter;

public class PowerAdapter implements EuropeanSocket {
    private AmericanPlug americanPlug;

    public PowerAdapter(AmericanPlug americanPlug) {
        this.americanPlug = americanPlug;
    }

    @Override
    public void providePower() {
        System.out.println("Adapter converting 220V to 110V...");
        americanPlug.plugIn(); // Using the American plug
    }
}
