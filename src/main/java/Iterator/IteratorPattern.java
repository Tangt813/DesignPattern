package Iterator;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName IteratorPattern.java
 * @Description TODO
 * @createTime 2021年10月31日 22:13:00
 */
public class IteratorPattern {

    public static void main(String[] args) {
        Menu menu = new Menu();
        System.out.println("产生一个菜单类");
        System.out.println("菜单中添加5.0元主食饭");
        menu.appendDish(new MainDish("饭",5.0));
        System.out.println("菜单中添加3.0元饮料可乐");
        menu.appendDish(new DrinkDish("可乐",3.0));
        System.out.println("菜单中添加3.0元零食玉米片");
        menu.appendDish(new SnackDish("玉米片",2.0));
        Iterator it = menu.iterator();
        while (it.hasNext()) {
            System.out.println("使用迭代器遍历菜品");
            Dish dish = (Dish) it.next();
            System.out.println("该菜名称为" + dish.getName() + "价格为" + dish.getPrice());
        }
    }

}
