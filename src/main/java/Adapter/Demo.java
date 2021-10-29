package Adapter;

public class Demo
{
    public static void main(String[] args) {
        System.out.println("Test Adapter");
        VIP vip=new VIP();
        Regular regular=new Regular();
        Facility facility=new Facility();
        RegularAdapter RA=new RegularAdapter(regular);
        System.out.println("测试VIP用户游玩设施");
        facility.run(vip);
        System.out.println("测试普通用户游玩设施");
        facility.run(RA);

    }

}
