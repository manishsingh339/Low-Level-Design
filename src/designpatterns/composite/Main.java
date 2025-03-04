package designpatterns.composite;

public class Main {
    public static void main(String[] args) {
        Folder root = new Folder("root");
        Folder folder1 = new Folder("folder1");
        Folder folder2 = new Folder("folder2");
        File file1 = new File("file1");
        File file2 = new File("file2");
        root.add(folder1);
        root.add(folder2);
        folder1.add(file1);
        folder2.add(file2);
        root.printDetails();
    }
}
