
package NullObject;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/30 3:34 PM
 * @Version 1.0
 */
import Filter.Ticket;

import java.util.Date;

public class RealTicket extends Filter.Ticket {
    public RealTicket(String userName, int price, Date time, String type) {
        super(userName, price, time, type);
    }

    public RealTicket(String userName) {
        super(userName);
    }
    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public boolean isNil() {
        return false;
    }
}
