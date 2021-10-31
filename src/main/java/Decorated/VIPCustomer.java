package Decorated;

public class VIPCustomer extends CustomerDecorator{
    People people;

    /**
     *获取用户对象
     * @param people 传入的用户对象
     */
    public VIPCustomer(People people) {
        this.people = people;
    }

    /**
     * 获取用户类型
     * @return 返回用户类型
     */
    public String getDescription() {
        return "VIP";
    }
    /**
     * 获取用户身份证号
     * @return 身份证号
     */
    public String getID() {
        return people.getID();
    }
    /**
     * 购买票的详细价钱
     */
    @Override
    public String buyTicket() {
            String ticketBreif=this.people.getID()+","+this.getDescription();
            String info = ticket.getTicket(ticketBreif);
            return info;
    }

    /**
     * VIP独有的减钱机制
     * @return 减少的价钱
     */
    private String VIPFunction(){
        return "减去100¥";
    }
}
