package BuyTicketsSubsystem;

import ChainOfResponsibility.AutoHandler;
import ChainOfResponsibility.BaseHandler;
import ChainOfResponsibility.RefundRequest;
import Decorated.Customer;
import Decorated.People;
import Decorated.VIPCustomer;
import Filter.Ticket;
import Singleton.SerialNumberObject;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class BuyTickets {
    public boolean hasTicket=false;

    public void show() throws ParseException {
        System.out.println("欢迎来到线上购票系统");
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                "=========\n" +
                "1.购票\n" +
                "2.退票\n" +
                "3.退出\n" +
                        "=========");
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
                    this.hasTicket=true;
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
                this.hasTicket=true;
            }
            else if(command.equals("2")){
                //在这里写退票
                System.out.println("欢迎来到退票系统，下面进入自动退票业务办理");
                System.out.println("请输入你的姓名：");
                String name;
                name = scanner.nextLine();
                System.out.println("请输入你的ID：");
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
                }
                else if (info.equals("free")) {
                    price = 0;
                }
                System.out.println("请输入您的购票日期（yyyy-MM-dd）：");
                String dateString = scanner.nextLine();
                DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Ticket ticket = new Ticket(name, (int)price, dateFormat.parse(dateString), info);
                System.out.println("您的购票信息如下：");
                System.out.println("Ticket : [ Name : " + ticket.getUserName() +
                        ", Price : " + ticket.getPrice() +
                        ", Date : " + ticket.getTime() +
                        ", Type : " + ticket.getType() + " ] ");
                BaseHandler autoHandler = new AutoHandler();
                RefundRequest request1 = new RefundRequest(ticket);
                autoHandler.handle(request1);
                this.hasTicket=false;
            }
            else{
                continue;
            }
            System.out.println(
                    "=========\n" +
                            "1.购票\n" +
                            "2.退票\n" +
                            "3.退出\n" +
                            "=========");
            command = scanner.nextLine();
        }
    }
}
