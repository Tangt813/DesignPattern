package Decorated;

import org.junit.Test;
public class DecoratedTest {
    @Test
    public void testDecorated(){
        System.out.println("大家好，欢迎来到装饰器模式展示～");
        System.out.println("装饰器模式允许向一个现有的对象添加新的功能，同时又不改变其结构。");
        System.out.println("接下来，我们通过给顾客添加不同VIP功能感受装饰器模式的使用");
        System.out.println("当我们需要创建一个VIP/高级VIP类型，但不想增加过多子类时，可以设计装饰类。");
        System.out.println("当顾客被VIP/高级VIP装饰后，顾客本身的属性不变，但是会新增不同的票价优惠功能。");
        String ID = "1234567";
        People customer = new Customer(ID);
        System.out.println(customer.getDescription() + " " + customer.getID());
        customer.buyTicket();
        System.out.println("\n");
        customer = new VIPCustomer(customer);
        System.out.println(customer.getDescription() + " " + customer.getID());
        customer.buyTicket();
        System.out.println("\n");
        customer = new SeniorVIPCustomer(customer);
        System.out.println(customer.getDescription() + " " + customer.getID());
        customer.buyTicket();
    }
}
