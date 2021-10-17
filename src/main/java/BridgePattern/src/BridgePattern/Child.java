package BridgePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Child.java
 * @Description 小孩子
 * @createTime 2021年10月12日 11:11:00
 */
public class Child extends People {

    public Child(){
        super();
    }

    public Child(String name) {
        super(name);
    }

    @Override
    public String getAgeGroupName() {
        return "Child";
    }

    @Override
    public Boolean take() {
        return null;
    }
}
