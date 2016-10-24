package factory;

/**
 * Created by admin on 2016/10/19.
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T creatHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
