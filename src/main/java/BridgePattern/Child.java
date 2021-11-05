package BridgePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Child.java
 * @Description 小孩子
 * @createTime 2021年10月12日 11:11:00
 */
public class Child extends People {

    // 设置名称，设置是否为VIP
    public Child(String name,Boolean isVip) {
        super(name,isVip);
    }

    // 获取当前人群名字
    @Override
    public String getAgeGroupName() {
        return "儿童";
    }

}
