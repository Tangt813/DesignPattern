package Prototype;

import java.util.Hashtable;

public class FoodCache {

    private static Hashtable<String, Food> foodMap
            = new Hashtable<String, Food>();

    public static Food getFood(String foodId) {
        Food cachedFood = foodMap.get(foodId);
        return (Food) cachedFood.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // foodMap.put(foodKey, food);
    // 例如，我们要添加三种形状

    public static void loadCache() {
        Chicken foodBadge = new Chicken();
        foodMap.put(foodBadge.getId(), foodBadge);

        Hamburger square = new Hamburger();
        foodMap.put(square.getId(),square);

        Noodles rectangle = new Noodles();
        foodMap.put(rectangle.getId(),rectangle);
    }
}
