package observer.ObserverMode;

/**
 * @author WilsonSong
 * @date 2018/10/5/005
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}
