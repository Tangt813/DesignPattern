package Adapter;

/**
 * author:XIE YUXIANG
 */
public class TicketAdapter implements Ticket {
    //适配器类
    private AdvancedTicket Advancedticket;
    public TicketAdapter(String ticketType)
    {
        if(ticketType=="VIP")
            this.Advancedticket=new VIPTicket();
    }

    @Override
    public void check(String ticketType)
    {
        if(ticketType=="VIP")
            Advancedticket.checkVIP(ticketType);
    }

}
