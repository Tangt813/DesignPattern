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
    public void TestMediator() {
        System.out.println("----------------------Mediator Pattern Test Start--------------------");
        Admin wang = new Admin("Wang");
        System.out.println("创建管理员老王、老李完成");
        Admin li = new Admin("Li");
        System.out.println("创建管理员完成");
        System.out.println("创建显示器完成");
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
