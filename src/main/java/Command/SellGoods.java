package Command;

public class SellGoods implements Order {
    private Goods goods;

    public SellGoods(Goods goods){
        this.goods = goods;
    }//构造函数

    public void execute() {
        goods.sell();
    }//执行出售命令
}
