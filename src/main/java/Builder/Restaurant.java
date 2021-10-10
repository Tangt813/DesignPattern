package Builder;

public class Restaurant {
    private BaseRestaurantWaiter waiter;
    public Restaurant(BaseRestaurantWaiter waiter) {
        this.waiter = waiter;
    }

    public Meal prepareMeal(String mainFood, String snack, String drink) {
        this.waiter.prepareMainFood(mainFood);
        this.waiter.prepareSnack(snack);
        this.waiter.prepareDrink(drink);
        return this.waiter.prepareMeal();
    }
}
