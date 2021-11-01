package Strategy;

public class playCarousel implements PlayAction {
    private String facility_name="Carousel";
    @Override
    public void playFacility(){
        String ans="play:"+this.facility_name;
        //System.out.println("let's play "+facility_name);
        System.out.println("请尽情享受在旋转木马上的欢乐时光！");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("                                                                                                   \n" +
                "                                               v=*                                                  \n" +
                "                                              ~   |                                                 \n" +
                "                                              w _ #                                                 \n" +
                "                                               \" 1,a*P~\"!&_                                         \n" +
                "                                               ] f        `&                                        \n" +
                "                                               ]            1                                       \n" +
                "                                               ] c         1&   _gr&*#a_                            \n" +
                "                                               ]           ^6 r\"`   ,+\"^                            \n" +
                "                                               ]            t     a'                                \n" +
                "                                               ] f  _p*~0^+ &   _F                                  \n" +
                "                                               ] L>\"^   F  _f  p^                                   \n" +
                "                                               ] c       ,*^ ,\"                                     \n" +
                "                                               ] 1      'm ='                                       \n" +
                "                                               ]                                                    \n" +
                "                                               ]                                                    \n" +
                "                                               ] c                                                  \n" +
                "                                               ] ,                                                  \n" +
                "                                              ,4v*\\,                                                \n" +
                " ~~=*e,                                   ,p*\"`    ~~*m,                                            \n" +
                " '   = `~*q                          _a*^^              ~*m_,                              _pm*+**  \n" +
                "  \\ '  !   ~&,                  _,NM~^      ,,m****\\m;,_    ~0*g_                       ,*~`,    j  \n" +
                "    '..'   -, ~x           _,w*\"~       ,x=~`          ~^*a     ~M*q,               _,*^         -  \n" +
                "   l         \\  ^a    ,an*~~`         w~     --    r-,     `*,      ~~**q,         e`           p   \n" +
                "   =n  '- ^,,     Kg\"~^            _r'  -.     \\  =      ,a   *,         `^*w,,  >\"     t   ^  q    \n" +
                "      ~  `\\     ,, \"              w^               \\,^  I  ^    *             ~7F    $  f   *^,#    \n" +
                "    ~`\\ `- ^\\     *  q          ,^     t /              ^        ^,           g^ x       /` / _X    \n" +
                "    Mt_ + `t -    J   t        p` /         (+--  **+,,       r+   u         /         *  ' ,       \n" +
                "    _  + `\\ '  , `     $      a         ,*~            `+,          s       d   .      ,- =  :~     \n" +
                "    ^*w  (            \\ n    l    ` '  -   ,'        =x       ,,     e     J          =    /  ]     \n" +
                "       `\"mQ_`, f \\      )   x  :,    *` ,!   ,*~`   =,  ^%  \\,        6   d +`    *    r  ` p/      \n" +
                "           ^\"Om_' % ~-   ! j        * _/  ,'`  --\"-u,   ,     x  '     6 j            '_g,*^        \n" +
                "                8MQ&,_    W`  :    =  ' ,   /^        '  +  \\  \\       ]_   ^^  j_paJM\"``           \n" +
                "                  )  ^\"\"\\mm,___   ,  ' g  ,~            \\ ^a \\  ' \"   ___,aawNM^~`                  \n" +
                "                  )          `~\"~\"**0mmbmm&;awap,,,,awwaadmw###MM^~\"~~~``       *                      \n" +
                "                  1                 >              ]           \\                /                    \n" +
                "                  r                 |              /            ]                |                   \n" +
                "                  |                 r              <           |                *                   \n" +
                "                  E                 >              >           *                /                   \n" +
                "                  &                 =              ?           >                ~                   \n" +
                "                f &                 /              &           -                >                   \n" +
                "                  W                 -              t           ~                <                   \n" +
                "             ,aM!m0*                ]              l           |             _a -                   \n" +
                "            r$     +5               ]              |           ~           gA'*4,                   \n" +
                "            `\\b    _hg             [               ]           =          4_     \"pbc  ,            \n" +
                "           Ih&    ~# =4             c            c :           /          #~2 + qp^+*g' p*+\\        \n" +
                "           (       3   &            t      _aM&    :           >          @     *M    TM  _  j      \n" +
                "                   \"Dw 4  ,mk       x    _/~    \"u ,         ?            4*      \",g '!  S\"=e&_    \n" +
                "      z\"*~!-         ^ V+N.^; ,*^   \"    J,\\     yNM,       b  :                   `+  +_  qc  %\\   \n" +
                "     }  =  k          r K) , \"T/    +    I,]   #Q   ^g,       m            3   __    'r(     j ,    \n" +
                "     'c     ~*   _,_ ~  _*\"!   r^   +    ' !   *\"\\   *\"g***    i           }  +  +,_3/  \\  \"\"\" ~j   \n" +
                "       \"\"       ,#~ #  ]^ ^T   *,   +    ^~      ~~N6l I   _ ,,j           *v,           #-\"^&r*    \n" +
                "        *M_    F .]f  > + & m8*-`   +     t          ^,E*, P\" =~\\           r~          j   '       \n" +
                "       &  \"F~ r   *   ~t t    >     p     f   am4   :,&  ,*   I+ ^        M^  ,~*, _,***~ ^\"        \n" +
                "      ,   ^   ' J d   ~ ,`,--~^;    w     $  F   ^*x#` N ~    I _K     pwJ   %  @\"7T      ^&        \n" +
                "      ^  T    t  h3  a^  u' y-~I    \\      \\g           gm+=\" !  !      , -  6  \\q+*$(    ,,        \n" +
                "     ?  tz:O   \"e f  } ^wc ! +      K     ,r           ,',,rgtF*'      #_     t  ^~~ !,s*   ^       \n" +
                "     ]  0_       \"&  =m  ^x  ' [   .M-*gJ^  ,/~^<,,*=**L   *`  s     /^  \\     \"\\^~,   I    r-      \n" +
                "      , ~~\",      Bm,      _ \\,:  '  _\"~'  ]~  x\"&q    T~~^ :  ,    /     \\      \"`  I  ^\"^  ]r^    \n" +
                "      !    *'    j`  +z    ~'\"   '   \"=& ,  L  ,   l   J     , $          `+    I     \\,,,,,+F      \n" +
                "      ! H ;     \"^ +   ~=  A    [    _ !     \\ Y  J    ',    f {   f     J        &    ~            \n" +
                "      !4 '`m,     J `z         +q       ,     \"<(a@,     ,   ! 3   f       :     , .#               \n" +
                "      ' c    =,_,M     ~=\\ ,    !   ]    !,    @`     *#t_   Q \\   )     j ^w,,w' ` ;  '    J' '    \n" +
                "        `  ,,J~Q,r     _       '    Q i   ]   .&s  )@`     ^`  $   \\a    0v       I   jp')\"] u'     \n" +
                "         ',  )   ,      `&\"s   _    ^, \"\",f      K   ~ m   _  TI    ]     /      ,_am!!      `      \n" +
                "         ;}  #ax &,  _u        !     _          ,   ,    `B~~\"\"v    +            \\     \\s  \\~       \n" +
                "         ' `~&  _f`EJ`   y j   !   m'`    \"%mpp=,xr     /'     f     \\   m        M       ~         \n" +
                "          \"aaNamf /~   *\" g&gawa  !          ^ !           p  /K____ ]  j `^^^\"9  _I              _,\n" +
                "                 #, _g__w\"      ,/~w_     ,/7a_1    +     !  ,`^ `~~\"!  w,_     ^~ ;            x^ `\n" +
                "~*_    _/M~*%_    &M\"  ~            `\"\\   `\\ ^ :__aaM~,      ' <      \\|   ~MMqy#xwf  ,aa   __y~    \n" +
                "   !  _^      \\j             ,pwm**+f  ]    &p&    {:*    _v'  E___    \"        [  w,P     ^        \n" +
                "    ~ \"     p*\"       _,/&\"'            *mn*!  c   , $   f     1   ~\"Mm__       `    ~x,            \n" +
                "          pM      2=~~              :    _   6~    &  _a~      *         \"=v_   1      ~&_          \n" +
                "        _F                          '     ~~~       ~\"        ,'             ^u ;        \"c         \n" +
                "       y^                            ^r                    _m^                 ~T         \"c        \n" +
                "       `          ,                    \"!+,_         __,e\"~                                ]        \n" +
                "       &,       ~^ +,                      ~~~~~4  V\"'                          : [        (t       \n" +
                "       f^q           ^v_                                                      _x'*'         F       \n" +
                "    ~+ {  \"g            \"+__                                                ,+^          <   _f     \n" +
                "   _a*t>,   \"m             ^~m_                                         ,a*~           ,`  p\"       \n" +
                "       ' ^,   \"+,               ^+e_            |                  _,r*~^            =~   4'        \n" +
                "           ^*,   ^*w_                \"~=ma,,__  ]         __,,ra*^~              _r^    *`       /- \n" +
                "              \"*,    ~*q,                     ~`'m*~~^~~~~`                  _**^     F^       j'   \n" +
                "                 ~+,     \"**,,                                          ,,c-~`     z~`        g     \n" +
                "                    ~*p,      ~'*,,_                              _,w*-\"`      _a!`           f     \n" +
                "          *~\"\\_,,_      ~~*u,_      ^^~***vx,,,,,,,,,,,,arw****-~~`       _,a*\"      `~h,,  /-f     \n" +
                "        _^    `  `4          ~'+,,                                   ,wm*~`           ~   ~#        \n" +
                "      ~ ^                          `\"+*mu,,,,,,,,,_,_,,,,,,,%we***\"\"`                               \n" +
                "                   % ,rmn,                           `                                              \n" +
                "                    ~`    +                                                                         \n" +
                "                                                                                                    \n" +
                "                                                                                                    ");
    }
    public static void main(String []args){
        playCarousel t=new playCarousel();
        t.playFacility();
    }
}
