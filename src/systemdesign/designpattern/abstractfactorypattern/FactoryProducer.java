package systemdesign.designpattern.abstractfactorypattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        switch (choice) {
            case "COLOR":
                return new ColorFactory();
            case "SHAPE":
                return new ShapeFactory();
        }
        return null;
    }
}
