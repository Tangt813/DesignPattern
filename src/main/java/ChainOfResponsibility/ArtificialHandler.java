package ChainOfResponsibility;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public class ArtificialHandler extends Handler{
    @Override
    public Boolean handle(RefundRequest request) {
        LocalDate today = LocalDate.now();
        LocalDate buyDate = LocalDate.ofInstant(request.getBuyDate().toInstant(), ZoneId.systemDefault());
        Integer duration = Period.between(buyDate, today).getDays();
        if(request.getSource().equals("Official") && duration <= 30){
            System.out.println("人工审核通过，退票成功！");
            return Boolean.TRUE;
        }
        System.out.println("您的条件不满足退票要求，退票失败。");
        return Boolean.FALSE;
    }
}
