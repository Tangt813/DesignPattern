package BridgePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Youth.java
 * @Description 青年类
 * @createTime 2021年10月12日 11:11:00
 */
public class Youth extends People {

    public Youth(){
        super();
    }

    public Youth(String name,Boolean isVip) {
        super(name,isVip);
    }

    @Override
    public String getAgeGroupName() {
        return "青年";
    }


}
