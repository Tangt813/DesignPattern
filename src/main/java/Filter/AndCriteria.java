package Filter;

/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 10:16 PM
 * @Version 1.0
 */

import java.util.List;

public class AndCriteria implements Criteria{
    private Criteria criteria;
    private Criteria anotherCriteria;

    public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }


    @Override
    public List<Ticket> meetCriteria(List<Ticket> tickets) {
        List<Ticket> firstCriteriaTickets = criteria.meetCriteria(tickets);
        return anotherCriteria.meetCriteria(firstCriteriaTickets);
    }
}
