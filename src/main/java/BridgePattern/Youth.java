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

    public Youth(String name) {
        super(name);
    }

    @Override
    public String getAgeGroupName() {
        return "Youth";
    }

    @Override
    public Boolean take() {
        return null;
    }
}
