package factory.AbstractFactory;

import factory.FactoryMethod.LDOrderPizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class PizzaStore {
    public static void main(String[] args){
        AbsOrderPizza order = new AbsOrderPizza(new LDFactory());
    }


}
