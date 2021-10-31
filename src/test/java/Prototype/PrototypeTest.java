package Prototype;

import Factory.src.Dish;
import Prototype.Factory_Proto.DishCache;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void prototypeTest() {
        System.out.println("----------------------Pototype Pattern Test Start--------------------");
//        FoodCache.loadCache();
//        System.out.print("餐厅里里有很多食物，同种食物都是一个方法和材料制作的\n");
//        System.out.print("这些食物具有名称、id、价格等属性，对顾客来说名称和价格是可见的\n");
//        Food clonedFood = (Food) FoodCache.getFood("10001");
//        System.out.println("Food " + clonedFood.getName() + ":" + clonedFood.getPrice()+" yuan");
//
//        Food clonedFood2 = (Food) FoodCache.getFood("10002");
//        System.out.println("Food " + clonedFood2.getName() + ":" + clonedFood.getPrice()+" yuan");
//
//        Food clonedFood3 = (Food) FoodCache.getFood("10003");
//        System.out.println("Food " + clonedFood3.getName() + ":" + clonedFood.getPrice()+" yuan");
        DishCache.loadCache();

        System.out.print("餐厅里里有很多食物，同种食物都是一个方法和材料制作的\n");
        System.out.print("这些食物具有名称、id、价格等属性，对顾客来说名称和价格是可见的\n");
        Dish clonedDish = DishCache.getDish("主食");
//        Food clonedFood = (Dish) FoodCache.getFood("10001");
//        System.out.println("Food " + clonedFood.getName() + ":" + clonedFood.getPrice()+" yuan");

        System.out.println("----------------------Prototye Pattern Test Start--------------------");


    }
}
