package designpatterns.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        caretaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #2");
        caretaker.addMemento(originator.saveStateToMemento());
        originator.setState("State #3");

        originator.getStateFromMemento(caretaker.getMemento(0));
        originator.getStateFromMemento(caretaker.getMemento(1));
    }
}
