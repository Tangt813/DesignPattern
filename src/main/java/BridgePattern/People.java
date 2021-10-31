package BridgePattern;

import Adapter.RegularTicket;
import Strategy.PlayAction;
import Strategy.playBigHammer;

import java.util.Objects;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName AgeGroup.java
 * @Description 年龄段类
 * @createTime 2021年10月11日 23:22:00
 */
public abstract class People {
    private final String name;

    private Boolean isVip;

    private PlayAction playAction;

    public People(){
        this.name = "Default Name";
        this.isVip = false;
        this.playAction = null;
    }

    public People(String name,Boolean isVip){
        this.name = name;
        this.isVip = isVip;
    }

    public String getName() {
        return name;
    }

    public Boolean getVip() {
        return isVip;
    }

    public PlayAction getPlayAction() {
        return playAction;
    }

    public void setPlayAction(PlayAction playAction) {
        this.playAction = playAction;
    }


    public void setVip(Boolean vip) {
        isVip = vip;
    }

    public void getSpecialTicket() {
        RegularTicket myTicket = new RegularTicket();
        String type = "";
        if(this.getVip()){
            type = "VIP";
        }
        else {
            type = "Regular";
        }
        System.out.println(myTicket.check(type));
    }

    public abstract String getAgeGroupName();

    public Boolean take(AmusementFacility amusementFacility){
        if(Objects.equals(amusementFacility.getSuitablePeople(), getAgeGroupName())){
            System.out.println(getName()+",您符合当前设施的适合人群");
            if(amusementFacility.getSpecial())
            {
                System.out.println("当前设施为需要额外付费的设施，检测您的身份");
                getSpecialTicket();
                amusementFacility.run();
            }
            else {
                System.out.println("当前设施为不需要额外付费的设施");
                amusementFacility.run();
            }
        }
        else {
            System.out.println(getName()+",您不符合当前设施的适合人群");
        }



        return Objects.equals(amusementFacility.getSuitablePeople(), getAgeGroupName());
    };
}




