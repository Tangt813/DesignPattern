package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public abstract class BaseRestaurantManager {
    protected final List<BaseRestaurantWaiter> waiters;
    public BaseRestaurantManager(){
        this.waiters = new ArrayList<BaseRestaurantWaiter>();
    }
    public BaseRestaurantManager(List<BaseRestaurantWaiter> waiters) {
        this.waiters = waiters;
    }

    public void addWaiter(BaseRestaurantWaiter waiter){
        this.waiters.add(waiter);
    }

    public abstract Meal prepareMeal(MainDish mainFood, SnackDish snack, DrinkDish drink);
}
