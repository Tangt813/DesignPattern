package MVC.src;

import Prototype.Factory_Proto.DishCache;

public class RestaurantView {
    /**
     * 展示餐厅信息
     * @param name
     * @param needTime
     * @param queueNum
     * @param freeSeat
     */
    public void show(String name,int needTime,int queueNum,int freeSeat)
    {
        System.out.println("");
        System.out.println("餐厅 "+name);
        System.out.println("空闲座位："+freeSeat+"。");
        System.out.println("排队还需要"+needTime+"分钟。");
        System.out.println("排队人数为："+queueNum+"人。");

    }
}
