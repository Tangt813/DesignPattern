package Visitor;

public class FacilityPlayer implements FacilityVisitor {

    @Override
    public void visit(RecreationFacility recreationFacility) {
        System.out.println("当前访问者为游客\n开始游玩");
    }

    @Override
    public void visit(Periscope periscope) {
        System.out.println("游客游玩摩天轮设施");
    }

    @Override
    public void visit(Fountain fountain) {
        System.out.println("游客游玩旋转木马设施");
    }

    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("游客游玩过山车设施");
    }
}
