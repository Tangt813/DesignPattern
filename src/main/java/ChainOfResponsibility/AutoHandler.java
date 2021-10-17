package ChainOfResponsibility;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public class AutoHandler extends Handler{
    private final Handler artificialHandler = new ArtificialHandler();
    @Override
    public Boolean handle(RefundRequest request) {
        LocalDate today = LocalDate.now();
        LocalDate buyDate = LocalDate.ofInstant(request.getBuyDate().toInstant(), ZoneId.systemDefault());
        Integer duration = Period.between(buyDate, today).getDays();
        if(request.getPrice() <= 100 && duration < 14){
            System.out.println("自动退票办理成功！");
            return Boolean.TRUE;
        }
        System.out.println("无法办理自动退票，进入人工审核流程。");
        return artificialHandler.handle(request);
    }

    public static void main(String[] args) {
        RefundRequest request = new RefundRequest(new Date(2021, Calendar.OCTOBER, 1), "Official", 500);
        Handler autoHandler = new AutoHandler();
        System.out.println(autoHandler.handle(request));
    }
}
