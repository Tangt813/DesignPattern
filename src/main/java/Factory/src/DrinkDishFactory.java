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
        System.out.println("一份"+drinkName+"已经制作完成");
        return new DrinkDish(drinkName, price);
    }
}
