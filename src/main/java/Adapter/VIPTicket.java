package Adapter;

/**
 * author:XIE YUXIANG
 */
public class VIPTicket implements AdvancedTicket{
    //vip用户
    public VIPTicket()
    {
    }
    @Override
    public String checkVIP()
    {
        return "您为尊贵的VIP用户，凭VIP票即可游玩所有";
    }
}
