package vaibhav.systemdesign.designpattern.bridgedesignpattern;

public class TreeBreatheImplementor implements BreatheImplementor {
    @Override
    public void breathe() {
        System.out.println("tree breathing process");
    }
}
