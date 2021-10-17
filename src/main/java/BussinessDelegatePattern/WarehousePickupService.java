package BussinessDelegatePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName WarehousePickupService.java
 * @Description 仓库查找服务
 * @createTime 2021年10月17日 13:31:00
 */
public class WarehousePickupService implements WarehouseService {
    @Override
    public void doProcessing(){
        System.out.println("Processing task by warehousePickupService");
    }
}
