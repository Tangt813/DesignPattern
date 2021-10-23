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

    @Override
    public void enter(Context context){
        context.enter();
    };

    @Override
    public String getState(){
        return this.state;
    };


}
