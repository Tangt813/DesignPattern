package FacadePattern;/*
@version : 
@author：张世铎
@date:
@description:导游带领游客游玩游乐设施
*/

public class FacilityPlay {
    String guideId;
    String visitorId;

    public void setFacilityPlay(String guideId,String visitorId)
    {
        this.guideId=guideId;
        this.visitorId=visitorId;
    }

    public void Play(){
        System.out.println("导游"+this.guideId+"带领游客"+visitorId+"游玩了过山车、大摆锤、旋转木马");
        System.out.println("游客"+visitorId+"表示玩的很开心");
    }

}
