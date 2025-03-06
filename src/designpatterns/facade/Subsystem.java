package designpatterns.facade;

class Cpu {
    public void start() {
        System.out.println("cpu start");
    }
}

class Memory {
    public void load() {
        System.out.println("memory start");
    }
}

class HardDisk {
    public void read() {
        System.out.println("hard disk start");
    }
}
