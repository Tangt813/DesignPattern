
import Builder.BaseRestaurantManager;
import Builder.RestaurantManager;
import Builder.RestaurantWaiter;
import Factory.src.*;
import MVC.src.RestaurantController;
import MVC.src.Restaurant;
import MVC.src.RestaurantView;

import MVC.src.RestaurantController;
import MVC.src.Restaurant;
import MVC.src.RestaurantView;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 最后的汇总写在这里

        Scanner mainScanner=new Scanner(System.in);
        boolean isAdmin=login();

        //游客模式
        if(!isAdmin){

        }
        //管理员模式
        else{

        }


        menu();


    }
    public static boolean login(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("请选择登陆模式：\n" +
                "1、游客登录\n" +
                "2、管理员登录");
        int isAdmin=scanner.nextInt();
        return isAdmin != 1;

    }
    public static void menu(){
        boolean exit=false;
        int order;
        showmap();
        while(!exit){

            System.out.println("请选择要前往的地区:\n" +
                    "1.票务中心\n" +
                    "2.游乐场\n" +
                    "3.表演会场\n" +
                    "4.园区餐厅\n" +
                    "5.纪念品商店\n" +
                    "0.离开");
            Scanner sc=new Scanner(System.in);
            order=sc.nextInt();
            switch (order){
                case 0:
                    exit=true;
                    System.out.println("您已离开园区！欢迎下次光临！");
                    break;
                case 1:
                    ticket();
                    break;
                case 2:
                    facility();
                    break;
                case 3:
                    perform();
                    break;
                case 4:
                    restaurant();
                    break;
                case 5:
                    shop();
                    break;

            }
        }
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
                BaseRestaurantManager restaurantManager = new RestaurantManager();
                restaurantManager.addWaiter(new RestaurantWaiter());
                MainFoodFactory mainFoodFactory=new MainFoodFactory();
                SnackFactory snackFactory=new SnackFactory();
                DrinkDishFactory drinkDishFactory=new DrinkDishFactory();
                //新建订单
                DishOrderService order=new DishOrderService();
                String mainFoodName=order.getMain();
                String snackName=order.getSnack();
                String drinkName=order.getDrink();
                //生产食品
                MainDish mainDish = mainFoodFactory.produceDish(mainFoodName, 20);
                SnackDish snackDish = snackFactory.produceDish(snackName, 10);
                DrinkDish drinkDish = drinkDishFactory.produceDish(drinkName, 8);
                restaurantManager.prepareMeal(mainDish, snackDish, drinkDish);
                System.out.println("顾客收到了餐品。");
            }
            else if(choice==0) {
                break;
            }
        }
    }

    /**
     * 票务模块
     */
    public static void ticket(){

    }

    /**
    * 游乐场模块
     */
    public static void facility(){

    }

    /**
     * 纪念品商店模块
     */
    public static void shop(){}

    /**
     * 表演模块
     */
    public static void perform(){

    }

 public static void showmap(){
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
             "     #                                                                                                                                                    MM   K0,&T,\"9&6  K&f                       `&     \n" +
             "    ]f                                                                                                                                                    QB  yDMz~  T\"M#  RB&                        ]&    \n" +
             "    #                                                                                                                                                    gD  ,8f   _  j~?&  DQ                         #6   \n" +
             "    #                                                                                                                                                   _M  05WrB00N##0&MxD  \"$                         0   \n" +
             "   ]f                                                                        ,                                                                                   表演会场                        ]&  \n" +
             "   #                                                           x :.'        ',$ s                                                                                                                                #  \n" +
             "   #                                                            -^^   _au_   *+                                                                                                                          ]& \n" +
             "   0                                                         a-  ,    #qj@        =                                                                                                                       0 \n" +
             "   &                                                         \\E \"    pF  \"&,   f #N                                                                                                                       B \n" +
             "   &                                                            _  yM      \"m,                                                                                                                            0 \n" +
             "  ]&                                                            .gM^s       ~#p !                                                                                                                         0 \n" +
             "  ]A                                                            #M\"~  t,\\ :   ~Mx                                                                                                                         # \n" +
             "  Q&                                                             ^       ^                                              ==            !**                                                                jA \n" +
             "  #5                                    ga                   =&**+**+***==*=********                                        #WM#&#    f                                                                  0  \n" +
             "  #                            a#        _0                           摩天轮                                           &   ,gNM#00h   K                                                                 jf  \n" +
             "  0                           p:h_      _]3                                                                           ,&q,  4F4#@Nf _j0p                                                                B   \n" +
             "  0                          F  \\B,    ,,M:                                                                           #0d,,_JQNN&NL,,dNS                                                               ]#   \n" +
             "  #                        ,P    `~k -,*0'                                                                            Q0M0N0gJ   yg0&&R&                                                               Q6   \n" +
             "  0                       p~       W#pM^                                                                              #uK0N0^Q- *(_00#p&                                                               #    \n" +
             "  #                     _4    ,,_    7 _                                                                              0&NQM00QEZ#0B0#&RN                                                              ]F    \n" +
             "  ]&                 +0&#3MSDN&Rr&3@&8^P&M                                                                            kD&ANM&#00K&0##8#MA                                                             #     \n" +
             "   0                          大摆锤                      __mN0MM4MNpqg_                                               J0MNZ&0M###00MNMN#0&x                                                           ]#     \n" +
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
             "                                                                                                                 Mg                                        #         p   :4&Z0!  -yg                        \n" +
             "                                                                                                                  #,                                       0         F  bz:\"( ~{d \"~                        \n" +
             "                                                                                                                  ]f                                       #          - %: DQ6:T~                           \n" +
             "                                                                                                                  ]&                                       ~       \"^~~~~~~\"~\"~\"\"\"^~~                       \n" +
             "                                                                                                                 _0'                                                      票务中心                           ");
 }
}


