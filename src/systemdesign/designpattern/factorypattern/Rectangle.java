package systemdesign.designpattern.factorypattern;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("draw rectangle");
    }
}
