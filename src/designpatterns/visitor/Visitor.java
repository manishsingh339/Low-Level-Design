package designpatterns.visitor;

public interface Visitor {
    void visit(Book book);
    void visit(Electronics electronics);
}
