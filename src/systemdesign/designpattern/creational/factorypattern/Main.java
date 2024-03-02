package systemdesign.designpattern.creational.factorypattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shape = factory.getShape("RECTANGLE");
        shape.draw();
    }
}
