package singleton;

/**
 * @author WilsonSong
 * @date 2018/10/6/006
 */
public class ChocolateFactory {

    private boolean empty;
    private boolean boiled;
    public volatile static ChocolateFactory uniqueInstance = null;

    private ChocolateFactory() {
        empty = true;
        boiled = false;
    }

    public synchronized static ChocolateFactory getInstance() {

        if (uniqueInstance == null) {
            synchronized (ChocolateFactory.class){
                if (uniqueInstance == null){
                    uniqueInstance = new ChocolateFactory();
                }
            }

        }

        return uniqueInstance;

    }

    public void fill() {
        if (empty) {
            // 添加原料巧克力动作
            empty = false;
            boiled = false;
        }
    }

    public void drain() {
        if ((!empty) && boiled) {
            // 排出巧克力动作
            empty = true;
        }
    }

    public void boil() {
        if ((!empty) && (!boiled)) {
            // 煮沸
            boiled = true;
        }
    }

}
