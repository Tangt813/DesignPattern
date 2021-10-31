package Decorated;

public class SeniorVIPCustomer extends CustomerDecorator{

    People people;

    /**
     *获取用户对象
     * @param people 传入的用户对象
     */
    public SeniorVIPCustomer(People people) {
        this.people = people;
    }
    /**
     * 获取用户类型
     * @return 返回用户类型
     */
    @Override
    public String getDescription() {
        return "SeniorVIP";
    }
    /**
     * 获取用户身份证号
     * @return 身份证号
     */
    @Override
    public String getID() {
        return people.getID();
    }
    /**
     * 购买票的详细价钱
     */
    @Override
    public String buyTicket() {
        people.buyTicket();
        System.out.print("" + SeniorVIPFunction());
        return " ";
    }
    /**
     * SeniorVIP独有的减钱机制
     * @return 减少的价钱
     */
    private String SeniorVIPFunction(){
        return "再减去100¥";
    }
}
