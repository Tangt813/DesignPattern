package NullObject;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/30 3:39 PM
 * @Version 1.0
 */

import java.util.Date;

/*
* 这个类继承于真对象，但是不实现有意义的函数，外界得到任何属性都会得到异常提示。
* */
public class NullTicket extends Filter.Ticket{

    /**
     * @Desc: 空门票构造函数
     * @Param: 用户名
     * @Return: 无
     */
    public NullTicket(String userName) {
        super(userName);
    }

    /**
     * @Desc: 得到用户名
     * @Param: 无
     * @Return: 提示无票
     */
    @Override
    public String getUserName() {
        return "No available in ticket database.";
    }

    /**
     * @Desc: 得到空对象门票日期
     * @Param: 无
     * @Return: 空
     */
    @Override
    public Date getTime() {
        return null;
    }

    /**
     * @Desc: 得到空对象类别
     * @Param: 无
     * @Return: 提示没有门票信息
     */
    @Override
    public String getType() {
        return "No available in ticket database.";
    }

    /**
     * @Desc: 得到空对象价格
     * @Param: 无
     * @Return: -1
     */
    @Override
    public int getPrice() {
        return -1;
    }

    /**
     * @Desc: 得到空对象是否为空对象
     * @Param: 无
     * @Return: 真
     */
    @Override
    public boolean isNil() {return true;}
}
