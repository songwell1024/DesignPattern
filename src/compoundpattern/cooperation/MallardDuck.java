package compoundpattern.cooperation;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class MallardDuck implements Quackable {

    Observable observable;

    public MallardDuck(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
