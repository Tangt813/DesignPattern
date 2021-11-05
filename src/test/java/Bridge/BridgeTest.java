package Bridge;

import BridgePattern.*;
import org.junit.Test;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName BridgeTest.java
 * @Description TODO
 * @createTime 2021年10月30日 10:37:00
 */
public class BridgeTest {
    @Test
    public void bridgeTest() {
        System.out.println("大家好欢迎来到桥接模式");
        System.out.println("在现实生活中，某些类具有两个或多个维度的变化，" +
                "如果用继承方式，不但对应的子类很多，而且扩展困难。\n选择桥接模式，将抽象与实现分离，" +
                "使它们可以独立变化。\n它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。");
        System.out.println("------------------------------------------------------------------");
        System.out.println("接下来我们通过游乐设施来感受桥接模式的使用:");
        System.out.println("我们知道，同样种类的游乐设施可能会有不同的适合人群。\n而若是每一种游乐设施都同要与其适合人群叠在一起构造子类" +
                "将会需要开发非常多的子类，而且拓展困难。\n而若使用桥接模式，将抽象与实现分离，" +
                "使它们可以独立变化。\n它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。\n" +
                "接下来将通过儿童与青年这两类不同的人群同游乐设施组合的方式来体现桥接模式");
        System.out.println("------------------------------------------------------------------");


        System.out.println("我们来新建一个儿童对象，名字为小明，不是我们嘉年华的VIP");
        Child child = new Child("小明",false);
        System.out.println(child.getName() + "是" + child.getAgeGroupName());

        System.out.println("我们来新建一个青年对象，名字为张伟，是我们嘉年华的VIP");
        Youth youth = new Youth("张伟",true);
        System.out.println(youth.getName() + "是" + youth.getAgeGroupName() );
        System.out.println("------------------------------------------------------------------");

        System.out.println("通过游乐设施与其适合人群的组合构造出不同的游乐设施");
        System.out.println("------------------------------------------------------------------");
        BigHammer bigHammer4Child = new BigHammer(child);
        BigHammer bigHammer4Youth = new BigHammer(youth);

        RollerCoaster rollerCoaster4Child = new RollerCoaster(child);
        RollerCoaster rollerCoaster4Youth = new RollerCoaster(youth);

        Carousel carousel4Child = new Carousel(child);
        Carousel carousel4Youth = new Carousel(youth);


        child.take(bigHammer4Child);
        System.out.println("------------------------------------------------------------------");
        child.take(bigHammer4Youth);
        System.out.println("------------------------------------------------------------------");

        youth.take(rollerCoaster4Child);
        System.out.println("------------------------------------------------------------------");
        youth.take(rollerCoaster4Youth);
        System.out.println("------------------------------------------------------------------");

        child.take(carousel4Child);
        System.out.println("------------------------------------------------------------------");
        child.take(carousel4Youth);
        System.out.println("------------------------------------------------------------------");
    }
}
