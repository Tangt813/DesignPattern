package Command;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
//        order.execute();//执行命令
    }

    public void cancelOrder(){//撤销命令
        if (orderList.isEmpty())
            return;
        else orderList.remove(orderList.size()-1);
    }

    public void placeOrders(){//执行命令
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
