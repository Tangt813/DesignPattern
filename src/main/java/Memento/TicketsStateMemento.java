package Memento;

public class TicketsStateMemento {
    private int leftTickets;//剩余门票数
    private int balance;//账户余额

    public int getLeftTickets() {
        return leftTickets;
    }

    public TicketsStateMemento(int leftTickets,int balance){
        this.balance=balance;
        this.leftTickets=leftTickets;
    }

    public void setLeftTickets(int leftTickets) {
        this.leftTickets = leftTickets;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
