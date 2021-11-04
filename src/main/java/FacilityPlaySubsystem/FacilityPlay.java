package FacilityPlaySubsystem;/*
@version : 
@author：张世铎
@date:
@description:
*/

import Strategy.*;

import java.util.Scanner;

public class FacilityPlay {
    public void show(){
        String index="";
        Scanner sc=new Scanner(System.in);
        Tourist context=new Tourist(null);
        while(!index.equals("0")) {
            System.out.println("***************************************************AmusementPark***********************************************");
            System.out.println("*                                              1->大摆锤                                                       *");
            System.out.println("*                                              2->旋转木马                                                     *");
            System.out.println("*                                              3->过山车                                                       *");
            System.out.println("*                                              4->射击                                                        *");
            System.out.println("*                                              0->离开                                                        *");
            System.out.println("**************************************************************************************************************");
            index=sc.nextLine();
            if(index.equals("1")){
                context.Changemethod(new playBigHammer());
                    context.doPlaying();

            }
            else if (index.equals("2")){
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

            }
            else {
                System.out.println("指令错误！");
            }
//            switch (index){
//                case 1:
//                    context.Changemethod(new playBigHammer());
//                    context.doPlaying();
//                    break;
//                case 2:
//                    context.Changemethod(new playCarousel());
//                    context.doPlaying();
//                    break;
//                case 3:
//                    context.Changemethod(new playRollerCoaster());
//                    context.doPlaying();
//                    break;
//                case 4:
//                    context.Changemethod(new playShooting());
//                    context.doPlaying();
//                    break;
//                case 0:
//                    break;
//                default:
//                    System.out.println("指令错误！");
//                    break;

  //          }
        }
        System.out.println("欢迎下次游玩！");
    }

}
