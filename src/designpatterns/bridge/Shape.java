package designpatterns.bridge;

public abstract class Shape {
    protected Color color;
    public Shape(Color color) {
        this.color = color;
    }
    public abstract void draw();
}

class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }
    public void draw() {
        System.out.println("Drawing circle: ");
        color.applyColor();
    }
}

class Rectangle extends Shape {
    public Rectangle(Color color) {
        super(color);
    }
    public void draw() {
        System.out.println("Drawing rectangle: ");
        color.applyColor();
    }
}