package FrontController;


/**
 * 创建调度器
 */
public class Dispatcher {
    private CustomerView CustomerView;
    private ManagerView ManagerView;
    public Dispatcher(){
        CustomerView = new CustomerView();
        ManagerView = new ManagerView();
    }

    /**
     * 判断需要进入哪个视图中
     * @param request 为request创建指定视图
     */
    public void dispatch(String request){
        if(request.equalsIgnoreCase("顾客")){
            CustomerView.show();
        }else if(request.equalsIgnoreCase("管理员")){
            ManagerView.show();
        }else{
            System.out.println("404 Not Found");
        }
    }
}
