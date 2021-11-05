package State;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class Enable implements State {
    private String state;


    public Enable(){
        this.state="Enable";
    }

    //重写可进入状态下的入园函数
    @Override
    public void enter(Context context){
        context.enter();
    };

    //获取当前状态
    @Override
    public String getState(){
        return this.state;
    };


}
