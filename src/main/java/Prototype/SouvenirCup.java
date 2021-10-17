package Prototype;

public class SouvenirCup extends Souvenir {

    public SouvenirCup(){
        setName("Cup");
        setPrice(49.99);
        setId("10002");
    }

    @Override
    public void draw() {
        System.out.println("Inside SouvenirCup::draw() method.");
    }
}