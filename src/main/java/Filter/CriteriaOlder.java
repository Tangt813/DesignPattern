package Filter;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 10:06 PM
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.List;

public class CriteriaOlder implements Criteria{

    /**
     * @Desc: 老人票筛选器
     * @Param: Tickets列表
     * @Return: 符合老人标准的tickets列表
     */
    @Override
    public List<Ticket> meetCriteria(List<Ticket> tickets) {
        List<Ticket> oldTickets = new ArrayList<Ticket>();
        for (Ticket ticket: tickets) {
            if (ticket.getType().equalsIgnoreCase("OLD")) {
                oldTickets.add(ticket);
            }
        }
        return oldTickets;
    }
}
