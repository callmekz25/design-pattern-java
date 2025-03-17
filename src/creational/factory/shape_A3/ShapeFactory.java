package creational.factory.shape_A3;

import creational.factory.shape_A3.shapes.Circle;
import creational.factory.shape_A3.shapes.Rectangle;
import creational.factory.shape_A3.shapes.Triangle;


import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {
    private static Map<EShapeType, Shape> instances = new HashMap<>();
    public static Shape getInstances(EShapeType tag) {
        if(instances.get(tag) == null) {
            instances.put(tag, createShape(tag));

        }
        return instances.get(tag);
    }
    protected static Shape createShape(EShapeType type) {
        switch (type){
            case RECTANGLE -> {
                return new Rectangle();
            }
            case CIRCLE -> {
                return new Circle();
            }
            case TRIANGLE -> {
                return new Triangle();
            }

        }
        return null;
    };
}
