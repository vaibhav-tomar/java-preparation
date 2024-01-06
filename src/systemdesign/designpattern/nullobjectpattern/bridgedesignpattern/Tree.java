package systemdesign.designpattern.nullobjectpattern.bridgedesignpattern;

public class Tree extends LivingThing {

    Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

    @Override
    void breathe() {
        breatheImplementor.breathe();
    }
}
