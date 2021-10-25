package MVC.src;

import MVC.src.Controller.RestaurantController;
import MVC.src.model.Restaurant;
import MVC.src.view.RestaurantView;

import java.util.Scanner;

import Iterator.*;

public class MVCDemo {
    public static void main(String[] args) {

        Restaurant restaurant = Restaurant.getRestaurant();
        RestaurantView RV = new RestaurantView();
        RestaurantController RC = new RestaurantController(restaurant, RV);
        while (true) {
            RC.updateView();
            RC.showMenu();
            System.out.println("请输入你要执行的要求：(1.更改店名。2.增加顾客。3.顾客离开。4.显示当前信息。5.展示菜单。0.退出)");
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            if (choice == 1) {
                System.out.println("请输入新店名：");
                scan = new Scanner(System.in);
                String newName = scan.nextLine();
                RC.setName(newName);
            } else if (choice == 2) {

                System.out.println("请输入来用餐的顾客人数：");
                scan = new Scanner(System.in);
                int number = scan.nextInt();
                RC.add(number);
            } else if (choice == 3) {
                System.out.println("请输入离开的顾客人数：");
                scan = new Scanner(System.in);
                int number = scan.nextInt();
                RC.clear(number);
            } else if (choice == 5) {
                RC.showMenu();
            } else if (choice == 0) {
                break;
            }
        }
    }


}
