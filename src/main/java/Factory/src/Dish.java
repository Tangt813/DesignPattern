package Factory.src;/*
@version : 1.0.0
@author：张世铎
@date:2021.10.17
@description:菜品类，包括菜品基本信息和关于菜品生产的函数
*/

public abstract class Dish {
    protected String name;
    protected double price;

    public enum produceState {toBeStarted, producing, complete}

    ;//生产状态
//    protected produceState state;

    Dish() {
    }

    Dish(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
