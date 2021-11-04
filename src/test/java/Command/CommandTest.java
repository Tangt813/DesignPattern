package Command;
import org.junit.Test;

public class CommandTest {
    @Test
    public void commandTest() {
        System.out.println("#命令模式(Command Pattern)将一个请求封装成一个对象，从而可以用不同的请求对目标进行参数化");
        System.out.println("#这种模式中提供一个命令的接口并实现具体的命令类以及作为调用对象的类，它会根据命令的类型确定哪个对象执行哪个命令");
        System.out.println("#软件系统中行为请求者与行为实现者通常是一种紧耦合的关系，但某些时候，比如需要对行为进行记录、撤销或重做、事务等处理时，这种紧耦合的设计就显得无法很好地面对变化");
        System.out.println("#以纪念品商店为例，商店中商品的进货和出售命令很可能被撤销或重做，并且我们需要确保这些命令都可以被记录和被追溯，此时命令模式就可以很好地解决这一点");
        System.out.println("#命令模式属于行为型模式");
        System.out.println("----------------------Command Pattern Test Start--------------------");
        System.out.println("纪念品商店要执行对水晶球的进货和出售任务");
        Goods abcGoods = new Goods();

        BuyGoods buyStockOrder = new BuyGoods(abcGoods);

        SellGoods sellGoodsOrder = new SellGoods(abcGoods);

        Shop shop = new Shop();
        System.out.println("商店接到了水晶球进货的命令");
        shop.takeOrder(buyStockOrder);
        System.out.println("商店接到了水晶球售卖的命令");
        shop.takeOrder(sellGoodsOrder);
        System.out.println("商店接到了水晶球售卖的命令");
        shop.takeOrder(sellGoodsOrder);
        System.out.println("商店接到了水晶球售卖的命令");
        shop.takeOrder(sellGoodsOrder);
        System.out.println("命令开始按顺序执行");
        shop.placeOrders();
        System.out.println("==========================");
        System.out.println("商店接到了水晶球进货的命令");
        shop.takeOrder(buyStockOrder);
        System.out.println("商店接到了水晶球售卖的命令");
        shop.takeOrder(sellGoodsOrder);
        System.out.println("撤销对商店的上一条命令");
        shop.cancelOrder();
        System.out.println("命令开始按顺序执行");
        shop.placeOrders();
        System.out.println("----------------------Command Pattern Test End---------------------");

    }
}
