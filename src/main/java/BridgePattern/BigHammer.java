package BridgePattern;

import Strategy.playBigHammer;

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

    // 设置适合人群
    @Override
    public void setSuitablePeople(People suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    // 运行
    @Override
    public void run() {
        playAction = (Strategy.PlayAction) new playBigHammer();
        playAction.playFacility();
    }

    // 获取游乐设施名称
    @Override
    public String getAmusementFacilityName() {
        return "适合" + suitablePeople.getAgeGroupName() + "的海底大摆锤";
    }

}
