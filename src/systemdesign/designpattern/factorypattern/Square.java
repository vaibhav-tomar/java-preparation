package systemdesign.designpattern.factorypattern;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("draw square");
    }
}
