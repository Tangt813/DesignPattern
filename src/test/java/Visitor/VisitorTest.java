package Visitor;

import org.junit.Test;

public class VisitorTest {
    @Test
    public void visitorTest() {
        System.out.println("----------------------Visitor Pattern Test Start--------------------");
        Facility facility = new RecreationFacility();
        System.out.print("海底世界的娱乐设施有喷泉、潜望镜、过山车\n");
        System.out.print("设施管理员前来检查设施\n");
        facility.accept(new FacilityAdministrator());
        System.out.print("游客前来游玩设施\n");
        facility.accept(new FacilityPlayer());
        System.out.println("----------------------Visitor Pattern Test Start--------------------");
    }
}
