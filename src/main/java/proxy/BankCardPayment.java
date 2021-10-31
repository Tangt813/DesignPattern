package proxy;

public class BankCardPayment implements Payment{
    private int cost;
    public BankCardPayment(int cost){
        this.cost=cost;
        showcost();
    }
    private void showcost(){
        System.out.println("a ticket costs "+cost+".");
    }
    public String Pay(){

        return "Pay for a ticket";
    }

}
