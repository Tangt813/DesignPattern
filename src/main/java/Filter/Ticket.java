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

    public Ticket(String userName, int price, Date time) {
        this.userName = userName;
        this.price = price;
        this.time = time;
    }

    public String getUserName() {
        return userName;
    }

    public int getPrice() {
        return price;
    }

    public Date getTime() {
        return time;
    }
}
