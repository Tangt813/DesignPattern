package proxy;

import java.util.Scanner;

public class ProxyPatternDemo {
    public static void main(String[] args){
        Payment payment=new WechatPayment(100);
        Scanner sc=new Scanner(System.in);
        int index=-1;
        while (index!=0){
            System.out.println("***************************************************Proxy******************************************************");
            System.out.println("*                                              1->pay for a ticket                                           *");
            System.out.println("*                                              0->exit                                                       *");
            System.out.println("**************************************************************************************************************");
            index=sc.nextInt();
            switch (index){
                case 1:
                    payment.Pay();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("wrong command");
                    break;
            }
        }
        System.out.println("Thanks for using Wechat Payment!1" +
                "");
    }

}
