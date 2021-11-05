package Mediator;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 11:46 PM
 * @Version 1.0
 */

public class Admin {
    private String name;

    /**
     * @Desc: 获得管理员姓名
     * @Param: 无
     * @Return: 管理员姓名
     */
    public String getName() {
        return name;
    }

    /**
     * @Desc: 设置管理员姓名
     * @Param: 管理员姓名
     * @Return: 无
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @Desc: 管理员构造函数
     * @Param: 姓名
     * @Return: 无
     */
    public Admin(String name) {
        this.name = name;
    }

    /**
     * @Desc: 管理员获得通知之后向显示器上加入某个设备的新用户
     * @Param: 设备名
     * @Return: 无
     */
    public void addGuest(String facility) {
        Mediator.addNewGuy(this, facility);
    }

    /**
     * @Desc: 管理员获得通知之后向显示器上去除某个设备的用户
     * @Param: 设备名
     * @Return: 无
     */
    public void popGuest(String facility) {
        Mediator.removeNewGuy(this, facility);
    }


}
