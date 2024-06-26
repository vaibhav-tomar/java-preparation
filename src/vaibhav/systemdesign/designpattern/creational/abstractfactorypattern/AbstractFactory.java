package vaibhav.systemdesign.designpattern.creational.abstractfactorypattern;

public abstract class AbstractFactory {
    abstract Shape getShape(String shape);

    abstract Color getColor(String color);
}
