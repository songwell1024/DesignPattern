package singleton;

/**
 * @author WilsonSong
 * @date 2018/10/6/006
 */
public class Singleton {
    private static Singleton uniqeInstance=null;

    private Singleton(){        //private类型的构造函数只能在类内部进行new，类外是不可获取的，就和private修饰的变量一样

    }

    public static Singleton getInstance(){
        if (uniqeInstance == null){
            uniqeInstance = new Singleton();
        }
        return uniqeInstance;
    }

}
