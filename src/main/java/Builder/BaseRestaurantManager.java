package Builder;

import Factory.src.DrinkDish;
import Factory.src.MainDish;
import Factory.src.SnackDish;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public abstract class BaseRestaurantManager {
    //可供指挥的服务员
    protected final List<BaseRestaurantWaiter> waiters;
    //默认构造函数，包括一个空的服务员列表
    public BaseRestaurantManager(){
        this.waiters = new ArrayList<BaseRestaurantWaiter>();
    }
    //带参构造函数，直接设置服务员列表
    public BaseRestaurantManager(List<BaseRestaurantWaiter> waiters) {
        this.waiters = waiters;
    }
    //添加一个可用的服务员
    public void addWaiter(BaseRestaurantWaiter waiter){
        this.waiters.add(waiter);
    }
    //由餐厅经理选择服务员来根据游客的需求准备套餐
    public abstract Meal prepareMeal(MainDish mainFood, SnackDish snack, DrinkDish drink);
}
