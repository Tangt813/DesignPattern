package FacadePattern;/*
@version : 
@author：张世铎
@date:
@description:购票类，帮助游客进行票务处理
*/

public class Ticketing {
    private String guideId;
    private String visitorId;
    private String date;
    private Ticket ticket;

    public Ticketing(String gID,String vID){
        this.ticket=new Ticket();
        this.guideId=gID;
        this.visitorId=vID;
    }

    public void Purchase(){
        this.ticket.setUser(this.visitorId+this.date);
        this.ticket.setTicketId();
    }

    public void setDate(String date){
        this.date=date;
    }

    public String getTicketId()
    {
        return this.ticket.getTicketId();
    }
}
