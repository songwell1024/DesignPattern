package compoundpattern.mvc;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public interface ControllerInterface {

    void start();
    void stop();
    void increaseBPM();
    void decreaseBPM();
    void setBPM(int bpm);
}
