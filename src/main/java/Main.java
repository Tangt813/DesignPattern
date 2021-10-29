
import Builder.RestaurantManager;
import Builder.RestaurantWaiter;
import Factory.src.*;
import MVC.src.Controller.RestaurantController;
import MVC.src.model.Restaurant;
import MVC.src.view.RestaurantView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        // 最后的汇总写在这里
        System.out.println("haha");
        restaurant();
        System.out.println("test");
    }

    /**
     * 餐厅模块
     */
    public static void restaurant()
    {
        System.out.println("----------------------Restaurant Pattern Test Start--------------------");
        //初始化Restaurant,视图RestaurantView,控制器RestaurantController
        Restaurant restaurant=Restaurant.getRestaurant();
        RestaurantView RV=new RestaurantView();
        RestaurantController RC=new RestaurantController(restaurant,RV);
        RC.updateView();
        RC.showMenu();
        while(true)//之后true改为choice，选择了展示MVC模式才进入
        {
            //首先先输出一次信息

            System.out.println("请输入你要执行的要求：(1.更改店名。2.增加顾客。3.顾客离开。4.显示当前信息。5.展示菜单。6.顾客点餐。0.退出)");
            Scanner scan= new Scanner(System.in);
            int choice=scan.nextInt();
            if(choice==1) {
                System.out.println("请输入新店名：");
                scan= new Scanner(System.in);
                String newName=scan.nextLine();
                System.out.println("通过读入新店名，通过Controller调用setName函数完成修改");
                RC.setName(newName);

            }
            else if(choice==2) {

                System.out.println("请输入来用餐的顾客人数：");
                scan = new Scanner(System.in);
                int number = scan.nextInt();
                System.out.println("通过读入前来用餐的人数,通过Controller调用add函数完成修改");
                RC.add(number);
            }
            else if(choice==3) {
                System.out.println("请输入离开的顾客人数：");
                scan = new Scanner(System.in);
                int number = scan.nextInt();
                System.out.println("通过读入离开的人数,通过Controller调用clear函数完成修改");
                RC.clear(number);
            }
            else if(choice==4)
            {
                RC.updateView();
            }
            else if(choice==5)
            {

                System.out.println("通过Controller调用showMenu函数展示菜单");
                RC.showMenu();
            }
            else if(choice==6){
                RestaurantManager restaurantManager = new RestaurantManager(new RestaurantWaiter());
                MainFoodFactory mainFoodFactory=new MainFoodFactory();
                SnackFactory snackFactory=new SnackFactory();
                DrinkDishFactory drinkDishFactory=new DrinkDishFactory();
                //新建订单
                DishOrderService order=new DishOrderService();
                String mainFoodName=order.getMain();
                String snackName=order.getSnack();
                String drinkName=order.getDrink();
                //生产食品
                MainDish mainDish = mainFoodFactory.produceDish(mainFoodName, 60);
                SnackDish snackDish = snackFactory.produceDish(snackName, 40);
                DrinkDish drinkDish = drinkDishFactory.produceDish(drinkName, 20);
                restaurantManager.prepareMeal(mainDish, snackDish, drinkDish);
                System.out.println("顾客收到了餐品。");
            }
            else if(choice==0) {
                break;
            }
        }
    }

}
