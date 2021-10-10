package Builder;

public class Meal {
    private String mainFood;
    private String snack;
    private String drink;

    public Meal() {
        this.mainFood = "待选择";
        this.snack = "待选择";
        this.drink = "待选择";
    }

    public Meal(String mainFood, String snack, String drink) {
        this.mainFood = mainFood;
        this.snack = snack;
        this.drink = drink;
    }

    public String getMainFood() {
        return mainFood;
    }

    public void setMainFood(String mainFood) {
        this.mainFood = mainFood;
    }

    public String getSnack() {
        return snack;
    }

    public void setSnack(String snack) {
        this.snack = snack;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
