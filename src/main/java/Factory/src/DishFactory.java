package Factory.src;/*
@version : 1.0.0
@author：张世铎
@date:2021.10.17
@description:餐厅菜品制作采用工厂模式，这里定义抽象基类
*/

public interface DishFactory {
    Dish produceDish(String name, Integer price);
}


