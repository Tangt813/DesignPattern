package Iterator;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Dish.java
 * @Description 菜品
 * @createTime 2021年10月17日 13:05:00
 */
public class Dish {

    private final String name;
    private final Integer price;

    public Dish(){
        this.name = "Default Dish Name";
        this.price = 99999;
    }

    public Dish(String name,Integer price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
}
