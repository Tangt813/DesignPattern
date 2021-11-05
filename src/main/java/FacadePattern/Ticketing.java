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

    //购票的构造函数
    public Ticketing(String gID,String vID){
        this.ticket=new Ticket();
        this.guideId=gID;
        this.visitorId=vID;
    }

    //执行购票动作
    public void Purchase(){
        this.ticket.setUser(this.visitorId+this.date);
        this.ticket.setTicketId();
    }


    //设置日期
    public void setDate(String date){
        this.date=date;
    }

    //获取门票ID
    public String getTicketId()
    {
        return this.ticket.getTicketId();
    }
}
