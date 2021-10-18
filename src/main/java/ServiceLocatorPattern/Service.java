package ServiceLocatorPattern;

public abstract class Service {
    public abstract String getName();
    public abstract String getPositon();
    public abstract boolean isBathAndEat();
    public abstract void setName(String nameNew);
    public abstract void setPositon(String positonNew);
    public abstract void setActive(boolean activeNew);
    public abstract void printDetails();
}
