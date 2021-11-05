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
        //随机选取一名服务员
        Random rand = new Random();
        Integer waiterId = rand.nextInt(waiters.size());
        BaseRestaurantWaiter waiter = waiters.get(waiterId);
        //展示服务员信息
        System.out.println("服务员" + waiterId + "号正在准备您的套餐。");
        //调用服务员的函数来准备套餐
        waiter.prepareMainFood(mainFood);
        waiter.prepareSnack(snack);
        waiter.prepareDrink(drink);
        //将服务员准备好的套餐交给游客
        return waiter.prepareMeal();
    }
}
