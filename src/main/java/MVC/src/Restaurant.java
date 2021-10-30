package MVC.src;

import Iterator.*;


public class Restaurant {
    public String name;
    private int busySeat=0;
    private int queueNum=0;
    private int speed=1;
    private int needTime=0;
    private Iterator menuIt;
    private int seat=10;
    public static Restaurant getRestaurant()
    {
        Menu menu = new Menu();
        menu.appendDish(new MainDish("饭",5.0));
        menu.appendDish(new DrinkDish("可乐",5.0));
        menu.appendDish(new SnackDish("零食",5.0));
        Iterator MI=menu.iterator();
        return new Restaurant("一起吃",MI);
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public Restaurant(String name, Iterator menuIt)
    {
        this.menuIt=menuIt;
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
