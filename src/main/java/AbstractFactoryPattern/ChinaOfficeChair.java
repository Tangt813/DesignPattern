package AbstractFactoryPattern;

public class ChinaOfficeChair extends Chair{

    public void chairMaterial(){
        System.out.println("古典红木材办公椅");
    }
    public void chairColor(){
        System.out.println("中国红");
    }
    public void draw(){
        System.out.println("\33[31m                                          \n" +
                "                _,,,,pem=qqyg,,,g        \n" +
                "                WM9~~^+##N6 `~0M#        \n" +
                "                lr    *NMD    7 !        \n" +
                "               ;f     4DE&     Nf        \n" +
                "               [1     --*G     NH        \n" +
                "               #1        ]     0         \n" +
                "      ,_aqpMMMM0f        I __,p0H        \n" +
                "      MF`  f   Bf    [Gp#MM@@F~0c        \n" +
                "      4&   $   R!    #N8       0c        \n" +
                "       Yf  ]   R1 _  Q#N       M         \n" +
                "      _l&pe4MME&0$EEE0MN0&&g#r_&p        \n" +
                "       0 _#pN0N#C~#^~*M40#4I`B~0         \n" +
                "       #  `    @*0     g0@~    M         \n" +
                "       N       4f       Q`     M         \n" +
                "       0       4f       0      M-        \n" +
                "       Q    _jgKL__     0      0         \n" +
                "       0_gpM~` *f~4FR0*Q0,__   M         \n" +
                "       M~00                M4&N0         \n" +
                "            MM#Q&g0^`&_0H        \n" +
                "                                   \33[0m  \n");
    }
}
