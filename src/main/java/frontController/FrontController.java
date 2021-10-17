package frontController;

/**
 * 创建前端控制器
 */
public class FrontController {
    private Dispatcher dispatcher;

    public FrontController(){
        dispatcher = new Dispatcher();
    }

    /**
     * 判断登录人员是否合法
     * @return
     */
    private boolean isAuthenticUser(){
        System.out.println("User is authenticated successfully.");
        //在该简单实例中默认是Authentic User
        return true;
    }

    /**
     * 追踪界面请求是何种类型人员
     * @param request
     */
    private void trackRequest(String request){
        System.out.println("Page requested: " + request);
    }

    /**
     * 拉取界面
     * @param request
     */
    public void dispatchRequest(String request){
        //记录每一个请求
        trackRequest(request);
        //对用户进行身份验证，由调度器拉取指定界面
        if(isAuthenticUser()){
            dispatcher.dispatch(request);
        }
    }
}
