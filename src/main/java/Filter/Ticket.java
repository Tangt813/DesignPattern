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
    public Ticket(String userName, int price, Date time, String type) {
        this.userName = userName;
        this.price = price;
        this.time = time;
        this.type = type;
    }

    public String getUserName() {
        return userName;
    }

    public int getPrice() {
        if (this.getType().equalsIgnoreCase("OLD")) {
            return 0;
        }

        if (this.getType().equalsIgnoreCase("VIP")) {
            return 50;
        }

        return price;
    }

    public Date getTime() {
        return time;
    }

    public String getType() {
        return type;
    }
}
