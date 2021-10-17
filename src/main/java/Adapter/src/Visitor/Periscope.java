package Adapter.src.Visitor;

public class Periscope implements Facility {

    @Override
    public void accept(FacilityVisitor facilityVisitor) {
        facilityVisitor.visit(this);
    }
}