package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class MainFoodFactory implements DishFactory {

    //重写主食工厂生产主食
    @Override
    public MainDish produceDish(String mainFoodName, Integer price) {
        System.out.println("一份"+mainFoodName+"已经制作完成");
        return new MainDish(mainFoodName, price);
    }
}
