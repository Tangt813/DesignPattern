package ChainOfResponsibility;

import Template.BasePerformance;
import Template.DolphinPerformance;
import Template.SeaLionPerformance;
import Template.SealPerformance;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public class ChainOfResponsibilityTest {
    @Test
    public void performTest(){
        System.out.println("--------------------Chain of Responsibility Pattern Test Start--------------------");
        RefundRequest request = new RefundRequest(new Date(2021, Calendar.OCTOBER, 1), "Official", 500);
        Handler autoHandler = new AutoHandler();
        System.out.println(autoHandler.handle(request));
        System.out.println("--------------------Chain of Responsibility Pattern Test End--------------------");
    }
}
