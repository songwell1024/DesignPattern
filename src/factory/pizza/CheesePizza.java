package factory.pizza;

/**
 * @author WilsonSong
 * @date 2018/10/7/007
 */
public class CheesePizza extends Pizza {
    @Override
    public void Prepare() {
        super.setName("CheesePizza");
        System.out.println(name + "preparing" );
    }
}
