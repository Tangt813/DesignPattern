package AbstractFactoryPattern;
//抽象工厂，得到对于椅子工厂和桌子工厂抽象而来的总工厂
public abstract class AbstractFactory {
    public abstract Chair getChair();//得到椅子对象
    public abstract Table getTable() ;//得到桌子对象
}
