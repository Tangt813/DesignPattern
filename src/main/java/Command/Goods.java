package Command;

public class Goods {

    private String name = "水晶球";
    private String id = "10001";
    private double price = 99;
    private int num=0;
    public void buy(){//进货
        num+=10;//进货10个
        System.out.println("进货: "+name+" 当前库存: "+num);
    }
    public void sell(){//售出
        num--;
        System.out.println("售出: "+name+" 当前库存: "+num);
    }
    public int getNum(){//获取当前数量
        return num;
    }
}
