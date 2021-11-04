package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

// 结合Dish类以及Iterator
public class Meal {
    //一份套餐由主食、小吃与饮料组成
    private MainDish mainFood;
    private SnackDish snack;
    private DrinkDish drink;

    //默认构造函数
    public Meal() {
        this.mainFood = new MainDish("待选择", 0);
        this.snack = new SnackDish("待选择", 0);
        this.drink = new DrinkDish("待选择", 0);
    }
    //带参构造函数
    public Meal(MainDish mainFood, SnackDish snack, DrinkDish drink) {
        this.mainFood = mainFood;
        this.snack = snack;
        this.drink = drink;
    }

    //setter与getter
    public MainDish getMainFood() {
        return mainFood;
    }

    public void setMainFood(MainDish mainFood) {
        this.mainFood = mainFood;
    }

    public SnackDish getSnack() {
        return snack;
    }

    public void setSnack(SnackDish snack) {
        this.snack = snack;
    }

    public DrinkDish getDrink() {
        return drink;
    }

    public void setDrink(DrinkDish drink) {
        this.drink = drink;
    }
}
