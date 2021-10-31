package BuyTicketsSubsystem;

import Decorated.Customer;
import Decorated.People;
import Decorated.VIPCustomer;
import Singleton.SerialNumberObject;

import java.util.Scanner;

public class BuyTickets {
    public static void main(String[] args) {
        System.out.println("欢迎来到线上购票系统");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.购票\n2.退票\n3.退出");
        String command = scanner.nextLine();
        while(!command.equals("3")) {
            if(command.equals("1")) {
                System.out.println("请输入你的ID");
                String id;
                id = scanner.nextLine();
                People user = new Customer(id);
                if (id.charAt(0) == '1') {
                    user = new VIPCustomer(user);
                }
                String info = user.buyTicket();
                double price = 200;
                if (info.equals("discount")) {
                    price = price * 0.8;
                } else if (info.equals("free")) {
                    System.out.println("您无需购票，请凭相关证件直接进入");
                    return;
                }
                System.out.println("请选择付款方式:");
                PayMethod payMethod = new PayMethod();
                payMethod.ChoosePayMethod(price);
                OrderForm orderForm = new OrderForm(price, info);
                boolean ifPay = orderForm.run();
                if (!ifPay) {
                    return;
                }
                SerialNumberObject serialNumberObject = SerialNumberObject.getInstance();
                Long num = serialNumberObject.getnumber();
                DrawTickets drawTickets = new DrawTickets();
                drawTickets.run(num, price, info);
            }
            else if(command.equals("2")){
                //在这里写退票
                System.out.println("退票");
            }
            else{
                continue;
            }
            System.out.println("\n1.购票\n2.退票\n3.退出");
            command = scanner.nextLine();
        }
    }
}
