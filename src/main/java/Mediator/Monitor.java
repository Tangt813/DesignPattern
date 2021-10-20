package Mediator;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 11:32 PM
 * @Version 1.0
 */

//import Visitor.FacilityAdministrator;

import java.util.Date;

public class Monitor {
    public static void showQueueProcess(Admin admin, String facility) {
        System.out.println(new Date().toString() + " [" +
                admin.getName() + "] : " + facility + " 多了一位排队客户.");
    }
}
