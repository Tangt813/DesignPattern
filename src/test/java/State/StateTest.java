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
        System.out.println("--------------------State Pattern Test Start--------------------");

    }
}
