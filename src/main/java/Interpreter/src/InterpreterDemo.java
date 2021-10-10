
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * 表达式
 */
interface Expression{
    int interpret(String info);
}

/**
 * 终结符表达式
 */
class TerminalExpression implements Expression{

    private Set<String> set=new HashSet<String>();

    /**
     * 初始化set，存入终结符
     * @param Data：初始数据
     */
    public TerminalExpression(String[] Data){
        Collections.addAll(set, Data);
    }

    /**
     * 判断info在不在终结符set中
     * @param info：例子“上海”，“儿童”
     * @return info在set里返回1，否则返回0
     */
    @Override
    public int interpret(String info) {
        if(set.contains(info))
            return 1;
        else
            return 0;
    }
}

/**
 * 非终结符表达式
 */
class NonterminalExpression implements Expression{
    private Expression city = null;
    private Expression person = null;
    private Expression company=null;

    /**
     * 创建3个非终结符表达式
     * @param city
     * @param person
     * @param company
     */
    public NonterminalExpression(Expression city, Expression person,Expression company) {
        this.city = city;
        this.person = person;
        this.company=  company;
    }

    /**
     * 对传入的info进行每个非终结符表达式的判断
     * @param info：例子“上海的公司的老人”
     * @return 返回满足的条件数目
     */
    @Override
    public int interpret(String info) {
        String s[] = info.split("的");
        return  (city.interpret(s[0])+person.interpret(s[2])>=1?1:0)+company.interpret(s[1]);
    }
}

/**
 * 文本
 */
class Context{
    private String[] citys = {"上海"};
    private String[] persons = {"老人", "儿童"};
    private String[] companys={"公司"};
    private Expression cityPerson;

    public Context(){
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        Expression company= new TerminalExpression(companys);
        cityPerson = new NonterminalExpression(city, person,company);
    }

    public void getTicket(String info){
        if(cityPerson.interpret(info)==1){
            System.out.println("您是" + info + ", 本次入园八折！");
        }else if(cityPerson.interpret(info)==0){
            System.out.println(info + "您不是免费人员，请购买全票。");
        }
        else if(cityPerson.interpret(info)==2)
        {
            System.out.println("您是" + info + ", 本次入园八折又八折共六四折！");
        }
    }
}

/**
 * 您是上海的公司的老人, 本次入园八折又八折共六四折！
 * 您是广州的非公司的儿童, 本次入园八折！
 * 您是上海的公司的儿童, 本次入园八折又八折共六四折！
 * 您是广州的非公司的儿童, 本次入园八折！
 * 您是上海的非公司的儿童, 本次入园八折！
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        Context ticket = new Context();
        ticket.getTicket("上海的公司的老人");
        ticket.getTicket("广州的非公司的儿童");
        ticket.getTicket("上海的公司的儿童");
        ticket.getTicket("广州的非公司的儿童");
        ticket.getTicket("上海的非公司的儿童");
    }
}