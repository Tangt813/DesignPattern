package Factory.src;/*
@version : 1.0.0
@author：张世铎
@date:2021.10.17
@description:菜品类，包括菜品基本信息和关于菜品生产的函数
*/

public  abstract class Dish {
    protected String name;
    protected double price;
    public enum produceState {toBeStarted,producing,complete } ;//生产状态
//    protected produceState state;

    Dish(){};
    Dish(String name){this.name=name;}
    public void give_name(String name){this.name=name;}
    public String getName() {return name;}
    public double getPrice() {return price;}
   // public  produceState getState() {return state;}

   /* public void dishProduced()
    {
        System.out.println(name);
        System.out.println(" has been produced!");
    }
    public void dishProducing()
    {
        System.out.println(name);
        System.out.println(" is in producing!");
    }
    public void dishToBeStarted()
    {
        System.out.println(name);
        System.out.println("is to be started!");
    }
*/
}
