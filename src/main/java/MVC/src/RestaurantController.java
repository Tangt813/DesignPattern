package MVC.src;

public class RestaurantController {
    private Restaurant restaurant;
    private RestaurantView RV;
    public RestaurantController(Restaurant restaurant,RestaurantView RV)
    {
        this.restaurant=restaurant;
        this.RV=RV;
    }
    public void showMenu()
    {
        restaurant.showMenu();
    }
    public void setName(String name)
    {
        restaurant.setName(name);
    }
    public void add(int number)
    {
        restaurant.add(number);
    }
    public void clear(int number)
    {
        restaurant.clear(number);
    }
    public void setSpeed(int speed)
    {
        restaurant.setSpeed(speed);
    }
    public void updateView()
    {
        RV.show(restaurant.getName(),restaurant.getTime(),restaurant.getQueue(),restaurant.getFree());
    }

}
