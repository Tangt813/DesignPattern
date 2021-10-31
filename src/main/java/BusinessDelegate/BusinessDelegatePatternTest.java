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

        Warehouse warehouse = new Warehouse();
        WarehouseDelegate warehouseDelegate = new WarehouseDelegate();

        WarehouseClient client = new WarehouseClient(warehouseDelegate);

        warehouseDelegate.setServiceType(WarehouseServiceType.Storage);
        client.doTask(1,"red", warehouse);

        warehouseDelegate.setServiceType(WarehouseServiceType.PickUp);
        client.doTask(1,"red", warehouse);

        warehouseDelegate.setServiceType(WarehouseServiceType.NotFound);
        client.doTask();
    }
}
