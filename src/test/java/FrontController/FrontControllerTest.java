package FrontController;
import org.junit.Test;
public class FrontControllerTest {
    @Test
    public void testFrontController(){
        FrontController frontController = new FrontController();
        System.out.println("大家好，欢迎来到前端控制器模式展示～");
        System.out.println("前端控制器模式是用来提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。");
        System.out.println("接下来，我们使用不同身份访问不同界面感受观察者模式的使用");
        System.out.println("当身份识别不出来、请求的界面不存在、身份和请求界面不匹配时，界面都不会正常展示。");
        System.out.println("只有当身份和请求的界面类型匹配时可以访问对应界面。");

        frontController.dispatchRequest("顾客","顾客");

        frontController.dispatchRequest("管理员","管理员");
        frontController.dispatchRequest("管理员","顾客");
        frontController.dispatchRequest("a","管理员");

        frontController.dispatchRequest("顾客","未识别人员");
    }
}
