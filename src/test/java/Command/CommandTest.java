package Command;
import org.junit.Test;

public class CommandTest {
    @Test
    public void commandTest() {
        System.out.print("----------------------Visitor Pattern Test Start--------------------\n");
        System.out.print("商店要执行对可乐的进货和出售任务\n");
        Goods abcGoods = new Goods();

        BuyGoods buyStockOrder = new BuyGoods(abcGoods);

        SellGoods sellGoodsOrder = new SellGoods(abcGoods);

        Shop shop = new Shop();
        System.out.print("商店接到了可乐进货的命令\n");;
        shop.takeOrder(buyStockOrder);
        System.out.print("商店接到了对可乐售卖的命令\n");
        shop.takeOrder(sellGoodsOrder);
        System.out.print("命令开始按顺序执行\n");
        shop.placeOrders();
        System.out.print("----------------------Visitor Pattern Test End---------------------\n");

    }
}
