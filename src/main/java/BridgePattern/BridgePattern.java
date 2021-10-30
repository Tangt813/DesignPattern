package BridgePattern;

public class BridgePattern {


    public static void main(String[] args) {
	// write your code here
        Child child = new Child("TSChild");
        System.out.println(child.getName() + " is " + child.getAgeGroupName());
        Youth youth = new Youth("TSYouth");
        System.out.println(youth.getName() + " is " + youth.getAgeGroupName() );

        BigHammer bigHammer4Child = new BigHammer(child);
        BigHammer bigHammer4Youth = new BigHammer(youth);
        System.out.println(bigHammer4Child.getAmusementFacilityName());
        System.out.println(bigHammer4Youth.getAmusementFacilityName());

        RollerCoaster rollerCoaster4Child = new RollerCoaster(child);
        RollerCoaster rollerCoaster4Youth = new RollerCoaster(youth);
        System.out.println(rollerCoaster4Child.getAmusementFacilityName());
        System.out.println(rollerCoaster4Youth.getAmusementFacilityName());
    }
}
