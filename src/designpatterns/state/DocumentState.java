package designpatterns.state;

public interface DocumentState {
    void edit(Document document);
    void publish(Document document);
}
