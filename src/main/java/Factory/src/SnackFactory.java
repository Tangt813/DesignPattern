package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class SnackFactory implements DishFactory {

    @Override
    public SnackDish produceDish(String snackName, Integer price) {
        System.out.println(snackName);
        System.out.println(" has been produced");
        return new SnackDish(snackName, price);
    }
}
