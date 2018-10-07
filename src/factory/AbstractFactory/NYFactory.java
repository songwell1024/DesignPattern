package factory.AbstractFactory;

import factory.pizza.NYCheesePizza;
import factory.pizza.NYPepperPizza;
import factory.pizza.Pizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class NYFactory implements AbsFactory {
    @Override
    public Pizza CreatePizza(String ordertype) {
        Pizza pizza = null;

        if (ordertype.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (ordertype.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;

    }
}
