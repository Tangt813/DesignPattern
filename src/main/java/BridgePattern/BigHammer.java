package BridgePattern;

import strategy.playBigHammer;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName BigHammer.java
 * @Description 大摆锤
 * @createTime 2021年10月12日 19:58:00
 */
public class BigHammer extends AmusementFacility{

    public BigHammer(People suitablePeople) {
        super(suitablePeople,true);
    }

    @Override
    public void setSuitablePeople(People suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    @Override
    public void run() {
        playAction = new playBigHammer();
        playAction.playFacility();
    }

    @Override
    public String getAmusementFacilityName() {
        return "BigHammer"+suitablePeople.getAgeGroupName();
    }

}
