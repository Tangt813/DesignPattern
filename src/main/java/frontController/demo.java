package frontController;

public class demo {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("Customer");
        frontController.dispatchRequest("Worker");
    }
}
