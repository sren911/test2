package factory;

/**
 * Created by admin on 2016/10/19.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T creatHuman(Class<T> c);
}
