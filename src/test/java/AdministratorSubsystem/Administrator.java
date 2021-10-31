package AdministratorSubsystem;

import Observer.Manager;
import Observer.Worker;

import java.util.Scanner;

public class Administrator {
    public static void main(String[] args) {
        HandleDatabase hd = new HandleDatabase();
        System.out.println("管理员界面");
        System.out.println("选择管理员功能：");
        System.out.println("输入'Q'退出管理员界面；");
        System.out.println("输入'A'查看营业额；");
        System.out.println("输入'B'向员工群发通知：");
        Scanner choice = new Scanner(System.in);
        String whichChoice = choice.next();
        while(!whichChoice.equals("Q")) {
            if (whichChoice.equals("A")){
                hd.searchInfo();
            }
            if (whichChoice.equals("B")) {
                Manager manager = new Manager();

                //创建三个员工，他们都是观察者，能收到群发的消息
                //他们观察的subject都是相同的
                Worker one = new Worker(manager, "one");
                Worker two = new Worker(manager, "two");
                Worker three = new Worker(manager, "three");

                boolean goon = true;

                while (goon) {
                    System.out.println("编辑消息:");
                    Scanner input = new Scanner(System.in);
                    String message = input.nextLine();

                    manager.setMessage(message);

                    System.out.println("要继续编辑消息吗？(y/n)");
                    Scanner input2 = new Scanner(System.in);
                    String ifgoon = input2.next();
                    if (ifgoon.equals("y")) {
                        goon = true;
                    } else {
                        goon = false;
                        System.out.println("成功退出!");
                    }
                }
            }
            System.out.println("选择管理员功能：");
            System.out.println("输入'Q'退出管理员界面；");
            System.out.println("输入'A'查看营业额；");
            System.out.println("输入'B'向员工群发通知：");
            Scanner nextChoice = new Scanner(System.in);
            whichChoice = nextChoice.next();
        }
        System.out.println("成功退出！");
    }
}

