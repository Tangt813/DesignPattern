package ServiceLocatorPattern;

public class ServiceDetails extends Service{
    public String name="";
    public String positon="";
    public boolean isActive=false;
    public ServiceDetails(){
    }
    public ServiceDetails(String jndiName,String jndiPos,boolean jndiAct){
        name=jndiName;
        positon=jndiPos;
        isActive=jndiAct;
    }
    public String getName(){
        return name;
    }
    public String getPositon(){
        return positon;
    }
    public boolean isBathAndEat(){
        return isActive;
    }
    public void printDetails(){
        System.out.print(name+"现在位置在"+positon);
        if(isActive){
            System.out.println(",并且已经吃饭了");
        }
        else {
            System.out.println(",但还没有吃饭");
        }
    }
    public void setName(String nameNew){
        positon=nameNew;
    }
    public void setPositon(String positonNew){
        positon=positonNew;
    }
    public void setActive(boolean activeNew){
        isActive=activeNew;
    }
}
