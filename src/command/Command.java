package command;

/**
 * @author WilsonSong
 * @date 2018/10/9/009
 */
public interface Command {
    public void execute();
    public void undo();
}
