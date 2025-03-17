package creational.factory.shape_A3.shapes;

import creational.factory.shape_A3.Shape;

public class Rectangle extends Shape {





    @Override
    public String draw() {
        return "Rectangle" + "-" + getBrush() + "-" + getPaper() + "-" + getFrame();
    }
}
