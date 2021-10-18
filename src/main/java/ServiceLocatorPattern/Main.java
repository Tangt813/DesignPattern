package ServiceLocatorPattern;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ServiceDetails seaHouse = new ServiceDetails("海马","海马小馆",false);
        ServiceDetails shark = new ServiceDetails("大白鲨","大白鲨馆",false);
        ServiceDetails dolphin = new ServiceDetails("海豚","海豚小馆",false);
        ServiceLocator.addService(seaHouse);
        ServiceLocator.addService(shark);
        ServiceLocator.addService(dolphin);
        ServiceDetails serviceDetail1=ServiceLocator.getService("海马");
        serviceDetail1.printDetails();
        ServiceLocator.modiServicePos("马戏团馆","海马");
        ServiceLocator.listDetails();
    }
}