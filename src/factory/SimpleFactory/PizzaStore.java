package factory.SimpleFactory;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class PizzaStore {
    SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
    OrderPizza orderPizza  = new OrderPizza(simplePizzaFactory);

}
