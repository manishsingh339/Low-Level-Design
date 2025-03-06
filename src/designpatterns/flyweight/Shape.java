package designpatterns.flyweight;

public interface Shape {
    void draw(String color);
}

class Circle implements Shape {
    private static final String TYPE = "Circle";

    @Override
    public void draw(String color) {
        System.out.println("Drawing " + TYPE + " with color " + color);
    }

}
