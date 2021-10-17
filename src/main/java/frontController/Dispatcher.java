package frontController;


/**
 * 创建调度器
 */
public class Dispatcher {
    private customerView customerView;
    private workerView workerView;
    public Dispatcher(){
        customerView = new customerView();
        workerView = new workerView();
    }

    /**
     * 判断需要进入哪个视图中
     * @param request 为request创建指定视图
     */
    public void dispatch(String request){
        if(request.equalsIgnoreCase("Customer")){
            customerView.show();
        }else if(request.equalsIgnoreCase("Worker")){
            workerView.show();
        }
    }
}
