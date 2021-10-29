package BridgePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Shouting.java
 * @Description TODO
 * @createTime 2021年10月29日 19:02:00
 */
public class Shouting extends AmusementFacility{

    Shouting(People suitablePeople) {
        super(suitablePeople);
    }

    @Override
    public void setSuitablePeople(People suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    @Override
    public String getAmusementFacilityName() {
        return "Shouting"+suitablePeople.getAgeGroupName();
    }

    @Override
    public void run() {

    }
}
