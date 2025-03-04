package designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemComponent{
    private List<FileSystemComponent> components = new ArrayList<>();
    private String name;

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemComponent component) {
        components.add(component);
    }

    public void remove(FileSystemComponent component) {
        components.remove(component);
    }

    @Override
    public void printDetails() {
        System.out.println("Folder: " + name);
        for (FileSystemComponent component : components) {
            component.printDetails();
        }
    }
}
