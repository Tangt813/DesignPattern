package Builder;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void builderTest() {
        System.out.println("--------------------Builder Pattern Test Start--------------------");
        Restaurant restaurant = new Restaurant(new RestaurantWaiter());
        System.out.println("一名顾客在餐厅购买了一份套餐，包括一份汉堡，一份薯条与一杯可乐。");
        restaurant.prepareMeal("汉堡", "薯条", "可乐");
        System.out.println("顾客收到了餐品。");
        System.out.println("--------------------Builder Pattern Test End--------------------");
    }
}
