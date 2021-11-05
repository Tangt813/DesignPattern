/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 9:44 PM
 */

package Filter;
import java.util.Date;


public class Ticket {
    /**
     * Ticket class, use criteria on this ticket class.
     * The properties remain to be supplemented.
     */
    public String userName;
    public int price;
    public Date time;
    public String type;

    /**
     * @Desc: 构造函数
     * @Param: 用户名、票价、票的日期、票种
     * @Return: 无
     */
    public Ticket(String userName, int price, Date time, String type) {
        this.userName = userName;
        this.price = price;
        this.time = time;
        this.type = type;
    }
    /**
     * @Desc: 构造函数重载
     * @Param: 用户名
     * @Return: 无
     */
    public Ticket(String userName) {
        this.price = 100;
        this.time = new Date();
        this.type = "ADULT";
        this.userName = userName;
    }

    /**
     * @Desc: 获得用户名
     * @Param: 无
     * @Return: 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @Desc: 获得票价
     * @Param: 无
     * @Return: 票价
     */
    public int getPrice() {
        if (this.getType().equalsIgnoreCase("OLD")) {
            return 0;
        }

        if (this.getType().equalsIgnoreCase("VIP")) {
            return 50;
        }

        return price;
    }

    /**
     * @Desc: 获取票务日期
     * @Param: 无
     * @Return: 日期
     */
    public Date getTime() {
        return time;
    }

    /**
     * @Desc: 获得票种
     * @Param: 无
     * @Return: 票种
     */
    public String getType() {
        return type;
    }

    /**
     * @Desc: 判断票务是否为空对象
     * @Param: 无
     * @Return: 假
     */
    public boolean isNil() {
        return false;
    }
}
