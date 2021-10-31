package strategy;

public class playRollerCoaster implements PlayAction {
private String facility_name="RollerCoaster";
@Override
    public void playFacility(){
    String ans="play:"+this.facility_name;
    System.out.println("let's play "+facility_name);
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        e.printStackTrace();
    }
    System.out.println("                                                                                                                       \n" +
            "                                                                                                                       \n" +
            "                                                                                     __gggpggp,                        \n" +
            "                                                                        _gpg,     _gM00000000000&g_                    \n" +
            "                                                                      #000000_  _gM00M\"~`  `~~M00000p                  \n" +
            "                                                                      ;\"B000MM_g00M^ #           ~M00Mg,               \n" +
            "                                                                 =M0qB^_&g00#_00F`   #   ,        ]`~M00&,             \n" +
            "                                                                  '^0000000 p00'     #    ,       ]   \"M00g            \n" +
            "                                                                   M00000# p0M -     #     ,      ]     ^M0&,          \n" +
            "                                                               gg ] gNM00 j0F #      #     ]      ]c     _\"00g         \n" +
            "                                                              4M#N#_000# q0P         #     '~     4n    - \\ ~0&        \n" +
            "                                                              F p0000000p0&          #    ^  ~    B6   /   i  MN_      \n" +
            "                                                                M00000&_0F       =   #            ]c  f     .  ~0      \n" +
            "                                                                  ^MM~^00         :  0  '      +  Q6 /          8      \n" +
            "                                                              _p000g  B0'          % 0 f          Qc+         .]f      \n" +
            "                                                             40000000q0&,           w0&          \\00           4f      \n" +
            "                                                          _  | 7000#M0M06           j0m   .   ,w,a#&xaa n   wmzQ6      \n" +
            "                                                         ]0&p&_000MMM0 M~,          M0,          /08           M&      \n" +
            "                                                         \"@ B00000 j0$ N           : 0          / B6!         '46      \n" +
            "                                                        *` M00000f 0#  #  `          0  ,         46 \\         ]&      \n" +
            "     m,_                                              _yp # _M00@ g0   0            ]0            Qt  :        4&      \n" +
            "    _ `~MNg,_                                         \"M#0&ppM00 g0F   0             0            Q6   t       WX      \n" +
            "    Q      ~M&g,                                         j000000H#0    0            ]0      ,     46    x      4$      \n" +
            "    4      K  M0g,                                      0000000wQ0`    0      &      0     ]c     B5    ]&     4f      \n" +
            "    #       -   ~0N,                                     `\"M0M~W0@     0       '    ]#      `     Q6    ' v    4&      \n" +
            "    #             M0g                                          ##      0            ]0       ^    4f       ,   4H      \n" +
            "    Q            ]&^M&,                                       #0       0            =#            QS           QH      \n" +
            "    Q            Q&  M0&                                     j0P       0            ]0            06         , ]A      \n" +
            "    B            4f   \"0&                                   _00       _#            j#            Q&          _]&      \n" +
            "    B#           N&    \"00,                                 00         0m           40           \"0f           N&      \n" +
            "    #p           B#     ^M0,                               #0f    .   *0#,   x ---==g0s-  ----===Q0&      =+*-*N&      \n" +
            "    #'           R0       00q                             p0M          0@           0Ma          !#&          yM&      \n" +
            "    Q            4f        00g                           p00          \"0             # t        ' #f         ] 4#      \n" +
            "    Q            >E         00&                         000  t       ' 0             #  \\      ^  #f           BX      \n" +
            "    B            ]f          M00,                     p000    q        #             #   (        QA           4#      \n" +
            "    0            ]f           M00g                   p000 #    s   ^   0    `        #    {       06           ]&      \n" +
            "    Q            ]f            M000g              _g000#  #     s_'    0     ^_      0     g/     Qf    \\,     ]&      \n" +
            "    #      4     ]k     ]      p\"M000g_        _pg0000F   #     ]6     0      &      #     *      ]6     t     ]5      \n" +
            "    0            ]&            0  M0000M&gggp0000000M`    #    ,^ t    0     ! =     0    f  ,    B5    '      ]f      \n" +
            "    #            \"&            &    M0000000000000M`      #   y^   s   0    !   &    #   *    ,   4&           ]f      \n" +
            "    B            ]&            &      `~MM00MM#~`     '   #  y^     q  0   !     I   0  J         46           ]&      \n" +
            "    0            ]6            &             #         *  0 ,'       e 0  f       +  0 *       `  4f           ]6      \n" +
            "    0            46           _&             0          + 0p^        ~q0 F         +j0r         ^ 4&           ]f      \n" +
            "    0&           40           ]0            N0           M0'          ^0P           40           ~0&           Nf      \n" +
            "    #k           ##           40c     ~  ^''N#%-*\"*=**=**00M*~~\"!^~\"~^40NM\"~MM**~\"\"~M0M*-\"=*\"+-=+x0&           #&      \n" +
            "    #^           ~f           40           a\"0n         p\"#M         _&0Ot         j`Kq           0&           Q$      \n" +
            "    #            ]f           ]&            ]# \\       y^ B !        # 0 ^m       j  # [        F 0$           Qf      \n" +
            "    #            ]f            #            ]0        _'  #  W      #  0  \",     ,   #  1      t  4H           ]&      \n" +
            "    0            ]f           ]#            *0   \\   _^   #   k    d   0   ^g   _'   #   t    )   Q#        ~  4&      \n" +
            "    #            ]6    \\      ]0            Q0    ,  '    B    X  #    0    ~c _^    #    <  (    46           4&      \n" +
            "    #      w     ]6     )     -0            Q0     m'     #     $@     0     ^o`     #     t*     0&           Qf      \n" +
            "    ^                          \"            ~~            \"            ^             ^            ~'           \"`      \n" +
            "                                                                                                                       \n" );
}
public static void main(String []args){
    playRollerCoaster t =new playRollerCoaster();
    t.playFacility();
}
}
