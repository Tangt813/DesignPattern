package Prototype;

import Visitor.Facility;
import Visitor.FacilityAdministrator;
import Visitor.FacilityPlayer;
import Visitor.RecreationFacility;
import org.junit.Test;

public class PrototypeTest {
    @Test
    public void prototypeTest() {
        System.out.println("----------------------Pototype Pattern Test Start--------------------");
        SouvenirCache.loadCache();
        System.out.print("纪念品商店里有很多商品，同种商品都是一个模板制作的\n");
        System.out.print("这些商品具有名称、id、价格等属性，对顾客来说名称和价格是可见的\n");
        Souvenir clonedSouvenir = (Souvenir) SouvenirCache.getSouvenir("10001");
        System.out.println("Souvenir " + clonedSouvenir.getName() + ":" + clonedSouvenir.getPrice()+" yuan");

        Souvenir clonedSouvenir2 = (Souvenir) SouvenirCache.getSouvenir("10002");
        System.out.println("Souvenir " + clonedSouvenir2.getName() + ":" + clonedSouvenir.getPrice()+" yuan");

        Souvenir clonedSouvenir3 = (Souvenir) SouvenirCache.getSouvenir("10003");
        System.out.println("Souvenir " + clonedSouvenir3.getName() + ":" + clonedSouvenir.getPrice()+" yuan");
        System.out.println("----------------------Prototye Pattern Test Start--------------------");
    }
}
