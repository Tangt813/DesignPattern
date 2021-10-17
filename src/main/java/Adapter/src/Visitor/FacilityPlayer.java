package Adapter.src.Visitor;

public class FacilityPlayer implements FacilityVisitor {

    @Override
    public void visit(RecreationFacility recreationFacility) {
        System.out.println("Recreation facility ready!\n");
    }

    @Override
    public void visit(Periscope periscope) {
        System.out.println("Playing Periscope.");
    }

    @Override
    public void visit(Fountain fountain) {
        System.out.println("Playing Fountain.");
    }

    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("Playing RollerCoaster.");
    }
}
