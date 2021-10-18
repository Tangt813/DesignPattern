package Command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Goods abcGoods = new Goods();

        BuyGoods buyStockOrder = new BuyGoods(abcGoods);
        SellGoods sellGoodsOrder = new SellGoods(abcGoods);

        Shop broker = new Shop();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellGoodsOrder);

        broker.placeOrders();
    }
}
