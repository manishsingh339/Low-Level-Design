package solidprinciple.ocp.follow;

interface Discount {
    double getDiscount();
}

class GoldDiscount implements Discount {
    public double getDiscount() { return 0.2; }
}

class SilverDiscount implements Discount {
    public double getDiscount() { return 0.1; }
}

public class Invoice {
    double calculateDiscount(Discount discount) {
        return discount.getDiscount();
    }
}
