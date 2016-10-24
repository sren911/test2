package factory;

/**
 * Created by admin on 2016/10/19.
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄种人的皮肤是黄色的");
    }

    @Override
    public void talk() {
        System.out.println("黄种人会说话，一般为两个字节");
    }
}
