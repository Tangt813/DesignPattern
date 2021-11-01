package FrontController;
import org.junit.Test;

public class FrontControllerTest {
    @Test
    public void testFrontController(){
        FrontController frontController = new FrontController();

        frontController.dispatchRequest("Customer","Customer");
        System.out.println("\n");
        frontController.dispatchRequest("Worker","Worker");
        System.out.println("\n");
        frontController.dispatchRequest("a","Worker");
        System.out.println("\n");
        frontController.dispatchRequest("Customer","a");
    }
}
