package BusinessDelegate;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName BusinessDelegatePatternTest.java
 * @Description 业务代表模式测试
 * @createTime 2021年10月17日 13:58:00
 */
public class BusinessDelegatePatternTest {
    public static void main(String[] args) {

        System.out.println("业务代表模式");
        System.out.println("用于对表示层和业务层解耦。它基本上是用来减少通信或对表示层代码中的业务层代码的远程查询功能。\n");
        System.out.println("接下来我们通过纪念品商店的仓库来感受桥接模式的使用:");
        System.out.println("我们设计纪念品商店的智能仓库，员工不需要亲自进入仓库取货、存货，只需要通过一个仓库智能终端即可完成工作。\n" +
                "仓库提供多种服务，如取货服务、存货服务。\n" +
                "还设计来无法找到服务来保障程序的鲁棒性需求" +
                "实现表示层与业务层的解耦\n");

        System.out.println("我们首先建立一个空仓库");
        Warehouse warehouse = new Warehouse();

        System.out.println("再建立一个智能仓库代理");
        WarehouseDelegate warehouseDelegate = new WarehouseDelegate();

        WarehouseClient client = new WarehouseClient(warehouseDelegate);

        System.out.println("\n启用查找货物服务");
        warehouseDelegate.setServiceType(WarehouseServiceType.PickUp);
        client.doTask(1,"red", warehouse);
        System.out.println("可以发现并未找到这件货物");

        System.out.println("\n启用存储货物服务");
        warehouseDelegate.setServiceType(WarehouseServiceType.Storage);
        client.doTask(1,"red", warehouse);

        System.out.println("\n启用查找货物服务");
        warehouseDelegate.setServiceType(WarehouseServiceType.PickUp);
        client.doTask(1,"red", warehouse);

        System.out.println("\n测试未找到服务");
        warehouseDelegate.setServiceType(WarehouseServiceType.NotFound);
        client.doTask();
    }
}
