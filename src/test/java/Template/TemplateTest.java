package Template;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TemplateTest {
    @Test
    public void templateTest() throws InterruptedException {

        System.out.println("模版模式中的基类提供了一个基础的行为流程模版，子类可以继承基类并重写模版中的部分函数来实现自己的行为。");
        Thread.sleep(1500);
        System.out.println("这样的设计减少了大量的冗余代码，是我们的代码更容易拓展与维护。");
        Thread.sleep(1500);
        System.out.println("这里是模版模式的演示，本场景的内容是动物表演，各种动物将依次为观众带来精彩的演出。");
        Thread.sleep(1500);
        System.out.println("如果我们为各表演类设计一个独立的类，则会带来大量的冗余代码，不利于维护。");
        Thread.sleep(1500);
        System.out.println("因此我们使用模板模式，首先定义了一个表演行为的基类，各个动物的表演将通过重写基类的perform函数来实现，\n当我们想要新增加一种动物表演时，只需要新建一个子类即可。当我们想要修改流程时，只需要修改基类即可");
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
