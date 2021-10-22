package Memento;

public class TicketState {
    private int leftTickets;//剩余门票数
    private int balance;//账户余额

    public TicketState(int leftTickets,int balance){
        this.balance=balance;
        this.leftTickets=leftTickets;
    }

    //读档
    public void recoveryState(TicketsStateMemento ticketsStateMemento){
        this.leftTickets=ticketsStateMemento.getLeftTickets();
        this.balance=ticketsStateMemento.getBalance();
    }

    //存档
    public TicketsStateMemento saveState(){
        return new TicketsStateMemento(this.leftTickets,this.balance);
    }

    //售票，一张票50元
    public void sellTickets(){
        this.leftTickets-=1;
        this.balance+=50;
    }

    public void display(){
        System.out.println("Balance:"+this.balance);
        System.out.println("Left Tickets:"+this.leftTickets);
    }
}
