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
        while (menuIt.hasNext()) {
            Dish dish = (Dish) menuIt.next();
            System.out.println(dish.getName());
        }
    }


}
