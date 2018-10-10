package adapter;

import adapter.Adapter.TuckeyAdapter;
import adapter.Turkey.Turkey;
import adapter.Turkey.WildTurkey;
import adapter.duck.Duck;
import adapter.duck.GreenHeadDuck;

/**
 * @author WilsonSong
 * @date 2018/10/9/009
 */
public class MainTest {
    public static void main(String[] args){
        WildTurkey wildTurkey = new WildTurkey();
        wildTurkey.fly();
        wildTurkey.gobble();
        GreenHeadDuck greenHeadDuck = new GreenHeadDuck();
        greenHeadDuck.fly();
        greenHeadDuck.getClass();

        Duck greenHeadDuck2 = new TuckeyAdapter(wildTurkey);
        greenHeadDuck2.fly();
        greenHeadDuck2.quack();

    }
}
