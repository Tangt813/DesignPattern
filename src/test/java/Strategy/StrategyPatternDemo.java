package Strategy;

import java.util.Scanner;

public class StrategyPatternDemo {
    public void strategyTest(){
     String index="";
        Scanner sc=new Scanner(System.in);
        Tourist context=new Tourist(null);
        System.out.println("在策略模式（Strategy Pattern）中，一个类的行为或其算法可以在运行时更改。");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("在狂欢节的游乐场中有许多项目可供游客游玩。");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("我们把每一个项目的游玩方式封装成一个一个的类，这些类共同实现了游玩方式这一接口");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("当游客在众多游乐设施中做出游玩选择时，我们调用对应的类方法，打印出具体的项目游玩方式。");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("策略模式符合开闭原则，因此，当游乐场新增了某一新的游玩设施时，我们只需再创建一个游玩方式类，而不必对其他代码进行修改。");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
     while(!index.equals("0")) {
         System.out.println("***************************************************策略模式****************************************************");
         System.out.println("*                                              1->玩大摆锤                                                    *");
         System.out.println("*                                              2->玩旋转木马                                                  *");
         System.out.println("*                                              3->玩过山车                                                    *");
         System.out.println("*                                              4->玩射击                                                      *");
         System.out.println("*                                              0->退出                                                        *");
         System.out.println("**************************************************************************************************************");

index=sc.nextLine();
if(index.equals("1")){
    context.Changemethod(new playBigHammer());
       context.doPlaying();
}
else if(index.equals("2")){
    context.Changemethod(new playCarousel());
        context.doPlaying();
}
else if(index.equals("3")){
    context.Changemethod(new playRollerCoaster());
       context.doPlaying();
}
else if (index.equals("4")){
    context.Changemethod(new playShooting());
        context.doPlaying();
}
else if (index.equals("0")){
    continue;
}
else {
    System.out.println("wrong command");
}
//switch (index){
//    case 1:
//       context.Changemethod(new playBigHammer());
//       context.doPlaying();
//       break;
//    case 2:
//        context.Changemethod(new playCarousel());
//        context.doPlaying();
//        break;
//    case 3:
//        context.Changemethod(new playRollerCoaster());
//        context.doPlaying();
//        break;
//    case 4:
//        context.Changemethod(new playShooting());
//        context.doPlaying();
//        break;
//    case 0:
//        break;
//    default:
//        System.out.println("wrong command");
//        break;
//
//}


     }
     System.out.println("Thanks for playing our facilities!");
    }
}
