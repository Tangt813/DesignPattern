package Mediator;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 11:46 PM
 * @Version 1.0
 */

public class Admin {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admin(String name) {
        this.name = name;
    }

    public void addGuest(String facility) {
        Monitor.showQueueProcess(this, facility);
    }
}
