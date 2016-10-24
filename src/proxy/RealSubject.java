package proxy;

/**
 * Created by admin on 2016/10/21.
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do Something----->"+str);
    }
}
