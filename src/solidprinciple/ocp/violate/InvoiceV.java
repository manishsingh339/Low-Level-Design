package solidprinciple.ocp.violate;

public class InvoiceV {
    double calculateDiscount(String type) {
        if (type.equals("GOLD")) return 0.2;
        if (type.equals("SILVER")) return 0.1;
        return 0.05;
    }
}

