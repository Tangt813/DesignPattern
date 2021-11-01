package Singleton;

import java.util.ArrayList;

public class SerialNumberObject {
    //private static Set sernum=new HashSet();
    private static ArrayList<Long>sernum=new ArrayList<Long>();
    //private static int sernum=0;
    private static SerialNumberObject instance;
    private SerialNumberObject(){};
    public static synchronized SerialNumberObject getInstance(){//加锁
        if (instance == null) {
            instance = new SerialNumberObject();
        }
        return instance;
    }
    public long getnumber(){
       long newnum=(long)((Math.random()*9+1)*100000);
       while(find(newnum,0,sernum.size()-1)){
           newnum=(long)((double)(Math.random()*9+1)*100000);
       }
       sernum.add(newnum);
      System.out.println("门票序列号:"+newnum);
      return newnum;
    }

  private boolean find(long target,int left,int right){
        if(left<=right) {
            int mid = (left + right) / 2;
            if (target == sernum.get(mid)) return true;
            else return find(target, left,mid-1) || find(target, mid+1, right);
        }
        else return false;
  }

}

