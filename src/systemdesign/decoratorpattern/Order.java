package systemdesign.decoratorpattern;

import systemdesign.decoratorpattern.base.BasePizza;
import systemdesign.decoratorpattern.base.Margherita;
import systemdesign.decoratorpattern.base.VegDelight;
import systemdesign.decoratorpattern.decorator.ExtraCheese;
import systemdesign.decoratorpattern.decorator.Mushroom;

public class Order {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheese(new Margherita());
        System.out.println(pizza1.cost());

        BasePizza pizza2 = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println(pizza2.cost());
    }
}
