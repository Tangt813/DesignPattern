package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

import java.util.Scanner;


public class DishOrderService {
    public Scanner sc = new Scanner(System.in);
    private String mainfood;
    private String snack;
    private String drink;

    public DishOrderService()
    {
        System.out.println("请选择主食：");
        this.mainfood=sc.next();
//        this.mainfood="汉堡";
        System.out.println("请选择小吃：");
        this.snack=sc.next();
//        this.snack="薯条";
        System.out.println("请选择饮料：");
        this.drink=sc.next();
//        this.drink="可乐";
    }

    public String getMain(){return mainfood;}
    public String getSnack(){return snack;}
    public String getDrink(){return drink;}
}
