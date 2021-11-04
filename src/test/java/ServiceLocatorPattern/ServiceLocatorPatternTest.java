package ServiceLocatorPattern;

import org.junit.Test;

import java.util.Scanner;
public class ServiceLocatorPatternTest {
    @Test
    public void testServiceLocatorPattern(){
        System.out.println("大家好，欢迎来到服务定位器模式展示~");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("服务定位器模式类似于cache，简单来说就是把我们常用的信息找一个中介先存起来");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("方便我们以后的访问，因为已经存储到了中介，所以想得到他的信息，直接通过中介查询就可以了");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("想象一个这样的场景，让我娓娓道来\n~~~~~~~~~~~~~~~~");
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("让我们一起来看服务定位器模式的具体例子");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("在海底狂欢节中有若干个演员，演员有相应的经纪人，经纪人要时刻了解到演员的信息：比如位置信息，是否吃过饭");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("演员的位置经常发生变动，如果经纪人和演员位置保持着单线联系，一处修改则将处处修改，这时我们构建一个服务定位器");
        System.out.println("来记录各个演员的相关信息，当一个演员的信息修改时，只需要修改他与服务定位器的信息，就实现了需求\n当经纪人需要调用时，直接读取之前已经存储在模拟cache中的信息，减少了信息交流参数，提高了效率和速度");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ServiceDetails seaHouse = new ServiceDetails("海马","海马小馆",false);
        ServiceDetails shark = new ServiceDetails("大白鲨","大白鲨馆",false);
        ServiceDetails paidaxing = new ServiceDetails("派大星","派大星小屋",false);
        ServiceDetails people = new ServiceDetails("经纪人","休息室",false);
        System.out.println("有三个演员，海马，大白鲨，海豚");
        System.out.println("有三个演员，海马");
        seaHouse.drawSeaHorse();
        System.out.println("演员，大白鲨");
        shark.drawShark();
        System.out.println("演员，派大星");
        paidaxing.drawPaidaXing();

        ServiceLocator.addService(seaHouse);
        ServiceLocator.addService(shark);
        ServiceLocator.addService(paidaxing);
        ServiceLocator.addService(people);
        ServiceLocator.listDetails();


        String pos="马戏团央视大舞台";
        ServiceLocator.modiServicePos(pos,"海马");
        pos="央视大舞台候场室";
        ServiceLocator.modiServicePos(pos,"经纪人");
        System.out.println("现在经纪人想获取演员海马的信息，因此访问服务定位器");
        ServiceDetails serviceDetail1=ServiceLocator.getService("海马");
        int i=0;
        for(i=0;i<5;i++){
            System.out.println("            |");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("*-----------------------*");
        System.out.println("|       服务定位器查询     |");
        System.out.println("*-----------------------*");
        for(i=0;i<5;i++){
            System.out.println("            |");
            try {
                Thread.sleep(350);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("*-----------------------*");
        serviceDetail1.printDetails();
        System.out.println("*-----------------------*");
    }
}
