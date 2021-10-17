package Adapter.src.Visitor;


public class Fountain implements Facility {

    @Override
    public void accept(FacilityVisitor facilityVisitor) {
        facilityVisitor.visit(this);
    }
}