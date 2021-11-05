package Memento;

//POJO对象
public class TicketsStateCaretaker {
    private TicketsStateMemento ticketsStateMemento;

    //获取ticketsStateMemento接口
    public TicketsStateMemento getTicketsStateMemento() {
        return ticketsStateMemento;
    }

    //设置ticketsStateMemento接口
    public void setTicketsStateMemento(TicketsStateMemento ticketsStateMemento) {
        this.ticketsStateMemento = ticketsStateMemento;
    }
}
