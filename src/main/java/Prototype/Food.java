package Prototype;

public abstract class Food implements Cloneable {

    private String id;
    public String name;
    protected double price;

    public double getPrice(){
        return price;
    }

    public String getName(){ return name;}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name){ this.name=name;}

    public void setPrice(double price){ this.price=price;}


    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
