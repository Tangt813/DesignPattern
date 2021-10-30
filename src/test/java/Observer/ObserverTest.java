package Observer;
import org.junit.Test;

import java.util.Scanner;

public class ObserverTest {
    @Test
    public void testObserver(){
        Manager manager = new Manager();

        //创建三个员工，他们都是观察者，能收到群发的消息
        //他们观察的subject都是相同的
        Worker one = new Worker(manager,"one");
        Worker two = new Worker(manager,"two");
        Worker three = new Worker(manager,"three");

        System.out.println("Edit a message:");
        String message = "Go to work";
        System.out.println("Go to work");
        manager.setMessage(message);

        System.out.println("\n");
        manager.delete(one);
        message = "Have a break";
        System.out.println("Have a break");
        manager.setMessage(message);
    }
}
