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
    @Override
    public void enter(Context context){
        context.enter();
    };

    @Override
    public String getState(){
        return this.state;
    };


}
