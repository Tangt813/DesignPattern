package SouvenirShop;
import FlyweightPattern.*;
import BusinessDelegate.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> radiusAll = Arrays.asList(6, 8, 10, 12);
    public static List<String> colorsAll = Arrays.asList("blue", "yellow", "red", "white", "green");
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(radiusAll,colorsAll);
        WarehouseDelegate warehouseDelegate = new WarehouseDelegate();
        WarehouseClient client = new WarehouseClient(warehouseDelegate);
        warehouseDelegate.setServiceType(WarehouseServiceType.PickUp);
        System.out.println("店小哥:欢迎来到海底世界纪念品店！" +
                "\n请问需要什么呢");
        System.out.println("Ameis:我看这个水晶球不错啊，来个水晶球吧");
        System.out.println("店小哥:帅哥你眼光真好，我们这里的水晶球还可以定制哦" +
                "\n自选颜色，半径大小，以及可以刻上你想要的纪念名称");
        System.out.println("Ameis:我看这个水晶球不错啊，来个水晶球吧");
        System.out.println("店小哥:好的，那您来选择相应的半径，颜色，定制名称");
        Scanner input=new Scanner(System.in);
        System.out.println("请问您是否要购买水晶球 [Y/N]");
        String isTrue=input.next();
        while (isTrue.equalsIgnoreCase("Y")){

            System.out.println("请输入您想要的规格参数");
            System.out.print("半径:");
            int raduis1=input.nextInt();
            System.out.print("颜色:");
            String color1=input.next();
            System.out.print("图案:");
            String names1=input.next();
            if (client.doTask(raduis1,color1, warehouse)){
                CrystalBall crystalBal = CrystallBallFactory.getCrystalBall(raduis1);
                crystalBal.setName(names1);
                crystalBal.setColor(color1);
                System.out.println("稍等片刻，你的水晶球马上做好！");
//                String people="\r     ,*~~*,       \n    ] .  . |      \n    l  q_, ]      \n      ;~Z^        \n     y`  ~m,      \n    *   c   ~     \n        f         \n        I         \n       / \\        \n      y   *       \n     _^    ^,     \n"+"\r         ,*~~*,       \n        ] .  . |      \n        l  q_, ]      \n          ;~Z^        \n         y`  ~m,      \n        *   c   ~     \n            f         \n            I         \n           / \\        \n          y   *       \n         _^    ^,     \n" + "\r                ,*~~*,       \n               ] .  . |      \n               l  q_, ]      \n                 ;~Z^        \n                y`  ~m,      \n               *   c   ~     \n                   f         \n                   I         \n                  / \\        \n                 y   *       \n                _^    ^,     \n";
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                crystalBal.draw1(names1);
            }
            else {
                System.out.println("抱歉帅哥，这款太火爆了，库存已经卖完了");
            }
            System.out.println("请问您是否要继续购买购买呢 [Y/N]");
            isTrue=input.next();
        }


    }
}
