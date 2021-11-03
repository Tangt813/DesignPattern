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

    /**
     * @Desc: 与标准，返回同时符合a和b标准的对象列表
     * @Param: 第一个标准与第二个标准
     * @Return: 符合a和b标准的对象列表
     */
    public AndCriteria(Criteria criteria, Criteria anotherCriteria) {
        this.criteria = criteria;
        this.anotherCriteria = anotherCriteria;
    }

    /**
     * @Desc: 接口的重载
     * @Param: Tickets列表
     * @Return: 符合与标准的tickets列表
     */
    @Override
    public List<Ticket> meetCriteria(List<Ticket> tickets) {
        List<Ticket> firstCriteriaTickets = criteria.meetCriteria(tickets);
        return anotherCriteria.meetCriteria(firstCriteriaTickets);
    }
}
