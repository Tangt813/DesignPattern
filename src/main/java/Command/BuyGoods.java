package Command;

public class BuyGoods implements Order {
    private Goods goods;

    public BuyGoods(Goods goods){
        this.goods = goods;
    }//构造函数

    public void execute() {
        goods.buy();
    }//执行买入命令
}
