package Observer;

/**
 * 创建观察者类
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
