package Adapter;

import java.util.Objects;

/**
 * @author:XieYuxiang
 */
public class RegularTicket implements Ticket{
    //普通用户
    public RegularTicket()
    {

    }

    /**
     * @param ticketType:读入票的类型
     * @return 返回判断语句
     */
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
