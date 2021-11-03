package Mediator;
/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 11:32 PM
 * @Version 1.0
 */


import Visitor.Facility;

import java.util.Date;
import java.util.HashMap;

public class Mediator {
    public static HashMap<String, Integer> memo = new HashMap<>();


    /**
     * @Desc: 向显示器上新加一位用户
     * @Param: 管理员名称和设施名称
     * @Return: 无
     */
    public static void addNewGuy(Admin admin, String facility) {
        System.out.println(new Date().toString() + " [" +
        admin.getName() + "] : " + facility + " 多了一位排队客户.");
        if (memo.containsKey(facility)) {
            memo.put(facility, memo.get(facility) + 1);
        }
        else {
            memo.put(facility, 1);
        }
//        System.out.println(memo.get(facility));
        showQueueProcess();
    }


    /**
     * @Desc: 向显示器上减少一位用户
     * @Param: 管理员名称和设施名称
     * @Return: 无
     */
    public static void removeNewGuy(Admin admin, String facility) {
        System.out.println(new Date().toString() + " [" +
                admin.getName() + "] : " + facility + " 删除了一位排队客户.");
        if (memo.containsKey(facility)) {
            memo.put(facility, memo.get(facility) - 1);
        }
        else {
            memo.put(facility, 0);
        }
//        System.out.println(memo.get(facility));
        showQueueProcess();
    }


    /**
     * @Desc: 格式化输出目前排队进程
     * @Param: 无
     * @Return: 无
     */
    public static void showQueueProcess() {
        System.out.println("==============================");
        System.out.println("        实时排队进程        ");
        for (String fac : memo.keySet()) {
            System.out.printf("%s:%-7d  \n", fac, memo.get(fac));
        }
        System.out.println("==============================");
//        System.out.println(new Date().toString() + " [" +
//                admin.getName() + "] : " + facility + " 多了一位排队客户.");
//        if (memo.containsKey(facility)) {
//            memo.put(facility, memo.get(facility) + 1);
//        }
//        else {
//            memo.put(facility, 1);
//        }
//        System.out.println(memo.get(facility));
    }
}
