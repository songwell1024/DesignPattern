package factory.AbstractFactory;

import factory.pizza.Pizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public interface AbsFactory {
    public Pizza CreatePizza(String ordertype) ;

}
