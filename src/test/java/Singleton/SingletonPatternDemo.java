package Singleton;

import java.util.Scanner;

public class SingletonPatternDemo {
    public void singletonTest(){
        SerialNumberObject getSerialNumber=SerialNumberObject.getInstance();
        Scanner sc=new Scanner(System.in);
        String index="";
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
