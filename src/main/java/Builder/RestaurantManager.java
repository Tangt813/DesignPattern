package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RestaurantManager extends BaseRestaurantManager{
    @Override
    public Meal prepareMeal(MainDish mainFood, SnackDish snack, DrinkDish drink) {
        Random rand = new Random();
        Integer waiterId = rand.nextInt(waiters.size());
        BaseRestaurantWaiter waiter = waiters.get(waiterId);
        System.out.println("服务员" + waiterId + "号正在准备您的套餐。");
        waiter.prepareMainFood(mainFood);
        waiter.prepareSnack(snack);
        waiter.prepareDrink(drink);
        return waiter.prepareMeal();
    }
}
