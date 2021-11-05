package AbstractFactoryPattern;

public class RestaurantFactory extends AbstractFactory{
    //继承抽象工厂，具体为餐厅工厂，保持生产风格的一致性
    public Chair getChair(){
        return new RestaurantChair();
    }
    public Table getTable(){
        return new RestaurantTable();
    }
}

