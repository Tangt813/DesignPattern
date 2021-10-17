package Visitor;

public class RollerCoaster implements Facility {

    @Override
    public void accept(FacilityVisitor facilityVisitor) {
        facilityVisitor.visit(this);
    }
}
