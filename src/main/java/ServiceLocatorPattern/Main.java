package ServiceLocatorPattern;

public class Main {

    public static void main(String[] args) {
//         write your code here
        System.out.println("大家好，欢迎来到服务定位器模式展示~");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("服务定位器模式类似于cache，简单来说就是把我们常用的信息找一个中介先存起来");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("方便我们以后的访问，因为已经存储到了中介，所以想得到他的信息，直接通过中介查询就可以了");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("想象一个这样的场景，让我娓娓道来\n~~~~~~~~~~~~~~~~");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("让我们一起来看服务定位器模式的具体例子");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("在海底狂欢节中有若干个演员，演员有相应的经纪人，经纪人要时刻了解到演员的信息：比如位置信息，是否吃过饭");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("演员的位置经常发生变动，如果经纪人和演员位置保持着单线联系，一处修改则将处处修改，这时我们构建一个服务定位器");
        System.out.println("来记录各个演员的相关信息，当一个演员的信息修改时，只需要修改他与服务定位器的信息，就实现了需求\n当经纪人需要调用时，直接读取之前已经存储在模拟cache中的信息，减少了信息交流参数，提高了效率和速度");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("有三个演员，海马，大白鲨，海豚");
        System.out.println("有三个演员，海马");
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
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("演员，大白鲨");
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
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("演员，派大星");
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
        ServiceDetails seaHouse = new ServiceDetails("海马","海马小馆",false);
        ServiceDetails shark = new ServiceDetails("大白鲨","大白鲨馆",false);
        ServiceDetails paidaxing = new ServiceDetails("派大星","派大星小屋",false);
        ServiceDetails people = new ServiceDetails("经纪人","休息室",false);
        ServiceLocator.addService(seaHouse);
        ServiceLocator.addService(shark);
        ServiceLocator.addService(paidaxing);
        ServiceLocator.addService(people);
        ServiceLocator.listDetails();


        String pos="马戏团央视大舞台";
        ServiceLocator.modiServicePos(pos,"海马");
        pos="央视大舞台候场室";
        ServiceLocator.modiServicePos(pos,"经纪人");
        System.out.println("现在经纪人想获取演员海马的信息，因此访问服务定位器");
        ServiceDetails serviceDetail1=ServiceLocator.getService("海马");
        int i=0;
        for(i=0;i<5;i++){
            System.out.println("            |");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("*-----------------------*");
        System.out.println("|       服务定位器查询     |");
        System.out.println("*-----------------------*");
        for(i=0;i<5;i++){
            System.out.println("            |");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("*-----------------------*");
        serviceDetail1.printDetails();
        System.out.println("*-----------------------*");

    }
}
//package ServiceLocatorPattern;
//
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Image;
//import java.awt.Toolkit;
//
//
//import javax.swing.JFrame;
//
//
//public class Main extends JFrame{
//    private static final int WIDTH=500;
//    private static final int HEIGHT=500;
//    private static int WINDOW_WIDTH=Toolkit.getDefaultToolkit().getScreenSize().width;
//    private static int WINDOW_HEIGHT=Toolkit.getDefaultToolkit().getScreenSize().height;
//    public Main(){
//        super("I love you");
//        this.setBackground(Color.BLACK);
//        this.setLocation((WINDOW_WIDTH-WIDTH)/2,(WINDOW_HEIGHT-HEIGHT)/2);
//        this.setSize(WIDTH, HEIGHT);
//        this.setLayout(getLayout());
//        this.setVisible(true);
//        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
//    }
//    public void paint(Graphics g){
//        double x,y,r;
//        Image image=this.createImage(WIDTH,HEIGHT);
//        Graphics pic=image.getGraphics();
//        for(int i=-2;i<90;i++){
//            for(int j=-2;j<90;j++){
//                r=Math.PI/45+Math.PI/45*i*(1-Math.sin(Math.PI/45*j))*18;
//                x=r*Math.cos(Math.PI/45*j)*Math.sin(Math.PI/45*i)+WIDTH/2;
//                y=-r*Math.sin(Math.PI/45*j)+HEIGHT/3;
//                pic.setColor(Color.MAGENTA);
//                pic.fillOval((int)x, (int)y, 2, 2);
//            }
//            g.drawImage(image, 0, 0, this);
//        }
//    }
//    public static void main(String[] args) {
//        new Main();
//
//
//    }
//
//
//}
