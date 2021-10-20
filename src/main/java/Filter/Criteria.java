package Filter;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 9:53 PM
 * @Version 1.0
 */

import java.util.List;

public interface Criteria {
    public List<Ticket> meetCriteria(List<Ticket> tickets);
}
