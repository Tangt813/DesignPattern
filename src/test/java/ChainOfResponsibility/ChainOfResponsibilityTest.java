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
    public void performTest() throws ParseException, InterruptedException {
        System.out.println("这里是责任链模式的演示，责任链模式将多个处理者连成一根链，让发出的请求被责任链上的处理者依次处理。");
        Thread.sleep(1500);
        System.out.println("本场景的内容是游客退票，为了减轻人工退票服务的压力，我们引入了自动退票系统，\n游客的退票请求将在责任链上传递，依次由自动退票服务与人工退票服务处理。");
        Thread.sleep(1500);
        System.out.println("我们将多个处理步骤抽象成为处理者，它们都继承自BaseHandler基类，这意味着我们可以以更灵活的方式来调整处理流程。");
        Thread.sleep(1500);
        System.out.println("例如，我们可以轻松地添加一名新的处理者，也可以调整链上的处理者的顺序，或者在处理者的处理函数中灵活地指定下一名处理者，这给我们的程序带来了巨大的灵活性与拓展性。");
        System.out.println("--------------------Chain of Responsibility Pattern Test Start--------------------");
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
