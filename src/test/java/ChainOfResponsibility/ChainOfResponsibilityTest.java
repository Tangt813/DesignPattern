package ChainOfResponsibility;

import Filter.Ticket;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public class ChainOfResponsibilityTest {
    @Test
    public void performTest() throws ParseException {
        System.out.println("--------------------Chain of Responsibility Pattern Test Start--------------------");
        System.out.println("这里是责任链模式的演示，本场景的内容是游客退票，游客的退票请求将在责任链上传递，依次由自动退票服务与人工退票服务处理。");
        BaseHandler autoHandler = new AutoHandler();
        System.out.println("一名游客准备办理退票，他的购票信息如下。");
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Ticket ticket1 = new Ticket("Tom", 200, dateFormat.parse("2021-08-01"), "full");
        System.out.println("Ticket : [ Name : " + ticket1.getUserName() +
                ", Price : " + ticket1.getPrice() +
                ", Date : " + ticket1.getTime() +
                ", Type : " + ticket1.getType() + " ] ");
        RefundRequest request1 = new RefundRequest(ticket1);
        autoHandler.handle(request1);
        System.out.println("另一名游客也准备办理退票，他的购票信息如下。");
        Ticket ticket2 = new Ticket("Tooom", 200, dateFormat.parse("2021-10-01"), "full");
        System.out.println("Ticket : [ Name : " + ticket2.getUserName() +
                ", Price : " + ticket2.getPrice() +
                ", Date : " + ticket2.getTime() +
                ", Type : " + ticket2.getType() + " ] ");
        RefundRequest request2 = new RefundRequest(ticket2);
        autoHandler.handle(request2);
        System.out.println("有一名游客刚买完票发现买错了类型，准备退票，他的购票信息如下。");
        Ticket ticket3 = new Ticket("Tommmm", 160, dateFormat.parse("2021-10-26"), "discount");
        System.out.println("Ticket : [ Name : " + ticket3.getUserName() +
                ", Price : " + ticket3.getPrice() +
                ", Date : " + ticket3.getTime() +
                ", Type : " + ticket3.getType() + " ] ");
        RefundRequest request3 = new RefundRequest(ticket3);
        autoHandler.handle(request3);
        System.out.println("--------------------Chain of Responsibility Pattern Test End--------------------");
    }
}
