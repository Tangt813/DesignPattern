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
        Long duration = today.toEpochDay() - buyDate.toEpochDay();
        if(duration <= 60){
            System.out.println("人工审核通过，退票成功！");
            return Boolean.TRUE;
        }
        System.out.println("您的购票时间已经超过了60天，不满足退票要求，退票失败。");
        return Boolean.FALSE;
    }
}
