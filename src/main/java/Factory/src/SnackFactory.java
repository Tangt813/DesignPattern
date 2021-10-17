package Factory.src;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class SnackFactory implements DishFactory{
    private String SnackName;

    public void getname(String name)
    {this.SnackName=name;}
    @Override
    public Dish produceDish()
    {
        System.out.println(SnackName);
        System.out.println(" has been produced");
        return new SnackDish(this.SnackName);
    }
}
