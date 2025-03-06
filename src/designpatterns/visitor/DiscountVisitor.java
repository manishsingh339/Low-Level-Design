package designpatterns.visitor;

public class DiscountVisitor implements Visitor {
    @Override
    public void visit(Book book) {
        System.out.println("Applying 10% discount on book: " + book.getTitle());
        System.out.println("Final Price: " + (book.getPrice() * 0.9));
    }

    @Override
    public void visit(Electronics electronics) {
        System.out.println("Applying 5% discount on electronics: " + electronics.getName());
        System.out.println("Final Price: " + (electronics.getPrice() * 0.8));
    }
}
