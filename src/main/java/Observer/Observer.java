package Observer;

/**
 * 创建观察者类
 */
public abstract class Observer {
    protected Manager manager;
    public abstract void update();
}
