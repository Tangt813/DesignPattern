package BridgePattern;

import Strategy.playRollerCoaster;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName rollerCoaster.java
 * @Description 过山车类
 * @createTime 2021年10月12日 11:32:00
 */
public class RollerCoaster extends AmusementFacility {


    public RollerCoaster(People suitablePeople) {
        super(suitablePeople,true);
    }

    @Override
    public void setSuitablePeople(People suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    @Override
    public void run() {
        playAction = new playRollerCoaster();
        playAction.playFacility();
    }

    @Override
    public String getAmusementFacilityName() {
        return "RollerCoaster"+suitablePeople.getAgeGroupName();
    }
}
