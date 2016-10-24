package singleton.singleton7_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by admin on 2016/10/19.
 * 单粒产生多个实例
 */
public class Emperor1 {
    private static int maxNumOfEmperor = 2;
    private static List<String> listName = new ArrayList<String>();
    private static List<Emperor1> listEmperor = new ArrayList<Emperor1>();
    private static int countNum = 0;

    static {
        for(int i=0; i<maxNumOfEmperor; i++) {
            listEmperor.add(new Emperor1("黄"+(i+1)+"帝"));
        }

    }
    private Emperor1() {};
    private Emperor1(String name) {
        listName.add(name);
    }

    public static Emperor1 getInstance() {
        Random random = new Random();
        countNum = random.nextInt(maxNumOfEmperor);
        return listEmperor.get(countNum);
    }

    public static void say() {
        System.out.println(listName.get(countNum));
    }

}
