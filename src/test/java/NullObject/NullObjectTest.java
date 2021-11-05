package NullObject;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/31 3:50 PM
 * @Version 1.0
 */

import Filter.Ticket;
import org.junit.Test;


public class NullObjectTest {
    @Test
    /*
    * 空对象模式测试函数。
    * 场景为出票，有游客购买了黄牛票、过期票等不合法等票。如果票务信息合法则直接返回正常对象，否则返回空对象。
    * */
    public void TestNullObject() {
        System.out.println("大家好，欢迎来到空对象模式展示～");
        System.out.println("空对象模式最大的好处在于同等地处理真实对象和空对象，增加程序的鲁棒性、防止空指针报错对程序带来的影响。");
        System.out.println("接下来请通过出票对实际业务来感受空对象模式的使用。");
        System.out.println("在出票环节，经常有小白在网上买到假票或者已经使用过的票而上当受骗，我们希望在编程的时候处理这种无效票务既不引入空指针又能有效地等同处理它们。");
        System.out.println("因此在出票时对数据库进行核查，若数据库中无该名称则返回一个空对象门票。");

        System.out.println("数据库中有三个有效票务名称: Tom, Jerry和Bert.");
        System.out.println("Yili向票务工厂请求出票。");
        showTicket(TicketFactory.getTicket("Yili"));
        System.out.println("\n\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Tom向票务工厂请求出票。");

        showTicket(TicketFactory.getTicket("Tom"));


        System.out.println("----------------------Null Object Pattern Test End--------------------");

    }

    public void showTicket(Ticket ticket) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (ticket.isNil()) {
            System.out.println("工作人员称: 你的票务信息在数据库中没有录入。");
            return ;
        }
        System.out.println("================================");
        System.out.println("|          游园联票              |");

        System.out.printf("|   Name: %-5s                |\n", ticket.getUserName());
        System.out.printf("|   Price: %-4d                |\n", ticket.getPrice());
        System.out.printf("|   Date: %4d-%2d-%2d           |\n", ticket.getTime().getYear() + 1900, ticket.getTime().getMonth() + 1, ticket.getTime().getDate());
        System.out.printf("|   Type: %-8s             |\n", ticket.getType());
        System.out.println("|                              |");
        System.out.printf("|        祝您玩得愉快！           |\n");

        System.out.println("================================");
        System.out.println("\n\n");
    }
}
