package designpatterns.flyweight;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = ShapeFactory.getCircle();
        circle1.draw("Red");
        Shape circle2 = ShapeFactory.getCircle();
        circle2.draw("Blue");

        Shape rectangle1 = ShapeFactory.getCircle();
        rectangle1.draw("Green");
        Shape rectangle2 = ShapeFactory.getCircle();
        rectangle2.draw("Yellow");

        System.out.println("circle1 == circle2: " + (circle1 == circle2));
        System.out.println("rectangle1 == rectangle2: " + (rectangle1 == rectangle2));
    }
}
