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

    public Guide(String guideId,String visitorId)
    {
        this.guideId=guideId;
        this.visitorId=visitorId;
        this.facilityPlay=new FacilityPlay();
        this.performanceWatching=new PerformanceWatching();
        this.ticketing=new Ticketing(guideId,visitorId);
    }

    public void setDate(String date){
        this.ticketing.setDate(date);
    }

    public void Purchase(){
        this.ticketing.Purchase();
    }

    public String getTicketId()
    {
        return this.ticketing.getTicketId();
    }

    public void Play(){
        this.facilityPlay.setFacilityPlay(this.guideId,this.visitorId);
        facilityPlay.Play();
    }

    public void Watch(){
        this.performanceWatching.setID(this.guideId,this.visitorId);
        this.performanceWatching.Watch();
    }


}
