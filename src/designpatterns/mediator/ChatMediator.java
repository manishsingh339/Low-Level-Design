package designpatterns.mediator;

public interface ChatMediator {
    void send(String message, User user);
    void addUser(User user);
}
