package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

public class RestaurantManager {
    private final BaseRestaurantWaiter waiter;
    public RestaurantManager(BaseRestaurantWaiter waiter) {
        this.waiter = waiter;
    }

    public Meal prepareMeal(MainDish mainFood, SnackDish snack, DrinkDish drink) {
        this.waiter.prepareMainFood(mainFood);
        this.waiter.prepareSnack(snack);
        this.waiter.prepareDrink(drink);
        return this.waiter.prepareMeal();
    }
}
