package Builder;
import Factory.src.*;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void builderTest() {
        System.out.println("--------------------Builder Pattern Test Start--------------------");
        System.out.println("这里是建造者模式的演示，本场景的内容是餐厅备餐，服务员将依次把准备好的主食、小吃、饮料放入餐盘中，组装成顾客所需要的套餐。");
        BaseRestaurantManager restaurantManager = new RestaurantManager();
        restaurantManager.addWaiter(new RestaurantWaiter());
        //生产食品
        MainDish mainDish = new MainDish("汉堡", 60);
        SnackDish snackDish = new SnackDish("薯条", 40);
        DrinkDish drinkDish = new DrinkDish("可乐", 20);
        restaurantManager.prepareMeal(mainDish, snackDish, drinkDish);
        System.out.println("顾客收到了餐品。");
        System.out.println("--------------------Builder Pattern Test End--------------------");
    }
}
