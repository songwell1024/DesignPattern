package factory.FactoryMethod;

import factory.pizza.*;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class NYOrderPizza extends OrderPizza{
    @Override
    public Pizza CreatePizza(String OrderType) {
        Pizza pizza = null;

        if (orderType.equals("cheese")) {
            pizza = new NYCheesePizza();
        } else if (orderType.equals("pepper")) {
            pizza = new NYPepperPizza();
        }
        return pizza;

    }
}
