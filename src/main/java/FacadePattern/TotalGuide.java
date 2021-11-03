package FacadePattern;/*
@version : 
@author：张世铎
@date:
@description:用于整体场景的导游类
*/
import BuyTicketsSubsystem.DrawTickets;
import Filter.Ticket;
import Singleton.SerialNumberObject;
import Strategy.*;
import Template.BasePerformance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TotalGuide {
    Scanner sc=new Scanner(System.in);
    private String vID;
    private Ticket ticket;
    private String gName="小P";

    public TotalGuide(String gName)
    {
        this.gName=gName;
    }

    public void buyTicket(){
        System.out.println("亲爱的游客，请您告诉我您的ID方便我为您购票哦~");
        this.vID=sc.nextLine();
        while(this.vID.length()<10||this.vID.length()>16)
        {
            System.out.println("您的ID输入有误请重新输入！\n");
            System.out.println("请重新输入你的ID");
            this.vID=sc.nextLine();
        }
        System.out.println("导游购票ing...");
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("这是您的票哦，请收好~\n");
        double price=200;
        String info="非VIP";
        if(this.vID.charAt(0)=='1')
        {
            price=price*0.8;
            info="VIP";
        }
        SerialNumberObject serialNumberObject = SerialNumberObject.getInstance();
        Long num = serialNumberObject.getnumber();
        DrawTickets drawTickets = new DrawTickets();
        drawTickets.run(num, price, info);
    }

    public void play(){
        Tourist context=new Tourist(null);
        System.out.println("我们接下来去海底世界游乐场哦~祝您玩的愉快\n");
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("先体验一下章鱼大摆锤吧\n");
        context.Changemethod(new playBigHammer());
        context.doPlaying();
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("再体验一下洋流过山车，请注意安全\n");
        context.Changemethod(new playRollerCoaster());
        context.doPlaying();
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("游客"+this.vID+"表示在导游"+this.gName+"的带领下玩的很开心");
    }

    public void watch(){
        System.out.println("亲爱的游客，欢迎来到海底大剧场~请欣赏下一场表演\n");
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("     \n" +
                "                                                                                                                    \n" +
                "                                                                      \33[31m              a,                        \33[0m       \n" +
                "                                                                      \33[31m               !  Dq                    \33[0m       \n" +
                "                                                                       \33[31m              ^/   \\                  \33[0m        \n" +
                "                                                                       \33[31m               l   4                  \33[0m        \n" +
                "                                                                       \33[31m               ] pS7#                  \33[0m       \n" +
                "                                                                       \33[31m               | j+q/&       ,         \33[0m       \n" +
                "                                                                        \33[31m       n\\     I Iy/qcl    x^m          \33[0m      \n" +
                "                                                                        \33[31m       & 9,   N A` F`|  ,6  j           \33[0m     \n" +
                "                                                      ,                \33[31m        E  ~b y/ ^   ^ ,O    f           \33[0m     \n" +
                "     \33[94m          MN0f    \33[0m                                0L             \33[31m         ]    \\ $       \\a    Y     \33[0m           \n" +
                "      \33[94m        M0&…&    \33[0m    0K,                       0Bm               \33[31m        l_    ` R$#MQz &   7           \33[0m      \n" +
                "      \33[94m       GM#gCM*%—6 \33[0m     N0g                     g@M#b_               \33[31m      +               \\Y/        \33[0m         \n" +
                "      \33[94m       ^ ]MR      \33[0m      *&0Fs            __,pqg0&MN0&0R0MN&ppgg__,,,,  \33[31m     hj\\         \\   \\       \33[0m           \n" +
                "       \33[94m         #M0A   \33[0m        ]M00p_   _m#m0MR#QMN2NNB&MNN#M&0QNM0MBM#8?~=/  \33[31m    ^%]            II           \33[0m       \n" +
                "       \33[94m        ]^]0M   \33[0m         #0QB0NM*V@N#MMR25N%6KFE$0NA0NMM&0MpE9E%#^      \33[32m    Yp0p#  %^``##N&0p,         \33[0m       \n" +
                "       \33[94m        ] j!    \33[0m         #E^   ~~**a_  `7M@0&WD0##80NN@M00WBM7.         \33[32m     MMH -  ^ ^ ~Z/I          \33[0m        \n" +
                "        \33[94m        ,'    \33[0m         j0`             q,,_rKKDQB&3N^&Q0KB0KBQza*M^     \33[32m    ]0N#%L,  m-S  W           \33[0m       \n" +
                "        \33[94m        #     \33[0m        ,0`               ``~*NAQDWQ&0DQ#M###@           \33[31m     NN&3p-   #t~3            \33[0m       \n" +
                "        \33[94m        &` I    \33[0m                                   ##^                 \33[31m       _ g     ^%p^            \33[0m       \n" +
                "         \33[94m       `\"\"   \33[0m                                                        \33[31m         =^      =^            \33[0m        \n" +
                "    ,g&MMMMNM0@M0M0B00MNMMM&N000MMM0MM0N&MMMMNM0@M0M0B00MNMMM&N000MMM0MMMMM0MM0MNMMM&N000MMM0MMMMM0MM0NMM0MM0Nm  \n" +
                "  MM0MNMMMMMMM0MNMNMNMMN0MM0NM0MMNM0MMNMM0MNMMMMMMM0MNMNMNMMN0MM0NM0MMNM0MMNMNMMNMMN0MM0NM0MMNM0MMNMNMM#8MM#M#8MM#8\n");
        for(int i=0;i<2;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("游客"+this.vID+"表示表演非常精彩！\n");
    }

    public void end(){ for(int i=0;i<2;i++){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
        System.out.println("本次旅程结束了哦~欢迎下次光临");
    }


}
