package Template;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TemplateTest {
    @Test
    public void templateTest() {
        System.out.println("--------------------Template Pattern Test Start--------------------");
        List<BasePerformance> performances = new ArrayList<BasePerformance>();
        performances.add(new DolphinPerformance());
        performances.add(new SealPerformance());
        performances.add(new SeaLionPerformance());

        for(BasePerformance p: performances) {
            p.performProcess();
        }
        System.out.println("--------------------Template Pattern Test End--------------------");
    }
}
