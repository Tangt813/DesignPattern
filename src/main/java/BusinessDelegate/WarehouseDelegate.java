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
        System.out.println("智能终端正在为你寻找你所需要的服务");
        WarehouseService warehouseService = lookUpService.getWarehouseService(serviceType);
        warehouseService.doProcessing();
    }

    public Boolean doTask(int radius,String color,Warehouse warehouse){
        System.out.println("智能终端正在为你寻找你所需要的服务");
        WarehouseService warehouseService = lookUpService.getWarehouseService(serviceType);
        return warehouseService.doProcessing(radius, color, warehouse);
    }
}
