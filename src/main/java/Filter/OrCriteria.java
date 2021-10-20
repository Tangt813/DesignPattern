package Filter;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 10:43 PM
 * @Version 1.0
 */

import java.util.List;

public class OrCriteria implements Criteria {
    private Criteria criteria;
    private Criteria anotherCriteria;

    public OrCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }
    @Override
    public List<Ticket> meetCriteria(List<Ticket> tickets) {
        List<Ticket> firstCriteriaTickets = criteria.meetCriteria(tickets);
        List<Ticket> anotherCriteriaTickets = anotherCriteria.meetCriteria(tickets);
        for (Ticket ticket: anotherCriteriaTickets) {
            if (firstCriteriaTickets.contains(ticket)) {
                firstCriteriaTickets.add(ticket);
            }
        }
        return firstCriteriaTickets;
    }
}
