package factory.AbstractFactory;

import factory.pizza.LDCheesePizza;
import factory.pizza.LDPepperPizza;
import factory.pizza.Pizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class LDFactory implements AbsFactory{
    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }
}
