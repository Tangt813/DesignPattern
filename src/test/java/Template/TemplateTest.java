package Template;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TemplateTest {
    @Test
    public void templateTest() {
        System.out.println("--------------------Template Pattern Test Start--------------------");
        System.out.println("这里是模版模式的演示，本场景的内容是动物表演，各种动物将依次为观众带来精彩的演出。");
        System.out.println("模版模式提供了一个基础的表演流程模版，而每个动物的表演则通过重写表演函数来完成。");
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
