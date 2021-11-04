package Show;
import Template.*;
import BridgePattern.*;
import ServiceLocatorPattern.*;

import java.util.ArrayList;
import java.util.List;

public class ShowTest {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("唐烁baby走着走着，走到了马戏团表演场");
        System.out.println("管理员:帅哥你好，请问您是来看马戏团表演的吗？");
        System.out.println("唐烁:是的");
        System.out.println("管理员:好的帅哥，请出示您的票务");

        Youth youth = new Youth("TSGirlbaby",true);
        youth.getSpecialTicket();
//        System.out.println("\33[96m*-----------------------*");
//        System.out.println("|    调用了适配器模式哦    |");
//        System.out.println("*-----------------------*\33[0m");

        System.out.println("\n经纪人:演员现在在哪里？在哪里？做好准备，马上要入场了\n负责人，告诉我演员都在哪里");
        ServiceDetails seaHouse = new ServiceDetails("海马","海马小馆",false);
        ServiceDetails shark = new ServiceDetails("大白鲨","大白鲨馆",false);
        ServiceDetails paidaxing = new ServiceDetails("派大星","派大星小屋",false);
        ServiceLocator.addService(seaHouse);
        ServiceLocator.addService(shark);
        ServiceLocator.addService(paidaxing);
        System.out.println("*-----------------------*");
        ServiceLocator.listDetails();
        System.out.println("*-----------------------*");
        System.out.println("经纪人:所有演员尽快赶来马戏团，表演要开始了");
        int i=0;
        for(i=0;i<2;i++){
            System.out.println("            |");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("*-----------------------*");
        System.out.println("|   经过5min演员迅速赶来   |");
        System.out.println("*-----------------------*");
        for(i=0;i<2;i++){
            System.out.println("            |");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String pos="马戏团央视大舞台";
        ServiceLocator.modiServicePos(pos,"海马");
        ServiceLocator.modiServicePos(pos,"大白鲨");
        ServiceLocator.modiServicePos(pos,"派大星");
        ServiceLocator.modiServiceAct(true,"海豚");
        ServiceLocator.modiServiceAct(true,"海狮");
        ServiceLocator.modiServiceAct(true,"海豹");
        System.out.println("负责人:告诉我现在演员位置信息");
        System.out.println("*-----------------------*");
        ServiceLocator.listDetails();
        System.out.println("*-----------------------*");
        System.out.println("负责人:老板，演员已就位");
//        System.out.println("\33[96m*-----------------------*");
//        System.out.println("|  调用了服务定位器模式哦  |");
//        System.out.println("*-----------------------*\33[0m");

        System.out.println("\n负责人:女生们和先生们，马戏团表演即将开始，有我们的演员登场！");
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
        List<BasePerformance> performances = new ArrayList<BasePerformance>();
        performances.add(new DolphinPerformance());
        performances.add(new SealPerformance());
        performances.add(new SeaLionPerformance());

        for(BasePerformance p: performances) {
            p.performProcess();
        }
//        System.out.println("\33[96m*-----------------------*");
//        System.out.println("|     调用了模板模式哦     |");
//        System.out.println("*-----------------------*\33[0m");
    }
}
