package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:点餐操作在内的类
*/

import java.util.Scanner;


public class DishOrderService {
    public Scanner sc = new Scanner(System.in);
    private String mainfood;
    private String snack;
    private String drink;

    //默认构造函数
    public DishOrderService()
    {
        System.out.println("请选择主食：");
        this.mainfood=sc.nextLine();
//        this.mainfood="汉堡";
        System.out.println("请选择小吃：");
        this.snack=sc.nextLine();
//        this.snack="薯条";
        System.out.println("请选择饮料：");
        this.drink=sc.nextLine();
//        this.drink="可乐";
    }
    //获取主食类别
    public String getMain(){return mainfood;}
    //获取小吃类别
    public String getSnack(){return snack;}
    //获取饮料类别
    public String getDrink(){return drink;}
}
