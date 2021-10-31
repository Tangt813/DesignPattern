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
        Child child = new Child("TSChild",false);
        System.out.println(child.getName() + "是" + child.getAgeGroupName());

        Youth youth = new Youth("TSYouth",true);
        System.out.println(youth.getName() + "是" + youth.getAgeGroupName() );

        BigHammer bigHammer4Child = new BigHammer(child);
        BigHammer bigHammer4Youth = new BigHammer(youth);

        RollerCoaster rollerCoaster4Child = new RollerCoaster(child);
        RollerCoaster rollerCoaster4Youth = new RollerCoaster(youth);

        Carousel carousel4Child = new Carousel(child);
        Carousel carousel4Youth = new Carousel(youth);

        child.take(bigHammer4Child);
        child.take(bigHammer4Youth);

        youth.take(rollerCoaster4Child);
        youth.take(rollerCoaster4Youth);

        child.take(carousel4Child);
        child.take(carousel4Youth);
    }
}
