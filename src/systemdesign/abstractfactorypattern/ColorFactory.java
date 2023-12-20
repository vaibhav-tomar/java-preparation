package systemdesign.abstractfactorypattern;

public class ColorFactory extends AbstractFactory {

    public Color getColor(String input) {
        switch (input) {
            case "RED":
                return new Red();
            case "GREEN":
                return new Green();
            case "BLUE":
                return new Blue();
            default:
                return null;
        }
    }

    @Override
    Shape getShape(String shape) {
        return null;
    }
}
