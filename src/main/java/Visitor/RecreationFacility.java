package Visitor;

public class RecreationFacility implements Facility {

    Facility[] parts;

    public RecreationFacility(){
        parts = new Facility[] {new Periscope(), new Fountain(), new RollerCoaster()};
    }


    @Override
    public void accept(FacilityVisitor facilityVisitor) {
        facilityVisitor.visit(this);
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(facilityVisitor);
        }

    }
}