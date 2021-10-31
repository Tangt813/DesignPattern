package Command;

public class Goods {

    private String name = "cola";
    private String id = "10001";
    private double price = 10;

    public void buy(){
        System.out.println("Goods [ Name: "+name+", Price: " + price +" ] bought");
    }
    public void sell(){
        System.out.println("Goods [ Name: "+name+", Price: " + price +" ] sold");
    }
}
