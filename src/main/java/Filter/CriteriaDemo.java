package Filter;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 10:49 PM
 * @Version 1.0
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CriteriaDemo {
    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<Ticket>();
        tickets.add(new Ticket("Tom", 380, new Date(), "adult"));
        tickets.add(new Ticket("Jerry", 180, new Date(), "Kid"));
        tickets.add(new Ticket("Yili", 180, new Date(), "Student"));
        tickets.add(new Ticket("Tiger", 380, new Date(), "adult"));
        tickets.add(new Ticket("Bert", 0, new Date(), "Old"));

        Criteria old = new CriteriaOlder();
        Criteria student = new CriteriaStudent();
        Criteria kid = new CriteriaKid();
        Criteria adult = new CriteriaAdult();
        Criteria or = new OrCriteria(old, student);

        System.out.println("Olds:");
        printTickets(old.meetCriteria(tickets));

        System.out.println("\nStudents:");
        printTickets(student.meetCriteria(tickets));

        System.out.println("\nKids:");
        printTickets(kid.meetCriteria(tickets));

        System.out.println("\nAdults:");
        printTickets(adult.meetCriteria(tickets));

        System.out.println("\nOld or students:");
        printTickets(or.meetCriteria(tickets));

    }

    public static void printTickets(List<Ticket> tickets) {
        for (Ticket ticket: tickets) {
//            System.out.println("Ticket : [ Name : " + ticket.getUserName() +
//                    ", Price : " + ticket.getPrice() +
//                    ", Date : " + ticket.getTime() +
//                    ", Type : " + ticket.getType() + " ] ");
            System.out.println("================================");
            System.out.println("|          游园联票             |");

            System.out.printf("|   Name: %-5s                |\n", ticket.getUserName());
            System.out.printf("|   Price: %-4d                |\n", ticket.getPrice());
            System.out.printf("|   Date: %4d-%2d-%2d           |\n", ticket.getTime().getYear() + 1900, ticket.getTime().getMonth() + 1, ticket.getTime().getDate());
            System.out.printf("|   Type: %-8s             |\n", ticket.getType());
            System.out.println("|                              |");
            System.out.printf("|        祝您玩得愉快！          |\n");

            System.out.println("================================");
        }
        System.out.println("######################################");
    }
}
