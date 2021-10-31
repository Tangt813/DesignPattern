package FlyweightPattern;
import java.util.HashMap;

public class CrystallBallFactory {
    private static final HashMap<Integer, CrystalBall> circleMap = new HashMap<Integer, CrystalBall>();
    public static int num=0;

    public static CrystalBall getCrystalBall(int radius) {
        CrystalBall crystalBall = circleMap.get(radius);

        if(crystalBall == null) {
            num=num+1;
            crystalBall = new CrystalBall(radius);
            circleMap.put(radius, crystalBall);

        }
        return crystalBall;
    }
    public static int numMuzi(){return num;}
}
