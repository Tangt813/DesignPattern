package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class DrinkDishFactory implements DishFactory {
    private String drinkName;
    private Integer price;
    //设置所生产饮料名称
    public void setName(String name) {
        this.drinkName = name;
    }
    //重写菜品工厂生产菜品函数
    @Override
    public DrinkDish produceDish(String drinkName, Integer price) {
        System.out.println("一份"+drinkName+"已经制作完成");
        return new DrinkDish(drinkName, price);
    }
}
