package Singleton;

import java.util.Scanner;

public class SingletonPatternDemo {
    public static void main(String[] args){
        SerialNumberObject getSerialNumber=SerialNumberObject.getInstance();
        Scanner sc=new Scanner(System.in);
        int index=-1;
        while (index!=0){
            System.out.println("***************************************************单例模式****************************************************");
            System.out.println("*                                              1->获取一个门票序列号                                            *");
            System.out.println("*                                              0->退出                                                        *");
            System.out.println("**************************************************************************************************************");
            index=sc.nextInt();
            switch (index){
                case 1:
                    getSerialNumber.getnumber();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("wrong command");
                    break;
            }

        }
System.out.println("谢谢使用单例模式!");
    }


}
