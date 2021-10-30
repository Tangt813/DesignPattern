package BridgePattern;

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

    public People(){
        this.name = "Default Name";
    }

    public People(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getAgeGroupName();

    public Boolean take(AmusementFacility amusementFacility){
        return Objects.equals(amusementFacility.getSuitablePeople(), getAgeGroupName());
    };
}




