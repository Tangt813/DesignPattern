package BridgePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Carousel.java
 * @Description TODO
 * @createTime 2021年10月29日 18:58:00
 */
public class Carousel extends AmusementFacility {
    Carousel(People suitablePeople) {
        super(suitablePeople);
    }

    @Override
    public void setSuitablePeople(People suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    @Override
    public String getAmusementFacilityName() {
        return "Carousel"+suitablePeople.getAgeGroupName();
    }

    @Override
    public void run() {

    }
}
