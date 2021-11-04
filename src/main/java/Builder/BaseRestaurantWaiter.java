package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

public abstract class BaseRestaurantWaiter {
    //将主食添加到套餐中
    abstract void prepareMainFood(MainDish mainFood);
    //将小吃添加到套餐中
    abstract void prepareSnack(SnackDish snack);
    //将饮料添加到套餐中
    abstract void prepareDrink(DrinkDish drink);
    //将准备完的套餐交给游客
    abstract Meal prepareMeal();
}
