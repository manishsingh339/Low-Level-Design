package designpatterns.command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(lightOnCommand);
        remote.pressButton();
        System.out.println();

        remote.setCommand(lightOffCommand);
        remote.pressButton();
    }
}
