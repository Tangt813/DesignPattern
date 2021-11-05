package Filter;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 10:13 PM
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.List;


public class CriteriaAdult implements Criteria{
    /**
     * @Desc: 符合成人票的票务过滤
     * @Param: Tickets列表
     * @Return: 符合成人标准的tickets列表
     */
    @Override
    public List<Ticket> meetCriteria(List<Ticket> tickets) {
        List<Ticket> adultTickets = new ArrayList<Ticket>();
        for (Ticket ticket: tickets) {
            if (ticket.getType().equalsIgnoreCase("ADULT")) {
                adultTickets.add(ticket);
            }
        }
        return adultTickets;
    }
}
