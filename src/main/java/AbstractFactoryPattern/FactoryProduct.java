package AbstractFactoryPattern;

public class FactoryProduct {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("Office")){
            return new OfficeFactory();
        } else if(choice.equalsIgnoreCase("Restaurant")){
            return new RestaurantFactory();
        }
        return null;
    }
}

