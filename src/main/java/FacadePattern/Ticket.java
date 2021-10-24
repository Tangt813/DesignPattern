package FacadePattern;/*
@version : 
@author：张世铎
@date:
@description:票的实体
*/
import java.util.Random;

public class Ticket {
    private String ticketId;
    private String userId;

    public void setTicketId(){
        Random r=new Random();
        int first=r.nextInt(100);
        int next=r.nextInt(100);
        this.ticketId=Integer.toString(first)+Integer.toString(next);
    }

    public void setUser(String id){
        this.userId=id;
    }

    public String getUserId(){
        return this.userId;
    }

    public String getTicketId(){
        return this.ticketId;
    }


}
