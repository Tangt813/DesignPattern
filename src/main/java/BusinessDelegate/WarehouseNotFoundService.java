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
        System.out.println("The service you need is not found");
    }
}
