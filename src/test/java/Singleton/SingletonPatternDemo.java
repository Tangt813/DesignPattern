package Singleton;

import java.util.Scanner;

public class SingletonPatternDemo {
    public void singletonTest(){
        SerialNumberObject getSerialNumber=SerialNumberObject.getInstance();
        Scanner sc=new Scanner(System.in);
        String index="";
        System.out.println("");
        System.out.println("单例模式保证一个类仅有一个实例，该类负责创建自己的对象，并提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("在游客购买门票后，门票系统会生成一个门票序列号。\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我们将门票序列号生成系统设计为一个单一实体。\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("该实体只在第一次被调用时创建，节省了系统运行空间.\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("并且，单一实体的门票序列号能保证每一张门票的序列号都是唯一的。\n\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        while (!index.equals("0")){
            System.out.println("***************************************************单例模式****************************************************");
            System.out.println("*                                              1->获取一个门票序列号                                            *");
            System.out.println("*                                              0->退出                                                        *");
            System.out.println("**************************************************************************************************************");
            index=sc.nextLine();
            if (index.equals("1")){
                getSerialNumber.getnumber();
            }
            else if (index.equals("0")){
                continue;
            }
            else {
                System.out.println("wrong command");
            }
//            switch (index){
//                case 1:
//                    getSerialNumber.getnumber();
//                    break;
//                case 0:
//                    break;
//                default:
//                    System.out.println("wrong command");
//                    break;
//            }

        }
System.out.println("谢谢使用单例模式!");
    }


}
