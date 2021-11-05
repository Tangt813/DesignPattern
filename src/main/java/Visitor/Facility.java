package Visitor;

public interface Facility {
    public void accept(FacilityVisitor facilityVisitor);//接口定义accept方法，在具体被访问对象中实现
}
