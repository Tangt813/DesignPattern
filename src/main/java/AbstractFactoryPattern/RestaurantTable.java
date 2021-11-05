package AbstractFactoryPattern;

public class RestaurantTable extends Table{
    //打印该桌子的材质
    public void tableMaterial(){
        System.out.println("水晶玻璃餐厅方桌");
    }
    //打印该桌子的颜色
    public void tableColor(){
        System.out.println("水晶灰");
    }
    //打印该桌子的形状
    public void draw(){
        System.out.println("\33[37m               __,,_a-pgmgrpx-a__,,_              \n" +
                "        ,_gpDNwR&#X&FQM&#Q$L0%N0#NNKB&b\\, _       \n" +
                "    ,q&&M#G0Wp&03Q0#E4%DQEXW0&WKKm#N&p0##MM0\\     \n" +
                "  q0&@NA&bM&CT&p00&&&r3pb&&&qAS3NN&4Qp0Om#J$9Wrr  \n" +
                " 0#EE&DQ0N0#KWm$$$M&Q9-N%K%0&F%&\\p994W#bAgR&gEg1r \n" +
                " \\wEE&@gB0QKK#M#+#N0Em#Y&M0%0K#FDp4MMEgMK&QQ&0&N^ \n" +
                "   ^Q4#0EM0E#\\ZMgB&#g&mqpm30#0#+BDB0WN9#B@#NA&^   \n" +
                "      ^!&Z4RRMM20MMQFB#Z&WBd#K&0#0#&@D08NN#~      \n" +
                "           ^^~+nMQMDK&0M0!hM#0W0A0MM?^~           \n" +
                "                      M#0#N0                      \n" +
                "                      N0&0M0                      \n" +
                "                      NBMMMN                      \n" +
                "                      MQM0N0                      \n" +
                "                      M#0MNN                      \n" +
                "                      M#000N                      \n" +
                "                      M00MN0                      \n" +
                "                      MM#00#                      \n" +
                "                      M000N0                      \n" +
                "                __gpM##&&&QQ##Mgm__               \n" +
                "            _p&N000MM0#%W0#0&#0NNB0Mgq            \n" +
                "               GM0NMNMRQM00MM00MNM7~              \n" +
                "                       *  * -^^                   ");
    }
}
