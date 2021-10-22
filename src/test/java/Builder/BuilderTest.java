package Builder;
import Factory.src.*;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void builderTest() {
        System.out.println("--------------------Builder Pattern Test Start--------------------");
        Restaurant restaurant = new Restaurant(new RestaurantWaiter());
        System.out.println("一名顾客在餐厅购买了一份套餐，包括一份汉堡，一份薯条与一杯可乐。");
//        restaurant.prepareMeal("汉堡", "薯条", "可乐");
        MainFoodFactory mainFoodFactory=new MainFoodFactory();
        SnackFactory snackFactory=new SnackFactory();
        DrinkDishFactory drinkDishFactory=new DrinkDishFactory();
        //新建订单
        DishOrderService order=new DishOrderService();
        //生产食品
        MainDish mainDish = mainFoodFactory.produceDish("汉堡", 60);
        SnackDish snackDish = snackFactory.produceDish("薯条", 40);
        DrinkDish drinkDish = drinkDishFactory.produceDish("可乐", 20);
        restaurant.prepareMeal(mainDish, snackDish, drinkDish);
        System.out.println("顾客收到了餐品。");
        System.out.println("--------------------Builder Pattern Test End--------------------");
    }
}
