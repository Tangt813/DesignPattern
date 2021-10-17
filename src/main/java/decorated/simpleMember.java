package decorated;

/**
 * 创建实现接口的实体类
 */
public class simpleMember implements member{
    /**
     * 创建普通会员
     */
    @Override
    public void build(){
        System.out.println("member:Simple Member");
    }
}
