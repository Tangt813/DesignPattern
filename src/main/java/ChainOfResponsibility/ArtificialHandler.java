package ChainOfResponsibility;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
//人工退票服务
public class ArtificialHandler extends BaseHandler {
    @Override
    public Boolean handle(RefundRequest request) {
        //计算购票时间
        LocalDate today = LocalDate.now();
        LocalDate buyDate = LocalDate.ofInstant(request.getBuyDate().toInstant(), ZoneId.systemDefault());
        Long duration = today.toEpochDay() - buyDate.toEpochDay();
        //如果已购买小于60天，则退票成功
        if(duration <= 60){
            System.out.println("人工审核通过，退票成功！");
            return Boolean.TRUE;
        }
        //否则退票失败
        System.out.println("您的购票时间已经超过了60天，不满足退票要求，退票失败。");
        return Boolean.FALSE;
    }
}
