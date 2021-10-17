package ChainOfResponsibility;

import java.util.Date;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public class RefundRequest {
    private Date buyDate;
    private String source;
    private Integer price;

    public RefundRequest(Date buyDate, String source, Integer price) {
        this.buyDate = buyDate;
        this.source = source;
        this.price = price;
    }

    public Date getBuyDate() {
        return buyDate;
    }

    public String getSource() {
        return source;
    }

    public Integer getPrice() {
        return price;
    }
}
