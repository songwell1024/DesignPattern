package factory.FactoryMethod;

import factory.pizza.LDCheesePizza;
import factory.pizza.LDPepperPizza;
import factory.pizza.Pizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class LDOrderPizza extends OrderPizza {

    @Override
    public Pizza CreatePizza(String OrderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new LDCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new LDPepperPizza();
        }
        return pizza;

    }
}
