package BridgePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName rollerCoaster.java
 * @Description 过山车类
 * @createTime 2021年10月12日 11:32:00
 */
public class RollerCoaster extends AmusementFacility {


    @Override
    public void setSuitablePeople(People suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    @Override
    public String getAmusementFacilityName() {

        return "RollerCoaster"+suitablePeople.getAgeGroupName();
    }

    @Override
    public void run() {
        return;
    }
}
