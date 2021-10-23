package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

public class RestaurantWaiter extends BaseRestaurantWaiter{
    private Meal meal = new Meal();
    @Override
    void prepareMainFood(MainDish mainFood) {
        this.meal.setMainFood(mainFood);
        System.out.println("服务员将一份" + mainFood.getName() + "放入了餐盘中。");
    }

    @Override
    void prepareSnack(SnackDish snack) {
        this.meal.setSnack(snack);
        System.out.println("服务员将一份" + snack.getName() + "放入了餐盘中。");
    }

    @Override
    void prepareDrink(DrinkDish drink) {
        this.meal.setDrink(drink);
        System.out.println("服务员将一杯" + drink.getName() + "放入了餐盘中。");
    }

    @Override
    Meal prepareMeal() {
        return this.meal;
    }
}
