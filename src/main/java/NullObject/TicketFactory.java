package NullObject;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/30 3:52 PM
 * @Version 1.0
 */

import Filter.Ticket;

public class TicketFactory {
    public static final String[] names = {"Tom", "Jerry", "Bert"};

    public static Ticket getTicket(String name) {
        for (String lName:  names) {
            if (lName.equalsIgnoreCase(name)) {
                return new RealTicket(name);
            }
        }
        return new NullTicket(name);
    }

}
