package strategy;

public class Tourist {

    private PlayAction playAction;
    public Tourist(PlayAction playAction){
        this.playAction=playAction;
    }
    public void Changemethod(PlayAction playAction){
        this.playAction=playAction;
    }
    public void doPlaying(){
        playAction.playFacility();
    }
}
