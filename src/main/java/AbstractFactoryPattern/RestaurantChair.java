package AbstractFactoryPattern;

public class RestaurantChair extends Chair{

    public void chairMaterial(){
        System.out.println("经典塑料餐厅靠背椅");
    }
    public void chairColor(){
        System.out.println("太空灰");
    }
    public void draw(){
        System.out.println("\33[37m                            \n" +
                "              _#0mag_,,_    \n" +
                "              0BMMgN#0CMq   \n" +
                "              QM RB009~#N   \n" +
                "             0 G@E@MHZ  0   \n" +
                "            0  KB#hM&! hf   \n" +
                "            B  &A&W$*  0    \n" +
                "           ]#  Q#4Wf  $f    \n" +
                "        ,am40x_0N8Bf  Nf    \n" +
                "   ,p*MNU1MW5M#QTBB   0     \n" +
                "  ;/7M#NNgQMMM00M0M#Nq0     \n" +
                "  i0~#*###M0MN0M000#00P     \n" +
                "  ]0  `~M0MB&MNM&MM~ 0!     \n" +
                "  iNP^ ~#p,  W$    _g0      \n" +
                "  [0f     ~N#NI  ,m#MN      \n" +
                "  `*        |N000M`  7      \n" +
                "            ;NF^            \n" +
                "            #Mf             \n" +
                "            MB              \33[0m");
    }
}
