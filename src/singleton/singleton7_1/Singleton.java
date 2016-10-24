package singleton.singleton7_1;

/**
 * Created by admin on 2016/10/19.
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return singleton;
    }
    //类中的其他方法尽量是static的
    public static void XX() {

    }
}
