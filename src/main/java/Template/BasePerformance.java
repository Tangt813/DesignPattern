package Template;

public abstract class BasePerformance {

    public void performProcess() {
        //动物表演的流程模版
        System.out.println("表演者开始候场");
        System.out.println("表演者登上舞台");
        System.out.println("表演者向观众致意");
        //这里调用perform，展示每个动物的表演内容
        perform();
        System.out.println("表演完毕，表演者再次向观众致意");
        System.out.println("表演者退场");
    }
    //子类通过继承来自定义表演内容，增加了代码的可拓展性
    public abstract void perform();
}
