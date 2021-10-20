package Filter;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 10:13 PM
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class CriteriaKid implements Criteria{
    @Override
    public List<Ticket> meetCriteria(List<Ticket> tickets) {
        List<Ticket> kidTickets = new ArrayList<Ticket>();
        for (Ticket ticket: tickets) {
            if (ticket.getType().equalsIgnoreCase("KID")) {
                kidTickets.add(ticket);
            }
        }
        return kidTickets;
    }
}
