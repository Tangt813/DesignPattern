package Interpreter;

/**
 * 非终结符表达式
 */
class NonterminalExpression implements Expression {
    private Expression person = null;
    private Expression value = null;
    private static int nowYear = 2021;

    /**
     * 创建3个非终结符表达式per
     *
     * @param person
     * @param value
     */
    public NonterminalExpression(Expression person, Expression value) {
        this.person = person;
        this.value = value;
    }

    /**
     * 对传入的info进行每个非终结符表达式的判断
     *
     * @param info：例子“441623200*********,VIP”,"441623200*********,普通"
     * @return 0，不是VIP，不是老人或孩子；
     * 1，是VIP，不是老人或孩子
     * 2，是老人或孩子
     */
    @Override
    public int interpret(String info) {
        String s[] = info.split(",");
        int year = nowYear - Integer.valueOf(s[0].substring(6, 10)).intValue();

        if (year <= 12) {
            s[0] = "儿童";
        } else if (year >= 60) {
            s[0] = "老人";
        } else {
            s[0] = "青壮年";
        }
        if (person.interpret(s[0]) == 1) {
            return 2;
        } else {
            if (value.interpret(s[1]) == 1) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}
