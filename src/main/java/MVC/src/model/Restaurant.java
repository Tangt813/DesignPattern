package MVC.src.model;

import Iterator.*;


public class Restaurant {
    public String name;
    private int seat;
    private int busySeat=0;
    private int queueNum=0;
    private int speed=1;
    private int needTime=0;
    private Iterator menuIt;
    public static Restaurant getRestaurant()
    {
        Menu menu = new Menu();
        menu.appendDish(new Dish("同济大排",5));
        menu.appendDish(new Dish("烤肉饭",18));
        menu.appendDish(new Dish("猪肝面",19));
        Iterator MI=menu.iterator();
        return new Restaurant(10,"一起吃",MI);
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public Restaurant(int seat,String name,Iterator menuIt)
    {
        this.menuIt=menuIt;
        this.seat=seat;
        this.name=name;
    }
    public void add(int number)
    {
        busySeat+=number;
        if(busySeat>seat)
        {
            int more=busySeat-seat;
            queueNum+=more;
            busySeat=seat;
            needTime+=more/speed;
        }
    }
    public void setSpeed(int speed)
    {
        this.speed=speed;
    }
    public void clear(int number)
    {
        busySeat-=number;
        if(queueNum>0)
        {
            busySeat+=queueNum-number>0?number:queueNum;
            queueNum=queueNum-number>0?queueNum-number:0;
            needTime=queueNum/speed;
        }
    }
    public int getTime()
    {
        return needTime;
    }
    public int getQueue()
    {
        return queueNum;
    }
    public String getName()
    {
        return name;
    }
    public int getFree()
    {
        return seat-busySeat;
    }
    public void showMenu()
    {
        System.out.println("----------------------Iterator Pattern Test Start---------------------------");
        System.out.println("");
        System.out.println("Iterator检查是否有下一个");
        while (menuIt.hasNext()) {
            System.out.println("有下一个");
            Dish dish = (Dish) menuIt.next();
            System.out.println(dish.getName()+"  价格："+dish.getPrice());
            System.out.println("");
            System.out.println("Iterator检查是否有下一个");

        }
        System.out.println("没有下一个，结束迭代");
        System.out.println("----------------------Iterator Pattern Test End-----------------------------");
        menuIt.first();
    }


}
