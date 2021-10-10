package Builder;

public class RestaurantWaiter extends BaseRestaurantWaiter{
    private Meal meal = new Meal();
    @Override
    void prepareMainFood(String mainFood) {
        this.meal.setMainFood(mainFood);
        System.out.println("服务员将一份" + mainFood + "放入了餐盘中。");
    }

    @Override
    void prepareSnack(String snack) {
        this.meal.setSnack(snack);
        System.out.println("服务员将一份" + snack + "放入了餐盘中。");
    }

    @Override
    void prepareDrink(String drink) {
        this.meal.setDrink(drink);
        System.out.println("服务员将一杯" + drink + "放入了餐盘中。");
    }

    @Override
    Meal prepareMeal() {
        return this.meal;
    }
}
