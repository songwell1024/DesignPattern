package compoundpattern.cooperation;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class Quackologist implements Observer {
    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+duck.getClass().getName()+"just quacked.");
    }
}
