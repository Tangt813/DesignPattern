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
        //获取订单信息
        Main_Fac.getname(order.getMain());
        Snack_Fac.getname(order.getSnack());
        Drink_Fac.getname(order.getDrink());
        //生产食品
        Main_Fac.produceDish();
        Snack_Fac.produceDish();
        Drink_Fac.produceDish();
    }
}
