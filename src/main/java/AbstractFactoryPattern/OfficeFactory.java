package AbstractFactoryPattern;

public class OfficeFactory extends AbstractFactory{
    public Chair getChair(){
        return new ChinaOfficeChair();
    }
    public Table getTable(){
        return new ChinaOfficeTable();
    }

}
