package ServiceLocatorPattern;

public abstract class Service {
    public abstract String getName();//得到服务对象名字
    public abstract String getPositon();//得到服务对象位置
    public abstract boolean isBathAndEat();//得到服务对象状态：是否吃饭
    public abstract void setName(String nameNew);//设置服务对象名称
    public abstract void setPositon(String positonNew);//设置服务对象位置
    public abstract void setActive(boolean activeNew);//设置服务对象状态
    public abstract void printDetails();//打印所有人的状态位置信息
}
