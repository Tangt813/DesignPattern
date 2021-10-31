package Command;

public class SellGoods implements Order {
    private Goods goods;

    public SellGoods(Goods goods){
        this.goods = goods;
    }

    public void execute() {
        goods.sell();
    }
}
