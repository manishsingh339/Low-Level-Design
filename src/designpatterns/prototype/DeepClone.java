package designpatterns.prototype;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

class Bike implements Serializable {
    private String name;
    private List<String> availableColors = new ArrayList<>();

    public Bike(String name, String color) {
        this.name = name;
        this.availableColors.add(color);
    }

    public void addColor(String color) {
        this.availableColors.add(color);
    }

    public void show() {
        System.out.println("Bike: Name: " + name + ", Color: " + availableColors);
    }

    public Bike clone() {
        try {
            // Write the object out to a byte array
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(bos);
            out.writeObject(this);
            out.close();

            // Make an input stream from the byte array and read
            // a copy of the object back in.
            ObjectInputStream in = new ObjectInputStream(
                    new ByteArrayInputStream(bos.toByteArray()));
            return (Bike) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new AssertionError();
        }
    }

    public String toString() {
        return "Bike{" +
                "name='" + name + '\'' +
                ", color='" + availableColors + '\'' +
                '}';
    }
}

//public class DeepClone implements Serializable {
//    private String data;
//
//    public DeepClone(String data) {
//        this.data = data;
//    }
//
//    public Bike clone() {
//        try {
//            // Write the object out to a byte array
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            ObjectOutputStream out = new ObjectOutputStream(bos);
//            out.writeObject(this);
//            out.close();
//
//            // Make an input stream from the byte array and read
//            // a copy of the object back in.
//            ObjectInputStream in = new ObjectInputStream(
//                    new ByteArrayInputStream(bos.toByteArray()));
//            return (Bike) in.readObject();
//        } catch (IOException | ClassNotFoundException e) {
//            throw new AssertionError();
//        }
//    }
//
//}
