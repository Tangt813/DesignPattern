package proxy;

public class BankCardPayment implements Payment{
    private double cost;
    public BankCardPayment(double cost){
        this.cost=cost;
        showcost();
    }
    private void showcost(){
        System.out.println("一张门票价格为 "+cost+"元.");
    }
    public String Pay(){

        return "支付一张门票.";
    }

}
