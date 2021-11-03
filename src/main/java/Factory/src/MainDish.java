package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class MainDish extends Dish {

    //含参的重构默认函数
    public MainDish(String name, Integer price) {
        this.name = name;
        this.price = price;
    }
}
