package Memento;

import org.junit.Test;

public class MementoTest {
    @Test
    public void TestMemento(){
        //开始时售票状态
        System.out.println("# 备忘录模式(Memento Pattern)保存一个对象的某个状态,以便在适当的时候恢复对象.");
        System.out.println("# 它的优势是在不破坏封装性的前提下,捕获一个对象的内部状态,并在该对象之外保存这个状态.");
        System.out.println("# 很多时候我们总是需要记录一个对象的内部状态,这样做的目的就是为了允许用户取消不确定或者错误的操作,能够恢复到他原先的状态");
        System.out.println("# 在我们用户线上购票时,我们先为其创建一个订单,用户有30分钟支付的时间,在这30分钟内此订单被该用户锁定，即其他人不能购买该用户所订购的票");
        System.out.println("# 若在30分钟内没有支付,此时剩余的票务信息会恢复到之前的状态,此时便需要备忘录模式\n");
        TicketState ticketsState = new TicketState(50,1000);
        System.out.println("刚开始时售票状态如下:");
        ticketsState.display();
        //备忘录管理
        TicketsStateCaretaker ticketsStateCaretaker = new TicketsStateCaretaker();
        //存档
        ticketsStateCaretaker.setTicketsStateMemento(ticketsState.saveState());

        ticketsState.sellTickets();
        System.out.println("此时有一位用户在网上订购一张狂欢节的票,我们为其创建订单,并将创建订单前的票务信息用备忘录模式存储，创建订单后的票务信息:");
        ticketsState.display();

        ticketsState.recoveryState(ticketsStateCaretaker.getTicketsStateMemento());
        System.out.println("该用户在30分钟内未支付订单信息,此时票务信息应恢复为创建订单前的状态,此时票务信息如下:");
        ticketsState.display();


    }
}
