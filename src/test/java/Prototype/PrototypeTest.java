package Prototype;

import Prototype.Factory_Proto.DishCache;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void prototypeTest() {
        System.out.println("#原型模式（Prototype Pattern）用于创建重复的对象，同时又能保证性能");
        System.out.println("#这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式");
        System.out.println("#使用原型模式复用的方式创建实例对象 , 比使用构造函数重新创建对象性能要高");
        System.out.println("#原型模式可以简化创建的过程 , 可以直接修改现有的对象实例的值 , 达到复用的目的");
        System.out.println("#在餐厅中每次做一道新菜都可以作为一个原型，以后有客人点相同菜品时可以直接返回克隆对象从而提高效率");
        System.out.println("#这种模式属于创建型模式");
        System.out.println("----------------------Pototype Pattern Test Start--------------------");
        FoodCache.loadCache();
        System.out.println("餐厅里里有很多食物，同种食物都是一个方法和材料制作的");
        System.out.println("后厨开始备餐:汉堡、薯条、面条");
        FoodCache.showCache();
        System.out.println("===================");
        System.out.println("顾客点了汉堡\n后厨已有备餐");
        Food clonedFood = (Food) FoodCache.getFood("汉堡");
        System.out.println("Food " + clonedFood.getName() + ":" + clonedFood.getPrice()+" yuan");
        System.out.println("===================");
        System.out.println("顾客点了面条\n后厨已有备餐");
        Food clonedFood2 = (Food) FoodCache.getFood("面条");
        System.out.println("Food " + clonedFood2.getName() + ":" + clonedFood2.getPrice()+" yuan");
        System.out.println("===================");
        System.out.println("顾客点了鸡肉\n后厨已有备餐");
        Food clonedFood3 = (Food) FoodCache.getFood("鸡肉");
        System.out.println("Food " + clonedFood3.getName() + ":" + clonedFood3.getPrice()+" yuan");

//        DishCache.loadCache();
//
//        System.out.print("餐厅里里有很多食物，同种食物都是一个方法和材料制作的\n");
//        System.out.print("这些食物具有名称、id、价格等属性，对顾客来说名称和价格是可见的\n");
//        Dish clonedDish = DishCache.getDish("主食");
//        Food clonedFood = (Dish) FoodCache.getFood("10001");
//        System.out.println("Food " + clonedFood.getName() + ":" + clonedFood.getPrice()+" yuan");

        System.out.println("----------------------Prototye Pattern Test Start--------------------");


    }
}
