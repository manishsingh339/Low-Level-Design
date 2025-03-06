package designpatterns.facade;

class ComputerFacade {
    private Cpu cpu;
    private Memory memory;
    private HardDisk hardDisk;

    public ComputerFacade() {
        cpu = new Cpu();
        memory = new Memory();
        hardDisk = new HardDisk();
    }

    public void start() {
        System.out.println("Starting Computer...");
        cpu.start();
        memory.load();
        hardDisk.read();
        System.out.println("Computer started");
    }

}
