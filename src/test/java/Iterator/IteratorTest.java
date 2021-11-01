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
        System.out.println("迭代器模式");
        System.out.println("在客户访问类与聚合类之间插入一个迭代器，这分离了聚合对象与其遍历行为，对客户也隐藏了其内部细节");
        System.out.println("------------------------------------------------------------------");
        System.out.println("接下来我们通过餐厅的菜单模块来感受迭代器模式的使用:");
        System.out.println("在餐厅中，菜单需要访问聚合对象中的一系列数据，" +
                "但是同时他又不需要对象的内部表示，同时便利任务交由迭代器完成，简化其菜单这一聚合对象。\n" +
                "增加新的聚合类和迭代器类也十分方便。为主食、饮料、小吃等聚合结构提供一个统一的接口。");
        System.out.println("------------------------------------------------------------------");

        Menu menu = new Menu();
        System.out.println("产生一个菜单对象");
        System.out.println("------------------------------------------------------------------");
        System.out.println("菜单中添加5.0元主食饭");
        menu.appendDish(new MainDish("饭",5.0));
        System.out.println("菜单中添加3.0元饮料可乐");
        menu.appendDish(new DrinkDish("可乐",3.0));
        System.out.println("菜单中添加3.0元零食玉米片");
        System.out.println("------------------------------------------------------------------");
        menu.appendDish(new SnackDish("玉米片",2.0));
        Iterator it = menu.iterator();
        while (it.hasNext()) {
            System.out.println("使用迭代器遍历菜品");
            Dish dish = (Dish) it.next();
            System.out.println("该菜名称为" + dish.getName() + "价格为" + dish.getPrice() + "元");
        }
    }
}
