
package NullObject;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/30 3:34 PM
 * @Version 1.0
 */
import Filter.Ticket;

import java.util.Date;

/*
 * 这个类继承于真对象，实现真对象的接口
 */
public class RealTicket extends Filter.Ticket {
    /**
     * @Desc: 真门票的构造函数
     * @Param: 用户名、价格、时间、票类别
     * @Return: 无
     */
    public RealTicket(String userName, int price, Date time, String type) {
        super(userName, price, time, type);
    }

    /**
     * @Desc: 真对象构造函数重载
     * @Param: 用户名
     * @Return: 无
     */
    public RealTicket(String userName) {
        super(userName);
    }

    /**
     * @Desc: 真对象得到用户名
     * @Param: 无
     * @Return: 用户名
     */
    @Override
    public String getUserName() {
        return userName;
    }

    /**
     * @Desc: 真对象判断是否为空
     * @Param: 无
     * @Return: 假
     */
    @Override
    public boolean isNil() {
        return false;
    }
}
