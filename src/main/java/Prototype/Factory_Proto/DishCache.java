package Prototype.Factory_Proto;



import Factory.src.*;

import java.util.Hashtable;

public class DishCache {

    private static Hashtable<String, Dish> dishMap
            = new Hashtable<String, Dish>();

    public static Dish getDish(String DishName) {
//        Food cachedFood = foodMap.get(foodId);
//        return (Food) cachedFood.clone();
//        System.out.println("clone\n");
        Dish cachedDish = dishMap.get(DishName);
        return cachedDish;
    }

    public static boolean searchDish(String dishName){
        if (dishMap.containsKey(dishName))
            return true;
        else return false;
    }

    public static void addCache(Dish dish){
        dishMap.put(dish.getName(),dish);
    }

    public static void showCache(){
        System.out.println("当前备餐："+dishMap.keySet());
    }

    public static void loadCache() {
//        System.out.print("loadCache");


        MainFoodFactory Main_Fac=new MainFoodFactory();
        SnackFactory Snack_Fac=new SnackFactory();
        DrinkDishFactory Drink_Fac=new DrinkDishFactory();

        dishMap.put("汉堡",Main_Fac.produceDish("汉堡", 22));
        dishMap.put("薯条",Snack_Fac.produceDish("薯条", 12));
        dishMap.put("可乐",Drink_Fac.produceDish("可乐", 10));

    }
}
