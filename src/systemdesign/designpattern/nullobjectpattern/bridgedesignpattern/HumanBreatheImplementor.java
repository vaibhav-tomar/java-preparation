package systemdesign.designpattern.nullobjectpattern.bridgedesignpattern;

public class HumanBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("human breathing process");
    }
}
