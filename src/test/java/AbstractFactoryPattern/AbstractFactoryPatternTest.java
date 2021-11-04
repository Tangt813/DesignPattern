package AbstractFactoryPattern;

import org.junit.Test;

public class AbstractFactoryPatternTest {
    @Test
    public void testAbstractFactoryPattern(){
        System.out.println("大家好，欢迎来到抽象工厂模式展示~");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("抽象工厂又称为其他工厂的工厂，将其他每一类的工厂抽象出来，更为方便的整合以及使用\n" +
                "比如在海底狂欢节这个乐园，很多地方需要用到椅子、桌子，比如餐厅、办公室等\n" +
                "当然，生产椅子、桌子分别可以采用工厂模式，但不同场景中，桌子椅子风格要求是不同的，但我们购买的时候\n" +
                "桌椅想要同一种风格，就比如家具店，他会将一套风格的桌子放在一起，方便购买，这时候抽象工厂模式就应运而生\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("抽象工厂模式满足了那些需要方便的生产一套物品的场合，在生产一套物品中的一个小物件时" +
                "通过调用工厂模式来生产每一个小物品，但他因为把一套物品抽象了出来，因此想要生成其他物件时\n" +
                "可以方便的生产风格一致的一套物品，方便客户购买\n");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("接来下我们一起来看看抽象工厂模式~");
        System.out.println("首先呢，新开业的狂欢节中需要建设餐厅和工作的办公室，那当然要批量买成套的桌椅啦\n" +
                "接下来我们先来看将办公室椅子生成工厂与办公室桌子生成工厂抽象出来的办公室工厂\n" +
                "\n");
        System.out.println("*-----------------------*");
        System.out.println("|     OfficeFactory     |");
        System.out.println("*-----------------------*");
        AbstractFactory officeFactory = FactoryProduct.getFactory("Office");
        System.out.println("有了办公室工厂，就能够保证工厂内的桌子和椅子是配套的~");
        System.out.println("不如来看看办公椅子是什么样子吧！");
        System.out.println("颜色为:");
        officeFactory.getChair().chairColor();
        System.out.println("材质为:");
        officeFactory.getChair().chairMaterial();
        System.out.println("样子为:");
        officeFactory.getChair().draw();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("再来看看办公桌子是什么样子吧！");
        System.out.println("颜色为:");
        officeFactory.getTable().tableColor();
        System.out.println("材质为:");
        officeFactory.getTable().tableMaterial();
        System.out.println("样子为:");
        officeFactory.getTable().draw();

        System.out.println("有了餐厅工厂，就能够保证工厂内的桌子和椅子是配套的~");
        AbstractFactory restaurantFactory = FactoryProduct.getFactory("Restaurant");
        System.out.println("不如来看看餐厅椅子是什么样子吧！");
        System.out.println("颜色为:");
        restaurantFactory.getChair().chairColor();
        System.out.println("材质为:");
        restaurantFactory.getChair().chairMaterial();
        System.out.println("样子为:");
        restaurantFactory.getChair().draw();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("再来看看餐厅桌子是什么样子吧！");
        System.out.println("颜色为:");
        restaurantFactory.getTable().tableColor();
        System.out.println("材质为:");
        restaurantFactory.getTable().tableMaterial();
        System.out.println("样子为:");
        restaurantFactory.getTable().draw();
    }
}
