public class serial_number {
    private static int sernum=0;
    private static serial_number instance;
    private  serial_number(){};
    public static synchronized serial_number getInstance(){//加锁
        if (instance == null) {
            instance = new serial_number();
        }
        return instance;
    }
    public void getnumber(){
       int sernumber[]=new int[6];
       int sn=sernum;
       for(int i=5;i>=0;i--){
           if (sn==0)break;
           sernumber[i]=sn%10;
           sn=sn/10;
       }
       this.sernum++;
      System.out.println(sernumber);
    }

}
