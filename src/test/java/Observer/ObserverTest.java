package Observer;
import org.junit.Test;

import java.util.Scanner;

public class ObserverTest {
    @Test
    public void testObserver(){
        System.out.println("大家好，欢迎来到观察者模式展示～");
        System.out.println("当对象间存在一对多关系时，则使用观察者模式。比如，当一个对象被修改时，则会自动通知依赖它的对象。");
        System.out.println("接下来，我们通过给工作人员群发通知感受观察者模式的使用");
        System.out.println("我们知道，每一位员工都要接收来自管理员的同一则消息并执行它，当管理员发送消息时，");
        System.out.println("这里我们需要员工能监听管理员发消息这个动作，所以我们要让员工成为一个个观察者依赖于管理员。");
        Manager manager = new Manager();

        //创建三个员工，他们都是观察者，能收到群发的消息
        //他们观察的subject都是相同的
        Worker one = new Worker(manager,"one");
        Worker two = new Worker(manager,"two");
        Worker three = new Worker(manager,"three");

        System.out.println("编辑一则消息:");
        String message = "去上班";
        System.out.println("去上班");
        manager.setMessage(message);

        System.out.println("\n");
        manager.delete(one);
        message = "下班了";
        System.out.println("下班了");
        manager.setMessage(message);
    }
}
