package adapter.Adapter;

import adapter.Turkey.Turkey;
import adapter.duck.Duck;

/**
 * @author WilsonSong
 * @date 2018/10/9/009
 */
public class TuckeyAdapter implements Duck{
    private Turkey turkey;
    public TuckeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
        turkey.fly();
        turkey.fly();
    }
}
