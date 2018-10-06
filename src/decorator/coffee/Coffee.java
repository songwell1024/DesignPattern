package decorator.coffee;

import decorator.coffeebar.Drink;

/**
 * @author WilsonSong
 * @date 2018/10/6/006
 */
public class Coffee extends Drink{
    @Override
    public float cost() {
        return super.getPrice();
    }
}
