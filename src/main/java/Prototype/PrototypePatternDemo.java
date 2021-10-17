package Prototype;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        SouvenirCache.loadCache();

        Souvenir clonedSouvenir = (Souvenir) SouvenirCache.getSouvenir("10001");
        System.out.println("Souvenir " + clonedSouvenir.getName() + ":" + clonedSouvenir.getPrice()+" yuan");

        Souvenir clonedSouvenir2 = (Souvenir) SouvenirCache.getSouvenir("10002");
        System.out.println("Souvenir " + clonedSouvenir2.getName() + ":" + clonedSouvenir.getPrice()+" yuan");

        Souvenir clonedSouvenir3 = (Souvenir) SouvenirCache.getSouvenir("10003");
        System.out.println("Souvenir " + clonedSouvenir3.getName() + ":" + clonedSouvenir.getPrice()+" yuan");
    }
}
