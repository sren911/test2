package proxy;

/**
 * Created by admin on 2016/10/20.
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    public GamePlayer(IGamePlayer gamePlayer,String name) {
        this.name = name;
    }
    @Override
    public void login(String user) {
        System.out.println(user+"登录了");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name+"在打怪");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name+"又升了一级");
    }
}
