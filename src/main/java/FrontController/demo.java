package FrontController;

public class demo {
    public static void main(String[] args) {
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
