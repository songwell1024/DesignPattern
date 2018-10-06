package decorator.CoffeeDecarator;

import decorator.coffeebar.Drink;

/**
 * @author WilsonSong
 * @date 2018/10/6/006
 */
public class Decorator extends Drink {

    Drink Obj;
    public Decorator(Drink Obj){
        this.Obj = Obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + Obj.cost();
    }

    @Override
    public String getDescription(){
        return super.description+"-"+super.getPrice()+"&&"+Obj.getDescription();
    }
}
