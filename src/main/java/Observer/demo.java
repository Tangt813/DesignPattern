package Observer;

public class demo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        //创建三个顾客，他们都是观察者，能收到群发的消息
        //他们观察的subject都是相同的
        Customer one = new Customer(subject,"one");
        Customer two = new Customer(subject,"two");
        Customer three = new Customer(subject,"three");

        System.out.println("First message: get up");
        subject.setMessage("get up");
        System.out.println("Second message: go to bed");
        subject.setMessage("go to bed");
    }
}
