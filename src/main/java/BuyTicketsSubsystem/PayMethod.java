package BuyTicketsSubsystem;/*
@version : 
@author：张世铎
@date:
@description:
*/
import proxy.BankCardPayment;
import proxy.Payment;
import proxy.WechatPayment;

import java.util.Scanner;

public class PayMethod {
    public void ChoosePayMethod(double cost){
        Payment Wechat_Payment=null;
        Payment BankCard_Payment=null;
        Scanner sc=new Scanner(System.in);
        int index=-1;
        while (index!=0) {
            System.out.println("***************************************************Proxy******************************************************");
            System.out.println("*                                              1->pay by bank card                                           *");
            System.out.println("*                                              2->pay on Wechat                                              *");
            System.out.println("**************************************************************************************************************");
            index = sc.nextInt();
            switch (index) {
                case 1:
                    if (BankCard_Payment == null)
                        BankCard_Payment = new BankCardPayment(cost);
                    //System.out.println(BankCard_Payment.Pay());
                    index = 0;
                    break;
                case 2:
                    if (Wechat_Payment == null)
                        Wechat_Payment = new WechatPayment(cost);
                    //System.out.println(Wechat_Payment.Pay());
                    index = 0;
                    break;
                case 0:
                    System.out.println("wrong command");
                    index=-1;
                    break;
                default:
                    System.out.println("wrong command");
                    break;
            }
        }
    }

}
