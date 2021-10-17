package BussinessDelegatePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName BusinessDelegatePatternTest.java
 * @Description 业务代表模式测试
 * @createTime 2021年10月17日 13:58:00
 */
public class BusinessDelegatePatternTest {
    public static void main(String[] args) {

        WarehouseDelegate warehouseDelegate = new WarehouseDelegate();

        warehouseDelegate.setServiceType(WarehouseServiceType.PickUp);

        WarehouseClient client = new WarehouseClient(warehouseDelegate);

        client.doTask();

        warehouseDelegate.setServiceType(WarehouseServiceType.Storage);
        client.doTask();

        warehouseDelegate.setServiceType(WarehouseServiceType.NotFound);
        client.doTask();
    }
}
