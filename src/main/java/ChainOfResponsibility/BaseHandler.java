package ChainOfResponsibility;

/**
 * Description
 *
 * @author zhichenren
 * @version 1.0
 */
//处理者的基类
public abstract class BaseHandler {
    //这里定义了责任链上的下一个处理者，可以在处理过程中动态设置
    private BaseHandler nextHandler;
    //用于处理请求的函数
    public abstract Boolean handle(RefundRequest request);
}
