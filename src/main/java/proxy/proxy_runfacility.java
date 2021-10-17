public class proxy_runfacility implements facility{
    private Runfacility runfacility;
    private String facility_name;
    public proxy_runfacility(String facility_name){
        this.facility_name=facility_name;
    }
  @Override
    public void run(){
        if(runfacility==null){
            runfacility=new Runfacility(facility_name);
        }
        runfacility.run();
  }
}
