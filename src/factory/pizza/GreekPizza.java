package factory.pizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class GreekPizza extends Pizza {
    @Override
    public void Prepare() {
        super.setName("GreekPizza");
        System.out.println(name + "preparing" );

    }
}
