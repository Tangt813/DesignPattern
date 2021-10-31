package proxy;

public class BankCardPayment implements Payment{
    private double cost;
    public BankCardPayment(double cost){
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
