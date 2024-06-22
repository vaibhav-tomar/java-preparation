package vaibhav.systemdesign.designpattern.bridgedesignpattern;

public class Human extends LivingThing {

    Human(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breathe() {
        breatheImplementor.breathe();
    }
}
