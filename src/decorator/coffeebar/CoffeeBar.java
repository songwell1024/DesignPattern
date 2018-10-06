package decorator.coffeebar;

import decorator.CoffeeDecarator.Chocolate;
import decorator.CoffeeDecarator.Milk;
import decorator.coffee.Decaf;
import decorator.coffee.LongBlack;

/**
 * @author WilsonSong
 * @date 2018/10/6/006
 */
public class CoffeeBar {

    public static void main(String[] args) {

        Drink order;
        order=new Decaf();
        System.out.println("order1 price:"+order.cost());
        System.out.println("order1 desc:"+order.getDescription());

        System.out.println("****************");
        order=new LongBlack();
        order=new Milk(order);
        order=new Chocolate(order);
        order=new Chocolate(order);
        System.out.println("order2 price:"+order.cost());
        System.out.println("order2 desc:"+order.getDescription());
    }
}