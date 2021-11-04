package Prototype;

public abstract class Food implements Cloneable {

    private String id;
    public String name;
    protected double price;


    public double getPrice(){
        return price;
    }//返回价格
    public String getName(){ return name;}//返回名称
    public String getId() {
        return id;
    }//返回id
    public void setId(String id) {
        this.id = id;
    }//设置id
    public void setName(String name){ this.name=name;}//设置名称
    public void setPrice(double price){ this.price=price;}//设置价格

    public Object clone() {//调用java中clone方法，根据原型克隆一个对象返回
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
