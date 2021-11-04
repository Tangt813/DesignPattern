package FlyweightPattern;

import FlyweightPattern.*;
import org.junit.Test;

import java.util.Scanner;

public class FlyweightPatternTest {
    public static int radius[] = { 6,8,10,12 };
    public static String colors[] = { "blue", "yellow", "red", "white", "green" };
    public static String names[] = { "**","++","Ameis", "Wang", "China"};
    @Test
    public void testFlyweightPattern() {
        System.out.println("大家好，欢迎来到享元模式展示~");
        Scanner input=new Scanner(System.in);
//        String str=input.next();
//        int n=input.nextInt();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("享元模式最大的优势在于抽取不同物体的公有特征，来极大降低新物体创建是所占内存的消耗");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接下来我们通过在购买水晶球的过程中来感受享元模式的使用");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我们知道，不同的水晶球形状是一样的，都是球形，不同之处在于颜色标签等，我们在生产一个球的过程中，如果每一个球对应一个模子是不现实的，也浪费了资源");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("因此对于一个同样半径的球，我们可以使用一个模子，也节约了生产，接下来我们就可以通过模子生产的数量，来感受享元的世界~");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("温馨提示：为了更人性化，水晶球可以自己选择图案哦~甚至可以打上你的名字");
        for(int i=0; i < 3; ++i) {
            System.out.println("\n此时模子的数量为："+CrystallBallFactory.numMuzi());
            System.out.println("请输入你想要的水晶球半径，颜色，及图案");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            int raduis1;
            System.out.print("半径:");
            raduis1=input.nextInt();
            System.out.print("颜色:");
            String color1=input.next();
            System.out.print("图案:");
            String names1=input.next();
            CrystalBall crystalBal = CrystallBallFactory.getCrystalBall(raduis1);
//            crystalBal.setColor(colors[i%5]);
//            crystalBal.setName(names[i%5]);
            crystalBal.setColor(color1.toString());
            crystalBal.setName(names1);
//            System.out.println("半径:"+raduis1+" 颜色:"+colors[i%5]+" 图案:"+names[i%5]);
            System.out.println("稍等片刻，你的水晶球马上做好！");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            crystalBal.draw(names[i%3]);
            crystalBal.draw(names1);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
        System.out.println("谢谢光临享元模式，再见~");
    }
    public static int getRandomRadius() {
        return radius[(int)(Math.random()*radius.length)];
    }

}
