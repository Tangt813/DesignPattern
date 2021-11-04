package Visitor;

public interface FacilityVisitor {
    public void visit(RecreationFacility recreationFacility);//visit函数被重载，将根据访问者不同身份执行不同操作
    public void visit(Periscope periscope);
    public void visit(Fountain fountain);
    public void visit(RollerCoaster rollerCoaster);
}
