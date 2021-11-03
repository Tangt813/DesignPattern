package Factory;/*
@version : 
@author：张世铎
@date:
@description:
*/
import Factory.src.*;
import org.junit.Test;

public class FactoryTest {
    @Test
    public void factoryTest(){
        System.out.println("大家好，欢迎来到工厂模式展示～\n" +
                "工厂模式的作用是用来实例化对象，封装对象实例化的过程\n" +
                "接下来我们通过餐厅餐品的生产来展示工厂方法模式\n" +
                "我们餐厅的菜品基类为Dish,派生出主食、小吃和饮料三种类\n" +
                "三种类的菜品名称、价格可以各不相同，但三大类的对象实例化各自通过自己的工厂完成\n" +
                "因此我们抽象化一个基类工厂，从基类工厂派生出主食工厂、小吃工厂和饮料工厂，分别用来实例化主食、小吃、饮料对象\n");

        //新建工厂
        MainFoodFactory Main_Fac=new MainFoodFactory();
        SnackFactory Snack_Fac=new SnackFactory();
        DrinkDishFactory Drink_Fac=new DrinkDishFactory();
        //新建订单
        DishOrderService order=new DishOrderService();
        String mainFoodName=order.getMain();
        String snackName=order.getSnack();
        String drinkName=order.getDrink();
        //生产食品
        Main_Fac.produceDish(mainFoodName, 60);
        Snack_Fac.produceDish(snackName, 40);
        Drink_Fac.produceDish(drinkName, 20);

    }
}
