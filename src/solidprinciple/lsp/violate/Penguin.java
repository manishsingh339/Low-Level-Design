package solidprinciple.lsp.violate;

class Bird {
    void fly() { System.out.println("Flying..."); }
}
@SuppressWarnings("unused")
public class Penguin extends Bird {
    void fly() { throw new UnsupportedOperationException("Penguins can't fly!"); }
}
