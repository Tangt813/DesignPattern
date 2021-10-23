package State;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class Context {
    private State currentState;
    private Enable En=new Enable();
    private Unable Un=new Unable();

    public Context(){
        this.currentState=Un;
    }
    public void enter(){
        if(this.currentState.getState().equals("Enable"))
            System.out.println("已购票，可进入园区");
        else if(this.currentState.getState().equals("Unable"))
            System.out.println("未购票，不可进入园区");
    }

    public void purchase(){
        if(this.currentState.getState().equals("Enable"))
            System.out.println("您已购票，无需重复购买");
        else if(this.currentState.getState().equals("Unable"))
        {
            System.out.println("请选择票的种类：");
            System.out.println("出票中...");
            System.out.println("您已成功购票");
            setCurrentState(En);}
    }

    public void setCurrentState(State state)
    {
        this.currentState=state;
    }
}
