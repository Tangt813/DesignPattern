package FacadePattern;/*
@version : 
@author：张世铎
@date:
@description:导游类，帮助游客进行项目的参观游览
*/

public class Guide {
    private String guideId;
    private String visitorId;
    private FacilityPlay facilityPlay;
    private PerformanceWatching performanceWatching;
    private Ticketing ticketing;

    //重构含参构造函数，对应参数初始化
    public Guide(String guideId,String visitorId)
    {
        this.guideId=guideId;
        this.visitorId=visitorId;
        this.facilityPlay=new FacilityPlay();
        this.performanceWatching=new PerformanceWatching();
        this.ticketing=new Ticketing(guideId,visitorId);
    }

    //日期设置函数
    public void setDate(String date){
        this.ticketing.setDate(date);
    }

    //购票函数
    public void Purchase(){
        this.ticketing.Purchase();
    }

    //获取所买票的ID
    public String getTicketId()
    {
        return this.ticketing.getTicketId();
    }

    //游玩游乐场函数
    public void Play(){
        this.facilityPlay.setFacilityPlay(this.guideId,this.visitorId);
        facilityPlay.Play();
    }

    //观看表演函数
    public void Watch(){
        this.performanceWatching.setID(this.guideId,this.visitorId);
        this.performanceWatching.Watch();
    }


}
