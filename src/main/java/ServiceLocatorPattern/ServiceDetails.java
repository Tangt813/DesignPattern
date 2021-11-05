package ServiceLocatorPattern;

public class ServiceDetails extends Service{
    public String name="";
    public String positon="";
    public boolean isActive=false;
    //初始化对象，根据name,pos,act初始化对象
    public ServiceDetails(String jndiName,String jndiPos,boolean jndiAct){
        name=jndiName;
        positon=jndiPos;
        isActive=jndiAct;
    }
    //得到关于name,position,active的相关信息
    public String getName(){
        return name;
    }
    public String getPositon(){
        return positon;
    }
    public boolean isBathAndEat(){
        return isActive;
    }
    //打印关于某个具体的对象的详细信息
    public void printDetails(){
        System.out.print(name+"现在位置在"+positon);
        if(isActive){
            System.out.println(",并且已经吃饭了");
        }
        else {
            System.out.println(",但还没有吃饭");
        }
    }
    //设置关于name,position,active的相关信息
    public void setName(String nameNew){
        positon=nameNew;
    }
    public void setPositon(String positonNew){
        positon=positonNew;
    }
    public void setActive(boolean activeNew){
        isActive=activeNew;
    }

    //用ASCII码手绘大白鲨
    public void drawShark(){
        System.out.println("                          ,                      \n" +
                "                           0L                     \n" +
                "0K,                       0Bm                    \n" +
                "  N0g                     g@M#b_                  \n" +
                "  *&0Fs            __,pqg0&MN0&0R0MN&ppgg__,,,,   \n" +
                "   ]M00p_   _m#m0MR#QMN2NNB&MNN#M&0QNM0MBM#8?~=/  \n" +
                "    #0QB0NM*V@N#MMR25N%6KFE$0NA0NMM&0MpE9E%#^     \n" +
                "    #E^   ~~**a_  `7M@0&WD0##80NN@M00WBM7.      \n" +
                "   j0`             q,,_rKKDQB&3N^&Q0KB0KBQza*M^      \n" +
                "  ,0`               ``~*NAQDWQ&0DQ#M###@    \n" +
                "                               ##^       ");
        //采用时间暂停的方式，实现一帧一帧的效果
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //用ASCII码手绘蓝色海马
    public void drawSeaHorse(){
        System.out.println("\33[94m   .       \n" +
                "    MN0f     \n" +
                "   M0`,&     \n" +
                "  GM#gCM*%—6\n" +
                "  ^ ]MR    \n" +
                "     #M0A    \n" +
                "    ]^]0M    \n" +
                "    ] j!     \n" +
                "     ,'      \n" +
                "     #       \n" +
                "     &` I    \n" +
                "     `\"\"     \33[0m");
        //采用时间暂停的方式，实现一帧一帧的效果
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //用ASCII码手绘派大星
    public void drawPaidaXing(){
        System.out.println("\33[31m               a,\n" +
                "               !  Dq\n" +
                "               ^/   \\                    \n" +
                "                l   4                      \n" +
                "                ] pS7#                     \n" +
                "                | j+q/&       ,            \n" +
                "         n\\     I Iy/qcl    x^m            \n" +
                "         & 9,   N A` F`|  ,6  j            \n" +
                "         E  ~b y/ \33[0m^   ^ \33[31m,O    f            \n" +
                "         ]    \\ $       \\a    Y             \n" +
                "          l_    ` \33[0mR$#MQz \33[31m&   7              \n" +
                "           +               \\Y/               \n" +
                "            hj\\         \\   \\                                      \n" +
                "            ^%]            II              \n" +
                "\33[32m             Yp0p#  %^``##N&0p,               \n" +
                "              MMH -  ^ ^ ~Z/I               \n" +
                "              ]0N#%L,  m-S  W               \n" +
                "\33[31m               NN&3p-   #t~3                \n" +
                "                _ g     ^%p^                \n" +
                "                 =^      =^    \33[0m");
        //采用时间暂停的方式，实现一帧一帧的效果
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
