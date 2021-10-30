package FrontController;


/**
 * 创建调度器
 */
public class Dispatcher {
    private CustomerView CustomerView;
    private WorkerView WorkerView;
    public Dispatcher(){
        CustomerView = new CustomerView();
        WorkerView = new WorkerView();
    }

    /**
     * 判断需要进入哪个视图中
     * @param request 为request创建指定视图
     */
    public void dispatch(String request){
        if(request.equalsIgnoreCase("Customer")){
            CustomerView.show();
        }else if(request.equalsIgnoreCase("Worker")){
            WorkerView.show();
        }else{
            System.out.println("404 Not Found");
        }
    }
}
