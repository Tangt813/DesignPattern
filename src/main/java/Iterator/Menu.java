package Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Menu.java
 * @Description 菜单类
 * @createTime 2021年10月17日 13:09:00
 */
public class Menu implements Aggregate {
    private final List<Dish> dishes;

    public Menu(){
        this.dishes = new ArrayList<Dish>();
    }

    public Dish getDishAt(int index) {
        return dishes.get(index);
    }

    public void appendDish(Dish dish) {
        dishes.add(dish);
    }

    public int getLength(){
        return dishes.size();
    }

    public Iterator iterator() {
        return new MenuIterator(this);
    }
}
