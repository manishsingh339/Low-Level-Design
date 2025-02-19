package oops.polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Parent reference, child object
        myDog.makeSound();  // Calls Dog's overridden method
    }
}
