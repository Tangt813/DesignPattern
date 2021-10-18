package Command;

public class BuyGoods implements Order {
    private Goods abcGoods;

    public BuyGoods(Goods abcGoods){
        this.abcGoods = abcGoods;
    }

    public void execute() {
        abcGoods.buy();
    }
}
