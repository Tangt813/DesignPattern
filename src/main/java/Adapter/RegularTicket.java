package Adapter;

import java.util.Objects;

/**
 * author:XIE YUXIANG
 */
public class RegularTicket implements Ticket{
    //普通用户
    public RegularTicket()
    {

    }

    @Override
    public String check(String ticketType) {
        if(Objects.equals(ticketType, "Regular"))
        {
            return "您为普通游客，请支付额外门票";
        }
        else if(Objects.equals(ticketType, "VIP"))
        {
            TicketAdapter ticketadapter=new TicketAdapter(ticketType);
            return ticketadapter.check(ticketType);
        }


        return "信息错误";
    }


}
