package designpatterns.visitor;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Java", 100);
        Electronics electronics = new Electronics("Laptop", 500);
        Visitor discountVisitor = new DiscountVisitor();
        book.accept(discountVisitor);
        electronics.accept(discountVisitor);
    }
}
