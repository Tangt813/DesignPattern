package Iterator;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName IteratorTest.java
 * @Description 迭代器模式测试
 * @createTime 2021年10月17日 13:21:00
 */
public class IteratorTest {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.appendDish(new MainDish("饭",5));
        menu.appendDish(new DrinkDish("可乐",5));
        menu.appendDish(new SnackDish("零食",5));
        Iterator it = menu.iterator();
        while (it.hasNext()) {
            Dish dish = (Dish) it.next();
            System.out.println(dish.getName());
        }
    }
}
