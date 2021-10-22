package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

public abstract class BaseRestaurantWaiter {
    abstract void prepareMainFood(MainDish mainFood);
    abstract void prepareSnack(SnackDish snack);
    abstract void prepareDrink(DrinkDish drink);
    abstract Meal prepareMeal();
}
