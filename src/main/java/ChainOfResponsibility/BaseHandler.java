package ChainOfResponsibility;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
public abstract class BaseHandler {
    private BaseHandler nextHandler;
    public abstract Boolean handle(RefundRequest request);
}
