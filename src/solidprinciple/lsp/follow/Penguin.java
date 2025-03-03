package solidprinciple.lsp.follow;

interface Bird {
    void eat();
}

interface FlyingBird extends Bird {
    void fly();
}

class Sparrow implements FlyingBird {
    public void fly() { System.out.println("Flying..."); }
    public void eat() { System.out.println("Eating..."); }
}

class Penguin implements Bird {
    public void eat() { System.out.println("Eating..."); }
}