package BusinessDelegate;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName WarehouseService.java
 * @Description 仓库服务
 * @createTime 2021年10月17日 13:27:00
 */
public interface WarehouseService {
    public void doProcessing();

    public Boolean doProcessing(int radius, String color, Warehouse warehouse);
}
