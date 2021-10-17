package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class MainFoodFactory implements DishFactory{
    private String MainFoodName;

    public void getname(String name)
    {this.MainFoodName=name;}
    @Override
    public Dish produceDish() {
        System.out.println(MainFoodName);
        System.out.println(" has been produced");
        return new MainDish(this.MainFoodName);
    }
}
