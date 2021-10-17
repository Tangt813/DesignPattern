package BussinessDelegatePattern;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName WarehouseClient.java
 * @Description 仓库客户端
 * @createTime 2021年10月17日 13:26:00
 */
public class WarehouseClient {

    WarehouseDelegate warehouseService;

    public WarehouseClient(WarehouseDelegate warehouseService){
        this.warehouseService  = warehouseService;
    }

    public void doTask(){
        warehouseService.doTask();
    }
}
