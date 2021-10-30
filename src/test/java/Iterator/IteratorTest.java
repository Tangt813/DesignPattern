package Iterator;

import org.junit.Test;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName IteratorTest.java
 * @Description TODO
 * @createTime 2021年10月30日 10:47:00
 */
public class IteratorTest {
    @Test
    public void iteratorTest(){
        Menu menu = new Menu();
        menu.appendDish(new MainDish("饭",5.0));
        menu.appendDish(new DrinkDish("可乐",5.0));
        menu.appendDish(new SnackDish("零食",5.0));
        Iterator it = menu.iterator();
        while (it.hasNext()) {
            Dish dish = (Dish) it.next();
            System.out.println(dish.getName());
        }
    }
}
