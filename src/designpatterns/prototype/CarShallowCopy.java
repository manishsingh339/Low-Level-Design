package designpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

class Car implements Prototype {
    private String model;
    private List<String> availableColors = new ArrayList<>();

    public Car(String model, String color) {
        this.model = model;
        this.availableColors.add(color);
    }

    public void addColor(String color) {
        this.availableColors.add(color);
    }

     @Override
     public Prototype clone() {
         try {
             return (Car) super.clone();
         } catch (CloneNotSupportedException e) {
             throw new RuntimeException(e);
         }
     }
     public void show() {
         System.out.println("Model: " + model + ", Color: " + availableColors);
     }

     public String toString() {
         return "Car{" +
                 "model='" + model + '\'' +
                 ", color='" + availableColors + '\'' +
                 '}';
     }
 }
