package proxy;

public class WechatPayment implements Payment{
    private BankCardPayment cashPayment;
    private double cost;
    public WechatPayment(double cost){
        this.cost=cost;
    }
    public String Pay(){
        if(cashPayment==null){
            cashPayment=new BankCardPayment(cost);
        }
        String payment=cashPayment.Pay()+" on Wecaht.";
        return payment;

    }
}
