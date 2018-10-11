package TemplateMethod;


/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class MainTest {
    public static void main(String[] args){
//        HotDrink drinkTea = new Tea();
//        drinkTea.prepareRecipe();
//
//        HotDrink drinkCoffee = new Coffee();
//        drinkCoffee.prepareRecipe();

        HotDrinkWithHook drinkTea = new TeaWithHook();
        drinkTea.prepareRecipe();
    }
}
