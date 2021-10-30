package BusinessDelegate;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName WarehouseLookUp.java
 * @Description 服务查询类
 * @createTime 2021年10月17日 13:32:00
 */
public class WarehouseLookUp {
    public WarehouseService getWarehouseService(WarehouseServiceType serviceType){
        switch (serviceType){
            case PickUp:
                return new WarehousePickupService();
            case Storage:
                return new WarehouseStorageService();
            default:
                return new WarehouseNotFoundService();
        }
    }
}
