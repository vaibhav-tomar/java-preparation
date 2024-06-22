package vaibhav.systemdesign.designpattern.decoratorpattern.decorator;

import vaibhav.systemdesign.designpattern.decoratorpattern.base.BasePizza;

public class Mushroom extends ToppingDecorator {

    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 15;
    }
}
