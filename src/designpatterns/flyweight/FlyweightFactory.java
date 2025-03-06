package designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

class ShapeFactory {
    private static final Map<String, Shape> shapeCache = new HashMap<>();

    public static Shape getCircle() {
        Shape circle = shapeCache.get("circle");
        if (circle == null) {
            circle = new Circle();
            shapeCache.put("circle", circle);
            System.out.println("Creating new Circle object.");
        }
        return circle;
    }
}
