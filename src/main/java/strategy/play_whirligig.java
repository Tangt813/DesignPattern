public class play_whirligig implements Play_Action{
    private String facility_name="whirligig";
    @Override
    public void play_facility(){
        String ans="play:"+this.facility_name;
        System.out.println(ans);
    }
}
