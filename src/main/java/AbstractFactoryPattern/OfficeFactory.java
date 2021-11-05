package AbstractFactoryPattern;

public class OfficeFactory extends AbstractFactory{
    //继承抽象工厂，具体为餐办公室工厂，保持生产风格的一致性
    public Chair getChair(){
        return new ChinaOfficeChair();
    }
    public Table getTable(){
        return new ChinaOfficeTable();
    }

}
