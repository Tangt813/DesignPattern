package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class MainFoodFactory implements DishFactory {

    @Override
    public MainDish produceDish(String mainFoodName, Integer price) {
        System.out.println(mainFoodName);
        System.out.println(" has been produced");
        return new MainDish(mainFoodName, price);
    }
}
