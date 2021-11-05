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
