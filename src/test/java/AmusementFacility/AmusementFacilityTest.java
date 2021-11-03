package AmusementFacility;

import BridgePattern.*;
import org.junit.Test;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName AmusementFacilityTest.java
 * @Description TODO
 * @createTime 2021年10月31日 13:39:00
 */
public class AmusementFacilityTest {
    @Test
    public void amusementFacilityTest(){
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
