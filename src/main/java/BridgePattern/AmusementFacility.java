package BridgePattern;

import strategy.PlayAction;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName AmusementFacilities.java
 * @Description 游乐设施类
 * @createTime 2021年10月11日 23:15:00
 */
public abstract class AmusementFacility {
    AmusementFacility(People suitablePeople,Boolean isSpecial){
        setSuitablePeople(suitablePeople);
        this.isSpecial = isSpecial;
    }

    protected People suitablePeople;

    protected Boolean isSpecial;

    protected PlayAction playAction;

    public abstract void setSuitablePeople(People suitablePeople);

    public Boolean getSpecial() {
        return isSpecial;
    }

    public void setSpecial(Boolean special) {
        this.isSpecial = special;
    }

    public abstract void run();

    public String getSuitablePeople() {
        return suitablePeople.getAgeGroupName();
    }

    public abstract String getAmusementFacilityName();
}
