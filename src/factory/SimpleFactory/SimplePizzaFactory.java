package factory.SimpleFactory;

import factory.pizza.CheesePizza;
import factory.pizza.GreekPizza;
import factory.pizza.Pizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class SimplePizzaFactory {
    public Pizza CreatePizza(String orderType){
        Pizza pizza = null;
        if (orderType.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (orderType.equals("greek")) {
            pizza = new GreekPizza();
        }
//        } else if (orderType.equals("pepper")) {
//            pizza = new PepperPizza();
//        }
        return pizza;
    }

}
