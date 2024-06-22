package vaibhav.systemdesign.designpattern.bridgedesignpattern;

public class Main {
    public static void main(String[] args) {
        LivingThing tree = new Tree(new TreeBreatheImplementor());
        tree.breathe();
    }
}
