package compoundpattern.mvc;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class DJTest {
    public static void main(String[] args) {
        BeatModelInterface model = new BeatModel();
        ControllerInterface controller = new BeatController(model);
    }
}
