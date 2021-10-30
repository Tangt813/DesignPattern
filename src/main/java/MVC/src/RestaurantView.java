package MVC.src;

public class RestaurantView {
    public void show(String name,int needTime,int queueNum,int freeSeat)
    {
        System.out.println("");
        System.out.println("餐厅 "+name);
        System.out.println("空闲座位："+freeSeat+"。");
        System.out.println("排队还需要"+needTime+"分钟。");
        System.out.println("排队人数为："+queueNum+"人。");

    }
}
