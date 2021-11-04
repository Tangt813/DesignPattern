package Prototype;



import java.util.Hashtable;

public class FoodCache {

    private static Hashtable<String, Food> foodMap
            = new Hashtable<String, Food>();

    public static Food getFood(String foodName) {//根据名称返回原型
        Food cachedFood = foodMap.get(foodName);
        return (Food) cachedFood.clone();
    }

    public static void loadCache() {
        Chicken chicken = new Chicken();//初始化cache
        foodMap.put(chicken.getName(), chicken);

        Hamburger hamburger = new Hamburger();
        foodMap.put(hamburger.getName(),hamburger);

        Noodles noodles = new Noodles();
        foodMap.put(noodles.getName(),noodles);
    }



    public static void showCache(){
        System.out.println("当前备餐："+foodMap.keySet());
    }//打印cache
}
