package Adapter;

/**
 * author:XIE YUXIANG
 */
public class Facility {
    //设施类
    public void run(VIP man)
    {
        //传入参数为VIP型
        System.out.println("This Facility is running !");
        man.getPay();
    }
}
