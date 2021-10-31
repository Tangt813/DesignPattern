package Decorated;
import Interpreter.*;
public class Customer implements People {
    String ID = "";

    /**
     * 构造函数
     * @param ID 传入用户身份证号
     */
    public Customer(String ID){
        this.ID = ID;
    }

    /**
     * 获取用户身份证号
     * @return 身份证号
     */
    @Override
    public String getID() {
        return this.ID;
    }

    /**
     * 购买票的详细价钱
     */
    @Override
    public String buyTicket() {
        String ticketBreif=ID+","+this.getDescription();
        String info = ticket.getTicket(ticketBreif);
        return info;
        //System.out.print("购买票价钱：原价");
    }

    /**
     * 获取用户的类型
     * @return 用户类型
     */
    @Override
    public String getDescription() {
        return "非VIP";
    }
}

