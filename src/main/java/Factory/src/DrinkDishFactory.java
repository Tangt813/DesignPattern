package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class DrinkDishFactory implements DishFactory{
    private String DrinkName;

    public void getname(String name)
    {this.DrinkName=name;}
    @Override
    public Dish produceDish() {
        System.out.println(DrinkName);
        System.out.println(" has been produced");
        return new DrinkDish(this.DrinkName);
    }
}
