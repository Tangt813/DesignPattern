package State;/*
@version : 
@author：张世铎
@date:
@description:
*/

public class Unable implements State {
    private String state;

    public Unable(){
        this.state="Unable";
    }
    //重写入园函数
    @Override
    public void enter(Context context){
        context.enter();
    };

    //重写获取当前状态的函数
    @Override
    public String getState(){
        return this.state;
    };


}
