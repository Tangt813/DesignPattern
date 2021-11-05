package FlyweightPattern;
import java.util.HashMap;

public class CrystallBallFactory {
    //构建一个哈希表，用来方便的存储当前创建的水晶球与半径的关系，也就是我们main里面所提到的模子，如果哈希表里面有该对象，就可以不用额外创建
    private static final HashMap<Integer, CrystalBall> circleMap = new HashMap<Integer, CrystalBall>();
    public static int num=0;

    public static CrystalBall getCrystalBall(int radius) {

        //根据radius值，在哈希表中监测是否有该对象，类似于字典的查找
        CrystalBall crystalBall = circleMap.get(radius);
        //安全保护，对空对象进行保护和访问
        if(crystalBall == null) {
            num=num+1;
            crystalBall = new CrystalBall(radius);
            circleMap.put(radius, crystalBall);

        }
        return crystalBall;
    }
    //返回模子个数
    public static int numMuzi(){return num;}
}
