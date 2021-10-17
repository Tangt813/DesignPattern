package Prototype;

public class SouvenirBadge extends Souvenir {

    public SouvenirBadge(){
        setName("Badge");
        setPrice(10.00);
        setId("10001");
    }

    @Override
    public void draw() {
        System.out.println("Inside SouvenirBadge::draw() method.");
    }
}
