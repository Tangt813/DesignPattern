package Memento;

public class TicketsStateCaretaker {
    private TicketsStateMemento ticketsStateMemento;


    public TicketsStateMemento getTicketsStateMemento() {
        return ticketsStateMemento;
    }

    public void setTicketsStateMemento(TicketsStateMemento ticketsStateMemento) {
        this.ticketsStateMemento = ticketsStateMemento;
    }
}
