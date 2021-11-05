package Interpreter;


import org.junit.Test;

/**
 *
 */
public class InterpreterTest {
    @Test
    public void interpreterTest() {
        System.out.println("解释器模式就是为语言的语法或表达式提供评估的设计模式");
        System.out.println("给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子");
        System.out.println("------------------------Interpreter test------------------------");
        Context ticket = new Context();
        System.out.println("传入一段句子，根据语法分析得到所需要的信息");
        System.out.println("本例中，运用于门票系统里，只需要传入身份证号＋VIP信息，即可通过语法解释得到票价");
        System.out.println("本例设置：小于12岁和大于60岁的游客免票，VIP用户打八折");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("首先测试VIP用户：");
        System.out.println("VIP用户的信息：");
        System.out.println("441623200108132010,VIP");
        System.out.println("读票.......");
        ticket.getTicket("441623200108132010,VIP");//6:9
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.println("然后测试普通用户：");
        System.out.println("普通用户的信息：");
        System.out.println("441423197108132010,非VIP");
        System.out.println("读票.......");
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