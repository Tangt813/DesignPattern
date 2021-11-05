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
        System.out.println("大家好，下面我们来介绍外观模式~\n" +
                "外观模式（Facade Pattern）隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口。\n" +
                "这种类型的设计模式属于结构型模式，它向现有的系统添加一个接口，来隐藏系统的复杂性。\n" +
                "这种模式涉及到一个单一的类，该类提供了客户端请求的简化方法和对现有系统类方法的委托调用。\n" +
                "接下来我们通过导游功能来介绍外观模式。\n" +
                "游客可以通过雇佣导游来带领他进行游园，导游可以为游客带来购票、观看表演、游乐场游玩等多个方面的服务\n");
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
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("导游开始带领游客游玩：");
        myGuide.Play();

        //导游带领游客观看表演
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("导游带领游客去看表演：");
        myGuide.Watch();

        System.out.println("--------------------Facade Pattern Test End--------------------");
    }

}
