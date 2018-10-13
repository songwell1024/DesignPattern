package compoundpattern.mvc;

/**
 * @author WilsonSong
 * @date 2018/10/10/010
 */
public class HeartController implements ControllerInterface {
    HeartModelInterface model;
    DJView view;

    public HeartController(HeartModelInterface model){
        this.model = model;
        view = new DJView(this, new HeartAdapter(model));
        view.createView();
        view.createControls();
        view.disableStopMenuItem();
        view.disableStartMenuItem();
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void increaseBPM() {

    }

    @Override
    public void setBPM(int bpm) {

    }

    @Override
    public void decreaseBPM() {

    }
}
