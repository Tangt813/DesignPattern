package Observer;

/**
 * 创建实体观察者类————Worker
 */
public class Worker extends Observer{
    private String name;

    /**
     * 构造函数
     * @param subject
     * @param name 观察者姓名
     */
    public Worker(Subject subject, String name){
        this.subject = subject;
        this.name = name;
        //将新建的观察者加入观察者队列中
        this.subject.attach(this);
    }

    /**
     * 观察者中收到消息后做出对应的反应
     */
    @Override
    public void update() {
        System.out.println("Worker "+ this.name +" "+subject.getMessage());
    }
}
