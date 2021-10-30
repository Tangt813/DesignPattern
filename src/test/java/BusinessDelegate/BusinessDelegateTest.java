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
