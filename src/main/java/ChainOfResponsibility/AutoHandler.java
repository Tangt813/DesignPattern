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
    private final BaseHandler artificialHandler = new ArtificialHandler();
    @Override
    public Boolean handle(RefundRequest request) {
        LocalDate today = LocalDate.now();
        LocalDate buyDate = LocalDate.ofInstant(request.getBuyDate().toInstant(), ZoneId.systemDefault());
        Long duration = today.toEpochDay() - buyDate.toEpochDay();
        if(request.getPrice() <= 100 && duration <= 14){
            System.out.println("自动退票办理成功！");
            return Boolean.TRUE;
        }
        if(request.getPrice() > 100){
            System.out.println("您的订单金额过大，请前往人工柜台办理。");
        }
        if(duration > 14){
            System.out.println("您的订单不满足14天自动退票条件，请前往人工柜台办理。");
        }
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
