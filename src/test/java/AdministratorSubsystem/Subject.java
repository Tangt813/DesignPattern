package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Subject 对象带有绑定观察者到 Client 对象和从 Client 对象解绑观察者的方法
 */
public class Subject {
    //观察者列表
    private List<Observer> observers
            = new ArrayList<Observer>();
    //群发信息
    private String message;

    /**
     * 获得信息的函数
     * @return
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置群发信息
     * @param message
     */
    public void setMessage(String message) {
        this.message = message;
        notifyAllObservers();
    }

    /**
     * 向观察者列表中新增一个观察者
     * @param observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * 每一个观察者都会收到消息
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            //观察者中收到消息后做出的反应
            observer.update();
        }
    }
}
