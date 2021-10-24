package Facade;/*
@version : 
@author：张世铎
@date:
@description:
*/
import FacadePattern.Guide;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void facadeTest(){
        System.out.println("--------------------Facade Pattern Test Start--------------------");
        System.out.println("一名游客选择雇佣一名导游");
        String vID="001225";
        String gID="001";
        String date="20200810";
        //建立起游客和导游的对应关系
        Guide myGuide=new Guide(gID,vID);
        //导游帮助游客购票
        System.out.println("导游开始帮助游客购票：");
        myGuide.setDate(date);
        myGuide.Purchase();
        String ticketId=myGuide.getTicketId();
        System.out.println("导游"+gID+"帮助游客"+vID+"完成购票,您的票号为"+ticketId);
        //导游带领游客游玩游乐设施
        System.out.println("导游开始带领游客游玩：");
        myGuide.Play();

        //导游带领游客观看表演
        System.out.println("导游带领游客去看表演：");
        myGuide.Watch();

        System.out.println("--------------------Facade Pattern Test End--------------------");
    }

}
