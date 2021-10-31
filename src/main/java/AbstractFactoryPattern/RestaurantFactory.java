package AbstractFactoryPattern;

public class RestaurantFactory extends AbstractFactory{

    public Chair getChair(){
        return new RestaurantChair();
    }
    public Table getTable(){
        return new RestaurantTable();
    }
}

