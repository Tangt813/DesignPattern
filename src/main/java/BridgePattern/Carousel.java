package BridgePattern;

import Strategy.playCarousel;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Carousel.java
 * @Description TODO
 * @createTime 2021年10月31日 22:04:00
 */
public class Carousel extends AmusementFacility{

    public Carousel(People suitablePeople) {
        super(suitablePeople,false);
    }

    @Override
    public void setSuitablePeople(People suitablePeople) {
        this.suitablePeople = suitablePeople;
    }

    @Override
    public void run() {
        playAction = new playCarousel();
        playAction.playFacility();
    }

    @Override
    public String getAmusementFacilityName() {
        return "适合" + suitablePeople.getAgeGroupName() + "的海底旋转木马";
    }

}
