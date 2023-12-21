package systemdesign.designpattern.abstractfactorypattern;

public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("green");
    }
}
