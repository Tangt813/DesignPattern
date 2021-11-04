package Mediator;
/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/30 4:04 PM
 * @Version 1.0
 */

import org.junit.Test;

public class MediatorTest {
    @Test
    /*
    * 中介者测试函数。
    * 场景为老王、老李两个管理员作为数据供给者向显示器这一中介者上更新信息，而游客通过显示器这一中介者了解排队进程。
    * */
    public void TestMediator() {
        System.out.println("大家好，欢迎来到中介者模式展示～");

        System.out.println("中介者模式可以用来降低多个对象和类之间的通信复杂性。这种模式提供了一个中介类，该类通常处理不同类之间的通信，并支持松耦合，使代码易于维护。");
        System.out.println("接下来我们通过游乐设施排队进程展示这一业务来体会中介者模式的使用。");
        System.out.println("我们知道，n个的管理员管理不同的设施，而m个游客想要获取设施排队信息需要询问每个管理员，会构成n*m个关系。");
        System.out.println("而如果引入一个显示器，管理员将信息录入而游客从显示器获得信息则会大大降低网络的复杂程度");
        

        System.out.println("----------------------Mediator Pattern Test Start--------------------");
        Admin wang = new Admin("Wang");
        System.out.println("创建管理员老王、老李完成");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Admin li = new Admin("Li");
        System.out.println("创建管理员完成");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("创建显示器完成");
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("创建中介者连接老王、老李和显示器完成");

        wang.addGuest("海底总动员");

        li.addGuest("巴斯光年");

        wang.addGuest("大摆锤");
        li.addGuest("旋转木马");
        li.addGuest("旋转木马");
        li.popGuest("海底总动员");
        li.popGuest("旋转木马");

        System.out.println("----------------------Mediator Pattern Test End---------------------");
    }
}
