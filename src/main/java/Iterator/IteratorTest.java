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
        menu.appendDish(new Dish("同济大排",5));
        menu.appendDish(new Dish());
        menu.appendDish(new Dish("烤肉饭",18));
        menu.appendDish(new Dish("猪肝面",19));
        Iterator it = menu.iterator();
        while (it.hasNext()) {
            Dish dish = (Dish) it.next();
            System.out.println(dish.getName());
        }
    }
}
