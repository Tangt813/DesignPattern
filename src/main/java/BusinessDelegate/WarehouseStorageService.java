package BusinessDelegate;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName WarehouseStorageService.java
 * @Description 存货服务
 * @createTime 2021年10月17日 13:41:00
 */
public class WarehouseStorageService implements WarehouseService{
    @Override
    public void doProcessing(){
        System.out.println("Processing task by warehouseStorageService");
    }
}
