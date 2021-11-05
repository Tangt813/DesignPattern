package State;
import State.*;
import org.junit.Test;
/*
@version : 
@author：张世铎
@date:
@description:
*/


public class StateTest {
    @Test
   public void stateTest(){
        System.out.println("大家好，欢迎来到状态模式展示~\n" +
                "状态模式的作用是基于对象状态的改变而使得用户行为的变化\n" +
                "接下来我们通过游客购票与否的状态来决定是否有入园的权限，以及会涉及到买票行为的变化\n" +
                "当游客未购票时，游客想要入园会被提醒没有入园权限，需要去购票；\n" +
                "当游客已经购票后，游客可以正常入园，如果游客再次选择买票则会提醒无须重复买票\n");
        System.out.println("--------------------State Pattern Test Start--------------------");
        System.out.println("初始状态：有一位还未购票的游客");
        Context visitor=new Context();
        System.out.println("未购票游客发出入园请求：");
        visitor.enter();
        System.out.println("未购票游客购票，state改变：");
        visitor.purchase();
        System.out.println("已购票游客重复发出购票请求：");
        visitor.purchase();
        System.out.println("已购票游客进园：");
        visitor.enter();
        System.out.println("--------------------State Pattern Test End--------------------");

    }
}
