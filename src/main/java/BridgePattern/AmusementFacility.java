package BridgePattern;

import Strategy.PlayAction;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName AmusementFacilities.java
 * @Description 游乐设施类
 * @createTime 2021年10月11日 23:15:00
 */
public abstract class AmusementFacility {
    /**
     * @title AmusementFacility
     * @description 依据适合人群及是否为额外收费项目创建一个游乐设施
     * @author  tangshuo
     * @update_author
     * @updateTime 2021/11/4 11:12 下午
     * @throws
     */
    AmusementFacility(People suitablePeople,Boolean isSpecial){
        setSuitablePeople(suitablePeople);
        this.isSpecial = isSpecial;
    }

    // 适合人群
    protected People suitablePeople;

    // 是否额外收费项目
    protected Boolean isSpecial;

    // 游乐设施运行的Action
    protected PlayAction playAction;

    // 设置适合人群
    public abstract void setSuitablePeople(People suitablePeople);

    // 返回是否为额外收费项目
    public Boolean getSpecial() {
        return isSpecial;
    }

    // 设置是否为特殊项目
    public void setSpecial(Boolean special) {
        this.isSpecial = special;
    }

    // 游乐设施运行
    public abstract void run();

    public String getSuitablePeople() {
        return suitablePeople.getAgeGroupName();
    }

    public abstract String getAmusementFacilityName();
}
