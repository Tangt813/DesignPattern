package FlyweightPattern;

public class Main {
    public static int radius[] = { 6,8,10 };
    public static String colors[] = { "Red", "Yellow", "Blue", "White", "Black" };
    public static String names[] = { "Ameis", "Wang", "China"};
    public static void main(String[] args) {
        for(int i=0; i < 10; ++i) {
            CrystalBall crystalBal = CrystallBallFactory.getCrystalBall(getRandomRadius());
            crystalBal.setColor(colors[i%5]);
            crystalBal.setName(names[i%3]);
            crystalBal.draw(names[i%3]);
        }
    }
    public static int getRandomRadius() {
        return radius[(int)(Math.random()*radius.length)];
    }

}
