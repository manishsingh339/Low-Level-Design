package solidprinciple.isp.violate;

interface Worker {
    void work();
    void eat();
}

class Robot implements Worker {
    public void work() { System.out.println("Working..."); }
    public void eat() { throw new UnsupportedOperationException("Robots don't eat!"); }
}

