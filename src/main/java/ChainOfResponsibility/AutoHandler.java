package ChainOfResponsibility;

import Filter.Ticket;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public class AutoHandler extends BaseHandler {
    //自动退票服务，责任链上的下一个处理者是人工处理服务
    private final BaseHandler artificialHandler = new ArtificialHandler();
    @Override
    public Boolean handle(RefundRequest request) {
        //根据请求中的票务信息来计算购票时间
        LocalDate today = LocalDate.now();
        LocalDate buyDate = LocalDate.ofInstant(request.getBuyDate().toInstant(), ZoneId.systemDefault());
        Long duration = today.toEpochDay() - buyDate.toEpochDay();
        //如果退票请求你在购票日期的14天内，可以直接自动退票
        if(duration <= 14){
            System.out.println("自动退票办理成功！");
            return Boolean.TRUE;
        }
        //否则将请求交给责任链上的下一个处理者完成
        System.out.println("您的订单不满足14天自动退票条件，请前往人工柜台办理。");
        System.out.println("进入人工审核流程。");
        return artificialHandler.handle(request);
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket("Tom", 100, new Date(), "Adult");
        RefundRequest request = new RefundRequest(ticket);
        BaseHandler autoHandler = new AutoHandler();
        System.out.println(autoHandler.handle(request));
    }
}
