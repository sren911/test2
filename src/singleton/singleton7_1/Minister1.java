package singleton.singleton7_1;

/**
 * Created by admin on 2016/10/19.
 */
public class Minister1 {
    public static void main(String[] args) {

        for(int i=0; i<5; i++) {
            Emperor1 emperor1 = Emperor1.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是：");
            emperor1.say();
        }
    }
}
