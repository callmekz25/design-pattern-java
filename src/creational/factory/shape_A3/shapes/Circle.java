package creational.factory.shape_A3.shapes;

import creational.factory.shape_A3.Shape;

public class Circle extends Shape {


    @Override
    public String draw() {
        return "Circle" + "-" + getBrush() + "-" + getPaper() + "-" + getFrame();
    }
}
