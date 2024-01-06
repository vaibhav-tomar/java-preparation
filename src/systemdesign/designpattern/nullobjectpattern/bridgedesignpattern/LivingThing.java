package systemdesign.designpattern.nullobjectpattern.bridgedesignpattern;

public abstract class LivingThing {

    BreatheImplementor breatheImplementor;

    public LivingThing(BreatheImplementor breatheImplementor) {
        this.breatheImplementor = breatheImplementor;
    }

    abstract void breathe();
}
