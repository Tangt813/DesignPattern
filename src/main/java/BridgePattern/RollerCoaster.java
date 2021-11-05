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

    // 设置适合人群
    @Override
    public void setSuitablePeople(People suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    // 游乐设施运行
    @Override
    public void run() {
        playAction = new playRollerCoaster();
        playAction.playFacility();
    }

    // 获得游乐设施名称
    @Override
    public String getAmusementFacilityName() {
        return "适合" + suitablePeople.getAgeGroupName() + "的海底过山车";
    }
}
