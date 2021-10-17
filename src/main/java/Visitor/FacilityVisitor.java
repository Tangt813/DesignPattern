package Visitor;

public interface FacilityVisitor {
    public void visit(RecreationFacility recreationFacility);
    public void visit(Periscope periscope);
    public void visit(Fountain fountain);
    public void visit(RollerCoaster rollerCoaster);
}