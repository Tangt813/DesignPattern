package ServiceLocatorPattern;

//做一个安全防护，即防止找不到的时候，系统出问题，做一个空对象处理
public class NullService extends Service{
    public String getName(){
        return "";
    }
    public String getPositon(){
        return "";
    }
    public boolean isBathAndEat(){
        return false;
    }
    public void printDetails(){

    }
    public void setName(String nameNew){
    }
    public void setPositon(String positonNew){
    }
    public void setActive(boolean activeNew){
    }
}
