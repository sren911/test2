package factory;

/**
 * Created by admin on 2016/10/19.
 */
public class NvWa {
    public static void main(String[] args) {
        AbstractHumanFactory humanFactory = new HumanFactory();
        System.out.println("--造出的第一批人是白色人种--");
        Human whiteHuman = humanFactory.creatHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("--造出的第一批人是黑色人种--");
        Human blackHuman = humanFactory.creatHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("--造出的第一批人是黄色人种--");
        Human yellowHuman = humanFactory.creatHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
