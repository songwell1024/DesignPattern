package compoundpattern.mvc;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public interface HeartModelInterface {
    int getHeartRate();
    void registerObserver(BeatObserver o);
    void removeObserver(BeatObserver o);
    void registerObserver(BPMObserver o);
    void removeObserver(BPMObserver o);
}
