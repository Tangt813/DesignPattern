

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

        //游客模式
        if(!isAdmin){
            frontControl(1);
            showmap();
            visitorMenu();
        }
        //管理员模式
        else{
            frontControl(2);
           Administrate();
        }

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
    public static void perform(){
        Show perform=new Show();
        perform.show();
        System.out.println("欢迎下次光临！");

    }

    /**
     * 地图显示
     */
    public static void showmap(){
     System.out.format("\33[%dm%s",96,"");
     System.out.println("                                                                                                ______________,_,,,,,,,paauuamwmmmmmmmmmmmmmmmmemmm**m**********mmmmqp,__                                   \n" +
             "                                  _______,,,aaaanmaaamaaa,_p,,,,,,aaaaummmmmw*****NMMM~~\"~~~~~~~~~~~^```^`` `                                                          `^~9*mu,_                            \n" +
             "               ___,awmmm***MM~~~~~\"~~```                                                                                                                                       ^~~M*mq,_                    \n" +
             "           _m*~~`                                                                                                                                                                      `~*m,                \n" +
             "         p#`                                                                                                                                                                               \"Mq              \n" +
             "        p~                                                                                                                                                          __                       `#,            \n" +
             "       gT                                                                                                                                                          j                           Mg           \n" +
             "      jH                                                                                                                                                         qAk#m                          \"&          \n" +
             "      0                                                                                                                                                         ,    x \\                         ~#         \n" +
             "     ]&                                                                                                                                                 __,__,____p,__gL__qg,__                   `&        \n" +
             "     #6                                                                                                                                                 ~9M9~\"*\"~7\"*\"~P^*\"~\"9YM                    ^0       \n" +
             "     #                                                                                                                                                    #Mx  Np#:- _NQ   qM6                      ~&      \n" +
             "     #                                                                                                                                                    MM                K&f                       `&     \n" +
             "    ]f                                                                                                                                                    QB                RB&                        ]&    \n" +
             "    #                                                                                                                                                    gD  ,8f   _  j~?&  DQ                         #6   \n" +
             "    #                                                                                                                                                   _M  05WrB00N##0&MxD  \"$                         0   \n" +
             "   ]f                                                              asasds0ad2,                                                                                   表演会场                        ]&  \n" +
             "   #                                                           x :.'        ',$ s                                                                                                                                #  \n" +
             "   #                                                            -^^   _au_   *+                                                                                                                          ]& \n" +
             "   0                                                         a-  ,    #qj@        =                                                                                                                       0 \n" +
             "   &                                                         \\E \"    pF   \"&,   f #N                                                                                                                       B \n" +
             "   &                                                            _  yM      \"m,                                                                                                                            0 \n" +
             "  ]&                                                            .gM^s       ~#p !                                                                                                                         0 \n" +
             "  ]A                                                            #M\"~  t,\\ :   ~Mx                                                                                                                         # \n" +
             "  Q&                                                             ^       ^                                                                                                                              jA \n" +
             "  #5                                    ga                   =&**+**+***==*=********                                        #WM#&#                                                                      0  \n" +
             "  #                            a#        _0                           摩天轮                                                 gNM#00h                                                                     jf  \n" +
             "  0                           p:h_      _]3                                                                           ,&q,  4F4#@Nf _j0p                                                                B   \n" +
             "  0                          F  \\B,    ,,M:                                                                           #0d,,_JQNN&NL,,dNS                                                               ]#   \n" +
             "  #                        ,P    `~k -,*0'                                                                            Q0M0           &&R&                                                               Q6   \n" +
             "  0                       p~       W#pM^                                                                              #uK0           0#p&                                                               #    \n" +
             "  #                     _4    ,,_    7 _                                                                              0&NQ           0&RN                                                              ]F    \n" +
             "  ]&                 +0&#3MSDN&Rr&3@&8^P&M                                                                            kD&ANM&#00K&0##8#MA                                                             #     \n" +
             "   0                          大摆锤                      __mN0MM4MNpqg_                                               J0MNZ&0M###00MNMN#0                                                             ]#     \n" +
             "   M6                                                 ,eN3\"=        7Nkg                                                    餐厅                                                                    #      \n" +
             "    #                                               _NM\"               ~Q,                                                                                                                          jF      \n" +
             "     &                                              NC~                 ~#                                                                                                                         _#       \n" +
             "     ]&                                             0#           _,r*\"~^~Nn_                                                                                                                       #        \n" +
             "      ~&                                         ___0Q`         t~~     y#  #g                                                                                                                    p^        \n" +
             "        0q                                     0@^^\"~MNp,    y+`       g0E   &                                                                                                                   #f         \n" +
             "         \"&                                   #1      ^0&Mq&~       _mM\" ,  m!                                                                                                                  0^          \n" +
             "           Mq_                                 btm,, =m*\"~D00O#vv*EE$&mxw0BP^                                                                                                                 _0^           \n" +
             "             ~Nq_                                  ~             ^                                                                                                                           p0             \n" +
             "                ^~*mm,__                                     过山车                                                                                                       _,mm***M**mmug,,_,M~              \n" +
             "                      `~~\"@*mmq,__                                                                                                                                  __,pM~^               ``                \n" +
             "                                `~~M**mwq,____                                                                                                                _pmM~~~`                                      \n" +
             "                                          ``~~~~~\"MMM*****mmmmuaaaa,________                                                                                gF~                                             \n" +
             "                                                                      ```~~~~~~~~MP****mmma,,__                                                            #'                                               \n" +
             "                                                                                             `^~MMmq_                                                     jf                T                               \n" +
             "                                                                                                    `~Mmq_                                                #                 -                               \n" +
             "                                                                                                         ^~Nq                                             0                - \"                              \n" +
             "                                                                                                             \"Q_                                          0          _    gp*p                              \n" +
             "                                                                                                               ^Q_                                        4p        :~--- W%,N    #  ^                      \n" +
             "                                                                                                                 Mg                                        #         p   :        -yg                        \n" +
             "                                                                                                                  #,                                       0         F  bz:      {d \"~                        \n" +
             "                                                                                                                  ]f                                       #          - %: DQ6:T~                           \n" +
             "                                                                                                                  ]&                                       ~       \"^~~~~~~\"~\"~\"\"\"^~~                       \n" +
             "                                                                                                                 _0'                                                      票务中心                           ");
     System.out.format("\33[%dm%s",0,"");
    }

}


