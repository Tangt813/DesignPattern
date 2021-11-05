package BridgePattern;

import Adapter.RegularTicket;
import Strategy.PlayAction;
import Strategy.playBigHammer;
import com.alibaba.fastjson.JSONObject;

import java.util.Objects;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName AgeGroup.java
 * @Description 年龄段类
 * @createTime 2021年10月11日 23:22:00
 */
public abstract class People {
    // 名字
    private final String name;

    // 是否为VIP
    private Boolean isVip;

    // 游玩的项目
    private PlayAction playAction;

    // 初始化一个默认的人
    public People(){
        this.name = "Default Name";
        this.isVip = false;
        this.playAction = null;
    }

    // 初始化一个人，赋予名字与是否为VIP
    public People(String name,Boolean isVip){
        this.name = name;
        this.isVip = isVip;
    }

    // 获取姓名
    public String getName() {
        return name;
    }

    // 获取是否为VIP
    public Boolean getVip() {
        return isVip;
    }

    // 获得游客选择的PlayAction
    public PlayAction getPlayAction() {
        return playAction;
    }

    // 设置游客的PlayAction
    public void setPlayAction(PlayAction playAction) {
        this.playAction = playAction;
    }

    // 设置VIP
    public void setVip(Boolean vip) {
        isVip = vip;
    }

    // 获得是否为特殊票
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

    // 获得年龄段
    public abstract String getAgeGroupName();

    public Boolean take(AmusementFacility amusementFacility){
        System.out.println(getName()+"要游玩"+amusementFacility.getAmusementFacilityName());
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




