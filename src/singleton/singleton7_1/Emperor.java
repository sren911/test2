package singleton.singleton7_1;

/**
 * Created by admin on 2016/10/19.
 * 单粒模式
 */

public class Emperor {
    private static final Emperor emperor = new Emperor();
    private Emperor() {}

    public static Emperor getInstance() {
        return emperor;
    }

    public static void say() {
        System.out.println("我是皇帝XXXX");
    }
}
