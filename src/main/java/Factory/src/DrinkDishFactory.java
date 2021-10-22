package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class DrinkDishFactory implements DishFactory {
    private String drinkName;
    private Integer price;

    public void setName(String name) {
        this.drinkName = name;
    }

    @Override
    public DrinkDish produceDish(String drinkName, Integer price) {
        System.out.println(drinkName);
        System.out.println(" has been produced");
        return new DrinkDish(drinkName, price);
    }
}
