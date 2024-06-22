package vaibhav.systemdesign.designpattern.bridgedesignpattern;

public class HumanBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("human breathing process");
    }
}
