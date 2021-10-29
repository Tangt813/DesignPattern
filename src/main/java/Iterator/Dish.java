package Iterator;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Dish.java
 * @Description 菜品
 * @createTime 2021年10月17日 13:05:00
 */
public abstract class Dish {

    protected String name;
    protected Double price;

    public Dish(){
        this.name = "Default Dish Name";
        this.price = 99999.0;
    }

    public Dish(String name,Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
