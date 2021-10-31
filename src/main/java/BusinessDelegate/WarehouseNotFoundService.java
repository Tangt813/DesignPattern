package BusinessDelegate;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName WarehouseNotFoundService.java
 * @Description TODO
 * @createTime 2021年10月17日 13:51:00
 */
public class WarehouseNotFoundService implements WarehouseService {
    @Override
    public void doProcessing(){
        System.out.println("你所需要的服务暂时还未提供");
    }

    @Override
    public Boolean doProcessing(int radius, String color,Warehouse warehouse) {
        System.out.println("你所需要的服务暂时还未提供");
        return true;
    }
}
