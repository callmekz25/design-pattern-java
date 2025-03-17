package creational.factory.shape_A3;

public class Main {
    public static void main(String[] args) {
        Shape rectangle_1 = ShapeFactory.getInstances(EShapeType.RECTANGLE);
        Shape rectangle_2 = ShapeFactory.getInstances(EShapeType.RECTANGLE);
        Shape triangle_1 = ShapeFactory.getInstances(EShapeType.TRIANGLE);
        Shape triangle_2 = ShapeFactory.getInstances(EShapeType.TRIANGLE);
        Shape circle_1 = ShapeFactory.getInstances(EShapeType.CIRCLE);
        Shape circle_2 = ShapeFactory.getInstances(EShapeType.CIRCLE);
        rectangle_1.setBrush("10mm");
        rectangle_1.setFrame("Frame");
        rectangle_1.setPaper("A4");
        triangle_1.setBrush("200");
        circle_1.setBrush("300");
        System.out.println(rectangle_1.draw());
        System.out.println(rectangle_2.draw());
        System.out.println(triangle_1.draw());
        System.out.println(triangle_2.draw());
        System.out.println(circle_1.draw());
        System.out.println(circle_2.draw());
    }
}
