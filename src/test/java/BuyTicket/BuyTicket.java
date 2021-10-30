package BuyTicket;

import Decorated.Customer;
import Decorated.People;
import Decorated.VIPCustomer;

public class BuyTicket {

    public static void main(String[] args) {
        String ID = "441623194608132010";
        People customer = new Customer(ID);
        customer.buyTicket();
        String ID2="441623200108132011";
        VIPCustomer  customer2=new VIPCustomer(new Customer(ID2));
        customer2.buyTicket();
    }
}
