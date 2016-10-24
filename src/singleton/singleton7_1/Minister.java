package singleton.singleton7_1;

/**
 * Created by admin on 2016/10/19.
 * 臣子类
 */
public class Minister {
    public static void main(String[] args) {
        for(int day=0; day<3; day++) {
            Emperor emperor = Emperor.getInstance();
            emperor.say();
        }
    }
}
