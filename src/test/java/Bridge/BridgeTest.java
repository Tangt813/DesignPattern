package Bridge;

import BridgePattern.BigHammer;
import BridgePattern.Child;
import BridgePattern.RollerCoaster;
import BridgePattern.Youth;
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
        System.out.println(child.getName() + " is " + child.getAgeGroupName());
        Youth youth = new Youth("TSYouth",true);
        System.out.println(youth.getName() + " is " + youth.getAgeGroupName() );

        BigHammer bigHammer4Child = new BigHammer(child);
        BigHammer bigHammer4Youth = new BigHammer(youth);
        System.out.println(bigHammer4Child.getAmusementFacilityName());
        System.out.println(bigHammer4Youth.getAmusementFacilityName());

        RollerCoaster rollerCoaster4Child = new RollerCoaster(child);
        RollerCoaster rollerCoaster4Youth = new RollerCoaster(youth);
        System.out.println(rollerCoaster4Child.getAmusementFacilityName());
        System.out.println(rollerCoaster4Youth.getAmusementFacilityName());
    }
}
