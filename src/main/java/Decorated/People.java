package Decorated;

public interface People {

    /**
     * 获取用户的类型
     * @return 用户类型
     */
    public abstract String getDescription();
    /**
     * 获取用户身份证号
     * @return 身份证号
     */
    public abstract String getID();
    /**
     * 购买票的详细价钱
     */
    public abstract void buyTicket();
}
