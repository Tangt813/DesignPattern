package BusinessDelegate;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tangshuo
 * @version 1.0.0
 * @ClassName Warehouse.java
 * @Description TODO
 * @createTime 2021年10月31日 14:41:00
 */
public class Warehouse {
    private List<Integer> radiusList;
    private List<String> colorList;

    Warehouse(){
        this.radiusList = new ArrayList<Integer>();
        this.colorList = new ArrayList<String>();
    }

    public Warehouse(List<Integer> radiusList,List<String> colorList) {
        this.radiusList = radiusList;
        this.colorList = colorList;
    }

    public Boolean findProduct(int radius,String color) {
        System.out.println("仓库正在查找货物");
        if (radiusList.contains(radius) && colorList.contains(color)){
            System.out.println("仓库查找到所需货物");
            return true;
        }
        else {
            System.out.println("仓库无法查找到所需货物");
            return false;
        }
    }

    public void insertProduct(int radius,String color){
        radiusList.add(radius);
        colorList.add(color);
        System.out.println("仓库正在添加货物");
    }
}
