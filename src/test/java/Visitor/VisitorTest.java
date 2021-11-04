package Visitor;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void visitorTest() {
        System.out.println("#访问者模式（Visitor Pattern）中有一个访问者类，它改变了元素类的执行算法");
        System.out.println("#通过这种方式，元素的执行算法可以随着访问者改变而改变");
        System.out.println("#访问者模式能够在不修改对象结构中的元素的情况下，为对象结构中的元素添加新的功能，提高了系统的可扩展性");
        System.out.println("#游乐设施为例，常规的访问者有游客和管理员等，但日后可能会增加新的身份的访问者如对游客进行细分等等");
        System.out.println("#访问者模式属于行为型模式");
        System.out.println("----------------------Visitor Pattern Test Start--------------------");
        Facility facility = new RecreationFacility();
        System.out.println("海底世界的娱乐设施有摩天轮、旋转木马、过山车等游乐设施\n");
        System.out.println("设施管理员前来检查设施");
        facility.accept(new FacilityAdministrator());
        System.out.println("=======================");
        System.out.print("游客前来游玩设施\n");
        facility.accept(new FacilityPlayer());
        System.out.println("----------------------Visitor Pattern Test Start--------------------");
    }
}
