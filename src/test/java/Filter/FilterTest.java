package Filter;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/31 3:00 PM
 * @Version 1.0
 */

import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static Filter.CriteriaDemo.printTickets;

public class FilterTest {
    @Test
    public void TestFilter() {
        System.out.println("----------------------Filter Pattern Test Start--------------------");

        List<Ticket> tickets = new ArrayList<Ticket>();
        System.out.println("汤姆刚刚购买了票价为380的成人票。");
        tickets.add(new Ticket("Tom", 380, new Date(), "adult"));

        tickets.add(new Ticket("Jerry", 180, new Date(), "Kid"));
        System.out.println("杰瑞刚刚购买了票价为180的儿童票。");

        tickets.add(new Ticket("Yili", 180, new Date(), "Student"));
        System.out.println("益立刚刚购买了票价为180的学生票。");

        tickets.add(new Ticket("Tiger", 380, new Date(), "adult"));
        System.out.println("泰格刚刚购买了票价为380的成人票。");

        tickets.add(new Ticket("Bert", 0, new Date(), "Old"));
        System.out.println("波特刚刚购买了票价为0的老人票。");


        System.out.println("现在我们开始对票务进行过滤:\n\n");
        Criteria old = new CriteriaOlder();
        Criteria student = new CriteriaStudent();
        Criteria kid = new CriteriaKid();
        Criteria adult = new CriteriaAdult();
        Criteria or = new OrCriteria(old, student);
        System.out.println("使用老人过滤器过滤老人票务信息:");
        printTickets(old.meetCriteria(tickets));

        System.out.println("使用学生过滤器过滤学生票务信息:");
        printTickets(student.meetCriteria(tickets));

        System.out.println("使用儿童过滤器过滤儿童票务信息:");
        printTickets(kid.meetCriteria(tickets));

        System.out.println("使用成人过滤器过滤成人票务信息:");
        printTickets(adult.meetCriteria(tickets));

        System.out.println("使用或过滤器过滤老人或者学生票务信息:");

        printTickets(or.meetCriteria(tickets));
        System.out.println("----------------------Filter Pattern Test End--------------------");

    }
}
