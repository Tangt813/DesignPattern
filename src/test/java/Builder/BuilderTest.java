package Builder;
import Factory.src.*;
import org.junit.Test;


public class BuilderTest {
    @Test
    public void builderTest() throws InterruptedException {
        System.out.println("建造者模式负责将几个简单的对象组合成一个复杂的对象。");
        Thread.sleep(1500);
        System.out.println("待组合的对象可以有多种选择，但将它们组合起来的方法是有共性的，我们可以将这个方法抽象出来交给建造者执行。");
        Thread.sleep(1500);
        System.out.println("当我们有多个组合的方法时，这样的设计可以将方法与具体的组合操作解耦，增加代码的可维护性。");
        Thread.sleep(1500);
        System.out.println("在我们的场景中，服务员（建造者）将依次把准备好的主食、小吃、饮料放入餐盘中，组装成顾客所需要的套餐。");
        Thread.sleep(1500);
        System.out.println("当我们有多个建造者的时候，我们可以使用导演来管理这些建造者，在我们的场景中，餐厅经理担任了导演的责任，负责指挥建造者准备套餐。");
        System.out.println("--------------------Builder Pattern Test Start--------------------");
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
