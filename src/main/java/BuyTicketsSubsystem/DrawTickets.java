package BuyTicketsSubsystem;/*
@version : 
@author：张世铎
@date:
@description:
*/


import Filter.Ticket;

import java.util.Date;

public class DrawTickets {
    public void run(Long id, double price,String type){
        Ticket ticket = new Ticket(id.toString(),(int)price,new Date(),type);
        System.out.println("================================");
        System.out.println("|          游园联票             |");

        System.out.printf("|   No: %-7s                |\n", ticket.getUserName());
        System.out.printf("|   Price: %-4d                |\n", ticket.getPrice());
        System.out.printf("|   Date: %4d-%2d-%2d           |\n", ticket.getTime().getYear() + 1900, ticket.getTime().getMonth() + 1, ticket.getTime().getDate());
        System.out.printf("|   Type: %-8s             |\n", ticket.getType());
        System.out.println("|                              |");
        System.out.printf("|        祝您玩得愉快！          |\n");

        System.out.println("================================");
    }

}
