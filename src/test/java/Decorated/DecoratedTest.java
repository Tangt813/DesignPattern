package Decorated;
import org.junit.Test;
public class DecoratedTest {
    @Test
    public void testDecorated(){
        String ID = "1212";
        People customer = new Customer(ID);
        System.out.println(customer.getDescription() + " " + customer.getID());
        customer.buyTicket();
        System.out.println("\n");
        customer = new VIPCustomer(customer);
        System.out.println(customer.getDescription() + " " + customer.getID());
        customer.buyTicket();
        System.out.println("\n");
        customer = new SeniorVIPCustomer(customer);
        System.out.println(customer.getDescription() + " " + customer.getID());
        customer.buyTicket();
    }
}
