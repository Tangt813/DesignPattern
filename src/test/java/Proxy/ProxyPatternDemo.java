package Proxy;

import proxy.BankCardPayment;
import proxy.Payment;
import proxy.WechatPayment;

import java.util.Scanner;

public class ProxyPatternDemo {
    public void proxyTest(){
        int cost=100;
        Payment Wechat_Payment=null;
        Payment BankCard_Payment=null;
        Scanner sc=new Scanner(System.in);
        String index="";
        System.out.println("在代理模式（Proxy Pattern）中，一个类代表另一个类的功能。这种类型的设计模式属于结构型模式。\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("在购买门票时，游客可以使用网银支付方式。\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("本着客户至上的原则，为了进一步方便游客支付，我们还提供了微信支付方式。\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("在微信支付这一方法类中，调用了网银支付的支付功能\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("也就是说，微信支付本质上使用的仍是网银的支付功能\n\n");
        while (!index.equals("0")){
            System.out.println("*************************************************代理模式******************************************************");
            System.out.println("*                                              1->用银行卡支付                                                 *");
            System.out.println("*                                              2->用微信支付                                                   *");
            System.out.println("*                                              0->退出                                                        *");
            System.out.println("**************************************************************************************************************");
            index=sc.nextLine();
           if(index.equals("1")){
               if(BankCard_Payment==null)
                       BankCard_Payment=new BankCardPayment(cost);
                    System.out.println(BankCard_Payment.Pay());
           }
          else if(index.equals("2")){
               if(Wechat_Payment==null)
                        Wechat_Payment=new WechatPayment(cost);
                    System.out.println(Wechat_Payment.Pay());
           }
          else if (index.equals("0")){
              continue;
           }
          else {
               System.out.println("wrong command");
           }
//            switch (index){
//                case 1:
//                    if(BankCard_Payment==null)
//                        BankCard_Payment=new BankCardPayment(cost);
//                    System.out.println(BankCard_Payment.Pay());
//                    break;
//                case 2:
//                    if(Wechat_Payment==null)
//                        Wechat_Payment=new WechatPayment(cost);
//                    System.out.println(Wechat_Payment.Pay());
//                    break;
//                case 0:
//                    break;
//                default:
//                    System.out.println("wrong command");
//                    break;
//            }
        }
        System.out.println("谢谢使用代理模式！");
    }

}
