package AbstractFactoryPattern;

public class FactoryProduct {
    //工厂产品，来选择具体生产为办公室工厂还是餐厅工厂
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Office")){
            return new OfficeFactory();
        } else if(choice.equalsIgnoreCase("Restaurant")){
            return new RestaurantFactory();
        }
        return null;
    }
}

