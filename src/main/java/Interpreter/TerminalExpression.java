package Interpreter;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式
 */
class TerminalExpression implements Expression {

    private Set<Object> set = new HashSet<Object>();

    /**
     * 初始化set，存入终结符
     *
     * @param Data：初始数据
     */
    public TerminalExpression(Object[] Data) {
        Collections.addAll(set, Data);
    }

    /**
     * 判断info在不在终结符set中
     *
     * @param info：例子“上海”，“儿童”
     * @return info在set里返回1，否则返回0
     */
    @Override
    public int interpret(String info) {
        if (set.contains(info))
            return 1;
        else
            return 0;
    }
}
