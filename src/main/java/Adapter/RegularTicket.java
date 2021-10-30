package Adapter;

/**
 * author:XIE YUXIANG
 */
public class RegularTicket implements Ticket{
    //普通用户
    public RegularTicket()
    {

    }

    @Override
    public void check(String ticketType) {
        if(ticketType=="Regular")
        {
            System.out.println("您为普通游客，请支付本设施的额外门票~");
        }
        else if(ticketType=="VIP")
        {
            TicketAdapter ticketadapter=new TicketAdapter(ticketType);
            ticketadapter.check(ticketType);
        }
    }


}
