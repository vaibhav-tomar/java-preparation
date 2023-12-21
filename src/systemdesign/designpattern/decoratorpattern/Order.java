package systemdesign.designpattern.decoratorpattern;

import systemdesign.designpattern.decoratorpattern.base.BasePizza;
import systemdesign.designpattern.decoratorpattern.base.Margherita;
import systemdesign.designpattern.decoratorpattern.base.VegDelight;
import systemdesign.designpattern.decoratorpattern.decorator.ExtraCheese;
import systemdesign.designpattern.decoratorpattern.decorator.Mushroom;

public class Order {
    public static void main(String[] args) {
        BasePizza pizza1 = new ExtraCheese(new Margherita());
        System.out.println(pizza1.cost());

        BasePizza pizza2 = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println(pizza2.cost());
    }
}
