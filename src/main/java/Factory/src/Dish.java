package Factory.src;/*
@version : 1.0.0
@author：张世铎
@date:2021.10.17
@description:菜品类，包括菜品基本信息和关于菜品生产的函数
*/

public abstract class Dish {
    protected String name;
    protected double price;

    public enum produceState {toBeStarted, producing, complete};//生产状态
    //protected produceState state;
    //默认构造函数
    Dish() {
    }
    //重构含参构造函数
    Dish(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
    //设置菜品名称
    public void setName(String name) {
        this.name = name;
    }
    //获取菜品名称
    public String getName() {
        return name;
    }
    //获取菜品价格
    public double getPrice() {
        return price;
    }
}
