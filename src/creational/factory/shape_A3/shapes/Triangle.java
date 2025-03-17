package creational.factory.shape_A3.shapes;

import creational.factory.shape_A3.Shape;

public class Triangle extends Shape {


    @Override
    public String draw() {
        return "Triangle" + "-" + getBrush() + "-" + getPaper() + "-" + getFrame();
    }
}
