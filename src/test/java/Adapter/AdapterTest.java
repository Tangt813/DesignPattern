package Adapter;

import org.junit.Test;

/**
 * @author xieyuxiang
 * @version 1.0.0
 * @ClassName AdapterTest.java
 * @Description TODO
 * @createTime 2021年10月30日 10:37:00
 */
public class AdapterTest
{
    @Test
    public void adapterTest() {
        System.out.println("Test Adapter");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("进入园区后，有许多特殊的设施或者表演需要购买另外的附加票，本设计模式就是实现附加票计算的功能");
        System.out.println("我们拥有一个门票检测系统，能够检测门票的等级，但接口只能检测普通的基本的门票类型");
        System.out.println("在园区不断发展时，肯定会推出各种各样的票，那时候如果没有一个能够适配所有门票的接口，将会导致修改的工作量变大");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("所以为了能够适配各种各样的票的类型，实现了适配器类，来让门票检验允许与所有票类型对接");
        RegularTicket myTicket=new RegularTicket();
        System.out.println("首先我们测试普通票：");
        System.out.println(myTicket.check("Regular"));
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("下面我们测试VIP票：");
        System.out.println(myTicket.check("VIP"));

    }

}
