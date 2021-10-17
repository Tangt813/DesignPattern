package ChainOfResponsibility;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public abstract class Handler {
    private Handler nextHandler;
    public abstract Boolean handle(RefundRequest request);
}
