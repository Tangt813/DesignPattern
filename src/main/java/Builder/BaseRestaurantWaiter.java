package Builder;

public abstract class BaseRestaurantWaiter {
    abstract void prepareMainFood(String mainFood);
    abstract void prepareSnack(String snack);
    abstract void prepareDrink(String drink);
    abstract Meal prepareMeal();
}
