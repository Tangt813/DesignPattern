package Mediator;/*
 * @author Yili Shen
 * @Email 1851009@tongji.edu.cn
 * @date 2021/10/20 11:52 PM
 * @Version 1.0
 */

public class MediatorPatternDemo {
    public static void main(String[] args) {
        Admin wang = new Admin("Wang");
        Admin li = new Admin("Li");
        wang.addGuest("海底总动员");
        li.addGuest("巴斯光年");
        wang.addGuest("大摆锤");
        li.addGuest("旋转木马");
    }
}
