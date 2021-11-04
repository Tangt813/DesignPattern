package Adapter;

import java.util.Objects;

/**
 * author:XIE YUXIANG
 */
public class TicketAdapter implements Ticket {
    //适配器类
    private AdvancedTicket Advancedticket;
    public TicketAdapter(String ticketType)
    {
        if(Objects.equals(ticketType, "VIP"))
            this.Advancedticket=new VIPTicket();
    }

    @Override
    public String  check(String ticketType)
    {
        if(Objects.equals(ticketType, "VIP"))
            return Advancedticket.checkVIP();
        return "信息错误";
    }

}
