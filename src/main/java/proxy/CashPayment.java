package proxy;

public class CashPayment implements Payment{
    private int cost;
    public CashPayment(int cost){
        this.cost=cost;
        showcost();
    }
    private void showcost(){
        System.out.println("a ticket costs "+cost+".");
    }
    public String Pay(){
        System.out.println("Pay for a ticket.");
        return "Pay for a ticket";
    }

}
