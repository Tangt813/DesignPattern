package ChainOfResponsibility;

import Filter.Ticket;

import java.util.Date;

/**
 * Description:
 * A refund request to be handled.
 * @author zhichenren
 * @version 1.0
 */
public class RefundRequest {
    //需要办理退票的票务信息
    private Ticket ticket;
    //带参构造函数，一个请求必须提供一个票务信息
    public RefundRequest(Ticket ticket) {
        this.ticket = ticket;
    }
    //获取票的购买日期
    public Date getBuyDate() {
        return ticket.getTime();
    }
    //获取票的价格
    public Integer getPrice() {
        return ticket.getPrice();
    }
}
