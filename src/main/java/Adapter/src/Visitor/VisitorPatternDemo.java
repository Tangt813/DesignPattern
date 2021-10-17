package Adapter.src.Visitor;

public class VisitorPatternDemo {
    public static void main(String[] args) {

        Facility facility = new RecreationFacility();
        facility.accept(new FacilityAdministrator());
        facility.accept(new FacilityPlayer());
    }
}