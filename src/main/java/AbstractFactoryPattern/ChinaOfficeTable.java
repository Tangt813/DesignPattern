package AbstractFactoryPattern;

public class ChinaOfficeTable extends Table {
    //打印该桌子的材质
    public void tableMaterial(){
        System.out.println("古典红木材办公桌");
    }
    //打印该桌子的颜色
    public void tableColor(){
        System.out.println("中国红");
    }
    //打印该桌子的形状
    public void draw(){
        System.out.println("\33[31m                                                 \n" +
                "                                                 \n" +
                "           __                                    \n" +
                "     ,geMM0QN##0MM0&N0#00mpMg*qmgpgppqg,a        \n" +
                "    9#0M#N0&B00#KR#0000RB000##0M0M0##MQM0        \n" +
                "    qgggaBQ0FZ00NNQ#&0E#BDB@MMM0MN0MBMW0#        \n" +
                "    M#0NN9~N~^##**M00&N0M0###M#K0MQQQ#MW&        \n" +
                "    0&mNm0W0B#WpNMNggpppJ#p,,_,,`__^N&5BQ        \n" +
                "    MW    ]M       `^~~~~~~9M0#NMN00#MM]0        \n" +
                "    M0    ]0                        00  ]0        \n" +
                "    NQ    ]#                        #0  ]N        \n" +
                "    M#  M0]#                        ##  l0        \n" +
                "    0MOM   N                        B0 _]#        \n" +
                "    M&     M                        D0& ]0        \n" +
                "    N#     K                        00  ]M        \n" +
                "    0#                              lM  0        \n" +
                "    M0                              [M  ]#        \n" +
                "                                    [M           \n" +
                "                                    +M           \n" +
                "                                               \33[0m  ");
    }
}
