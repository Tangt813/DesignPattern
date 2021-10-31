package BuyTicketsSubsystem;

import Memento.TicketState;
import Memento.TicketsStateMemento;
import Memento.TicketsStateCaretaker;
import org.junit.Test;

import java.util.Scanner;

public class OrderForm {
    private String price;
    private String type;

    OrderForm(double price, String type){
        this.price=""+price;
        this.type=type;
    }

    public boolean run() {
        TicketState ticketsState = new TicketState(50, 1000);
        TicketsStateCaretaker ticketsStateCaretaker = new TicketsStateCaretaker();
        ticketsStateCaretaker.setTicketsStateMemento(ticketsState.saveState());

        System.out.println("\n# 以下为后台显示信息");
        ticketsState.display();
        System.out.print('\n');

        System.out.println("这是您的订单:");
        for(int i=0;i<20;i++){
            System.out.print('—');
        }
        System.out.print("\n|type:");
        System.out.print(type);
        for(int i=0;i<20-type.length()-7;i++){
            System.out.print(' ');
        }
        System.out.print("|\n|price:");
        System.out.print(price);
        for(int i=0;i<20-price.length()-8;i++){
            System.out.print(' ');
        }
        System.out.print("|\n");
        for(int i=0;i<20;i++){
            System.out.print('—');
        }
        System.out.print("\n输入y/Y支付,输入其他取消订单\n");

        System.out.println("\n# 以下为后台显示信息");
        ticketsState.sellTickets();
        ticketsState.display();
        System.out.print('\n');

        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        if (command.equals("y") || command.equals("Y")) {
            return true;
        } else {
            System.out.println("您已取消支付...");
            ticketsState.recoveryState(ticketsStateCaretaker.getTicketsStateMemento());
            System.out.println("\n# 以下为后台显示信息");
            ticketsState.display();
            return false;
        }
    }



    public void show(){
        for(int i=0;i<20;i++){
            System.out.print('—');
        }
        System.out.print("\n|type:");
        System.out.print(type);
        for(int i=0;i<20-type.length()-8;i++){
            System.out.print(' ');
        }
        System.out.print("|\n|price:");
        System.out.print(price);
        for(int i=0;i<20-price.length()-7;i++){
            System.out.print(' ');
        }
        System.out.print("|\n");
        for(int i=0;i<20;i++){
            System.out.print('—');
        }
        System.out.print("\n输入y/Y支付,输入其他取消订单\n");
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = ""+price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
