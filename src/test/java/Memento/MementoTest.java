package Memento;

import org.junit.Test;

public class MementoTest {
    @Test
    public void TestMemento(){
        //开始时售票状态
        TicketState ticketsState = new TicketState(50,1000);
        System.out.println("开始时售票状态如下:");
        ticketsState.display();
        //备忘录管理
        TicketsStateCaretaker ticketsStateCaretaker = new TicketsStateCaretaker();
        //存档
        ticketsStateCaretaker.setTicketsStateMemento(ticketsState.saveState());

        ticketsState.sellTickets();
        System.out.println("售出一张票后票务状态:");
        ticketsState.display();

        ticketsState.recoveryState(ticketsStateCaretaker.getTicketsStateMemento());
        System.out.println("撤销刚刚售出的票后的状态:");
        ticketsState.display();


    }
}
