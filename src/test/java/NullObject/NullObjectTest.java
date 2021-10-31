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
    public void TestNullObject() {
        System.out.println("----------------------Null Object Pattern Test Start--------------------");

        System.out.println("数据库中有三个有效票务名称: Tom, Jerry和Bert.");
        System.out.println("Yili向票务工厂请求出票。");
        showTicket(TicketFactory.getTicket("Yili"));
        System.out.println("\n\n");

        System.out.println("Tom向票务工厂请求出票。");
        showTicket(TicketFactory.getTicket("Tom"));


        System.out.println("----------------------Null Object Pattern Test End--------------------");

    }

    public void showTicket(Ticket ticket) {
        if (ticket.isNil()) {
            System.out.println("工作人员称: 你的票务信息在数据库中没有录入。");
            return ;
        }
        System.out.println("================================");
        System.out.println("|          游园联票             |");

        System.out.printf("|   Name: %-5s                |\n", ticket.getUserName());
        System.out.printf("|   Price: %-4d                |\n", ticket.getPrice());
        System.out.printf("|   Date: %4d-%2d-%2d           |\n", ticket.getTime().getYear() + 1900, ticket.getTime().getMonth() + 1, ticket.getTime().getDate());
        System.out.printf("|   Type: %-8s             |\n", ticket.getType());
        System.out.println("|                              |");
        System.out.printf("|        祝您玩得愉快！          |\n");

        System.out.println("================================");
        System.out.println("\n\n");
    }
}
