package Command;

public class BuyGoods implements Order {
    private Goods goods;

    public BuyGoods(Goods goods){
        this.goods = goods;
    }

    public void execute() {
        goods.buy();
    }
}
