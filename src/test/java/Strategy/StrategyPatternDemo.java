package Strategy;

import java.util.Scanner;

public class StrategyPatternDemo {
    public void strategyTest(){
     String index="";
        Scanner sc=new Scanner(System.in);
        Tourist context=new Tourist(null);
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
