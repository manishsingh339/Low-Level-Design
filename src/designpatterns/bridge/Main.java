package designpatterns.bridge;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(new Red());
        circle.draw();
        Shape rectangle = new Rectangle(new Green());
        rectangle.draw();
    }
}
