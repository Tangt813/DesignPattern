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
        //新建工厂
        MainFoodFactory Main_Fac=new MainFoodFactory();
        SnackFactory Snack_Fac=new SnackFactory();
        DrinkDishFactory Drink_Fac=new DrinkDishFactory();
        //新建订单
        DishOrderService order=new DishOrderService();
        //生产食品
        Main_Fac.produceDish("汉堡", 60);
        Snack_Fac.produceDish("薯条", 40);
        Drink_Fac.produceDish("可乐", 20);
    }
}
