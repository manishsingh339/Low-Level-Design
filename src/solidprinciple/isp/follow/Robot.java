package solidprinciple.isp.follow;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

class Human implements Workable, Eatable {
    public void work() { System.out.println("Working..."); }
    public void eat() { System.out.println("Eating..."); }
}

class Robot implements Workable {
    public void work() { System.out.println("Working..."); }
}

