package Interpreter;


/**
 *
 */
public class InterpreterDemo {
    public static void main(String[] args) {
        Context ticket = new Context();
        ticket.getTicket("441623200108132010,VIP");//6:9
        ticket.getTicket("441423197108132010,非VIP");//6:9
        ticket.getTicket("441623201108132010,非VIP");//6:9
        ticket.getTicket("441623201108132010,非VIP");//6:9
    }
}