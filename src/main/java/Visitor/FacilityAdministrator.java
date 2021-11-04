package Visitor;


public class FacilityAdministrator implements FacilityVisitor {

    @Override
    public void visit(RecreationFacility recreationFacility) {
        System.out.println("当前访问者为管理员\n开始检查游乐设施");
    }

    @Override
    public void visit(Periscope periscope) {
        System.out.println("检查大摆锤设施......完成！");
    }

    @Override
    public void visit(Fountain fountain) {
        System.out.println("检查旋转木马设施......完成！");
    }

    @Override
    public void visit(RollerCoaster rollerCoaster) {
        System.out.println("检查过山车设施......完成！");
    }
}
