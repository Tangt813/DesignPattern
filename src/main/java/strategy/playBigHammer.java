package strategy;

public class playBigHammer implements PlayAction {
    private String facility_name="BigHammer";
    @Override
    public void play_facility(){
        System.out.println("let's play "+facility_name);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("                              QQNNM00#0MM00M&0Mt       J&0MMMMM00#:                                        B000MNP      \n" +
                "                             4Q0M00000MM0M#0M!        Z00000000#0^                                         0M00M0#               \n" +
                "                            g#M0M0000MMNM00N\"        _N0MM0M00NN                                           4MN0N#N      \n" +
                "                           j0N0N000000000NN&         y0M0M000NF\\                                           *MM000Q      \n" +
                "                          y&KMM##M0M00M000!         Q0M0Q0M000-                                             NN0MMNm     \n" +
                "                         BM0N0M0NN0000NNMH         _N00MM00#M%                                              00000MN     \n" +
                "                        M00MN00M0#MNMMM#A          Q0MM000M#$                                               M#000MM     \n" +
                "                       0RN0N0MB00NMMMM#$          g00M000QM&                                                Q00M000     \n" +
                "                     _pMMM00N0M00MMMQME          q#M#0M000M                                                  0M00#0u    \n" +
                "                     yQMQMM0M#00N00M0M          m##M000000&                                                  &N#MMMM    \n" +
                "                   -B#000#0M000M0N00@          aQM0MM00##?                                                   0NMM000    \n" +
                "                   p0&0M0N0NM0MN0MNM           #MNM00000H                                                    *00MNM&    \n" +
                "                 _g0NM&B#QN0M0NM0#N           0M0000M0MM\\                                                    N00N00M    \n" +
                "                 gM0N00MN000MN#0#M           j#0NNMM0M@                                                       #0000Q,   \n" +
                "                N00M0000N##0000M&~        +Q00#00MMM0M                                                        #0Q000p   \n" +
                "              *pM00NM0000N000N00!        ,0Q0000M0M08                                                         000MQN#   \n" +
                "             _pM00000MM00MM00N0&, _      #Q00W#0M0M0                                                          ~NNMM0&   \n" +
                "             #M0#M000000N000000Q#&0g _  #000M0Q00RN0&                                                          00MMM&   \n" +
                "           xg0N000MNNM0NM00NN00##0M#Q0N0N00000000M0MP                                                          ]#M0M0c  \n" +
                "          _qNMQMM00MM00N#0MMM0M0MM0000#0N00000M0000#                                                           N0N00#A  \n" +
                "          4000M000N0M0000M0000MM000N0#M0000M0M0N0NQT                                                           \"0M0NM^  \n" +
                "         g0M0N0M0#NN00000MA`\"#000MMNMM0000N000#00#8                                                             #00N00                       \n" +
                "        _0000#0000000M00000Q0MNNN0NN000M0000000000qp                                                            M0M00#^ \n" +
                "       Q0#0#0M00M0MM0NM0M0M0N00#MM0M00MN#M0000M0000MH_                                                          QM00MNw \n" +
                "     _g0000#M0N000M000M0MMMMMMM9M\"FMM00M&00000000M#00MN                                                         jM#M00t \n" +
                "      #0M0M0M0M0B0M0000#            _0#0N0M0M#00M&MMM0Q0&                                                       3BM0008 \n" +
                "    0N0Q0N00000#0M0M#0M@           _#M0N0M00M0Q0M0MMM#&MMNg                                                     +0M0M0# \n" +
                "  \\pMM000N0000MM0#M&000QN00       p#00M$  3M#00000M000RN0#Npg                                                   _0M0#0# \n" +
                "  0MM0&0N0NMMN00#MMM#00000&_ _   j0NM#      #N0M&#M0N0M#MN#0Q,                                                   BM0M00~\n" +
                " g#M0N00MMM0#N00M0M0000000#M00& j00@S       Q00## M00NM000MM00                                                   #00000&\n" +
                " #0000Q00000MN0#00#000000000008p#0M^         BM0#f ~0N0NM0&Q00Q^                                                 ]00MM0f\n" +
                "NN000N0M00M0M0MN0MN0#MN0000N0000M#&  _       J00K6   000q00000Mg                                                 w0M0N00\n" +
                "0M0N0000N0#0NM00BgM jMM0MM00NNM00M&N00L       400#    ^M0N00M#M&                                                 \"B0M000\n" +
                "Q00000M0NMM000M0^~ p@ ^M0M00N00M000M000qg0&   \"&M0c     7MMMM0Q01                                                 N0M0&0\n" +
                "MMNQ0#0M00M0MQ00  /5 wM _000NN0MN00000M0MM0&gM&ZM&#      ]0MNM0Mf                                                 &00#0M\n" +
                "NM0NMNMM000M#0}        uf ^Q00000M000M00MM000M0N0M0p#0&N00MM00M0                                                  M0000M\n" +
                "000000M000#0NM$           j^  M00000NM0M000M0M00000M00#000000000                                                  R00000\n" +
                "M00000#0N000Z             ~  d  #MM0MN000NNM00M0000#000M00N0N00##                                                 *M00N0\n" +
                "000#0000M0M@\"                5 #  p\"P#BM00N000M000M#000B#0000NfMg                                                  0000M\n" +
                "0M#00M00000e                      T   Q0~T0NM0000M00M0#00#0#BH!                                                    N000M\n" +
                "N0MM0MMN##                            #  y0_#53~M~Z0#M~0NNQT#W                                                     M#0MM\n" +
                "00N000000M                              4\\R$  =&\"]n} B +ME> -                                                     #000M\n" +
                "000MM0MML                                             ^  ^                                                         ]#0N0\n" +
                "000000MM#                                                                                                          ]M000\n" +
                "0000N0&                                                                                                             NMM0\n" +
                "N00M0M0~                                                                                                            0000\n" +
                "N0MM#& %                                                                                                           40000\n" +
                "000#K3t                                                                                                            #0NM0\n" +
                "0MNQ ~                                                                                                            __&M0N\n" +
                "0005                                                                                                              DW00MM\n" +
                "0MC                                                                                                               N0M0M0\n" +
                "M~T                                                                                                              ,N000M\n" +
                "M :                                                                                                               ###0M\n" +
                "%:T                                                                                                               p##0M0\n" +
                "\"ZM                                                                                                               N00MM0\n" +
                "m                                                                                                                _N0#00\n" +
                "&                                                                                                              pm0000N#0");
    }
    public static void main(String[] args){
        playBigHammer instance_swing_hammer=new playBigHammer();
        instance_swing_hammer.play_facility();
    }
}
