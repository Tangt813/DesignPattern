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
    private Ticket ticket;

    public RefundRequest(Ticket ticket) {
        this.ticket = ticket;
    }

    public Date getBuyDate() {
        return ticket.getTime();
    }

    public Integer getPrice() {
        return ticket.getPrice();
    }
}
