import java.security.SecureRandom;

public class Runfacility implements facility{
    private String facility_name;
    public Runfacility(String facility_name){
        this.facility_name=facility_name;
        checkfacility(facility_name);

    }
    public void checkfacility(String facility_name){
        System.out.println("check:"+facility_name);
    }

    @Override
    public void run() {
        System.out.println("run:"+this.facility_name);
    }
}
