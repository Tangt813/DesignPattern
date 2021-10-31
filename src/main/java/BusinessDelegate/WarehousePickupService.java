package BusinessDelegate;

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
        System.out.println("智能终端正在为你寻找你需要的货物");
    }

    @Override
    public Boolean doProcessing(int radius, String color, Warehouse warehouse) {
        System.out.println("智能终端正在为你寻找颜色为"+color+",半径为"+radius+"的水晶球");
        if(warehouse.findProduct(radius,color)){
            System.out.println("智能终端已经找到需要的货物");
            return true;
        }
        else {
            System.out.println("智能终端无法寻找到你需要的货物");
            return false;
        }
    }
}
