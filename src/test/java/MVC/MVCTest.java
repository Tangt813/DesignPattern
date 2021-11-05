package MVC;

import Iterator.*;
import MVC.src.Restaurant;
import MVC.src.RestaurantController;
import MVC.src.RestaurantView;
import org.junit.Test;

import java.util.Scanner;


public class MVCTest {
    @Test
    public void mvcTest() {
        System.out.println("MVC模式代表 Model-View-Controller（模型-视图-控制器） 模式");
        System.out.println("使用MVC的目的是将Model和View的实现代码分离，从而使同一个程序可以使用不同的表现形式");
        System.out.println("Controller存在的目的则是确保Model和View的同步，一旦Model改变，View应该同步更新。");
        System.out.println("---------------------------MVC模式 Test---------------------------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("本模式设计应用于餐厅模块，View为餐厅门外的大屏，展示餐厅的空位，排队人数，预计等待时间");
        System.out.println("View是展示的界面，即餐厅大屏幕");
        System.out.println("Controller调用接口来实现属性的改变");
        System.out.println("Model实现函数，实现属性变化过程");
        System.out.println("-----------------------------------------------------------------");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("首先我们创建Model,View,Controller");
        Restaurant restaurant = Restaurant.getRestaurant();
        RestaurantView RV = new RestaurantView();
        RestaurantController RC = new RestaurantController(restaurant, RV);
        System.out.println("当然，当有顾客前来，或者顾客离去，以及各种对属性产生影响时，餐厅管理员可以通过Controller的不同接口");
        System.out.println("实现属性的改变，更新好后的信息将会重新打印");
        System.out.println("一开始我们直接在View展示出所有信息");
        RC.updateView();
        while (true) {
            System.out.println("请输入你要执行的要求：(1.更改店名。2.增加顾客。3.顾客离开。4.显示当前信息。0.退出)");
            Scanner scan = new Scanner(System.in);
            String  choice = scan.nextLine();
            if (choice.equals("1")) {
                System.out.println("请输入新店名：");
                scan = new Scanner(System.in);
                String newName = scan.nextLine();
                RC.setName(newName);
            } else if (choice.equals("2")) {

                System.out.println("请输入来用餐的顾客人数：");
                scan = new Scanner(System.in);
                if(scan.hasNextInt())
                {
                    int number = scan.nextInt();
                    RC.add(number);
                }
                else
                {
                    System.out.println("输入错误，请输入整数！");
                    continue;
                }

            } else if (choice.equals("3")) {
                System.out.println("请输入离开的顾客人数：");
                scan = new Scanner(System.in);
                if(scan.hasNextInt())
                {
                    int number = scan.nextInt();
                    RC.clear(number);
                }
                else
                {
                    System.out.println("输入错误，请输入整数！");
                    continue;
                }

            } else if (choice.equals("5")) {
                RC.showMenu();
            } else if (choice.equals("0")) {
                break;
            }
            RC.updateView();
        }
    }

    public static Restaurant getRestaurant()
    {
        Menu menu = new Menu();
        menu.appendDish(new MainDish("饭",5.0));
        menu.appendDish(new DrinkDish("可乐",5.0));
        menu.appendDish(new SnackDish("零食",5.0));
        Iterator MI=menu.iterator();
        return new Restaurant("一起吃餐厅",MI);
    }

}
