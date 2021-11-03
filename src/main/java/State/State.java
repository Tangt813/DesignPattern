package State;/*
@version : 
@author：张世铎
@date:
@description:
*/

public interface State {
    //入园函数
    public void enter(Context context);
    //获取当前状态
    public String getState();
}
