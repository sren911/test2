package factory;

/**
 * Created by admin on 2016/10/19.
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白种人的皮肤一般为白色的");
    }

    @Override
    public void talk() {
        System.out.println("白种人会说话，一般为一个字节");
    }
}
