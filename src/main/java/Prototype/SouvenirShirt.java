package Prototype;

public class SouvenirShirt extends Souvenir {

    public SouvenirShirt(){
        setName("Shirt");
        setPrice(99.99);
        setId("10003");
    }

    @Override
    public void draw() {
        System.out.println("Inside SouvenirShirt::draw() method.");
    }
}