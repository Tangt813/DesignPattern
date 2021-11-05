package FacadePattern;/*
@version : 
@author：张世铎
@date:
@description:导游带领游客参观表演
*/

public class PerformanceWatching {
    String guideId;
    String visitorId;

    //设置游客和导游的ID
    public void setID(String gID,String vID){
        this.guideId=gID;
        this.visitorId=vID;
    }

    //执行表演的观看函数
    public void Watch(){
        System.out.println("导游"+this.guideId+"带领游客"+visitorId+"观看了剧场表演");
        System.out.println("游客"+visitorId+"表示非常精彩");
    }
}
