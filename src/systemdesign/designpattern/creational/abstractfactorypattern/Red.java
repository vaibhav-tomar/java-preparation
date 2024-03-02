package systemdesign.designpattern.creational.abstractfactorypattern;

public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("red");
    }
}
