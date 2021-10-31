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
