package NullObject;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/30 3:39 PM
 * @Version 1.0
 */

import java.util.Date;

public class NullTicket extends Filter.Ticket{


    public NullTicket(String userName) {
        super(userName);
    }

    @Override
    public String getUserName() {
        return "No available in ticket database.";
    }

    @Override
    public Date getTime() {
        return null;
    }

    @Override
    public String getType() {
        return "No available in ticket database.";
    }

    @Override
    public int getPrice() {
        return -1;
    }

    @Override
    public boolean isNil() {return true;}
}
