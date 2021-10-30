package proxy;

public class WechatPayment implements Payment{
    private CashPayment cashPayment;
    private int cost;
    public WechatPayment(int cost){
        this.cost=cost;
    }
    public String Pay(){
        if(cashPayment==null){
            cashPayment=new CashPayment(cost);
        }
        String payment=cashPayment.Pay()+" on Wecaht.";
        return payment;

    }
}
