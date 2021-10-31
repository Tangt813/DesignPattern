package BusinessDelegate;

import org.junit.Test;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName BusinessDelegateTest.java
 * @Description TODO
 * @createTime 2021年10月30日 10:36:00
 */
public class BusinessDelegateTest {
    @Test
    public void businessDelegateTest() {
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
