package AmusementFacility;

import BridgePattern.BigHammer;
import BridgePattern.Child;
import BridgePattern.RollerCoaster;
import BridgePattern.Youth;
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

        child.take(bigHammer4Child);
        child.take(bigHammer4Youth);

        youth.take(rollerCoaster4Child);
        youth.take(rollerCoaster4Youth);
    }
}
