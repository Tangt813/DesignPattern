package Prototype;

import java.util.Hashtable;

public class SouvenirCache {

    private static Hashtable<String, Souvenir> souvenirMap
            = new Hashtable<String, Souvenir>();

    public static Souvenir getSouvenir(String shapeId) {
        Souvenir cachedSouvenir = souvenirMap.get(shapeId);
        return (Souvenir) cachedSouvenir.clone();
    }

    // 对每种形状都运行数据库查询，并创建该形状
    // souvenirMap.put(shapeKey, shape);
    // 例如，我们要添加三种形状

    public static void loadCache() {
        SouvenirBadge souvenirBadge = new SouvenirBadge();
        souvenirMap.put(souvenirBadge.getId(), souvenirBadge);

        SouvenirCup square = new SouvenirCup();
        souvenirMap.put(square.getId(),square);

        SouvenirShirt rectangle = new SouvenirShirt();
        souvenirMap.put(rectangle.getId(),rectangle);
    }
}