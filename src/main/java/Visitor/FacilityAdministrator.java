package Visitor;


public class FacilityAdministrator implements FacilityVisitor {

    @Override
    public void visit(RecreationFacility recreationFacility) {
        System.out.println("Recreation facility unchecked!");
    }

    @Override
    public void visit(Periscope periscope) {
        System.out.println("Checking Periscope.......Finish!");
    }

    @Override
    public void visit(Fountain fountain) {
        System.out.println("Checking Fountain......Finish!");
    }

    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("Checking RollerCoaster......Finish!");
    }
}
