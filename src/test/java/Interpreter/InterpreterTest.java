package Interpreter;


import org.junit.Test;

/**
 *
 */
public class InterpreterTest {
    @Test
    public void interpreterTest() {
        System.out.println("------------------------Interpreter test------------------------");
        Context ticket = new Context();
        System.out.println("传入一段句子，根据语法分析得到所需要的信息");
        System.out.println("本例中，运用于门票系统里，只需要传入身份证号＋VIP信息，即可通过语法解释得到票价");
        System.out.println("本例设置：小于12岁和大于60岁的游客免票，VIP用户打八折");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("首先测试VIP用户：");
        System.out.println("VIP用户的信息：");
        ticket.getTicket("441623200108132010,VIP");//6:9
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("然后测试普通用户：");
        ticket.getTicket("441423197108132010,非VIP");//6:9
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("然后测试儿童用户：");
        ticket.getTicket("441623201108132010,非VIP");//6:9
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("然后测试老人用户：");
        ticket.getTicket("441623194508132010,非VIP");//6:9
    }
}