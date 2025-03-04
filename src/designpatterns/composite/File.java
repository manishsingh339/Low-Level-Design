package designpatterns.composite;

public class File implements FileSystemComponent {
    private String name;
    public File(String name) {
        this.name = name;
    }

    @Override
    public void printDetails() {
        System.out.println("\tFile: " + name);
    }
}
