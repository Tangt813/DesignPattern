package BusinessDelegate;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName WarehouseDelegate.java
 * @Description 仓库代表
 * @createTime 2021年10月17日 13:52:00
 */
public class WarehouseDelegate {
    private final WarehouseLookUp lookUpService = new WarehouseLookUp();
    private WarehouseServiceType serviceType;

    public void setServiceType(WarehouseServiceType serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        WarehouseService warehouseService = lookUpService.getWarehouseService(serviceType);
        warehouseService.doProcessing();
    }
}
