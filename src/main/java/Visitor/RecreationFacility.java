package Visitor;

public class RecreationFacility implements Facility {

    Facility[] parts;

    public RecreationFacility(){//构造函数
        parts = new Facility[] {new Periscope(), new Fountain(), new RollerCoaster()};
    }


    @Override
    public void accept(FacilityVisitor facilityVisitor) {//依次访问各种设施
        facilityVisitor.visit(this);
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(facilityVisitor);
        }

    }
}
