package Interpreter;

/**
 * @author:XieYuxiang
 * 文本
 */
public class Context {
    private String[] persons = {"老人", "儿童"};
    private String[] values = {"VIP"};
    private Expression personValue;

    public Context() {
        Expression age = new TerminalExpression(persons);
        Expression value = new TerminalExpression(values);
        personValue = new NonterminalExpression(age, value);
    }

    /**
     * @param info 待解释的语句
     * @return 返回门票折扣类型
     */
    public String getTicket(String info) {
        if (personValue.interpret(info) == 2) {
            System.out.println("您享受免费服务, 本次入园免费！");
            return "free";
        } else if (personValue.interpret(info) == 1) {
            System.out.println("您不是免费人员，但你是尊贵的VIP，享受八折购票。");
            return "discount";
        } else if (personValue.interpret(info) == 0) {
            System.out.println("您不是免费人员也不是VIP，本次入园请支付全票！");
            return "full";
        }
        return " ";
    }
}
