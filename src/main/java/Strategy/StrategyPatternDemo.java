package strategy;

import java.util.Scanner;

public class StrategyPatternDemo {
    public static void main(String[] args){
     int index=-1;
        Scanner sc=new Scanner(System.in);
        Tourist context=new Tourist(null);
     while(index!=0) {
         System.out.println("***************************************************Strategy***************************************************");
         System.out.println("*                                              1->playBigHammer                                              *");
         System.out.println("*                                              2->playCarousel                                               *");
         System.out.println("*                                              3->playRollerCoaster                                          *");
         System.out.println("*                                              4->playShooting                                               *");
         System.out.println("*                                              0->exit                                                       *");
         System.out.println("**************************************************************************************************************");
index=sc.nextInt();
switch (index){
    case 1:
       context.Changemethod(new playBigHammer());
       context.doPlaying();
       break;
    case 2:
        context.Changemethod(new playCarousel());
        context.doPlaying();
        break;
    case 3:
        context.Changemethod(new playRollerCoaster());
        context.doPlaying();
        break;
    case 4:
        context.Changemethod(new playShooting());
        context.doPlaying();
        break;
    case 0:
        break;
    default:
        System.out.println("wrong command");
        break;

}


     }
     System.out.println("Thanks for playing our facilities!");
    }
}
