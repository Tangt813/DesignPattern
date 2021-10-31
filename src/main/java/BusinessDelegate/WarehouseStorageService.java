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
        System.out.println("智能终端正在存放你新增的货物");
    }

    @Override
    public Boolean doProcessing(int radius, String color, Warehouse warehouse) {
        System.out.println("智能终端正在存放颜色为"+color+",半径为"+radius+"的水晶球");
        warehouse.insertProduct(radius,color);
        System.out.println("智能终端完成存放你新增的货物");
        return true;
    }
}
