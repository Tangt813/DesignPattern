import java.util.ArrayList;
import java.util.HashSet;

public class serial_number {
    //private static Set sernum=new HashSet();
    private static ArrayList<Long>sernum=new ArrayList<Long>();
    //private static int sernum=0;
    private static serial_number instance;
    private  serial_number(){};
    public static synchronized serial_number getInstance(){//加锁
        if (instance == null) {
            instance = new serial_number();
        }
        return instance;
    }
    public void getnumber(){
       long newnum=(long)((Math.random()*9+1)*100000);
       while(find(newnum,0,sernum.size()-1)){
           newnum=(long)((double)(Math.random()*9+1)*100000);
       }
       sernum.add(newnum);
      System.out.println(newnum);
    }
  private boolean find(long target,int left,int right){
        if(left<=right) {
            int mid = (left + right) / 2;
            if (target == sernum.get(mid)) return true;
            else return find(target, left,mid-1) || find(target, mid+1, right);
        }
        else return false;
  }
    public static void main(String []args){
        serial_number test =serial_number.getInstance();
test.getnumber();
test.getnumber();
test.getnumber();
    }
}

