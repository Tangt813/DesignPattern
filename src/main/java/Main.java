

import FacadePattern.TotalGuide;
import FrontController.FrontController;
import BuyTicketsSubsystem.*;
import Show.Show;
import SouvenirShop.SouvenirShopSubsystem;

import AdministratorSubsystem.*;
import Restaurant.*;
import FacilityPlaySubsystem.*;


import java.text.ParseException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) throws ParseException, InterruptedException {
        // 最后的汇总写在这里

        Scanner mainScanner=new Scanner(System.in);
        boolean isAdmin = login();
        boolean needGuide=false;

        //游客模式
        if(!isAdmin){
            frontControl(1);
            showmap();
            needGuide=needGuide();
            //导游代理模式
            if(needGuide)
                Guide();
            else
                visitorMenu();
        }
        //管理员模式
        else{
            frontControl(2);
           Administrate();
        }

    }

    /**
     * 是否需要导游
     */
    public static boolean needGuide(){
        System.out.println("本次嘉年华提供向导服务，请问您是否需要导游？\n" +
                "1、需要导游\n" +
                "2、不需要导游\n");
        Scanner scanner=new Scanner(System.in);
        return scanner.nextInt()==1;
    }

    /**
     * 导游执行
     */
    public static void Guide(){
        TotalGuide guide=new TotalGuide("阿P");
        guide.buyTicket();
        guide.play();
        guide.watch();
        guide.end();
    }


    /**
     * 前端控制器
     */
    public static void frontControl(int order) throws InterruptedException {
        FrontController frontController = new FrontController();
        if(order==1) {
            frontController.dispatchRequest("Customer","Customer");
            System.out.println("\n");
        }
        else if(order==2){
            frontController.dispatchRequest("Worker","Worker");
            System.out.println("\n");
        }
        Thread.sleep(2000);
    }

    /**
     * 登录
     */
    public static boolean login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择登陆模式：\n" +
                "1、游客登录\n" +
                "2、管理员登录");
        int isAdmin=scanner.nextInt();
        return isAdmin != 1;
    }

    /**
     * 管理员模块
     */
    public static void Administrate(){
      Administrator Admin=new Administrator();
      Admin.show();
    }

    /**
     * 游客菜单
     */
    public static boolean visitorMenu() throws ParseException, InterruptedException {
        boolean hasTicket=false;
        boolean exit=false;
        int order;
        while(!exit){
            Thread.sleep(2000);
            System.out.println(
                    "=======menu=======\n"+
                    "请选择要前往的地区:\n" +
                    "1.票务中心\n" +
                    "2.游乐场\n" +
                    "3.表演会场\n" +
                    "4.园区餐厅\n" +
                    "5.纪念品商店\n" +
                    "0.离开\n"+
                    "=======menu=======");
            Scanner sc=new Scanner(System.in);
            order=sc.nextInt();
            switch (order){
                case 0:
                    exit=true;
                    System.out.println("您已离开园区！欢迎下次光临！");
                    break;
                case 1:
                    hasTicket=ticket();
                    break;
                case 2:
                    if(hasTicket)
                        facilityPlay();
                    else
                        System.out.println("您还未购票，暂时不能入园！");
                    break;
                case 3:
                    if(hasTicket)
                        perform();
                    else
                        System.out.println("您还未购票，暂时不能入园！");
                    break;
                case 4:
                    if(hasTicket)
                        restaurant();
                    else
                        System.out.println("您还未购票，暂时不能入园！");
                    break;
                case 5:
                    if(hasTicket)
                        souvenirShop();
                    else
                        System.out.println("您还未购票，暂时不能入园！");
                    break;
                default:
                    System.out.println("指令错误！");
                    break;

            }
        }
        return hasTicket;
    }

    /**
     * 餐厅模块
     */
    public static void restaurant()
    {
        RestaurantSubsystem restaurant=new RestaurantSubsystem();
        restaurant.show();
        System.out.println("欢迎下次光临");

    }

    /**
     * 票务模块
     */
    public static boolean ticket() throws ParseException {
        BuyTickets ticketing=new BuyTickets();
        ticketing.show();
        return ticketing.hasTicket;
    }

    /**
    * 游乐场模块
     */
    public static void facilityPlay()
    {
        FacilityPlay play=new FacilityPlay();
        play.show();
    }

    /**
     * 纪念品商店模块
     */
    public static void souvenirShop(){
        SouvenirShopSubsystem souvenirShop=new SouvenirShopSubsystem();
        souvenirShop.show();
        System.out.println("欢迎下次光临！");
    }

    /**
     * 表演模块
     */
    public static void perform() throws InterruptedException {
        Show perform=new Show();
        perform.show();
        System.out.println("欢迎下次光临！");

    }

    /**
     * 地图显示
     */
    public static void showmap(){
     System.out.format("\33[%dm%s",96,"");
     System.out.println(" " +
             " mm m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m m\n" +
             " M                                                                                                              M \n" +
             " #                                                                                                              # \n" +
             " #                                                                                                              # \n" +
             " #                                                                                         |-|                  # \n" +
             " #                                                                                         T D                  # \n" +
             " #                                                                                  0 * * * m e * m * v         # \n" +
             " #                                                                                      #  Y 4 4 M              # \n" +
             " #           , ,                                                                        9 , %   T *             # \n" +
             " #         ;  - }                                                                         ~ ' ^ 0 %             # \n" +
             " #        ' ^  J                                                                           表演会场              # \n" +
             " #       (  Q ] '               - - -*                                                                          # \n" +
             " #        __ } ,              (     ;  )                                                                        # \n" +
             " #       ^~~^ ^ ^ ^          (     *  y  )                                                                      # \n" +
             " #        大摆锤                (7'   ^ )                                                                        # \n" +
             " #                          === * + *= ===                                                                      # \n" +
             " #                             摩天轮                                                                            # \n" +
             " #                 x * * x                                                                                      # \n" +
             " #                E        l                                                 ] q g |                            # \n" +
             " #                6  ,- \\ *                                              j ] S M M j                           # \n" +
             " #              +~\\,/  ///                                               F g r * 7 g  0                        # \n" +
             " #              ]- - ^ * * & = '                                            DQG_4#G                             # \n" +
             " #                  过山车                                                   B0D#0#g                             # \n" +
             " #                                                                          +*@*M+\"*-                          # \n" +
             " #                                                                             餐厅                              # \n" +
             " #                                                                                                              # \n" +
             " #                                                                                                              # \n" +
             " #                                                                                                              # \n" +
             " #                                                                                                              # \n" +
             " #                                                                                              ] l .           # \n" +
             " #                                                                                            n @ & ,           # \n" +
             " #                                                                                              mX1             # \n" +
             " #                                                                                            ~ ~ ~^ ^          # \n" +
             " #                                                                             *GATE*          票务中心          # \n" +
             " #                                                                             *    *                           # \n" +
             " ]g                                                                            *    *                           y' \n" +
             "  ^9 * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *    * * * * * * * * * * * * * * *");
     System.out.format("\33[%dm%s",0,"");
    }

}


