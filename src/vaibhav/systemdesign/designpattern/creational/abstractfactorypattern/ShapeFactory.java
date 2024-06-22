package vaibhav.systemdesign.designpattern.creational.abstractfactorypattern;

public class ShapeFactory extends AbstractFactory {

    public Shape getShape(String input) {
        switch (input) {
            case "CIRCLE":
                return new Circle();
            case "SQUARE":
                return new Square();
            case "RECTANGLE":
                return new Rectangle();
            default:
                return null;
        }
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}
