package oops.abstraction;

interface Animal {
    void makeSound(); // Abstract method (by default)
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat meows");
    }
}

public class AbstractUsingInterface {
    public static void main(String[] args) {
        Animal myCat = new Cat();
        myCat.makeSound();
    }
}

