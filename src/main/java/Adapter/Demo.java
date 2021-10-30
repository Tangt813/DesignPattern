package Adapter;

public class Demo
{
    public static void main(String[] args) {
        System.out.println("Test Adapter");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("创建一个VIP类用户和一个普通用户，他们都会使用一些付费设施");
        System.out.println("实现一个函数来根据用户类型来判断应收取的票价");

        RegularTicket myTicket=new RegularTicket();
        myTicket.check("VIP");
        myTicket.check("Regular");

    }

}
