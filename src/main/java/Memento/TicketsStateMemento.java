package Memento;

public class TicketsStateMemento {
    private int leftTickets;//剩余门票数
    private int balance;//账户余额

    //获取剩余门票数接口
    public int getLeftTickets() {
        return leftTickets;
    }

    //构造函数
    public TicketsStateMemento(int leftTickets,int balance){
        this.balance=balance;
        this.leftTickets=leftTickets;
    }

    //设置剩余门票数接口
    public void setLeftTickets(int leftTickets) {
        this.leftTickets = leftTickets;
    }

    //获取账户余额接口
    public int getBalance() {
        return balance;
    }

    //设置账户余额接口
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
