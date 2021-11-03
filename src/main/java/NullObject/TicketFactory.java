package NullObject;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/30 3:52 PM
 * @Version 1.0
 */

import Filter.Ticket;


/*
 * 票务工厂，根据数据库中是否存在票务信息返回真或假对象
 */
public class TicketFactory {
    public static final String[] names = {"Tom", "Jerry", "Bert"};
    /**
     * @Desc: 票务工厂，根据数据库中是否存在票务信息返回真或假对象
     * @Param: 购票人名称
     * @Return: 如果是存在的，就返回真对象，否则返回空对象
     */
    public static Ticket getTicket(String name) {
        for (String lName:  names) {
            if (lName.equalsIgnoreCase(name)) {
                return new RealTicket(name);
            }
        }
        return new NullTicket(name);
    }

}
