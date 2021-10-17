public class play_roller_coaster implements Play_Action{
private String facility_name="roller_coaster";
@Override
    public void play_facility(){
    String ans="play:"+this.facility_name;
    System.out.println(ans);
}
}
