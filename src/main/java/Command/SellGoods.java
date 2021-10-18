package Command;

public class SellGoods implements Order {
    private Goods abcGoods;

    public SellGoods(Goods abcGoods){
        this.abcGoods = abcGoods;
    }

    public void execute() {
        abcGoods.sell();
    }
}