package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

public class RestaurantWaiter extends BaseRestaurantWaiter{
    private Meal meal = new Meal();
    //将主食加入套餐
    @Override
    void prepareMainFood(MainDish mainFood) {
        this.meal.setMainFood(mainFood);
        System.out.println("服务员将一份" + mainFood.getName() + "放入了餐盘中。");
    }
    //将小吃加入套餐
    @Override
    void prepareSnack(SnackDish snack) {
        this.meal.setSnack(snack);
        System.out.println("服务员将一份" + snack.getName() + "放入了餐盘中。");
    }
    //将饮料加入套餐
    @Override
    void prepareDrink(DrinkDish drink) {
        this.meal.setDrink(drink);
        System.out.println("服务员将一杯" + drink.getName() + "放入了餐盘中。");
    }
    //返回准备好的套餐
    @Override
    Meal prepareMeal() {
        return this.meal;
    }
}
