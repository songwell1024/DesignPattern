package compoundpattern.cooperation;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class GooseAdapter implements Quackable {

    Observable observable;

    Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        goose.hoke();
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
