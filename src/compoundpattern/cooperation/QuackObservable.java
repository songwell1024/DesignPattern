package compoundpattern.cooperation;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public interface QuackObservable {

    public void registerObserver(Observer observer);
    public void notifyObservers();
}
