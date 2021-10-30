package BridgePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName AmusementFacilities.java
 * @Description 游乐设施类
 * @createTime 2021年10月11日 23:15:00
 */
public abstract class AmusementFacility {
    AmusementFacility(People suitablePeople){
        setSuitablePeople(suitablePeople);
    }

    protected People suitablePeople;

    public abstract void setSuitablePeople(People suitablePeople);

    public String getSuitablePeople() {
        return suitablePeople.getAgeGroupName();
    }

    public abstract String getAmusementFacilityName();
}
