package Command;

public class CommandPatternDemo {
    public static void main(String[] args) {
        Goods Goods = new Goods();

        BuyGoods buyStockOrder = new BuyGoods(Goods);
        SellGoods sellGoodsOrder = new SellGoods(Goods);

        Shop broker = new Shop();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellGoodsOrder);
        broker.cancelOrder();
        broker.placeOrders();
    }
}
