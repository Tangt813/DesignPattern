package Restaurant;
import MVC.src.RestaurantController;
import MVC.src.Restaurant;
import MVC.src.RestaurantView;
import Factory.src.*;
import org.junit.Test;


import java.util.Scanner;

public class RestaurantTest {
    @Test
    public void RestaurantTest()
    {
        System.out.println("----------------------Restaurant Pattern Test Start--------------------");
        //获取Restaurant
        //新建RestaurantView和RestaurantController
        Restaurant restaurant=Restaurant.getRestaurant();
        RestaurantView RV=new RestaurantView();
        RestaurantController RC=new RestaurantController(restaurant,RV);
        //餐厅的DishFactory
        MainFoodFactory Main_Fac=new MainFoodFactory();
        SnackFactory Snack_Fac=new SnackFactory();
        DrinkDishFactory Drink_Fac=new DrinkDishFactory();
        while(true)
        {
            RC.updateView();
            RC.showMenu();
            System.out.println("请输入你要执行的要求：(1.更改店名。2.增加顾客。3.顾客离开。4.显示当前信息。5.展示菜单。0.退出)");
            Scanner scan= new Scanner(System.in);
            int choice=scan.nextInt();
            if(choice==1) {
                System.out.println("请输入新店名：");
                scan= new Scanner(System.in);
                String newName=scan.nextLine();
                RC.setName(newName);
            }
            else if(choice==2) {

                System.out.println("请输入来用餐的顾客人数：");
                scan = new Scanner(System.in);
                int number = scan.nextInt();
                RC.add(number);
                System.out.println("新顾客点餐：");
                DishOrderService service=new DishOrderService();
                System.out.println("查看订单请选择1");
                int op=scan.nextInt();
                if(op==1)
                    System.out.println("您的订单："+"\n主食："+service.getMain()+"\n小吃："+service.getSnack()+"\n饮料："+service.getDrink());
                System.out.println("备餐中...");
                Main_Fac.produceDish(service.getMain(), 22);
                Snack_Fac.produceDish(service.getSnack(), 12);
                Drink_Fac.produceDish(service.getDrink(), 10);
            }
            else if(choice==3) {
                System.out.println("请输入离开的顾客人数：");
                scan = new Scanner(System.in);
                int number = scan.nextInt();
                RC.clear(number);
            }
            else if(choice==5)
            {
                RC.showMenu();
            }
            else if(choice==0) {
                break;
            }
        }
        System.out.println("----------------------Restaurant Pattern Test End----------------------");
    }
}
